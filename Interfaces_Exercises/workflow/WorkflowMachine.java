import activity.*;

public class WorkflowMachine {
    public void execute(Workflow workflow) {
        for (Activity activity : workflow.getActivitys()) {
            activity.execute();
        }
    }
}