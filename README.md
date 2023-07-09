# inheritance
Nesneye dayalı programlama inheritance konusunda bir örnektir
I) Kişileri temsilen Person isimli bir sınıf yazmanız istenmektedir. Person
sınıfında olması gereken değişken ve metotlar aşağıda verilmektedir:
* Kişinin isim ve soyadını, String tipindeki name isimli değişkende birlikte
tutmaktadır. Başka bir değişken yoktur Nesneye dayalı programlamadaki eğilim
değişkenlerin "private" olarak tanımlanmasıdır.
* Parametresiz yapıcı (constructor) metot yazınız. Bu metotta, name değişkenine
null atanacaktır.
* name değişkenine parametre olarak geçirilen değerin atanmasını sağlayacak
tek parametreli yapıcı (constructor) metot yazınız.
* Person sınıfı için "copy constructor" metot yazınız.
NOT: Bu sınıf için atanacak verilerde hata kontrolü yapmanız
istenmemektedir.
* Erişici ve atayıcı (accessor/mutator) olarak adlandırılan get ve set metotlarını
name değişkeni için oluşturunuz. (NOT: Atanacak verilerde hata kontrolü
yapmanız istenmemektedir.)
* toString metodunu yazınız.
* Ders kitabınızda en son verilen şablona (Object tipinde parametresi olan
şablon) uyarak equals metodunu yazınız.
II) Araçları temsilen Vehicle isimli bir sınıf yazılması istenmektedir. Vehicle
sınıfında olması gereken değişken ve metotlar aşağıda verilmektedir:
* Aracın markasını (üretici) tutmak için String tipinde marka değişkeni, motor
silindir sayısını tutmak için int tipinde silindir değişkeni ve aracın sahibi kişiyi
tutmak için Person tipinde owner değişkeni tanımlamanız istenmektedir.
Nesneye dayalı programlamadaki eğilim değişkenlerin "private" olarak
tanımlanmasıdır.
* Parametresiz yapıcı (constructor) metot yazınız.
* Gerekli tüm verinin alınıp atanmasını sağlayacak parametreli yapıcı
(constructor) metot yazınız. Atamalarda, ders kitabınızda "Privacy Leak"
olarak adlandırılan duruma sebebiyet vermeyecek şekilde kullanımlar yapınız.
* Vehicle sınıfı için "copy constructor" metot yazınız. Atamalarda, ders
kitabınızda "Privacy Leak" olarak adlandırılan duruma sebebiyet vermeyecek
şekilde kullanımlar yapınız.
NOT: Bu sınıf için atanacak verilerde hata kontrolü yapmanız
istenmemektedir.
* Erişici ve atayıcı (accessor/mutator) olarak adlandırılan get ve set metotlarını
oluşturunuz.
(NOT-1: Atanacak verilerde hata kontrolü yapmanız istenmemektedir.
NOT-2: getOwner ve setOwner metotlarında ders kitabınızda "Privacy Leak"
olarak adlandırılan duruma sebebiyet vermeyecek şekilde kullanımlar
yapınız.)
* toString metodunu yazınız.
* Ders kitabınızda en son verilen şablona (Object tipinde parametresi olan
şablon) uyarak equals metodunu yazınız.
III) Kamyonları temsilen Truck isimli sınıfı Vehicle sınıfından kalıtım
(inheritance) ile türetiniz. Truck sınıfında olması gereken değişken ve metotlar
aşağıda verilmektedir:
* Kamyonun yük kapasitesini tutmak için double tipinde kapasite değişkeni
vardır. Nesneye dayalı programlamadaki eğilim değişkenlerin "private" olarak
tanımlanmasıdır.
* Parametresiz yapıcı (constructor) metot yazınız.
* Gerekli tüm verinin alınıp atanmasını sağlayacak parametreli yapıcı
(constructor) metot yazınız.
* Truck sınıfı için "copy constructor" metot yazınız.
NOT: Bu sınıf için atanacak verilerde hata kontrolü yapmanız
istenmemektedir.
* Erişici ve atayıcı (accessor/mutator) olarak adlandırılan get ve set metotlarını
oluşturunuz.
(NOT-1: Atanacak verilerde hata kontrolü yapmanız istenmemektedir.
* toString metodunu yazınız.
* Ders kitabınızda en son verilen şablona (Object tipinde parametresi olan
şablon) uyarak equals metodunu yazınız.
IV) Bir deneme sınıfı yazarak main metodu içinde aşağıda istenenleri yapınız.
* İstediğiniz veriler ile (dosyaya gerek yoktur), bir adet Person nesnesi ve bu
kişinin sahibi olduğu bir adet Truck nesnesi oluşturunuz.
* Oluşturduğunuz Truck nesnesinin bilgilerini yazdırınız.
* Truck nesnesinden "copy constructor" ile bir adet kopya nesne oluşturunuz.
* İki Truck nesnesinin eşitliğini "equals" metodu kullanıp, sonucunu yazdırarak
gösteriniz.
