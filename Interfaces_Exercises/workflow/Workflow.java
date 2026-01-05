import activity.Activity;

import java.util.List;
import java.util.ArrayList;

public class Workflow {
    private List<Activity> activitys;

    public Workflow() {
        setActivitys(new ArrayList<Activity>());
    }

    public void registerActivity(Activity activity) {
        this.activitys.add(activity);
    }

    public void setActivitys(List<Activity> activitys) {
        this.activitys = activitys;
    }

    public List<Activity> getActivitys() {
        return this.activitys;
    }
}