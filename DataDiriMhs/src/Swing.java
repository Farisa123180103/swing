
import java.awt.*;
import javax.swing.*;

public class Swing extends JFrame{
    JButton ok;
   JLabel judul,nama,nim,jk,agama,alamat;
   TextField uname,unim;//,addrs;
   JRadioButton l,p;
   TextArea addrs;
   JComboBox agm;
   ButtonGroup group;
    
    public void Mhs(){
        setTitle("Form Data Mahasiswa");
        String agma[]={"","Islam","Kristen","Hindu","Katolik"};
        //JComboBox cb = new JComboBox(agma);
        agm = new JComboBox(agma);
        judul = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        uname = new TextField();
        nim = new JLabel("Nim");
        unim = new TextField();
        jk = new JLabel("Jenis Kelamin");
        l = new JRadioButton("L");
        p = new JRadioButton("P");
        agama = new JLabel("Agama");
        alamat = new JLabel("Alamat");
        addrs = new TextArea();
        //addrs = new TextField();
        ok = new JButton("OK");
        group = new ButtonGroup();
        
        setLayout(null);
        add(judul);
        add(nama);
        add(uname);
        add(nim);
        add(unim);
        add(jk);
        add(l);
        add(p);
        add(agama);
        add(alamat);
        add(addrs);
        add(ok);
        add(agm);
        
        judul.setBounds(130, 20, 150, 20);
        nama.setBounds(50, 60, 100, 20);
        uname.setBounds(150, 60, 150, 20);
        nim.setBounds(50, 100, 100, 20);
        unim.setBounds(150, 100, 150, 20);
        jk.setBounds(50, 130, 80, 20);
        l.setBounds(150, 130, 40, 20);
        p.setBounds(200, 130, 40, 20);
        agama.setBounds(50, 160, 100, 20);
        agm.setBounds(150, 160, 100, 20);
        alamat.setBounds(50, 190, 80, 20);
        addrs.setBounds(150, 190, 200, 80);
        ok.setBounds(300, 300, 60, 20);
        
        group.add(l);
        group.add(p);
        
        setSize(420,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
