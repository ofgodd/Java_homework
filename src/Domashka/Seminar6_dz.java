package Domashka;

public class Seminar6_dz {

        private String color;
        private Integer Ram;
        private String OS;
        private Integer HDD;
        private Integer id;
        private String brand;
        private String model;
        private boolean isBooked = false;


    public Seminar6_dz(String model, Integer id, String brand) {
            this.model = model;
            this.brand = brand;
            this.id = id;
            System.out.println("Ноутбук марки " + "'" + this.brand + "'" + " Модель " + this.model + " С id " + Integer.toString(this.id));
        }

        public String getColor () {
            return this.color;
        }

        public Integer getRAM () {
            return this.Ram;
        }

        public String getOS () {
            return this.OS;
        }

        public Integer getHDD () {
            return this.HDD;
        }

        public Integer getid () {
            return this.id;
        }

        public String getBrand () {
            return this.brand;
        }

        public String getModel () {
            return this.model;
        }

        public Boolean getBooking () {
            return this.isBooked;
        }

        public void setColor (String color){
            this.color = color;
        }

        public void setRAM (Integer Ram){
            this.Ram = Ram;
        }

        public void setOS (String OS){
            this.OS = OS;
        }

        public void setHDD (Integer HDD){
            this.HDD = HDD;
        }

        public void Book () {
            if (isBooked == false) {
                this.isBooked = true;
            } else System.out.println("Этот ноутбук уже зарезервирован");
        }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS " + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.Ram);
        sb.append(System.lineSeparator());
        if (this.isBooked == false) sb.append("Не зарезервирован");
        else sb.append("Зарезервирован");


        return (sb.toString());
    }
}



