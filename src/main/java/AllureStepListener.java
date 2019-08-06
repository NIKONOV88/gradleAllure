import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AllureStepListener implements StepLifecycleListener {
    @Override
    public void afterStepStart(StepResult result) {
        log.info("getName(): " + result.getName());
        log.info("getDescription(): " + result.getDescription());
        log.info("toString(): " + result.toString());
    }
}
