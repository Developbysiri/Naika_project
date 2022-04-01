package naika_lipstik.controllers;

import com.agapsys.rcf.ActionRequest;
import com.agapsys.rcf.ActionResponse;
import com.agapsys.rcf.Controller;
import com.agapsys.rcf.HttpMethod;
import com.agapsys.rcf.WebAction;
import com.agapsys.rcf.WebActions;
import com.agapsys.rcf.WebController;
import java.io.IOException;

@WebController("sample")
public class SampleController extends Controller {

    @WebActions({
        @WebAction(httpMethods = HttpMethod.GET, mapping = "/getObject"),
        @WebAction(httpMethods = HttpMethod.GET, mapping = "/")
    })
    public String getObject(ActionRequest req) {
        return "Hello world!";
    }

    @WebAction
    public void get(ActionRequest request, ActionResponse response) throws IOException {
        response.getServletResponse().getWriter().print("Hello world!");
    }

}
