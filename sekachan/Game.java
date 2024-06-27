/*****************************/
/* ゲーム枠の作成（全体構造）*/
/*   coded by Y.Suganuma     */
/*****************************/
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import main.*;

public class Game {
    public static void main (String[] args)
    {
        Win win = new Win("全体構造");
    }
}

class Win extends JFrame
{
    /******************/
    /* コンストラクタ */
    /******************/
    Win(String name)
    {
                    // JFrameクラスのコンストラクタ（Windowのタイトルを引き渡す）
        super(name);
                    // Windowの大きさ
        setSize(460, 390);   // +left+right+20, +top+bottom+20
//		Insets ins = getInsets();
//		System.out.println(ins.top + " " + ins.left + " " + ins.bottom + " " + ins.right);
                    // MainPanel の大きさを決定
        Dimension size = getSize(); 
        size.width  -= 60;   // パネルの横幅
        size.height -= 90;   // パネルの高さ
                    // ContentPain を取得し，設定
        Container CP = getContentPane();   // ContentPane を取得
        CP.setLayout(null);   // レイアウトマネージャを停止
        CP.setBackground(new Color(220, 255, 220));   // 背景色
                    // MainPanel を追加し，設定
        MainPanel pn = new MainPanel(size);   // MainPanel オブジェクトの生成
        CP.add(pn);   // MainPanel オブジェクトを ContentPane に追加			pn.setSize(size.width, size.height);
        pn.setLocation(10, 10);
                    // ウィンドウを表示
        setVisible(true);
                    // イベントリスナ
        addWindowListener(new WinEnd());
    }

    /******************************/
    /* 上，左，下，右の余白の設定 */
    /******************************/
    public Insets getInsets()
    {
        return new Insets(50, 20, 20, 20);
    }

    /************/
    /* 終了処理 */
    /************/
    class WinEnd extends WindowAdapter
    {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
