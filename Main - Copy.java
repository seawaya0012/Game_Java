import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JTextField jtf;
    private String name;
    private int Level;
    private int HP;
    private int HPmon;
    private int HPmont;
    private int HPmontest;
    private int Atk;
    private int Atkmon;
    private String swordWeapon;
    private int amount;
    private int item;
    private int Levelmon;

    public Main() {
        super( "Fate Stay Night" );
        Level = 1;
        amount = 0;
        item = 0;
        Atk = 100;
        HP = 100;
        Levelmon = 1;
        Container c = getContentPane();
        Icon icon = new ImageIcon("Fate1.png");
        c.setLayout( new FlowLayout() );
        JLabel j = new JLabel("Welcome to Fate Stay Night");
        JLabel i = new JLabel(icon);
        // label and text entry field
        JLabel jl = new JLabel("Name (Please Enter) :");
        jtf  = new JTextField(20);   // 25 chars wide
        c.add( j );
        c.add( i );
        c.add( jl );
        c.add( jtf );
        // Handle events from pressing return
        jtf.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Name : " + e.getActionCommand() );
                name = e.getActionCommand();
                jtf.setText("");
            }
        } );
		
		
		// Radio Button
		final JRadioButton radio1 = new JRadioButton("Saber");
		radio1.setBounds(119, 58, 109, 23);
		getContentPane().add(radio1);
		
		final JRadioButton radio2 = new JRadioButton("Lancer");
		radio2.setBounds(119, 84, 109, 23);
		getContentPane().add(radio2);
		
		final JRadioButton radio3 = new JRadioButton("Archer");
		radio3.setBounds(119, 110, 109, 23);
		getContentPane().add(radio3);
		
		// Set Group
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
        group.add(radio2);
        group.add(radio3);
		
        // Button
		JButton btn = new JButton("My Status");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Choos Class
				if(radio1.isSelected()){
                    swordWeapon = "Excalibur";
                    final ImageIcon iconsaber = new ImageIcon(getClass().getResource("saber1.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nitem : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nClass : Saber\nswordWeapon : "+swordWeapon+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,iconsaber);
				} else if (radio2.isSelected()) {
                    swordWeapon = "Gae Bolg";
                    final ImageIcon iconsaber = new ImageIcon(getClass().getResource("Lancer1.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nitem : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nClass : Lancer\nswordWeapon : "+swordWeapon+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,iconsaber);
				} else if (radio3.isSelected()) {
                    swordWeapon = "Caladbolg";
                    final ImageIcon iconsaber = new ImageIcon(getClass().getResource("Archer1.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nitem : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nClass : Archer\nswordWeapon : "+swordWeapon+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,iconsaber);
				} else {
					JOptionPane.showMessageDialog(null,
							"You not select.");	
				}
				
			}
        });
		btn.setBounds(125, 154, 89, 23);
        getContentPane().add(btn);	
        
        // Status Monster
        JLabel monster = new JLabel("\nMonster            ");
        c.add(monster);
        Icon monster1 = new ImageIcon("monster1.png");
        JLabel mon = new JLabel(monster1);
        c.add(mon);

        Atkmon = 50;
        HPmon = 50;
        HPmontest = HPmon;

        // Radio Button
        JLabel battle = new JLabel("           Battle : ");
        c.add(battle);
        
        // battle
        // Button
        JButton bat = new JButton("Attack");
        c.add(bat);
		bat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                HPmont = HPmon - Atk;
                HP -= Atkmon;
                if(radio1.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        item +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("1.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got item : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("1.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("1.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                if(radio2.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        item +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("2.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got item : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("2.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("2.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                if(radio3.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        item +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("3.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got item : "+item+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("3.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("3.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                
            }
        } 
        ); 

        JButton it = new JButton("UseItem");
        c.add(it);
		it.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent i) {
                if(item>0){
                    item--;
                    HP += 100;
                    JOptionPane.showMessageDialog(null,"Use item HP+100 success");
                }
                else if(item<0){
                    JOptionPane.showMessageDialog(null,"You don't have item!!!");

                }
            }
        }
        );
        JButton stm = new JButton("Status Monster");
        c.add(stm);
		stm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent st) {
                JOptionPane.showMessageDialog(null,"Name : Acnologia\nLevel : "+Levelmon+"\nAttack : "+Atkmon+"\nHP : "+HPmontest);
            }
        }
        );

        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Project\\Project Java\\GUI\\Fate.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,900);
        setVisible(true);
    }
    public static void main( String args[] ){
        new Main(); 
    } 
}
    

