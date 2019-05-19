/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.util.Scanner;
import model.Bai001;
import model.Bai002;
import model.Bai003;
import model.Bai004;
import model.Bai005;
import model.Bai006;
import model.Bai007;
import model.Bai008;
import model.Bai009;
import model.Bai010;
import model.Bai011;
import model.Bai012;
import model.Bai013;
import model.Bai014;
import model.Bai015;
import model.Bai016;
import model.Bai017;
import model.Bai018;
import model.Bai019;
import model.Bai020;
import model.Bai021;
import model.Bai022;
import model.Bai023;
import model.Bai024;
import model.Bai025;
import model.Bai029;
import model.Bai030;
import model.Bai031;
import model.Bai032;
import model.Bai033;
import model.Bai034;
import model.Bai036;
import model.Bai037;
import model.Bai038;
import model.Bai039;
import model.Bai040;
import model.Bai041;
import model.Bai049;
import model.Bai050;
import model.Bai053;
import model.Bai056;
import model.Bai059;
import model.Bai060;
import model.Bai062;
import model.Bai063;
import model.a.Bai064;
import model.a.Bai065;
import model.a.Bai066;
import model.a.Bai067;
import model.a.Bai075;
import model.a.Bai082;
import model.a.Bai088;
import model.a.Bai094;
import model.a.Bai096;
import model.a.Bai097;
import model.a.Bai098;
import model.a.Bai099;
import model.a.Bai101;
import model.a.Bai106;
import model.a.Bai109;
import model.a.Bai110;
import model.a.Bai111;
import model.a.Bai112;
import model.a.Bai113;
import model.a.Bai115;
import model.a.Bai122;
import model.a.Bai123;
import model.a.Bai124;
import model.a.Bai127;
import model.a.Bai134;
import model.a.Bai135;
import model.a.Bai136;
import model.a.Bai137;
import model.a.Bai155;
import model.a.Bai156;
import model.a.Bai157;
import model.a.Bai169;
import model.a.Bai173;
import model.a.Bai174;
import model.a.Bai175;
import model.a.Bai215;
import model.a.Bai222;
import model.b.Bai189;
import model.b.Bai226;
import model.b.Bai231;
import model.b.Bai232;
import model.b.Bai233;
import model.b.Bai234;
import model.b.Bai235;
import model.b.Bai247;
import model.b.Bai248;

/**
 *
 * @author Hoang Anh
 */
public class View {

    public static void main(String[] args) {
        //tiếp theo tạo đối tượng controller
        View view = new View();
        //double d = 3.0;
        //view.wrapper(d);
        //đây là kiểu nguyên thủy
        /*
        truyền vào nó sẽ thành đối tượng vì nó tự động boxing(đóng hộp)
        cho em(wrapper bởi chiếc hộp Double);
        //vì mỗi kiểu nguyên thủy sẽ có 1 chiếc hộp phù hợp với nó
        ví dụ int thì có Integer,double có Double, float có Float
        */
// ở đây nó cần 1 đối tượng, nhưng
                //em có thể truyền vào 1 giá trị nguyên thủy kiểu double
                //ý quên,...
                // khi đó nó sẽ tự chuyển từ kiểu nguyên thủy
                //sang kiểu đối tượng Double
       System.out.println("show1 chạy mô hình mvc, hiện full");
        //view.show();
                System.out.println("chạy xong show 1");
                System.out.println("show2 chạy switch case");
                view.show2();
                System.out.println("chạy xong show 2");
                //nếu muốn chạy từng hàm riêng thì xài view view = new view();
                //view.show();
                //chạy sẽ thấy
                //show chạy trước, mà show dùng mvc
                //nó sẽ hiện full
                //đó bây h là show2 chạy
                //để e hiểu a tách như này cho biết này
        
        //tiếp theo tạo đối tượng view để dùng method show
    }

    // đầu tiên view chỉ có nhiệm vụ hiển thị lên cho người dùng xem nên nó sẽ chỉ có chức năng show
    public void show() {
        //view sẽ dùng 2 controller để hiển thị
        //đầu tiên tạo hàm main
        Controller cl = new Controller();
        // thấy chưa a bảo để ý vào 1 tí
        // cái show2 là cái của switch case
        //cái show 1 là của mvc
        //nhìn này
    }
    //void wrapper(double wrap){ // Double wrap
    //System.err.println(wrap);  // wrap.IntValue đóng hộp lấy giá trị nguyên
        //có thấy gì ko,2 cái này hoàn toàn khác nhau
        //và sẽ k có boxing hay đóng hộp cho em vì đều là nguyên thủy
        //đó dùng . gì đó cũng k dc,vì nó k phải đối tượng
        //System.err.println(wrap);  // wrap.IntValue đóng hộp lấy giá trị nguyên
        /*
        em có thấy từ 1 kiểu nguyên thủy, mà nó xuồng này nó 
        đã sử dụng như 1 đối tượng, có nghĩa nó tự đóng hộp(ngầm định)
        boxing cho em
        từ cái hộp Double này em có thể lấy giá trị int
        hiểu chưa e.ví 
        à để a nói thêm
        ví dụ như này
        hiểu chưa e
        boxing này là mình tự đóng hay là mình chỉ cần method là nó có a
        k phải mình tự động, mà là java tự làm cho em
        nó muốn mọi thứ của nó tuân thủ hướng đối tượng
        
        */
    void show2() {
        //lúc này k dùng controller nữa dùng trực tiếp bằng switch
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập key");
        int key = scan.nextInt();
        //có key rồi thì dùng switch
            switch(key){
                case 1:
                // nếu nhập 1 thì gọi bài 1
                //a tạo đối tượng cách truyền thống
                Bai001 b1 = new Bai001();
                b1.sum();
                break;
                // nếu nhập 1 thì gọi bài 1
                //a tạo đối tượng cách truyền thống
                case 2:
                Bai002 b2 = new Bai002();
                b2.sum2();
                break;
                case 3:
                Bai003 b3 = new Bai003();
                b3.sum3();
                break;
                case 4:
                Bai004 b4 = new Bai004();
                b4.sum4();
                break;
                case 5:
                Bai005 b5 = new Bai005();   // b5= new Bai05;
                b5.sum5();
                break;
                case 6:
                Bai006 b6 = new Bai006();
                b6.sum6();
                break;
                case 7:
                Bai007 b7 = new Bai007();
                b7.sum7();
                break;
                case 8:
                Bai008 b8 = new Bai008();
                b8.sum8();
                break;
                case 9:
                Bai009 b9 = new Bai009();
                b9.sum9();
                break;
                case 10:
                Bai010 b10 = new Bai010();
                b10.tich10();
                case 11:
                Bai011 b11 = new Bai011();
                b11.tich11();
                break;
                case 12:
                Bai012 b12 = new Bai012();
                b12.tich12();
                break;
                case 13:
                Bai013 b13 = new Bai013();
                b13.tich13();
                break;
                case 14:
                Bai014 b14 = new Bai014();
                b14.tich14();
                break;
                case 15:
                Bai015 b15 = new Bai015();
                b15.tich15();
                break;
                case 16:
                Bai016 b16 = new Bai016();
                b16.tich16();
                break;
                case 17:
                Bai017 b17 = new Bai017();
                b17.tich17();
                break;
                case 18:
                Bai018 b18 = new Bai018();
                b18.tich18();
                break;
                case 19:
                Bai019 b19 = new Bai019();
                b19.tich19();
                break;
                case 20:
                Bai020 b20 = new Bai020();
                b20.tich20();
                break;
                case 21:
                Bai021 b21 = new Bai021();
                b21.tich21();
                break;
                case 22:
                Bai022 b22 = new Bai022();
                b22.tich22();
                break;
                case 23:
                Bai023 b23 = new Bai023();
                b23.tich23();
                break;
                case 24:
                Bai024 b24 = new Bai024();
                b24.tich24();
                break;
                case 25:
                Bai025 b25 = new Bai025();
                b25.tich25();
                break;
                case 29: 
                Bai029 b29 = new Bai029();
                b29.tich29();
                break;
                case 30:
                Bai030 b30 = new Bai030();
                b30.tich30();
                break;
                case 31:
                Bai031 b31 = new Bai031();
                b31.tich31();
                break;
                case 32:
                Bai032 b32 = new Bai032();
                b32.tich32();
                break;
                case 33:
                Bai033 b33 = new Bai033();
                b33.tich33();
                break;
                case 34:
                Bai034 b34 = new Bai034();
                b34.tich34();
                break;
                case 36:
                Bai036 b36 = new Bai036();
                b36.tich36();
                break;
                case 37:
                Bai037 b37 = new Bai037();
                b37.tich37();
                break;
                case 38:
                Bai038 b38 = new Bai038();
                b38.tich38();
                break;
                case 39:
                Bai039 b39 = new Bai039();
                b39.tich39();
                break;
                case 40:
                Bai040 b40 = new Bai040();
                b40.tich40();
                break;
                case 41:
                Bai041 b41 = new Bai041();
                b41.tich41();
                break;
                case 42:
                Bai049 b49 = new Bai049();
                b49.tich49();
                break;
                case 43:
                Bai050 b50 = new Bai050();
                b50.tich50();
                break;
                case 44:
                Bai053 b53 = new Bai053();
                b53.tich53();
                break;
                case 45:
                Bai056 b56 = new Bai056();
                b56.tich56();
                break;
                case 46:
                Bai059 b59 = new Bai059();
                b59.tich59();
                break;
                case 47:
                Bai060 b60 = new Bai060();
                b60.tich60();
                break;
                case 48:
                Bai062 b62 = new Bai062();
                b62.tich62();
                break;
                case 49:
                Bai063 b63 = new Bai063();
                b63.tich63();
                break;
                case 50:
                Bai064 b64 = new Bai064();
                b64.tich64();
                break;
                case 51:
                Bai065 b65 = new Bai065();
                b65.tich65();
                break;
                case 52:
                Bai066 b66 = new Bai066();
                b66.tich66();
                break;
                case 53:
                Bai067 b67 = new Bai067();
                b67.tich67();
                break;
                case 54:
                Bai075 b75 = new Bai075();
                b75.tich75();
                break;
                case 55:
                Bai082 b82 = new Bai082();
                b82.tich82();
                break;
                case 56:
                Bai088 b88 = new Bai088();
                b88.tich88();
                break;
                case 57:
                Bai094 b94 = new Bai094();
                b94.tich94();
                break;
                case 58:
                Bai096 b96 = new Bai096();
                b96.tich96();
                break;
                case 59:
                Bai097 b97 = new Bai097();
                b97.tich97();
                break;
                case 60:
                Bai098 b98 = new Bai098();
                b98.tich98();
                break;
                case 61:
                Bai099 b99 = new Bai099();
                b99.tich99();
                break;
                case 62:
                Bai101 b101 = new Bai101();
                b101.tich101();
                break;
                case 63:
                Bai106 b106 = new Bai106();
                b106.tich106();
                break;
                case 64:
                Bai109 b109 = new Bai109();
                b109.tich109();
                break;
                case 65:
                Bai110 b110 = new Bai110();
                b110.tich110();
                break;
                case 66:
                Bai111 b111 = new Bai111();
                b111.tich111();
                break;
                case 67:
                Bai112 b112 = new Bai112();
                b112.tich112();
                break;
                case 68:
                Bai113 b113 = new Bai113();
                b113.tich113();
                break;
                case 69:
                Bai115 b115 = new Bai115();
                b115.tich115();
                break;
                case 70:
                Bai122 b122 = new Bai122();
                b122.tich122();
                break;
                case 71:
                Bai123 b123 = new Bai123();
                b123.tich123();
                break;
                case 72:
                Bai124 b124 = new Bai124();
                b124.tich124();
                break;
                case 73:
                Bai127 b127 = new Bai127();
                b127.tich127();
                break;
                case 74:
                Bai134 b134 = new Bai134();
                b134.tich134();
                break;
                case 75:
                Bai135 b135 = new Bai135();
                b135.tich135();
                break;
                case 76:
                Bai136 b136 = new Bai136();
                b136.tich136();
                break;
                case 77:
                Bai137 b137 = new Bai137();
                b137.tich137();
                break;
                case 78:
                Bai155 b155 = new Bai155();
                b155.tich155();
                break;
                case 79:
                Bai156 b156 = new Bai156();
                b156.tich156();
                break;
                case 80:
                Bai157 b157 = new Bai157();
                b157.tich157();
                break;
                case 81:
                Bai169 b169 = new Bai169();
                b169.tich169();
                break;
                case 82:
                Bai173 b173 = new Bai173();
                b173.tich173();
                break;
                case 83:
                Bai174 b174 = new Bai174();
                b174.tich174();
                break;
                case 84:
                Bai175 b175 = new Bai175();
                b175.tich175();
                break;
                case 85:
                Bai215 b215 = new Bai215();
                b215.tich215();
                break;
                case 86:
                Bai222 b222 = new Bai222();
                b222.tich222();
                break;
                case 87:
                Bai226 b226 = new Bai226();
                b226.tich226();
                break;
                case 88:
                Bai231 b231 = new Bai231();
                b231.tich231();
                break;
                case 89:
                Bai189 b189 = new Bai189();
                b189.tich189();
                break;
                case 90:
                Bai232 b232 = new Bai232();
                b232.tich232();
                break;
                case 91:
                Bai233 b233 = new Bai233();
                b233.tich233();
                break;
                case 92:
                Bai234 b234 = new Bai234();
                b234.tich234();
                break;
                case 93:
                Bai235 b235 = new Bai235();
                b235.tich235();
                break;
                case 94:
                Bai247 b247 = new Bai247();
                b247.tich247();
                break;
                case 95:
                Bai248 b248 = new Bai248();
                b248.tich248();
                break;
            default:  System.out.println("đéo chọn à");
        }
    }
}