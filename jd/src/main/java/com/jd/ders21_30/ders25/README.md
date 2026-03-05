# Banka Uygulaması - Pratik (Encapsulation)
Basit bir seviyede bir banka uygulaması geliştireceğiz.


Bank Class'ının field'leri:

- accountNumber (String)
- ownerName (String)
- balance (double)
- isActive (boolean)

method'lar:

- depositByAmount(double amount)
- withdrawByAmount(double amount)
- closeAccount()
- getBalance()
- getAccountNumber()
- getOwnerName()
- isActive()

Koşullar (Ana İş Kuralları):

- accountNumber: her obje için bir kez atanacak ve değiştirelemeyecek. (Sistem tarafından rastgele şekilde atanacak.)
- ownerName: her objenin bir adı olmalı. Null veya Blank olamaz. En az 3 karakter olmalı. Güncelllenemez!
- balance: eksi bakiye olamaz. her objede balance değeri 0 tl ile başlamalı.
- isActive: hesapların aktifliğini takip etmek için eklenen bir alan. Her obje ilk oluştuğunda hesaplar aktif olmalı.

- depositByAmount(): parametre olarak verilen miktar kadar para yatırılacak. 
    
    1. Hesap aktif değilse ekrana "Hesap Kapalı" yazacak.
    2. amount(miktar) negatifse ekrana "Miktar pozitif olmalı!" yazacak.
    3. balance güncellenecek.
    4. ekrana "{Miktar} yatırıldı. Güncel Bakiye: {balance}" yazacak.

- withdrawByAmount(): parametre olarak verilen miktar kadar para azaltılacak.

    1. Hesap aktif değilse ekrana "Hesap Kapalı" yazacak.
    2. amount(miktar) negatifse ekrana "Miktar pozitif olmalı!" yazacak.
    3. amount(miktar), balance(bakiye)'den büyükse ekrana "Yetersiz bakiye!" yazacak.
    4. balance güncellenecek.
    5. ekrana "{amount} TL çekildi. Güncel bakiye: {balance}" yazacak.

- closeAccount(): hesabın durumunu false yapacak.
    

