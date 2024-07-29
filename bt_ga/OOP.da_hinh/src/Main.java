//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NhanSU ns1 = new PhoPhong( "võ nguyên đại"," cccd 999999999","quãng nam");
//        xuất lương lúc là phó phòng
        System.out.println("lương phó phòng là"+ns1.tinhLuong(20) );
        System.out.println("tên là "+ns1.getTen() );
//    xuất lương lúc là trưởng phòng
//        ns1 = new TruongPhong(); // nhận ra ns1 sẽ bị mất đi tên , cccd và quê quán, từ đó phải viết lại
        ns1= new TruongPhong( ns1.getQue(), ns1.getCccd( ),ns1.getTen() );
//        lương khi là trưởng phòng
        System.out.println("tên là "+ns1.getTen() );
        System.out.println("lương khi là trưởng phòng "+ns1.tinhLuong(20) );
    }
}