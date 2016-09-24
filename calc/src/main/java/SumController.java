import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SumController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("/index.jsp");
        try {
            int x = Integer.parseInt(request.getParameter("x"));
            int y = Integer.parseInt(request.getParameter("y"));
            int sum = x + y;
            mav.addObject("x", x);
            mav.addObject("y", y);
            mav.addObject("sum", sum);
            System.out.println("SumController ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in SumController");
        }
        return mav;
    }
}