// ４つのパッケージのインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

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