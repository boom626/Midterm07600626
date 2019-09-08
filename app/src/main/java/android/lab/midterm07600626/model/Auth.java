package android.lab.midterm07600626.model;

public class Auth {
    private static final String EMILL1 ="aaa";   //ทุกอย่างที่อยู่ในclass จะเหนค่านี้
    private static final String PASSWORD1 ="111";

    private static final String EMILL2 ="bbb";   //ทุกอย่างที่อยู่ในclass จะเหนค่านี้
    private static final String PASSWORD2 ="222";
    //keep data
    private String mEmail;
    private  String mPassword;

    public Auth(String Email, String Password) {
        this.mEmail = Email;
        this.mPassword = Password;
    }


    public boolean check(){
        if(mEmail.equals(EMILL1)&& mPassword.equals(PASSWORD1)){
            return true;
        }else if(mEmail.equals(EMILL2)&& mPassword.equals(PASSWORD2)){
            return true;
        }else{return false;}
    }
    public boolean check_user_aaa(){
        if(mEmail.equals(EMILL1)&& mPassword.equals(PASSWORD1)){
            return true;
        }else {
            return false;
        }
    }
    public boolean check_user_bbb(){
        if(mEmail.equals(EMILL2)&& mPassword.equals(PASSWORD2)){
            return true;
        }else {
            return false;
        }
    }
}
