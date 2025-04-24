
package in.gadgethub.servlet;

import in.gadgethub.dao.impl.ProductDaoImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SONI
 */
public class RemoveProductServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session=request.getSession();
       String userName=(String) session.getAttribute("userName");
       String password=(String) session.getAttribute("password");
       String userType=(String) session.getAttribute("userType");
       if (userType==null || !userType.equalsIgnoreCase("admin")){
           response.sendRedirect("login.jsp?message=Access Denied ! please login as admin");
           
       }else if (userName==null || password==null){
           response.sendRedirect("login.jsp?message=Session expired ! please login again");
       }
       String prodId=request.getParameter("prodId");
       ProductDaoImpl productDao=new ProductDaoImpl();
       String status=productDao.removeProduct(prodId);
       RequestDispatcher rd=request.getRequestDispatcher("removeProduct.jsp?message="+status);
       rd.forward(request, response);
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
