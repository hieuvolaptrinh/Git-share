package overriding;

public class KhoaToan  extends NamHoc2023{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

//    overide ; tái định nghĩa

    @Override
    public void tinhDTB() {
        System.out.println("đây là phương thức tính dtb của khoa toán" );
    }
}
