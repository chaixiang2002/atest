import com.snow.pojo.Expenditure;
import com.snow.service.impl.ExpenditureServiceImpl;
import com.snow.util.TimeUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class testExpenditure {
    static ExpenditureServiceImpl expenditureService = new ExpenditureServiceImpl();


    public static void main(String[] args) {
        String time = TimeUtils.time();
        System.out.println(time);
//        add();
//        delete();
//        update();
//        selectAll();
//        selectById();
//        selectLastId();
//
//        add();
//        delete();
//        update();
//        selectAll();
//        selectById();
//        selectById();
//

    }
    public static String time(){

        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        String format = sdf.format(date);
        System.out.println("现在时间：" + format); // 输出已经格式化的现在时间（24小时制）
        return format;
    }

    static void add(){
        Expenditure expenditure = new Expenditure();
        expenditure.setTotalMoney(12.2);
        expenditure.setApplication("dasd");
        expenditure.setShoppingList("asdcc");
        expenditure.setSubmitTime(time());
        expenditureService.add(expenditure);
    }


    static void delete(){
        expenditureService.delete(4);
    }

    static void update(){
        Expenditure expenditure = new Expenditure();
        expenditure.setID(3);
        expenditure.setTotalMoney(12.2);
        expenditure.setAuditor("snow");
        expenditure.setApplication("dasd_update");
        expenditure.setShoppingList("asdcc");
        expenditure.setSubmitTime(time());
        expenditure.setState("通过");
        expenditureService.update(expenditure);
    }


    static void selectAll(){
        List<Expenditure> expenditures = expenditureService.selectAll();
        System.out.println(expenditures);
    }

    static void selectById(){
        Expenditure expenditure = expenditureService.selectById(3);
        System.out.println(expenditure);
    }

    static void selectLastId(){
        Integer lastId = expenditureService.selectLastId();
        System.out.println(lastId);
    }


}
