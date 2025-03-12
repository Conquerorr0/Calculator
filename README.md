# Java Hesap Makinesi

Bu proje, Java programlama dili kullanılarak geliştirilmiş grafiksel bir hesap makinesi uygulamasıdır. Temel matematiksel işlemleri gerçekleştirebilen ve işlem önceliğini dikkate alan bir hesap makinesidir.

## Özellikler

- Temel matematiksel işlemler (toplama, çıkarma, çarpma, bölme)
- Yüzde hesaplama
- İşlem önceliği desteği
- Parantez kullanımı desteği
- Kullanıcı dostu grafiksel arayüz

## Proje Yapısı

```
src/
├── com/
│   └── example/
│       └── calculator/
│           ├── Calculate.java         # Temel matematik işlemleri
│           ├── CalculatorGUI.java     # Grafiksel kullanıcı arayüzü
│           ├── CalculatorGUI.form     # GUI form dosyası
│           └── ProcessPriority.java   # İşlem önceliği yönetimi
```

## Teknik Detaylar

- Java Swing kullanılarak geliştirilmiş GUI
- Stack veri yapısı kullanılarak işlem önceliği yönetimi
- Modüler ve nesne yönelimli tasarım

## Geliştirme Önerileri

1. **Kod Organizasyonu**:
   - SOLID prensiplerinin daha iyi uygulanması
   - Design pattern'ların kullanılması (örn: Strategy pattern için işlemler)
   - Unit testlerin eklenmesi

2. **Özellik İyileştirmeleri**:
   - Bilimsel hesap makinesi özellikleri eklenebilir
   - Geçmiş işlemler kaydı tutulabilir
   - Hafıza fonksiyonları eklenebilir

3. **Performans İyileştirmeleri**:
   - İşlem önceliği algoritmasının optimize edilmesi
   - Hata yönetiminin geliştirilmesi

4. **Kullanıcı Deneyimi**:
   - Klavye kısayolları eklenmesi
   - Tema desteği
   - Daha modern bir arayüz tasarımı

## Kurulum

1. Projeyi klonlayın
2. NetBeans IDE veya tercih ettiğiniz Java IDE'sini kullanarak projeyi açın
3. Gerekli bağımlılıkların yüklü olduğundan emin olun
4. Projeyi derleyin ve çalıştırın

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. 