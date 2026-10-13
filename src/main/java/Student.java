import java.util.ArrayList;
import java.util.List;

public class Student {
        private String nume;
        private String grupa;
        private String prenume;
        private List<Integer> note;
        public Student(String valoare, String grupa){
            this.nume = valoare;
            this.grupa = grupa;
            note = new ArrayList();
        }
        public String getNume() {
            return nume;
        }
         public String getPrenume(){
            return prenume;
         }

        public String getGrupa() {
            return grupa;
        }

        public void adaugaNota(int nota){
            this.note.add(nota);
        }

        public boolean esteIntegralist(){
            for (int elem : note) {
                int nota = elem;
                if (nota <5){
                    return false;
                }
            }
            return true;
        }

        public Integer medie(){
            int suma = 0;
            for (int elem : note ){
                int nota = elem;
                suma = suma + nota;
            }
            return suma / note.size();
        }

    public String toString() {
        String result = "";
        result += grupa;
        result += String.format(" %10s", nume);
        result += String.format(" %10s", prenume);
        result += " " + note;
        result += medie();
        return result;
    }
    }

