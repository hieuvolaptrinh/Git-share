package String.src;

public class Chuan_Hoa_ten {
//String trong Java không thể thay đổi một khi nó đã được khai báo, để sử
//dụng các hàm như chèn, xóa, thêm kí tự ta có thể sử dụng lớp StringBuilder
    public static void main(String[] args) {
        String s = "NgUYEN ThUY    liNh";
        StringBuilder sb = new StringBuilder("");
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int j = 1; j < x.length( ); j++) {
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length( ) - 1); // xóa dấu cách thừa
        System.out.println(sb.toString( ));

    }
}
