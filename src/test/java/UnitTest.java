import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    void test() {
        try {
            System.out.println("running test");
            Thread.sleep(10 * 1000);
            System.out.println("all good");
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

    }
}
