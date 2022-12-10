import com.snow.pojo.Members;
import com.snow.service.impl.MembersServiceImpl;
import com.snow.service.impl.MessagesServiceImpl;

import java.util.List;


public class tetsMember {

    public static void main(String[] args) {
        q2();
    }
    static void q1(){
        Members members = new Members();
        members.setName("2");
        members.setPassword("234");
        MembersServiceImpl membersService = new MembersServiceImpl();

        membersService.add(members);
        List<Members> members1 = membersService.selectAll();
        System.out.println(members1);
    }


    static void q2(){
        MembersServiceImpl membersService = new MembersServiceImpl();
        Members snow = membersService.selectByUsername("snow");
        System.out.println(snow);

    }

    static void q3(){
        MembersServiceImpl membersService = new MembersServiceImpl();
        Members snow = membersService.login("snow","snow");
        System.out.println(snow);
    }
}
