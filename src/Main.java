public class Main {

    public static void main(String[] args) {

        /*
        Ho creato un array di stringhe con i giorni della settimana
         */
        String[] arr = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        /*
        Ho creato un for loop per passare attraverso l'array e stampare in maiuscolo i nomi dei giorni
        della settimana, ogni due giorni partendo dal lunedi
         */
        for(int i = 0; i < arr.length; i = i + 2){
            System.out.println(arr[i].toUpperCase());
        }
    }
}