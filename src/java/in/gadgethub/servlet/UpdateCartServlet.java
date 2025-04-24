package in.gadgethub.servlet;

import in.gadget.dao.CartDao;
import in.gadgethub.dao.impl.CartDaoImpl;
import in.gadgethub.dao.impl.DemandImpl;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.pojo.CartPojo;
import in.gadgethub.pojo.DemandPojo;
import in.gadgethub.pojo.ProductPojo;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); // Delegating to your core method
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); // Optional if you want to allow GET too
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");
        String password = (String) session.getAttribute("password");
        String userType = (String) session.getAttribute("userType");

        if (userType == null || userName == null || !userType.equalsIgnoreCase("customer")) {
            response.sendRedirect("login.jsp?message=Access denied ! Please login first");
            return;
        }

        String prodId = request.getParameter("pid");
        int pQty = Integer.parseInt(request.getParameter("pQty"));

        ProductDaoImpl prodDao = new ProductDaoImpl();
        CartDao cartDao = new CartDaoImpl();
        ProductPojo product = prodDao.getProductDetails(prodId);
        int availableQty = product.getProdQuantity();

        if (availableQty < pQty) {
            String status = "Only " + availableQty + " no of " + product.getProdName() +
                    " are available in the shop!. So we can add only " + availableQty +
                    " products in your cart";

            DemandImpl demand = new DemandImpl();
            DemandPojo demandPojo = new DemandPojo(userName, prodId, pQty - availableQty);
            boolean flag = demand.addProduct(demandPojo);
            if (flag) {
                status += "<br/>Later we will mail you when " + product.getProdName() + " will be available";
            }

            request.setAttribute("message", status);
            RequestDispatcher rd = request.getRequestDispatcher("./CartDetailsServlet");
            rd.forward(request, response);
        } else {
            String status = cartDao.updateProductInCart(new CartPojo(userName, prodId, pQty));
            request.setAttribute("message", status);
            RequestDispatcher rd = request.getRequestDispatcher("./CartDetailsServlet");
            rd.forward(request, response);
        }
    }
}