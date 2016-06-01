package AppCommunication;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kees on 26/04/2016.
 */
public class CommunicationMessageTest {

    CommunicationMessage communicationMessage = new CommunicationMessage("Hallo", "Hank", "Hans");

    //TODO JAVADOC
    @Test
    public void getText() throws Exception {
        Assert.assertEquals("Text is not correct", "Hallo", communicationMessage.getText());
    }

    //TODO JAVADOC
    @Test
    public void getSender() throws Exception {
        Assert.assertEquals("Sender is not correct", "Hank", communicationMessage.getSender());
    }

    //TODO JAVADOC
    @Test
    public void setSender() throws Exception {
        communicationMessage.setSender("Theo");
        Assert.assertEquals("Sender is not set correctly", "Theo", communicationMessage.getSender());
    }

    //TODO JAVADOC
    @Test
    public void getReceiver() throws Exception {
        Assert.assertEquals("Receiver is not correct", "Hans", communicationMessage.getReceiver());
    }

    //TODO JAVADOC
    @Test
    public void setReceiver() throws Exception {
        communicationMessage.setReceiver("Leo");
        Assert.assertEquals("Receiver is not set correctly", "Leo", communicationMessage.getReceiver());
    }

    //TODO JAVADOC
    @Test
    public void setText() throws Exception {
        communicationMessage.setText("Hee");
        Assert.assertEquals("Text is not set correct", "Hee", communicationMessage.getText());
    }

}