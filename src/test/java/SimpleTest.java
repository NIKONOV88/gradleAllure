import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SimpleTest {

    @Test
    public void simpleMethodTest1() {
        step1();
        assert true;
    }

    @Test
    public void simpleMethodTest2() {
        step2();
        assert true;
    }

    @Step("first name step")
    private void step1(){
        System.out.println("INNER STEP print step1");
    }

    @Step("second name step")
    private void step2(){
        System.out.println("INNER STEP print step2");
    }
}
