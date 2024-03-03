package d31lambda;

public class Course {
   // /Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
// Class icerisinde pasif ve aktif ozellikler olusturalim

/*
        Icinde




        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi

        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */
 //1) private variable'lar (kapsulleme-encapsulation)

   private String season;
   private String courseName;
   private int averageScore;
   private int NumberOfStudent;

   // 2) parametreli ve parametresiz constructor'lar


    public Course(String season, String courseName, int averageScore, int numberOfStudent) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        NumberOfStudent = numberOfStudent;
    }

    public Course() {

    }
     //3) getter'lar -Private değişkenlere erişim sağlamak için-


    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

        //    4) setter'lar -Private değişkenleri değiştirmek için-


    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }
  //  5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
    //barindiran classlara POJO class denir


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", NumberOfStudent=" + NumberOfStudent +
                '}';
    }
}
