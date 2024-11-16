Dokumentasi Prak PBO 10

1.	Tambahkan fitur ubah PIN
a.	Tambahkan opsi “Ubah PIN” pada menu utama
![image](https://github.com/user-attachments/assets/e40703a0-b51a-4ef3-a9f2-96ed9d0497e9)
![image](https://github.com/user-attachments/assets/f1d8d795-e013-4859-b854-cfef6cc8bb93)
Pada gambar di atas saya menambahkan pilihan "5.Ubah PIN" pada kelas ATM.java agar dapat memilih untuk mengubah PIN
![image](https://github.com/user-attachments/assets/bf5ea722-2999-4279-80e6-76d2f4b5599a)
Kemudian saya menambahkan case 5 untuk dapat masuk kehalaman ubah PIN

b.	Buat method dalam kelas Account untuk mengubah PIN, yaitu: changePin()
![image](https://github.com/user-attachments/assets/09acbbb6-057f-46d8-9d66-db4545b71ffa)
Pada kelas Account saya menambahkan method changePin(); method inilah halaman untuk mengubah PIN

c.	Dalam method tersebut lakukan hal berikut:
i.	Verifikasi PIN lama
![image](https://github.com/user-attachments/assets/4cb6d4bf-b19f-428d-8a8c-ae9bf26ca566)
Dalam mengubah PIN saya juga menambahkan Verifikasi PIN lama

ii.	Minta nasabah memasukkan PIN baru dua kali
![image](https://github.com/user-attachments/assets/c70779db-c7b1-41e2-93d7-fcd43af4e3c1)
Kemudian membuat untuk nasabah memasukkan PIN dua kali agar PIN cocok dan benar

iii.	Validasi bahwa kedua input PIN baru cocok
![image](https://github.com/user-attachments/assets/60cf9788-d959-49d4-8f96-4cf85722da06)
Kemudian setelah kedua PIN cocok maka akan keluar validasi PIN tersebut cocok

iv.	Perbarui PIN jika validasi berhasil
![image](https://github.com/user-attachments/assets/ebda45de-3cf9-4cfe-a80e-4799147c962a)
Kemudian ada juga validasi PIN berhasil diubah jika semua langkah sudah sesuai dan berhasil


2.	Validasi saldo minimal pada saat penarikan
a.	Modifikasi fitur penarikan sehingga nasabah harus menyisakan saldo minimal setelah penarikan dilakukan. Misal, saldo minimal adalah Rp50,000-
![image](https://github.com/user-attachments/assets/01f45daf-541b-4d05-939d-92c80c609a95)
Pada gambar tersebur saya menambahkan validasi agar saat ingin melakukan penarikan nasabah harus menyisakan saldo minimum

b.	Langkah – langkah :
i.	Tentukan saldo minimal, tambahkan konstanta MINIMUM_BALANCE dalam kelas Account 
![image](https://github.com/user-attachments/assets/bdc4b2c4-3bf1-492b-99af-9c7fc55cb833)
Dalam kelas Account saya menambahkan konstanta untuk minimum balance saldo

ii.	Modifikasi methode execute() dalam kelas Withdrawal untuk memeriksa apakah saldo setelah penarikan tidak kurang dari saldo minimal
![image](https://github.com/user-attachments/assets/f532e1de-f2c5-41e9-b55d-375aa9d199c2)
Kemudian saya memodifikasi methode execute() dalam kelas Withdrawal yang dimana saya menambahkan if, else if, dan else keadaan saat penarikan saldo

iii.	Jika saldo tidak mencukupi, tampilkan pesan kesalahan
![image](https://github.com/user-attachments/assets/6aa14dde-0463-4969-8969-0f7fea1da6a2)
Kemudian saya membuat validasi jika saldo kurang dari jumlah yang ingin ditarik.

PACKAGE yang digunakan
![image](https://github.com/user-attachments/assets/820f08f1-532a-4d92-8de4-a9a05725c487)

Source Code
model/Account.java
![image](https://github.com/user-attachments/assets/80c0e70e-11ec-4c28-8945-8272e0b65c9d)
![image](https://github.com/user-attachments/assets/53f7916b-98c1-45b5-a56f-1f2fe8e21f8f)

transaction/Deposit.java
![image](https://github.com/user-attachments/assets/b79160f7-7e28-40fd-91af-bf3e72c1370f)

transaction/Transaction.java
![image](https://github.com/user-attachments/assets/c05f2219-ff64-45d0-b6f7-5a5e22446b01)

transaction/Transfer.java
![image](https://github.com/user-attachments/assets/58f6342a-8c44-423a-9d12-235a48147719)

transaction/Withdrawal.java
![image](https://github.com/user-attachments/assets/a6b5490c-d684-48b2-a77a-84bfd9decab4)

atm/ATM.java
![image](https://github.com/user-attachments/assets/86a2f03f-b0ab-487e-ab25-1e392c71f99c)
![image](https://github.com/user-attachments/assets/2f1414fb-927f-4662-963d-2817f6a19b2d)
![image](https://github.com/user-attachments/assets/184b57fd-0119-4c0f-a50c-fa2d907ac58a)

atm/Main.java
![image](https://github.com/user-attachments/assets/388ff3d9-1747-4a26-8c8c-7c4344fd093f)
