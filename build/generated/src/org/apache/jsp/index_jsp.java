package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import in.gadgethub.utility.*;
import in.gadgethub.pojo.ProductPojo;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.dao.impl.*;
import in.gadget.dao.*;
import in.gadgethub.pojo.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>");
      out.print(AppInfo.appName);
      out.write(" Application</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"myCSS.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" />\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #fff0f5;\"> <!-- Lightest pink background -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"text-center m-3 text-primary h3\">");
      out.print(request.getAttribute("message"));
      out.write("</div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            ");

            Map<String, Integer> mapList = (HashMap) request.getAttribute("map");
            String userName = (String) request.getAttribute("userName");
            List<ProductPojo> prodList = (ArrayList<ProductPojo>) request.getAttribute("products");

            if (prodList != null && mapList != null) {
                for (ProductPojo product : prodList) {
                    if (product != null && product.getProdId() != null) {
                        Integer cartQty = mapList.containsKey(product.getProdId()) ? mapList.get(product.getProdId()) : 0;

                        if (cartQty == null) {
                            cartQty = 0;
                        }
            
      out.write("\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"thumbnail mt-3 mb-3\" style=\"background-color: #ffeef8; border: 1px solid #f8bbd0; border-radius: 10px;\">\n");
      out.write("                    <img src=\"./ShowImageServlet?pid=");
      out.print(product.getProdId());
      out.write("\" alt=\"Product\" style=\"height: 150px; max-width: 180px\" class=\"mt-3\" />\n");
      out.write("                    <p class=\"productname\" style=\"color: #c2185b;\">");
      out.print(product.getProdName());
      out.write("</p>\n");
      out.write("                    ");

                    String description = product.getProdInfo();
                    description = description.substring(0, Math.min(100, description.length()));
                    
      out.write("\n");
      out.write("                    <p class=\"productinfo\" style=\"color: #880e4f;\">");
      out.print(description);
      out.write("..</p>\n");
      out.write("                    <p class=\"price\" style=\"color: #ad1457;\">Rs ");
      out.print(product.getProdPrice());
      out.write("</p>\n");
      out.write("                    <form method=\"post\">\n");
      out.write("                        ");
 if (cartQty == 0) { 
      out.write("\n");
      out.write("                        <button type=\"submit\" formaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\" class=\"btn btn-warning\">\n");
      out.write("                            Add to Cart\n");
      out.write("                        </button>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;\n");
      out.write("                        <button type=\"submit\" formaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\" class=\"btn btn-primary\" style=\"background-color: #f06292; border-color: #f06292;\">\n");
      out.write("                            Buy Now\n");
      out.write("                        </button>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                        <button type=\"submit\" formaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=0\" class=\"btn btn-danger\">\n");
      out.write("                            Remove From Cart\n");
      out.write("                        </button>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;\n");
      out.write("                        <button type=\"submit\" formaction=\"cartDetails.jsp\" class=\"btn btn-success\" style=\"background-color: #ec407a; border-color: #ec407a;\">\n");
      out.write("                            Checkout\n");
      out.write("                        </button>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <br />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    } else {
                        out.println("Product or product ID is null.");
                    }
                }
            } else {
                out.println("");
            }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Contact Us</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\" integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Montserrat', sans-serif; /* Modern font */\n");
      out.write("            background: linear-gradient(135deg, #ffecd2, #fcb69f); /* Warm background */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section {\n");
      out.write("            background: linear-gradient(135deg, #fff0f5, #ffe4e1); /* Soft pink form */\n");
      out.write("            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);\n");
      out.write("            padding: 50px;\n");
      out.write("            margin: 0; /* Remove default margin */\n");
      out.write("            width: 100%; /* Full width */\n");
      out.write("            max-width: none; /* Remove max width */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section h2 {\n");
      out.write("            color: #6a11cb; /* Purple heading */\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section p {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section .contact-info {\n");
      out.write("            font-size: 18px;\n");
      out.write("            line-height: 1.8;\n");
      out.write("            color: #444;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section .contact-info i {\n");
      out.write("            margin-right: 10px;\n");
      out.write("            color: #2575fc; /* Blue icon color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .form-control {\n");
      out.write("            border: 2px solid #ddd;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            padding: 16px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: border-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .form-control:focus {\n");
      out.write("            border-color: #2575fc;\n");
      out.write("            box-shadow: 0 0 12px rgba(37, 117, 252, 0.4);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .btn-warning {\n");
      out.write("            background: linear-gradient(135deg, #ff6347, #ff4500); /* Tomato/orange button */\n");
      out.write("            border: none;\n");
      out.write("            padding: 18px 40px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: 600;\n");
      out.write("            transition: transform 0.2s ease, box-shadow 0.2s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .btn-warning:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"contact-section\">\n");
      out.write("        <h2>Contact Us</h2>\n");
      out.write("        <p>We love our fans!</p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 contact-info\">\n");
      out.write("                <p><i class=\"fa-solid fa-phone\"></i> Phone: +91 9770127656</p>\n");
      out.write("                <p><i class=\"fa-solid fa-envelope\"></i> Email: ojasvinisoni02@gmail.com</p>\n");
      out.write("                <p><i class=\"fa-solid fa-signs-post\"></i> Postal Code: 462022</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Name\" required />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\" required />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <textarea name=\"\" id=\"\" rows=\"5\" class=\"form-control mt-1\" placeholder=\"Enter your message..\"></textarea>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 form-group mt-1\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning\">Send</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script>\n");
      out.write("(function(){if(!window.chatbase||window.chatbase(\"getState\")!==\"initialized\"){window.chatbase=(...arguments)=>{if(!window.chatbase.q){window.chatbase.q=[]}window.chatbase.q.push(arguments)};window.chatbase=new Proxy(window.chatbase,{get(target,prop){if(prop===\"q\"){return target.q}return(...args)=>target(prop,...args)}})}const onLoad=function(){const script=document.createElement(\"script\");script.src=\"https://www.chatbase.co/embed.min.js\";script.id=\"d0e39hs6ns3OfteMWhT_D\";script.domain=\"www.chatbase.co\";document.body.appendChild(script)};if(document.readyState===\"complete\"){onLoad()}else{window.addEventListener(\"load\",onLoad)}})();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
