// ４つのパッケージのインポート
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/first")  //マッピング名の指定
public class FirstServlet extends HttpServlet {  //HttpServlet継承
    public void doGet(HttpServletRequest req, HttpServletResponse res)  
    throws IOException, ServletException {  //例外の指定
        res.setContentType("text/html;charset=utf-8");  //コンテンツタイプの指定
        PrintWriter out = res.getWriter();  //PrintWriterを取得
        out.println("<html>");              //PrintWriterで出力
        out.println("<head>");
        out.println("<title>はじめてのサーブレット</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>サーブレットを始めよう</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
コンパイル時の記述：
tomcat version 10使用。
CATALINA_HOMEにtomcatフォルダパスを設定した上で以下を記述
javac -encoding utf-8 -classpath "%CATALINA_HOME%\lib\servlet-api.jar" FirstServlet.java
*/