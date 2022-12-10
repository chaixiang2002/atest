import com.snow.pojo.Activity;
import com.snow.service.impl.ActivityServiceImpl;

import java.util.List;

public class testActivity {
    public static void main(String[] args) {
        q1();
    }
    static void q1(){
        Activity  activity=new Activity();
        activity.setContent("asd");
        activity.setName("test");

        ActivityServiceImpl activityService = new ActivityServiceImpl();
        activityService.add(activity);
        List<Activity> activities = activityService.selectAll();

        System.out.println(activities);
    }
}
