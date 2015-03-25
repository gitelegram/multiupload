package org.gitzhu.multiupload.servlet;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import org.gitzhu.multiupload.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gitzhu on 3/25/15.
 */
public class ServletRequestContext implements RequestContext{

    private final HttpServletRequest request;
    private static final String Content_Length = "Content-length";

    public ServletRequestContext(HttpServletRequest request){
        this.request = request;
    }

    public String getCharacterEncoding(){
        return request.getCharacterEncoding();
    }

    public String getContentType(){
        return request.getContentType();
    }

    public long getContentLength(){

        long size;
        try {
            size = Long.parseLong(request.getHeader(Content_Length));
        } catch (NumberFormatException e) {
            size = request.getContentLength();
        }
        return size;
    }

}
