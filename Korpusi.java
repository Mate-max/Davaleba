package homework1.java;

import java.util.ArrayList;
import java.util.List;

public class Korpusi {
        private String misamarti;
        private List<Mosaxleoba> mosaxle;

        public Korpusi(String misamarti) {
            this.misamarti = misamarti;
            mosaxle = new ArrayList<>();
        }

        public String getMisamarti() {
            return misamarti;
        }

        public void setMisamarti(String misamarti) {
            this.misamarti = misamarti;
        }

        public List<Mosaxleoba> getMosaxleoba() {
            return mosaxle;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("კორპუსი { ");
            sb.append("მისამართი = '").append(misamarti).append('\'');
            sb.append(", მაცხოვრებელი = ");
            for (var mosaxle: mosaxle) {
                sb.append(mosaxle);
            }
            sb.append(" }");
            return sb.toString();
        }

        public void addMosaxle(Mosaxleoba mosaxle) {
            this.mosaxle.add(mosaxle);
        }
    }

