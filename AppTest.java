package vn.camautomation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void PhanSo(){
        PhanSo ps1=new PhanSo(5,8);
        PhanSo ps2=new PhanSo(2,9);
        ps1.CongPhanSo(ps2);
        ps1.TruPhanSo(ps2);
        ps1.NhanPhanSo(ps2);
        ps1.ChiaPhanSo(ps2);

    }
}
