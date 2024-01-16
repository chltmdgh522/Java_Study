package exception;

public class IDFormatTest {
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId)throws IDFormatException{ //예외를 회피함으로써 main으로 미룸
        if(userId==null){
            throw new IDFormatException("아이디 널일수가 없어용"); //강제로 발생
        }
        else if(userId.length()<8 || userId.length()>20){
            throw new IDFormatException("아이디 입력수 초과");
        }
        this.userId = userId;
    }

    public static void main(String[] args) {
        IDFormatTest a= new IDFormatTest();
        String name="chltmdgh522";
        try{
            a.setUserId(name);
        }catch(IDFormatException e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
