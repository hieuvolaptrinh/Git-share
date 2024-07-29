package overriding;

public class NamHoc2023 {
//    thuộc tính
    protected String ten;
    protected String cccd;

    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }
//    phunoge thức
    public void tinhDTB(){
        System.out.println("đây là phương thức tính điểm trung biình của class cha" );
    }
}
