package lites.jnightlight.firsttestserver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import lites.jnightlight.firsttestserver.JakeHipsterSampleApplicationApp;
import lites.jnightlight.firsttestserver.config.AsyncSyncConfiguration;
import lites.jnightlight.firsttestserver.config.EmbeddedKafka;
import lites.jnightlight.firsttestserver.config.EmbeddedSQL;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JakeHipsterSampleApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
