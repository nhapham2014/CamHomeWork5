package vn.camautomation;

public class PhanSo {
    public int tu,mau;
    public PhanSo(int tu, int mau){
        this.tu=tu;
        this.mau=mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    public void setTu(int tu){
        this.tu=tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void CongPhanSo(PhanSo ps){
        int tu=this.getTu()* ps.mau+this.getMau()*ps.tu;
        int mau=this.getMau()*ps.mau;
        PhanSo psTong = new PhanSo(tu,mau);
        System.out.println("Tong hai phan so: "+psTong.tu+"/"+psTong.mau);
    }
    public void TruPhanSo(PhanSo ps){
        int tu=this.getTu()* ps.mau-this.getMau()*ps.tu;
        int mau=this.getMau()*ps.mau;
        PhanSo psHieu = new PhanSo(tu,mau);
        System.out.println("Hieu hai phan so: "+psHieu.tu+"/"+psHieu.mau);
    }
    public void NhanPhanSo(PhanSo ps){
        int tu=this.getTu()* ps.tu;
        int mau=this.getMau()*ps.mau;
        PhanSo psTich = new PhanSo(tu,mau);
        System.out.println("Tich hai phan so: "+psTich.tu+"/"+psTich.mau);
    }
    public void ChiaPhanSo(PhanSo ps){
        int tu=this.getTu()* ps.mau;
        int mau=this.getMau()*ps.tu;
        PhanSo psThuong = new PhanSo(tu,mau);
        System.out.println("Hieu hai phan so: "+psThuong.tu+"/"+psThuong.mau);
    }

}
