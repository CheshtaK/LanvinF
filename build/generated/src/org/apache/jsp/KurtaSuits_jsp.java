package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public final class KurtaSuits_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/NewHeader1.jsp");
    _jspx_dependants.add("/SearchBox1.jsp");
    _jspx_dependants.add("/Heart.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write(".card {\n");
      out.write("    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("    max-width: 170px;\n");
      out.write("    margin: auto;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("    color: grey !important;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 8px;\n");
      out.write("    color: white;\n");
      out.write("    background-color: #000;\n");
      out.write("    text-align: center;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    font-size: 12px;\n");
      out.write("    \n");
      out.write("     -webkit-border-radius: 20px;\n");
      out.write("   -moz-border-radius: 20px;\n");
      out.write("   border-radius: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover, a:hover {\n");
      out.write("    opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img{\n");
      out.write("    opacity: 1;\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    transition: .5s ease;\n");
      out.write("    backface-visibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".favorites{\n");
      out.write("    transition: .5s ease;\n");
      out.write("    opacity: 0;  \n");
      out.write("    position: relative;\n");
      out.write("    top: -250px;\n");
      out.write("    left: 90px;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    -ms-transform: translate(-50%, -50%)\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover img {\n");
      out.write("  opacity: 0.3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover .favorites {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa {\n");
      out.write("    font-size: 50px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".styled-select {\n");
      out.write("   background: url(http://i62.tinypic.com/15xvbd5.png) no-repeat 96% 0;\n");
      out.write("   height: 35px;\n");
      out.write("   overflow: hidden;\n");
      out.write("   width: 79px;\n");
      out.write("}\n");
      out.write(".styled-select select {\n");
      out.write("   background: transparent;\n");
      out.write("   border: none;\n");
      out.write("   font-size: 16px;\n");
      out.write("   color: white;\n");
      out.write("   height: 35px;\n");
      out.write("   padding: 5px; \n");
      out.write("   width: 105px; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".rounded {\n");
      out.write("   -webkit-border-radius: 20px;\n");
      out.write("   -moz-border-radius: 20px;\n");
      out.write("   border-radius: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".black   { background-color: #000;}\n");
      out.write("\n");
      out.write("#First{\n");
      out.write("    position: absolute;\n");
      out.write("    top:130px;\n");
      out.write("    left: 350px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Second{\n");
      out.write("    position: absolute;\n");
      out.write("    top:130px;\n");
      out.write("    left: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Third{\n");
      out.write("    position: absolute;\n");
      out.write("    top:130px;\n");
      out.write("    left:850px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Fourth{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 130px;\n");
      out.write("    left: 1100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Fifth{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 660px;\n");
      out.write("    left: 350px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Sixth{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 660px;\n");
      out.write("    left: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Seventh{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 660px;\n");
      out.write("    left: 850px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Eighth{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 660px;\n");
      out.write("    left: 1100px;\n");
      out.write("}\n");
      out.write("#price{\n");
      out.write("    font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#snackbar,#snackbar1 {\n");
      out.write("    visibility: hidden;\n");
      out.write("    min-width: 250px;\n");
      out.write("    margin-left: -125px;\n");
      out.write("    background-color: #333;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    padding: 16px;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    left: 50%;\n");
      out.write("    bottom: 30px;\n");
      out.write("    font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#snackbar.show,#snackbar1.show {\n");
      out.write("    visibility: visible;\n");
      out.write("    -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;\n");
      out.write("    animation: fadein 0.5s, fadeout 2.5s 4.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fadein {\n");
      out.write("    from {bottom: 0; opacity: 0;} \n");
      out.write("    to {bottom: 30px; opacity: 1;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadein {\n");
      out.write("    from {bottom: 0; opacity: 0;}\n");
      out.write("    to {bottom: 30px; opacity: 1;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fadeout {\n");
      out.write("    from {bottom: 30px; opacity: 1;} \n");
      out.write("    to {bottom: 0; opacity: 0;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadeout {\n");
      out.write("    from {bottom: 30px; opacity: 1;}\n");
      out.write("    to {bottom: 0; opacity: 0;}\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write(".w3-sidebar a {font-family: \"Roboto\", sans-serif}\n");
      out.write("#heading{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 25px;\n");
      out.write("    font-family: \"Helvetica\", sans-serif;\n");
      out.write("    text-height: 10px;\n");
      out.write("    color: mediumvioletred;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".w3-sidebar{\n");
      out.write("    position: absolute;\n");
      out.write("    left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-content\" style=\"max-width:1200px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"w3-sidebar w3-bar-block w3-white w3-collapse w3-top\" style=\"z-index:3;width:250px\" id=\"mySidebar\">\n");
      out.write("  <div class=\"w3-container w3-display-container w3-padding-16\">\n");
      out.write("    <i onclick=\"w3_close()\" class=\"fa fa-remove w3-hide-large w3-button w3-display-topright\"></i>\n");
      out.write("    <h1 id=\"heading\"><b>LANVIN</b></h1>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <div id=\"menu\" class=\"w3-padding-64 w3-large w3-text-grey\" style=\"font-weight:bold\">\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <a onclick=\"men()\" href=\"javascript:void(0)\" class=\"w3-button w3-block w3-white w3-left-align\">Men <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </a>\n");
      out.write("      <div id=\"men1\" class=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("      <a href=\"T-Shirts.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>T-Shirts</a>\n");
      out.write("      <a href=\"CasualShirts.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Casual Shirts</a>\n");
      out.write("      <a href=\"FormalShirts.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Formal Shirts</a>\n");
      out.write("      <a href=\"Sweaters.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Sweaters</a>\n");
      out.write("      <a href=\"Jackets.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Jackets</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <a onclick=\"women()\" href=\"javascript:void(0)\" class=\"w3-button w3-block w3-white w3-left-align\">Women <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </a>\n");
      out.write("      <div id=\"women1\" class=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("      <a href=\"KurtaSuits.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Kurtas & Suits</a>\n");
      out.write("      <a href=\"Dresses.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Dresses & Jumpsuits</a>\n");
      out.write("      <a href=\"Jeans.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Jeans & Jeggings</a>\n");
      out.write("      <a href=\"Shrugs.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Shrugs</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <a onclick=\"kids()\" href=\"javascript:void(0)\" class=\"w3-button w3-block w3-white w3-left-align\">\n");
      out.write("      Kids <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </a>\n");
      out.write("      <div id=\"kids1\" class=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("      <a href=\"T-ShirtsK.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>T-Shirts</a>\n");
      out.write("      <a href=\"DressesK.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Dresses</a>\n");
      out.write("      <a href=\"IndianK.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Indian Wear</a>\n");
      out.write("      <a href=\"DungareesK.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Dungarees</a>\n");
      out.write("      <a href=\"JeansK.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Jeans & Trousers</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <a onclick=\"hnl()\" href=\"javascript:void(0)\" class=\"w3-button w3-block w3-white w3-left-align\">Home&Living <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </a>\n");
      out.write("    <div id=\"hnl1\" class=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("      <a href=\"Bedsheets.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Bedsheets</a>\n");
      out.write("      <a href=\"Towels.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Bath Towels</a>\n");
      out.write("      <a href=\"Clocks.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Clocks</a>\n");
      out.write("      <a href=\"Lamps.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-caret-right w3-margin-right\"></i>Lamps</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <a href=\"http://localhost:8080/LanvinF/About.jsp\" class=\"w3-bar-item w3-button w3-padding\">About</a> \n");
      out.write("  <a href=\"http://localhost:8080/LanvinF/Contact.jsp\" class=\"w3-bar-item w3-button w3-padding\">Contact</a> \n");
      out.write("  <a href=\"LoginPage.jsp\" class=\"w3-bar-item w3-button w3-padding\">Log In</a>\n");
      out.write("  <a href=\"RegistrationPage.jsp\" class=\"w3-bar-item w3-button w3-padding\">Sign Up</a>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"w3-bar w3-top w3-hide-large w3-black w3-xlarge\">\n");
      out.write("  <div class=\"w3-bar-item w3-padding-24 w3-wide\">LANVIN</div>\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-padding-24 w3-right\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function men() {\n");
      out.write("    var x = document.getElementById(\"men1\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else {\n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function women() {\n");
      out.write("    var x = document.getElementById(\"women1\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else {\n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function kids() {\n");
      out.write("    var x = document.getElementById(\"kids1\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else {\n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function hnl() {\n");
      out.write("    var x = document.getElementById(\"hnl1\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else {\n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Click on the \"Jeans\" link on page load to open the accordion for demo purposes\n");
      out.write("document.getElementById(\"myBtn\").click();\n");
      out.write("\n");
      out.write("\n");
      out.write("// Script to open and close sidebar\n");
      out.write("function w3_open() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function w3_close() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .search-box-wrapper {\n");
      out.write("                position: absolute;\n");
      out.write("                top:35px;\n");
      out.write("                right: 150px;\n");
      out.write("    display: inline-flex;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-box-input {\n");
      out.write("    font-size: inherit;\n");
      out.write("    border: 0.2em solid thistle;\n");
      out.write("    border-radius: 0.5em 0 0 0.5em;\n");
      out.write("    padding: 0.2em 0.5em;\n");
      out.write("    outline: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-box-input:hover,\n");
      out.write(".search-box-input:focus {\n");
      out.write("    border-color: thistle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-box-button {\n");
      out.write("    font-size: inherit;\n");
      out.write("    border: 0.2em solid thistle;\n");
      out.write("    border-radius: 0 0.5em 0.5em 0;\n");
      out.write("    background-color: thistle;\n");
      out.write("    border-left: 0;\n");
      out.write("    padding: 0 0.75em;\n");
      out.write("    color: #000;\n");
      out.write("    font-weight: bold;\n");
      out.write("    outline: 0;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-box-button:hover,\n");
      out.write(".search-box-button:focus {\n");
      out.write("    border-color: thistle;\n");
      out.write("    background-color: thistle;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bag{\n");
      out.write("    position: absolute;\n");
      out.write("    top:0px;\n");
      out.write("    right: -80px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"search-box-wrapper\">\n");
      out.write("            <input type=\"text\" placeholder=\"Search...\" class=\"search-box-input\">\n");
      out.write("            <button class=\"search-box-button\">&#128269;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</button>\n");
      out.write("            <div>\n");
      out.write("                <a href=\"Wishlist.jsp\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            .heart {\n");
      out.write("  width: 100px;\n");
      out.write("  height: 100px;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 350px;\n");
      out.write("  top: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  background: url(https://cssanimation.rocks/images/posts/steps/heart.png) no-repeat;\n");
      out.write("  background-position: 0 0;\n");
      out.write("  cursor: pointer;\n");
      out.write("  animation: fave-heart 1s steps(28);\n");
      out.write("}\n");
      out.write(".heart:hover {\n");
      out.write("  background-position: -2800px 0;\n");
      out.write("  transition: background 1s steps(28);\n");
      out.write("}\n");
      out.write("@keyframes fave-heart {\n");
      out.write("  0% {\n");
      out.write("    background-position: 0 0;\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    background-position: -2800px 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"heart\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"CartTry.jsp\"><i id=\"bag\" class=\"fa fa-shopping-bag\" style=\"font-size:36px;\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form name=\"form1\">\n");
      out.write("        ");

                try
                {
                    Connection con;
                    Statement st;
                    ResultSet rs;
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineShopping","root","cheshta");
                    st = con.createStatement();
                    rs = st.executeQuery("select * from Women where Category='KS'");
                while(rs.next())
                {
                
      out.write("\n");
      out.write("                <div class=\"card\" id=\"");
      out.print(rs.getString(9));
      out.write("\">\n");
      out.write("                    \n");
      out.write("                    <img src=\"");
      out.print(rs.getString(2));
      out.write("\" alt=\"KurtaSuit\">\n");
      out.write("                    \n");
      out.write("                    <h1>");
      out.print(rs.getString(4));
      out.write("</h1>\n");
      out.write("                    <p class=\"title\">");
      out.print(rs.getString(5));
      out.write("</p>\n");
      out.write("                    <p id=\"price\">Rs.");
      out.print(rs.getString(6));
      out.write("  <strike>Rs.");
      out.print(rs.getString(7));
      out.write("</strike> <text style=\"color:red\">");
      out.print(rs.getString(8));
      out.write("% off</text></p>\n");
      out.write("                    <p class=\"favorites\"><i onclick=\"addWish(");
      out.print(rs.getString(1));
      out.write(");\" class=\"fa fa-heart\" style=\"font-size:16px;color:red\"></i></p>    \n");
      out.write("                    <div id=\"snackbar\">Added to Wishlist</div>\n");
      out.write("                    <div id=\"snackbar1\">Added to Cart</div>\n");
      out.write("                        <table style=\"width:170px\">\n");
      out.write("                        <tr>\n");
      out.write("                        <td width=\"50%\"><button onclick=\"addCart(");
      out.print(rs.getString(1));
      out.write(");\">Bag</button></td>\n");
      out.write("                        <td>\n");
      out.write("                        <div  class=\"styled-select black rounded\">\n");
      out.write("                            <select name=\"size\" id=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                        <option value=\"S\">S</option>\n");
      out.write("                                        <option value=\"M\">M</option>\n");
      out.write("                                        <option value=\"L\">L</option>\n");
      out.write("                                        <option value=\"XL\">XL</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </table>\n");
      out.write("                </div>                              \n");
      out.write("                ");

                }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                
      out.write("         \n");
      out.write("        </form>\n");
      out.write("    </body> \n");
      out.write("    \n");
      out.write("    <script language=\"javascript\">\n");
      out.write("            function addCart(Id){\n");
      out.write("                var sel = document.getElementById(Id);\n");
      out.write("                var selValue = sel.options[sel.selectedIndex].value; \n");
      out.write("                var f=document.form1;\n");
      out.write("                f.method=\"post\";\n");
      out.write("                f.action='http://localhost:8080/LanvinF/MenServlet?Id='+Id+'&Size='+selValue;\n");
      out.write("                f.submit();\n");
      out.write("                \n");
      out.write("                var x = document.getElementById(\"snackbar1\")\n");
      out.write("                x.className = \"show\";\n");
      out.write("                setTimeout(function(){ x.className = x.className.replace(\"show\", \"\"); }, 3000);\n");
      out.write("            }\n");
      out.write("            function addWish(Id){\n");
      out.write("                var sel = document.getElementById(Id);\n");
      out.write("                var selValue = sel.options[sel.selectedIndex].value;\n");
      out.write("                var f=document.form1;\n");
      out.write("                f.method=\"post\";\n");
      out.write("                f.action='http://localhost:8080/LanvinF/MenWServlet?Id='+Id+'&Size='+selValue;\n");
      out.write("                f.submit();\n");
      out.write("            \n");
      out.write("                var x = document.getElementById(\"snackbar\")\n");
      out.write("                x.className = \"show\";\n");
      out.write("                setTimeout(function(){ x.className = x.className.replace(\"show\", \"\"); }, 3000);\n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("</html>");
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
