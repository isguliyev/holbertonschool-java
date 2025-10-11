import activity.*;
import java.util.ArrayList;

public class Workflow {
    private ArrayList<Activity> activitys;

    public Workflow() {
        setActivitys(new ArrayList<Activity>());
    }

    public void registerActivity(Activity activity) {
        getActivitys().add(activity);
    }

    public void setActivitys(ArrayList<Activity> activitys) {
        this.activitys = activitys;
    }

    public ArrayList<Activity> getActivitys() {
        return this.activitys;
    }
}