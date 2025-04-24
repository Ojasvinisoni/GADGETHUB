package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            background: linear-gradient(135deg, #f3e5f5, #ce93d8); /* Soft pastel purple to pink */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section {\n");
      out.write("            background: linear-gradient(135deg, #fce4ec, #f8bbd0); /* Soft pink gradient for the section */\n");
      out.write("            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);\n");
      out.write("            padding: 50px;\n");
      out.write("            margin: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: none;\n");
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
      out.write("            color: #444;\n");
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
      out.write("            color: #9c27b0; /* Purple icon color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .form-control {\n");
      out.write("            border: 2px solid #f06292;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            padding: 16px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: border-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .form-control:focus {\n");
      out.write("            border-color: #9c27b0;\n");
      out.write("            box-shadow: 0 0 12px rgba(156, 39, 176, 0.4);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-section form .btn-warning {\n");
      out.write("            background: linear-gradient(135deg, #ba68c8, #ab47bc); /* Lavender to purple button */\n");
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
      out.write("        <p>We'd love to hear from you!</p>\n");
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
      out.write("    <script>\n");
      out.write("    (function(){\n");
      out.write("        if(!window.chatbase || window.chatbase(\"getState\") !== \"initialized\"){\n");
      out.write("            window.chatbase = (...arguments) => {\n");
      out.write("                if(!window.chatbase.q) { window.chatbase.q = [] }\n");
      out.write("                window.chatbase.q.push(arguments);\n");
      out.write("            };\n");
      out.write("            window.chatbase = new Proxy(window.chatbase, {\n");
      out.write("                get(target, prop) {\n");
      out.write("                    if(prop === \"q\") return target.q;\n");
      out.write("                    return (...args) => target(prop, ...args);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        const onLoad = function(){\n");
      out.write("            const script = document.createElement(\"script\");\n");
      out.write("            script.src = \"https://www.chatbase.co/embed.min.js\";\n");
      out.write("            script.id = \"d0e39hs6ns3OfteMWhT_D\";\n");
      out.write("            script.domain = \"www.chatbase.co\";\n");
      out.write("            document.body.appendChild(script);\n");
      out.write("        };\n");
      out.write("        if(document.readyState === \"complete\"){\n");
      out.write("            onLoad();\n");
      out.write("        } else {\n");
      out.write("            window.addEventListener(\"load\", onLoad);\n");
      out.write("        }\n");
      out.write("    })();\n");
      out.write("    </script>\n");
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
