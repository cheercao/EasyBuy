package cn.easybuy.web.pre;

import cn.easybuy.entity.News;
import cn.easybuy.entity.Product;
import cn.easybuy.param.NewsParams;
import cn.easybuy.utils.Pager;
import cn.easybuy.utils.ProductCategoryVo;
import cn.easybuy.web.AbstractServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(urlPatterns = {"/Pay"}, name = "Pay")
public class PayServlet extends AbstractServlet {
    @Override
    public Class getServletClass() {
        return PayServlet.class;
    }
    public String index(HttpServletRequest request, HttpServletResponse response)throws Exception {
        System.out.println(request);
        System.out.println(request.getParameter("payId"));
        return "/pre/pay/index";
    }
}
