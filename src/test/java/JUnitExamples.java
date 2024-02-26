import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        //Конфигурация
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach
    void BeforeEach() {
        //Конфигурация
        System.out.println("Here is beforeEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Here is afterAll()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Here is afterEach");
    }

    @Test
    void firstTest() {
        System.out.println("Here is firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("Here is secondTest()");
    }
}
