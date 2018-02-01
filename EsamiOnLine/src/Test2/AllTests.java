package Test2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompilaPiano.class, TastPubblicaAppelloesame.class, TestAutenticarsi.class, TestStatoVoto.class })
public class AllTests {

}
