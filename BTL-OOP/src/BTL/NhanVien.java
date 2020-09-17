package BTL;

public class NhanVien extends CaNhan {
	private String MaNV;
	private int NamSinh;
	private int SoGioLam;
	NhanVien() {
		super();
		this.MaNV = "";
		this.NamSinh = 0;
		this.SoGioLam = 0;
	}
	NhanVien(String a, String b, String c,String d, int e, int g) {
		super(a,b,c);
		this.MaNV = d;
		this.NamSinh = e;
		this.SoGioLam = g;
	}
}
