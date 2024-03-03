package d28exceptions_enum_iterators;

public class ExceptionRunner {
    public static void main(String[] args) {
        ogrenciNotu(55); //-55 ide kabul eder
    }
    public static void ogrenciNotu(int not){
       // System.out.println(not);
        if (not<0 || not>100){
            try {
                throw new InvalidStudentGradeException("ogrenci notu 0 da kucuk veya 100 den buyuk olamaz") ;
            } catch (InvalidStudentGradeException e) {
              e.printStackTrace();
            }
        }else {
             System.out.println(not);

        }
    }
}
