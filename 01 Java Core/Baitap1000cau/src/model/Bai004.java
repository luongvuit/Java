/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai004 {

    private int n;
    private double result = 0;

    public void sum4() {
//        double x = 3;
//        double y = 4;
//        double z = x/y;
//        System.out.println(5/2);
        // nhớ rồi, lâu vl quên mẹ mất
        //em để như 3/4 nó sẽ thực hiện phép chia 3/4 trước, sau đó gán cho z
        // vì thế 3/4 là kết quả <1, nó sẽ làm tròn về 0 vì double
        // là vậy
        // nếu đặt 2 cái là x và y đều là double, thì khi chia ra sẽ có kết quả 
        /*double , còn để 3/4 kia nó sẽ ngầm hiểu số 3 là int, số 4 là int, khi đó nó 
      chia ra kết quả và ép về int trước khi gán cho double
      // có gì k hiểu k
       nhưng mà lúc nãy là một biểu  thức 
      làm sao
       biểu thức 1/(2*i), i là int, 1 và 2 cũng là int, khi đó nó sẽ có kết quả int
      int gán cho double nó sẽ thành 
      biết sao nó ko ra 2,5 ko? dạ biết vì int chỉ lấy nguyên nhưng 
      Double.mà khi e viết bài này qua chương trình c thì lại oke
      // mỗi ngôn ngữ 1 khác, java nó hướng đối tượng
      // nên ban nãy a mới demo cái Double dobule = new Double();
      // nó sẽ từ đối tượng này và ép về kiểu nguyên thủy(unboxing)
      //chứ k phải nó đơn thuần là kiểu ng thủy
      // thế biểu thức nãy do khả năng tất cả là int nên nó trả về theo kiểu int đúng k a
      //tất cả bé hơn 0, khi trả về nó sẽ thành 0+0+..+0 và nó lại gán cho kiểu dobule
      // nó chả có ý nghĩa nếu giá trị đó đều là 0
      // nó chia lấy kết quả rồi nó mới gán,chứ k phải nó gán thành double
      //rồi nó chia
      // dạ oke e cám ơn a duy nhé
      //để a sửa luôn
         */
//      Double d = new Double;
//      d.doubleValue()// nó sẽ thành cái này, nó unboxing 
        // kiểu int và nó lấy giá trị double, cái này nó liên quan
        // tới đối tượng, e chưa học thì chỉ cần hiểu là
        /*
              như a nói, ví dụ 
              double d = 3/4;
              3/4 = 0 vì < 1( kết quả chia  < 1 nó sẽ cast về 0)
              ví dụ
              5/2 --> e đoán nó ra mấy 2
              
              
              
              
              
         */
//        System.out.println(z);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri n bai 4: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            double tu = 1; // để a xem nào, lâu r k đụng
            double mau = 2 * i;
            result += (tu / mau);
//            s += sum; // 1 chia 1 1 số nó sẽ có kết quả là 0 vì đây mặc định là kiểu integer
        }
        //chuyển về double xem
//        System.out.println(s);
        System.out.println(result);

        /*
            // ở đây ban đầu tử gán = 1 ban đầu số 1 là kiểu int của 
            lớp wrapper 
            sau đó ngầm định nó sẽ chuyển thành Integer.doublevalue();
            // nó sẽ lấy giá trị double bên trong cái hộp(wrapper) chứa
            // cái giá trị nguyên thủy( số 1) đó
            khi thành double thì nó sẽ là 1.0, khi đó nó mới gán
            cho double kia dc chứ k phải nó đem hẳn 1 gán cho double
            trong khi double là giá trị 1.0, 1.1,...
            thập phân
            khi gán cho thì khi tử và mẫu đều là double thì kết quả chia ra
            mới là double, còn tử or mẫu là int thì kết quả là int
            còn muốn nó k tự động ngầm định chuyển từ 1 sang 1.0
            thì em khai báo hẳn double tu = 1.0;
            khi đó nó k cần chuyển nữa, giá trị đã đúng kiểu nó cần rồi
            
            // mẫu nó sẽ là 1 là kiểu Integer,nó tự
            //kiểu double vì 2,4,6,8 từ kiểu int
            // nó gán cho double sau đó nó sẽ thành double
            giá trị sau khi gán là 2.0,4.0,6.0,...
            khi đó em chia tử
            có ý kiến gì k e
            nếu giả sử như float chia int thì sao a
            float cũng là giá trị thập phân, 1.0,2.0
         /... vân vân
            nhưng khác biệt ở đây là giới hạn max value của 2 kiểu này khác nhau
            và nó tiêu tốn lượng bit khác nhau
            float 32 bit còn double 64 bit thì phải, a ko nhớ kĩ 
            dạ mà ý e là float chia int nếu kết quả <1 thì giá trị nó cx cast về 0 à a ?
            // float chia int cũng như double chia int, 1 int 1 foat chia nhau nó thành int thôi
            //chỉ khi cả 2 đều cùng loại thập phân
            dạ vậy thì e hiểu rồi 
            cái này nó liên quan tới phần wrapper, unboxing và boxing trong java
            bản chất c nó khác vì java nó là hướng đối tượng, mọi thứ ở trong java 
            nó đều muốn thành đối tượng
            trong khi int, double, ...
            là các giá trị nguyên thủy, vì thế nó sẽ có 1 cách đó là có những chiếc hộp(wrapper)
            ví dụ như Double, Integer,Float,... nó sẽ wrapper các giá trị này
            có nghĩa là nó gói mấy giá trị này lại khi đó cái hộp đó là đối tượng
            và khi em muốn dùng giá trị nguyên thủy của chiếc hộp
            em phải mở chiếc hộp ra,thì em mới lấy dc cái bên trong của chiếc hộp
            đó là lý do vì sao có Double doituong - new Double() và double nguyenthuy =0;
            giả sử thế.1 cái là đối tượng chứa dữ liệu nguyên thủy
            1 cái là dữ liệu nguyên thủy
            và cái doituong.doubleValue() nó sẽ mở chiếc hộp đó ra, và lấy giá trị nguyên
            thủy bên trong
            e hiểu chưa nếu lấy giá trị bên trong thì phải cần thêm một phương thức để nó lấy nữa đúng k a
            k hẳn là thế
            java nó có những thứ ngầm định sẽ làm điều đó cho em, hoặc em có thể tự làm nếu
            k muốn ngầm định theo mặc định
             đấy là a demo thôi chứ 1 đối tượng có thể dùng nhiều cách
            đâu phải chỉ dùng ở trong method
            nên là đây chỉ là 1 trường hợp của nó thôi
            1 ví dụ cho e thấy
            dạ vâng ạ 
            thế nên đừng chạy theo đối tượng vội, cứ lo viết hàm main đi
            dạ :v haha
            e cám ơn a duy nhé
            hơi tốn time của a duy :v
            ok k sao
            e 
            cái gì a giúp dc thì a giúp
            dạ e cám ơn a duy nhiều :v
            ok e
            a out 
            dạ e chào a
            a demo cho cái ví dụ luôn
         */
    }

}
