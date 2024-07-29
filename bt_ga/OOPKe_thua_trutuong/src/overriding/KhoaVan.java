package overriding;

public class KhoaVan extends NamHoc2023{
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }
//    overrride

    @Override
    public void tinhDTB() {
        System.out.println("đây là pt tính điểm trung bu=ình khoa văn" );
    }
}
