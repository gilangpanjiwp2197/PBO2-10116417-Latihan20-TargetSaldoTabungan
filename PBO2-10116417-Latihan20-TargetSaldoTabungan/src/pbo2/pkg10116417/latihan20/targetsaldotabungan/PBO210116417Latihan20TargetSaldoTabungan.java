/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;

/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM TARGET SALDO TABUNGAN
 */
public class PBO210116417Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String format="###,###.#";
     DecimalFormat dm = new DecimalFormat(format);
        int i = 1;
        int saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " +(dm.format(saldoAwal)));
            i++;
        } while (i<=8);
        
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
    }
    
}
