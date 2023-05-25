package git.com.tinhtoan;

public class Anh {
    private String Ten ;
    private int Hinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public Anh(String ten, int hinh) {
        Ten = ten;
        Hinh = hinh;

    }
}
