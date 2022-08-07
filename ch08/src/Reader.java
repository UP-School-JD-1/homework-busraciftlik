public class Reader {
    String name;
    int age;
    char gender = ' ';


    public void read(Book book){
        System.out.println("Mevcut Sayfa: " + book.currentPage);
        System.out.println("20 sayfa okunuyor.");
        book.currentPage = book.currentPage + 20;
        System.out.println("Yeni Mevcut Sayfa: " + book.currentPage);
    }
    public  String getInfo (){
      String info = ("Reader name:" +name+" Reader age:"+age +" Reader gender:" +gender);
      return info;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char newGender){
        if(newGender == 'K'|| newGender == 'E'){
            gender = newGender;
        }else {
            System.out.println("Lütfen K ya da E giriniz.");
        }

    }
}
