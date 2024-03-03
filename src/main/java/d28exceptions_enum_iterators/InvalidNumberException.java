package d28exceptions_enum_iterators;

    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim


    public class InvalidNumberException extends RuntimeException{

        //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim

        public InvalidNumberException(String message) {
            super(message);
        }
    }






