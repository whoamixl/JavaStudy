package exception;

public class MyException extends Exception {

    private int detailID;
    public MyException(int e){
        this.detailID = e;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detailID=" + detailID +
                '}';
    }
}
