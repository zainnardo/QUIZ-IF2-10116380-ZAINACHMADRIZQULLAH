/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116380.zainachmadrizqullah;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
*NAMA   : Zain Achmad Rizqullah
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : Rock and Roll Haircut
 */
public class Customer extends ServicePrice implements CustomerInvoice {
    
     private String nama, email;
    private boolean member;

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public boolean isMember() 
    {
        return member;
    }

    public void setMember(boolean member) 
    {
        this.member = member;
    }
    
    public String currentTime()
    {
        int hari, detik, menit, jam, tanggal, bulan, tahun;
        
        GregorianCalendar date = new GregorianCalendar();
        
        String namaBulan[]  = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String namaHari[]   = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        detik   = date.get(Calendar.SECOND);
        menit   = date.get(Calendar.MINUTE);
        jam     = date.get(Calendar.HOUR_OF_DAY);
        hari    = date.get(Calendar.DAY_OF_WEEK);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan   = date.get(Calendar.MONTH);
        tahun   = date.get(Calendar.YEAR);
        
        return namaHari[hari - 1] + ", " + tanggal + " " + namaBulan[bulan] + " " + tahun + " " + jam + ":" + menit + ":" + detik;
    }
}
