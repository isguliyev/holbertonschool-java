import activity.EncodeVideo;
import activity.ModifyVideoStatus;
import activity.SendEmail;
import activity.UploadVideo;

public class Program {
    public static void main(String[] args) {
        WorkflowMachine workflowMachine = new WorkflowMachine();

        Workflow workflowEncodeVideos = new Workflow();

        workflowEncodeVideos.registerActivity(new UploadVideo());
        workflowEncodeVideos.registerActivity(new EncodeVideo());
        workflowEncodeVideos.registerActivity(new SendEmail());

        workflowMachine.execute(workflowEncodeVideos);

        Workflow workflowVideos = new Workflow();

        workflowVideos.registerActivity(new UploadVideo());
        workflowVideos.registerActivity(new SendEmail());

        workflowMachine.execute(workflowVideos);

        Workflow workflowVideosStatus = new Workflow();

        workflowVideosStatus.registerActivity(new UploadVideo());
        workflowVideosStatus.registerActivity(new ModifyVideoStatus());
        workflowVideosStatus.registerActivity(new SendEmail());

        workflowMachine.execute(workflowVideosStatus);
    }
}