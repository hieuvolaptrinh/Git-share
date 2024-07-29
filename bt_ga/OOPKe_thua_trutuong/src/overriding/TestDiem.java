package overriding;

public class TestDiem {
    public static void main(String[] args) {
        KhoaToan t1=new KhoaToan("võ hiếu","123213");
        t1.tinhDTB();
        KhoaAnh a1= new KhoaAnh("anh13124","124234");
        a1.tinhDTB();
    }
}
