package overriding;

public class KhoaAnh extends NamHoc2023{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }

//    overide ; tái định nghĩa

    @Override
    public void tinhDTB() {
        System.out.println("đây là phương thức tính dtb của khoa Anh" );
    }
}
