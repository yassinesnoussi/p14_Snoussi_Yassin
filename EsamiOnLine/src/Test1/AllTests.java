package Test1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CorsoTest.class, EsameTest.class, InsegnanteTest.class, PianoStudioTest.class, PrenotazioneTest.class,
		SistemaTest.class, StudenteTest.class, UtenteTest.class })
public class AllTests {

}
