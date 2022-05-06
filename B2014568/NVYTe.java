package B2014568;

import java.io.Serializable;
import java.util.Scanner;
public class NVYTe implements Serializable{
	private String hoten;
	private String diachi;
	private int namsinh;
	private int thamnien;
	private String bangcap;
	private boolean tiemvaccine;
	
	//Ham xay dung mac nhien
	public NVYTe() {
		hoten = new String("Tran Ngoc Phuoc Hoang");
		diachi = new String("KienGiang");
		namsinh = 2002;
		thamnien = 10;
		bangcap = new String("Tiensi");
		tiemvaccine = true;
	}
	public NVYTe(String ht, String dc, int y, int tn, String bc, boolean vc) {
		hoten = new String(ht);
		diachi = new String(dc);
		namsinh = y;
		thamnien = tn;
		bangcap = new String(bc);
		tiemvaccine = vc;
	}
	public NVYTe(NVYTe e) {
		hoten = new String(e.hoten);
		diachi = new String(e.diachi);
		namsinh = e.namsinh;
		thamnien = e.thamnien;
		bangcap = new String(e.bangcap);
		tiemvaccine = e.tiemvaccine;
	}
	public void makeCopy(NVYTe e) {
		hoten = e.hoten;
		diachi = e.diachi;
		namsinh = e.namsinh;
		thamnien = e.thamnien;
		bangcap = e.bangcap;
		tiemvaccine = e.tiemvaccine;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap ho ten:");
		hoten = kb.nextLine();
		System.out.println("Nhap dia chi");
		diachi = kb.nextLine();
		System.out.println("Nhap nam sinh");
		namsinh = kb.nextInt();
		System.out.println("Nhap bang cap");
		bangcap = kb.nextLine();
		bangcap = kb.nextLine();
		System.out.println("Nhap tham nien");
		thamnien = kb.nextInt();
		System.out.println("Da tim vaccine hay chua");
		tiemvaccine = kb.nextBoolean();
	}
	public void hienThi() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Dia chi: " + diachi);
		System.out.println("Nam sinh: " + namsinh);
		System.out.println("Tham niem: " + thamnien);
		System.out.println("Bang cap: " + bangcap);
		System.out.println("Tiem vaccine: " + tiemvaccine);
	}
	public String layDiaChi() {
		return diachi;
	}
	public boolean daTiemVaccine() {
		return tiemvaccine ;
	}
	public int layThamNien() {
		return thamnien;
	}
	public int tinhTuoi(int namhientai) {
		int sotuoi=0;
		sotuoi = namhientai - namsinh;
		return sotuoi;
	}
	public boolean cungBangCap(NVYTe nv) {
		if(this.bangcap == nv.bangcap) {
			return true;
		}
		return false;
	}
}
