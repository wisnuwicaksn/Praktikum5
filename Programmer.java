public class Programmer extends Pegawai{
    Double bonus;

    public Programmer(String nama, Double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setBonus(Double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
    }

    public void cetakInfo(){
        super.cetakInfo();
        setBonus(1200000.2);
        System.out.println("Bonus       : Rp " + getBonus());
    }
}