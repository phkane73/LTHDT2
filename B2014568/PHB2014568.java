package B2014568;
import java.util.Scanner;

public class PHB2014568 {
	public static void main(String[] args) {
//		NVYTe nv1 = new NVYTe();
//		NVYTe nv2;
//		nv1.nhap();
//		nv2 = new NVYTe(nv1);
//		nv2.hienThi();
		int n;
		Scanner kb =  new Scanner(System.in);
		System.out.println("nhap n");
		n = kb.nextInt();
		NVYTe ds[] = new NVYTe[n];
		for(int i = 0; i<n; i++) {
			ds[i] = new NVYTe();
			System.out.println("Nhap NVYTe thu" + (i+1));
			ds[i].nhap();
		}
//		for(int i=0; i<n; i++) {
//			if (ds[i].daTiemVaccine()==true) {
//				ds[i].hienThi();
//			}
//		}
		
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			if(ds[i].tinhTuoi(2022)>max) {
//				max=ds[i].tinhTuoi(2022);
//			}
//		}
//		for(int i=0;i<n;i++) {
//			if(ds[i].tinhTuoi(2022)==max) {
//				
//				System.out.println("NVYTe co tuoi lon nhat");
//				ds[i].hienThi();
//			}
//		}
		//Sx theo tham nien
		NVYTe t = new NVYTe();
		for (int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if (ds[i].layThamNien()>ds[j].layThamNien()) {
					t=ds[i];
					ds[i]=ds[j];
					ds[j]=t;
				}
			}
		}
		for(int i=0; i<n; i++) {
			ds[i].hienThi();
		}
	}
}
