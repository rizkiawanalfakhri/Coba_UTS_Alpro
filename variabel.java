public class variabel {
    public static void main(String[] args) {

        String nama = "Muhammad Rizkiawan Al Fakhri";
        String ttl = "Bogor, 14-04-2008";
        String jk = "Laki-laki";
        String alamat = "Perumahan Lido Permai Blok A8/03, Desa Ciburuy, Kecamatan Cigombong, Kabupaten Bogor";
        String no = "089683087917";
        double gajian = 1000000;
        System.out.println("Nama                : " + nama);
        System.out.println("Tempat Tanggal Lahir: " + ttl);
        System.out.println("Jenis Kelamin       : " + jk);
        System.out.println("Alamat              : " + alamat);
        System.out.println("No HP               : " + no);
        System.out.println("Gajian              : Rp. " + String.format("%,.0f", gajian));
        System.out.println(" SELESAI PAK");

    }

}