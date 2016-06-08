package AppCommunication;

import java.util.UnknownFormatConversionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kaj Suiker on 20-4-2016.
 */
public class CommunicationRequest {
    private String url;
    private String payload;
    private CommunicationMessage networkMessage;

    //TODO explain
    /**
     * Constructor.
     * @param networkMessage : [INSERT TEXT HERE]
     */
    public CommunicationRequest(CommunicationMessage networkMessage) {
        this.networkMessage = networkMessage;

        url = networkMessage.getText().substring(0, networkMessage.getText().indexOf("/"));
        payload = networkMessage.getText().substring(networkMessage.getText().indexOf("/")+1);
    }

    /**
     * Gets the url of this CommunicationRequest.
     * @return the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets a new url to this CommunicationRequest.
     * @param url : the new url.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the payload of this CommunicationRequest.
     * @return the payload.
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets a new payload to this CommunicationRequest.
     * @param payload : the new payload.
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Gets the networkMessage of this CommunicationRequest.
     * @return the networkMessage.
     */
    public CommunicationMessage getNetworkMessage() {
        return networkMessage;
    }

}
