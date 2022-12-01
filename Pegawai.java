public class Pegawai{
    String nama;
    Double gajiPokok;

    public void setNama(String nama){
        this.nama = nama; 
    }

    public void setgajiPokok(Double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getnama(){
        return this.nama;
    }

    public Double getgajiPokok(){
        return this.gajiPokok;
    }

    public void cetakInfo(){
        System.out.println("Nama        : " + this.getnama());
        System.out.println("Gaji Pokok  : Rp " + this.getgajiPokok());
    }
}