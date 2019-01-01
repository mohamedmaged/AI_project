

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;  
public class Interface extends JFrame {
  String color, season, lifecycle, soil, size, perfume,root;
//  ClipsEnvironment clipsEnvironment ;

    Interface(){
         panel1 p1=new panel1();
         
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(700, 300);
         //this.setLayout(new FlowLayout(FlowLayout.CENTER));
         JPanel p=new JPanel();
         //p.setBackground(Color.LIGHT_GRAY);
         JButton Startbutton = new JButton("START");    
         p.add(Startbutton);
         Startbutton.setLocation(350, 300);
         p.setVisible(true);
         this.add(p);     
         setVisible(true);  
         Container c=this.getContentPane();
         Startbutton.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){       
                c.remove(p);
                c.add(p1);
                c.revalidate();
                c.repaint();
                c.setVisible(true);       
           }
             });  
         
  /*          clipsEnvironment.assertdata(color,season,lifecycle,soil,size,perfume,root);
            clipsEnvironment.run();
            answer.setText(clipsEnvironment.getFlower());
            clipsEnvironment.reset();*/
            //answer.setText(answer.getText()+"lily");
           
    }
    }
    /*    String colors[]={"blue","purple","yellow","red","white","pink","orange","violet","pinkish-red"};  
        String seasons[]={"autumn","summer","spring","winter"};
        String lifecycles[]={"one-year","more-than-one-year"};
        String soils[]={" ","acidic","loose","fertile","rich","well-drained"};
        String roottypes[]={"bulb","roots"};
 //       clipsEnvironment = new ClipsEnvironment();
        JPanel panel11=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel12=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel21=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel22=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel31=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel32=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel41=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel42=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel51=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel panel52=new JPanel();
        //panel1.setBounds(40,80,300,300);  
        
        panel11.setBackground(Color.LIGHT_GRAY);
        panel12.setBackground(Color.LIGHT_GRAY);
        panel21.setBackground(Color.LIGHT_GRAY);
        panel22.setBackground(Color.LIGHT_GRAY);
        panel31.setBackground(Color.LIGHT_GRAY);
        panel32.setBackground(Color.LIGHT_GRAY);
        panel41.setBackground(Color.LIGHT_GRAY);
        panel42.setBackground(Color.LIGHT_GRAY);
        panel51.setBackground(Color.LIGHT_GRAY);
        panel52.setBackground(Color.LIGHT_GRAY);
        
        
        JComboBox colorscb = new JComboBox(colors);
        JComboBox seasoncb = new JComboBox(seasons);
        JComboBox lifecyclecb = new JComboBox(lifecycles);
        JComboBox soilcb = new JComboBox(soils);
        JComboBox roottypescb = new JComboBox(roottypes);
       
        JTextField sizetf = new JTextField(7);
        
        JLabel answer = new JLabel("Your flower is ");
       
        JLabel sizelbl = new JLabel("Size");
        JLabel colorlbl = new JLabel("Color");
        JLabel seasonlbl = new JLabel("Season");
        JLabel lifecyclelbl= new JLabel("Lifecycle");
        JLabel soillbl = new JLabel("Soil");
        JLabel roottypelbl = new JLabel("Root type");
        
        JCheckBox perfumechb = new JCheckBox("Perfume");
        perfumechb.setBackground(Color.LIGHT_GRAY);
        
        JButton button = new JButton("What's my flower");
        
        button.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            color= (String)colorscb.getItemAt(colorscb.getSelectedIndex());
            season= (String)seasoncb.getItemAt(seasoncb.getSelectedIndex());
            lifecycle= (String)lifecyclecb.getItemAt(lifecyclecb.getSelectedIndex());
            soil= (String)soilcb.getItemAt(soilcb.getSelectedIndex());
            size= sizetf.getText();
            if(perfumechb.isSelected()){
                perfume = "true";
            }
            else{
                perfume = "false";
            }
            root= (String)roottypescb.getItemAt(roottypescb.getSelectedIndex());
  /*          clipsEnvironment.assertdata(color,season,lifecycle,soil,size,perfume,root);
            clipsEnvironment.run();
            answer.setText(clipsEnvironment.getFlower());
            clipsEnvironment.reset();*/
            //answer.setText(answer.getText()+"lily");
            /*}
             });  
        
        panel11.add(colorlbl);
        panel11.add(colorscb);
        panel12.add(sizelbl);
        panel12.add(sizetf);
        
        panel21.add(seasonlbl);
        panel21.add(seasoncb);
        panel22.add(roottypelbl);
        panel22.add(roottypescb);
        
        panel31.add(lifecyclelbl);
        panel31.add(lifecyclecb);
        panel32.add(soillbl);
        panel32.add(soilcb);
        panel11.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel11.setVisible(true);
        panel12.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel12.setVisible(true);
        
        panel41.add(perfumechb);
        panel42.add(button);
        panel51.add(answer);
        panel21.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel21.setVisible(true);
        panel22.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel22.setVisible(true);
        panel31.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel31.setVisible(true);
        panel32.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel32.setVisible(true);
        panel41.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel41.setVisible(true);
        panel42.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel42.setVisible(true);
        panel51.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel51.setVisible(true);
        panel52.setVisible(true);

        add(panel11);
        add(panel12);
        add(panel21);
        add(panel22);
        add(panel31);
        add(panel32);
        add(panel41);
        add(panel42);
        add(panel51);
        add(panel52);
          
        setLayout(new GridLayout(5,2));
        setSize(500,400);  
        setVisible(true);  
    }
}
*/