package bank;

import java.util.Scanner;

public class Account {
	
	private static AccountClient accountClient = new AccountClient();

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yapılcak olan işlemi yazın: Para Çekme , Para Yükleme , Havale Yapma , Hesap Bilgilerimi Yaz:");
		String girdi = scanner.nextLine(); 
		
		 if(girdi.equals("Para Çekme")) {
			 System.out.println("Çekilcek tutarı girin");
			 int cekme = scanner.nextInt();
			 ParaCekme(cekme);
		 }
		 else if(girdi.equals("Para Yükleme")) {
			 System.out.println("Yüklenecek tutarı yazın");
			 int yukleme = scanner.nextInt();
			 ParaYukleme(yukleme);
		 }
		 else if(girdi.equals("Hesap Bilgilerimi Yaz")) {
			 System.out.println(accountClient.info());
		 }
		 else{
			 System.out.println("Hatalı seçim yaptınız tekrar deneyin");
			 return;
		 }
		 
		 scanner.close();
		 
    }

    public static void ParaCekme(int cekme) {
        if (accountClient.getBalance() >= cekme) {
            accountClient.setBalance(accountClient.getBalance() - cekme);
            System.out.println("İşlem Başarılı " + cekme + "TL çekilmiştir \nYeni bakiye:"  + accountClient.getBalance());
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public static void ParaYukleme(int yukleme) {
        accountClient.setBalance(accountClient.getBalance() + yukleme);
        System.out.println("İşlem Başarılı " + yukleme + "TL yüklenmiştir \nYeni bakiye:" + accountClient.getBalance());
    }
}