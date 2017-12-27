package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("body{\n");
      out.write("    background-color: #ffccff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".background{\n");
      out.write("    background-color: white;\n");
      out.write("    position: relative;\n");
      out.write("    width: 30px;\n");
      out.write("    height: 95px;\n");
      out.write("    box-shadow: 10px 10px 5px grey;\n");
      out.write("    padding: 200px;\n");
      out.write("    margin-top: 100px;\n");
      out.write("    margin-left: 450px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".heading{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50px;\n");
      out.write("    left: 105px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#UserName{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 150px;\n");
      out.write("    left: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    width: 325px;\n");
      out.write("    border-radius: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#PasswordBox{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 205px;\n");
      out.write("    left: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    width: 325px;\n");
      out.write("    border-radius: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#LoginButton{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 300px;\n");
      out.write("    left: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    width: 325px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    background-color:#ff3399;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#LoginButton:hover{\n");
      out.write("    background-color:#ff66b3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#RecoverPassword{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 400px;\n");
      out.write("    left: 50px;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#NewUser{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 427px;\n");
      out.write("    left: 50px;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#NewUser1{\n");
      out.write("    position:absolute;\n");
      out.write("    top: 427px;\n");
      out.write("    left: 145px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>` \n");
      out.write("        <div class=\"background\">\n");
      out.write("\t<form action=\"http://localhost:8080/LanvinF/LoginServlet\" method=\"post\">\n");
      out.write("\t<div class=\"heading\" style=\"font-size:35px;weight:bold;font-family:Garamond;color:mediumvioletred\">Login to Lanvin</div>\n");
      out.write("\t<input id=\"UserName\" type=\"text\" name=\"username\" style=\"font-size:15px;font-family:Bookman\" placeholder=\" Enter Username\" required> \n");
      out.write("\t<input id=\"PasswordBox\" type=\"password\" name=\"password\" style=\"font-size:15px;font-family:Bookman\" placeholder=\" Enter Password\" required>\n");
      out.write("\t<input id=\"LoginButton\" type=\"submit\" style=\"font-size:15px;font-family:Arial Black;color:white\" value=\"LOG IN\">\n");
      out.write("\t<a href=\"\" id=\"RecoverPassword\" style=\"font-size:14px;color:#ff3399\">Recover Password</a>\n");
      out.write("\t<font id=\"NewUser\" style=\"font-size:14px\">New to Lanvin?</font>\n");
      out.write("\t<a href=\"http://localhost:8080/LanvinF/RegisterServlet\" id=\"NewUser1\" style=\"font-size:14px;color:#ff3399\">Create Account</a>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write(".headerf ul{\n");
      out.write("    list-style-type: none;\n");
      out.write("    left: 160px;\n");
      out.write("    top: 0;\n");
      out.write("    right: 160px;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: visible;\n");
      out.write("     background-color: #ffccff;\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li{\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li a, .dropbtn{\n");
      out.write("    display: block;\n");
      out.write("    color: black;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 24px 26px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li a:hover:not(.active), .dropdown:hover .dropbtn{\n");
      out.write("    background-color: palevioletred;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li.dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #ffccff;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #ffccff}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"headerf\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a class=\"active\" href=\"\" style=\"font-size:20px;color:mediumvioletred;weight:bold\">CK Fashions</a></li>\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"dropbtn\">Men</a>\n");
      out.write("\t\t\t<div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"T-Shirts.jsp\">T-Shirts</a>\n");
      out.write("      \t\t\t<a href=\"CasualShirts.jsp\">Casual Shirts</a>\n");
      out.write("      \t\t\t<a href=\"FormalShirts.jsp\">Formal Shirts</a>\n");
      out.write("      \t\t\t<a href=\"Sweaters.jsp\">Sweaters</a>\n");
      out.write("      \t\t\t<a href=\"Jackets.jsp\">Jackets</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"dropbtn\">Women</a>\n");
      out.write("\t\t\t<div class=\"dropdown-content\">\n");
      out.write("\t\t\t\t<a href=\"KurtaSuits.jsp\">Kurtas & Suits</a>\n");
      out.write("\t\t\t\t<a href=\"Dresses.jsp\">Dresses & Jumpsuits</a>\n");
      out.write("\t\t\t\t<a href=\"Jeans.jsp\">Jeans & Jeggings</a>\n");
      out.write("\t\t\t\t<a href=\"Shrugs.jsp\">Shrugs</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"dropbtn\">Kids</a>\n");
      out.write("\t\t\t<div class=\"dropdown-content\">\n");
      out.write("\t\t\t\t<a href=\"T-ShirtsK.jsp\">T-Shirts</a>\n");
      out.write("\t\t\t\t<a href=\"DressesK.jsp\">Dresses</a>\n");
      out.write("\t\t\t\t<a href=\"IndianK.jsp\">Indian Wear</a>\n");
      out.write("\t\t\t\t<a href=\"DungareesK.jsp\">Dungarees</a>\n");
      out.write("\t\t\t\t<a href=\"JeansK.jsp\">Jeans & Trousers</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"dropbtn\">Home&Living</a>\n");
      out.write("\t\t\t<div class=\"dropdown-content\">\n");
      out.write("\t\t\t\t<a href=\"Bedsheets.jsp\">Bedsheets</a>\n");
      out.write("\t\t\t\t<a href=\"Towels.jsp\">Bath Towels</a>\n");
      out.write("\t\t\t\t<a href=\"Clocks.jsp\">Clocks</a>\n");
      out.write("\t\t\t\t<a href=\"Lamps.jsp\">Lamps</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li><a href=\"http://localhost:8080/LanvinF/About.jsp\">About</a></li>\n");
      out.write("\t\t<li>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</li>\n");
      out.write("\t\t<li><a href=\"http://localhost:8080/LanvinF/LoginPage.jsp\">Log in</a>\n");
      out.write("\t\t<li><a href=\"http://localhost:8080/LanvinF/RegistrationPage.jsp\">Sign Up</a>\n");
      out.write("\t</ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("    <div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write(".fa {\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 10px;  \n");
      out.write("  width: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  margin: 3px 1px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa:hover {\n");
      out.write("    opacity: 0.7;\n");
      out.write("}\n");
      out.write(".fa-facebook {\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 140px;\n");
      out.write("\tleft: -700px;\n");
      out.write("  \tbackground: #3B5998;\n");
      out.write("  \tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-twitter {\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 78px;\n");
      out.write("\tleft: 610px;\n");
      out.write("  \tbackground: #55ACEE;\n");
      out.write("  \tcolor: white;\n");
      out.write("}\n");
      out.write(".fa-youtube {\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 77px;\n");
      out.write("\tleft: 615px;\n");
      out.write("  \tbackground: #bb0000;\n");
      out.write("  \tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-instagram {\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 77px;\n");
      out.write("\tleft: 615px;\n");
      out.write("  \tbackground: #125688;\n");
      out.write("  \tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#os{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 10px;\n");
      out.write("\tleft: 160px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#men{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:50px; \n");
      out.write("\tleft: 45px;\n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#women{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:70px;\n");
      out.write("\tleft: 15px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#kids{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:90px;\n");
      out.write("\tleft: -32px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#hl{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:110px;\n");
      out.write("\tleft: -61px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#ul{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 10px;\n");
      out.write("\tleft: 60px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\t\n");
      out.write("#contact{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:50px;\n");
      out.write("\tleft: -30px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#faq{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:70px;\n");
      out.write("\tleft: -100px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#tc{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:90px;\n");
      out.write("\tleft: -135px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#tou{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:110px;\n");
      out.write("\tleft: -164px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#track{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:130px;\n");
      out.write("\tleft: -254px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#ship{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:150px;\n");
      out.write("\tleft: -340px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#cancel{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:170px;\n");
      out.write("\tleft: -396px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#blog{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop:190px;\n");
      out.write("\tleft: -472px; \n");
      out.write("\tcolor: grey;\n");
      out.write("\tfont-size:13px;\n");
      out.write("\tfont-family:Comic Sans MS;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#exp{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 10px;\n");
      out.write("\tleft: -300px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#gplay{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 62px;\n");
      out.write("\tleft: -510px;\n");
      out.write("}\n");
      out.write("#apple{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 60px;\n");
      out.write("\tleft: -500px;\n");
      out.write("}\n");
      out.write("#kit{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 100px;\n");
      out.write("\tleft: -603px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("#gua{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: -10px;\n");
      out.write("\tleft: 850px;\n");
      out.write("}\n");
      out.write("#text{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: -25px;\n");
      out.write("\tleft: 880px;\n");
      out.write("}\n");
      out.write("#textc{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: -5px;\n");
      out.write("\tleft: 690px;\n");
      out.write("}\n");
      out.write("#delive{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 70px;\n");
      out.write("\tleft: 420px;\n");
      out.write("}\n");
      out.write("#text2{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 50px;\n");
      out.write("\tleft: 450px;\n");
      out.write("}\n");
      out.write("#text2c{\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 70px;\n");
      out.write("\tleft: 270px;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\tcolor:black !important;\n");
      out.write("}\n");
      out.write("hr { \n");
      out.write("\tdisplay: block;\n");
      out.write("    margin-top: 155px;\n");
      out.write("    margin-left: 150px;\n");
      out.write("    margin-right: 150px;\n");
      out.write("    border-style: groove;\n");
      out.write("    border-width: 1.5px;\n");
      out.write("} \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#ffccff\">\n");
      out.write("        <a href=\"\" id=\"os\" style=\"font-size:12px;font-family:Helvetica;color:black;font-weight:bold\">ONLINE SHOPPING</a>\n");
      out.write("<a href=\"\" id=\"men\">Men</a>\n");
      out.write("<a href=\"\" id=\"women\">Women</a>\n");
      out.write("<a href=\"\" id=\"kids\">Kids</a>\n");
      out.write("<a href=\"\" id=\"hl\">Home & Living</a>\n");
      out.write("\t<font id=\"ul\" style=\"font-size:12px;font-family:Helvetica;color:black;font-weight:bold\">USEFUL LINKS</font>\n");
      out.write("\t<a href=\"\" id=\"contact\">Contact Us</a>\n");
      out.write("\t<a href=\"\" id=\"faq\">FAQ</a>\n");
      out.write("\t<a href=\"\" id=\"tc\">T&C</a>\n");
      out.write("\t<a href=\"\" id=\"tou\">Terms Of Use</a>\n");
      out.write("\t<a href=\"\" id=\"track\">Track Orders</a>\n");
      out.write("\t<a href=\"\" id=\"ship\">Shipping</a>\n");
      out.write("\t<a href=\"\" id=\"cancel\">Cancellation</a>\n");
      out.write("\t<a href=\"\" id=\"blog\">Blog</a>\n");
      out.write("\t\t<font id=\"exp\" style=\"font-size:12px;font-family:Helvetica;color:black;font-weight:bold\">EXPERIENCE LANVIN APP ON MOBILE</font>\n");
      out.write("\t\t<i class=\"fa fa-google\" id=\"gplay\" style=\"font-size:36px\"></i>\n");
      out.write("\t\t<i class=\"fa fa-apple\" id=\"apple\" style=\"font-size:38px\"></i>\n");
      out.write("\t\t<font id=\"kit\" style=\"font-size:12px;font-family:Helvetica;color:black;font-weight:bold\">KEEP IN TOUCH</font>\n");
      out.write("\t\t<a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("\t\t<a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("\t\t<a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("\t\t<a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("\t\t\t<i class=\"fa fa-angellist\" id=\"gua\" style=\"font-size:36px\"></i>\n");
      out.write("\t\t\t<font id=\"text\" style=\"font-size:15px;font-family:Helvetica;color:black\"><b>100% ORIGINAL</b> guarantee</font>\n");
      out.write("\t\t\t<font id=\"textc\" style=\"font-size:15px;font-family:Helvetica;color:black\">for all products at Lanvin.com</font>\n");
      out.write("\t\t\t<i class=\"fa fa-truck\" id=\"delive\" style=\"font-size:36px;\"></i>\n");
      out.write("\t\t\t<font id=\"text2\" style=\"font-size:15px;font-family:Helvetica;color:black\">Get <b>free delivery</b> for every</font>\n");
      out.write("\t\t\t<font id=\"text2c\" style=\"font-size:15px;font-family:Helvetica;color:black\">order above Rs. 1199</font>  \n");
      out.write("<hr>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
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
