import com.snow.pojo.Messages;
import com.snow.service.impl.MembersServiceImpl;
import com.snow.service.impl.MessagesServiceImpl;

import java.util.List;

public class AddMessages {
    public static void main(String[] args) {
        Messages messages = new Messages();
        messages.setContent_("test");
        messages.setReceiver(4);
        messages.setSender(3);

        System.out.println("1:"+messages);

        MessagesServiceImpl messagesService = new MessagesServiceImpl();
        messagesService.add(messages);

        List<Messages> messages1 = messagesService.selectAll();

        System.out.println("2:"+messages);
    }


}
