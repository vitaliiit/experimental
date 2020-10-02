public class Result {
    static String k;
    public static void main(String[] args) {
      Experimental experimental = new Experimental();

      experimental.getVoice();

      System.out.println(experimental); /* тут просто виведено адрес в пам'яті об'єкту 'experimental'- Experimental@27973e9b */

      System.out.println(experimental.getVoice()); /* тут виконався метод 'getVoice()'І ШЕ В
      КОНСОЛЬ ВИВЕДЕНО 'fff' - ТОМУ ЩО МЕТОД 'getVoice() ПОВЕРНУВ (ВИДАВ І ПОВЕРНУВ) ЗНАЧЕННЯ 'fff' ЗА ДОПОМОГОЮ
      КЛЮЧОВОГО СЛОВА 'return' ТАМ ДЕ ЙОГО ВИКЛИКАЮТЬ - В КОНКРЕТНОМУ ВИПАДКУ ТУТ - В ПОТОЦІ 'System.out */


      k = experimental.getVoice();  /* ДИВНО -  ТУТ ОКРІМ ГОЛОВНОГО ПО МОЄМУ ЗАВДАННЯ -
      ПРИСВОЇТИ ЗМІННІЙ 'k' ВЛАСТИВОСТІ МЕТОДУ НА КОТРИЙ ПОСИЛАЄТЬСЯ ЧЕРЕЗ ОБ'ЄКТ 'experimental'
      ( МЕТОД 'getVoice()' - МАЄ ВЛАСТИВІСТЬ ПРИСВОЮВАТИ ЗНАЧЕННЯ "hi hi" ЗМІННІЙ 's' І ПОВЕРТАТИ ПРИСВОЄНЕ
      ЗНАЧЕННЯ "fff" ЗМІННІЙ 'mau') - ВИКОНУЄТЬСЯ МЕТОД 'getVoice()' */

      System.out.println(experimental.s); /*тут null поки не запрацює метод getVoice(). як запрацює, то присвоїть змінній s - hi hi*/
      System.out.println("-----");
      System.out.println("-----");
      System.out.println(k); /* змінній 'k' присвоюєтся значення 'fff' змінної 'mau' котру метод getVoice повертає */

      System.out.println("$$$");

    }
}



