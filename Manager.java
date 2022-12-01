public class Manager extends Pegawai{
    Double tunjangan;

    public Manager(String nama, Double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    public Double getTunjangan(){
        return this.tunjangan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        setTunjangan(5000000.1);
        System.out.println("Tunjangan   : Rp " + getTunjangan());
    }
}