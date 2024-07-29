package btoop.src.Account;

public class Account {
    private  String id ,costomerId, useName,passWord;

    public Account(String id, String costomerId, String useName, String passWord) {
        this.id = id;
        this.costomerId = costomerId;
        this.useName = useName;
        this.passWord = passWord;
    }
    public boolean checkLogin(String username, String passWord){
        if(this.useName.equals(username) && this.passWord.equals(passWord))
            return true;
        else
            return false;
    }
}
