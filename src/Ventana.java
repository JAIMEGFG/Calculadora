import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    //  intancias    botones            acciones
    JButton botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis;
    JButton botonSiete, botonOcho, botonNueve, botonDiez, botonOnce, botonDoce;
    JButton botonTrece, botonCatorce, botonQuince, botonDieciseis, botonCientifica;
    JButton botonSin, botonCos,botonTan;
    Container container;
    JLabel mostrar;
    JTextField pantalla;
    boolean operando = false;
    JPanel panelAbajo, panelArriba, panelTop,panelCientifica;
    CardLayout cardLayout;
    int op1, op2;
    int tipoOperacion;


    public void todoCalculadora() {
        instancias();
        configurarContainer();
        this.setBounds(50, 50, 500, 500);
        setLocationRelativeTo(null);
        acciones();
        this.setVisible(true);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.pack();


    }

    private void configurarContainer() {
        container.setLayout(new BorderLayout());
        container.add(configArriba(), BorderLayout.CENTER);
        container.add(configTop(), BorderLayout.NORTH);
        container.add(configAbajo(), BorderLayout.SOUTH);



    }
    private JPanel configTop(){
        panelTop.setPreferredSize(new Dimension(100,50));
        panelTop.setLayout((new BorderLayout()));
        panelTop.add(botonCientifica);
        return panelTop;
    }

    private JPanel configArriba() {


        panelArriba.setPreferredSize(new Dimension(200, 200));
        panelArriba.setLayout(new BorderLayout());
        panelArriba.add(pantalla);



        return panelArriba;
    }
   /* private void configCientifica(){
        panelCientifica.setPreferredSize(new Dimension(200,200));
        panelCientifica.setLayout(new BorderLayout());
        panelCientifica.add(botonCientifica);
        panelCientifica.add(botonCos);
        panelCientifica.add(botonTan);
        panelCientifica.add(botonSin);

    } */

    private JPanel configAbajo() {
        panelAbajo.setPreferredSize(new Dimension(200, 200));
        panelAbajo.setLayout(new GridLayout(4, 4));
        panelAbajo.add(botonSiete);
        panelAbajo.add(botonOcho);
        panelAbajo.add(botonNueve);
        panelAbajo.add(botonTrece);
        panelAbajo.add(botonCuatro);
        panelAbajo.add(botonCinco);
        panelAbajo.add(botonSeis);
        panelAbajo.add(botonCatorce);
        panelAbajo.add(botonUno);
        panelAbajo.add(botonDos);
        panelAbajo.add(botonTres);
        panelAbajo.add(botonDoce);
        panelAbajo.add(botonDiez);
        panelAbajo.add(botonQuince);
        panelAbajo.add(botonDieciseis);
        panelAbajo.add(botonOnce);


        return panelAbajo;
    }

    private void acciones() {
        Component[] componentes = panelAbajo.getComponents();
        for (Component item : componentes) {
            ((JButton) item).addActionListener(this);
        }
        botonCientifica.addActionListener(this);
    }

    private void instancias() {
        botonUno = new JButton("1");
        botonUno.setBackground(Color.YELLOW);
        botonUno.setFont(new Font("Arial", Font.BOLD, 35));

        botonDos = new JButton("2");
        botonDos.setBackground(Color.YELLOW);
        botonDos.setFont(new Font("Arial", Font.BOLD, 35));

        botonTres = new JButton("3");
        botonTres.setBackground(Color.YELLOW);
        botonTres.setFont(new Font("Arial", Font.BOLD, 35));

        botonCuatro = new JButton("4");
        botonCuatro.setBackground(Color.YELLOW);
        botonCuatro.setFont(new Font("Arial", Font.BOLD, 35));

        botonCinco = new JButton("5");
        botonCinco.setBackground(Color.YELLOW);
        botonCinco.setFont(new Font("Arial", Font.BOLD, 35));

        botonSeis = new JButton("6");
        botonSeis.setBackground(Color.YELLOW);
        botonSeis.setFont(new Font("Arial", Font.BOLD, 35));

        botonSiete = new JButton("7");
        botonSiete.setBackground(Color.RED);
        botonSiete.setFont(new Font("Arial", Font.BOLD, 35));

        botonOcho = new JButton("8");
        botonOcho.setBackground(Color.RED);
        botonOcho.setFont(new Font("Arial", Font.BOLD, 35));

        botonNueve = new JButton("9");
        botonNueve.setBackground(Color.RED);
        botonNueve.setFont(new Font("Arial", Font.BOLD, 35));

        botonDiez = new JButton("0");
        botonDiez.setBackground(Color.RED);
        botonDiez.setFont(new Font("Arial", Font.BOLD, 35));

        botonOnce = new JButton("+");
        botonOnce.setBackground(Color.RED);
        botonOnce.setFont(new Font("Arial", Font.BOLD, 35));

        botonDoce = new JButton("-");
        botonDoce.setBackground(Color.YELLOW);
        botonDoce.setFont(new Font("Arial", Font.BOLD, 35));

        botonTrece = new JButton("/");
        botonTrece.setBackground(Color.RED);
        botonTrece.setFont(new Font("Arial", Font.BOLD, 35));

        botonCatorce = new JButton("x");
        botonCatorce.setBackground(Color.YELLOW);
        botonCatorce.setFont(new Font("Arial", Font.BOLD, 35));

        botonQuince = new JButton("=");
        botonQuince.setBackground(Color.RED);
        botonQuince.setFont(new Font("Arial", Font.BOLD, 35));

        botonDieciseis = new JButton("C");
        botonDieciseis.setBackground(Color.RED);
        botonDieciseis.setFont(new Font("Arial", Font.BOLD, 35));

        botonCientifica = new JButton("Calculadora Cientifica");
        botonCientifica.setBackground(Color.LIGHT_GRAY);
        botonCientifica.setFont(new Font("Arial", Font.BOLD, 25));

        botonSin = new JButton("SIN");
        botonSin.setBackground(Color.LIGHT_GRAY);
        botonSin.setFont(new Font("Arial", Font.BOLD, 25));

        botonCos = new JButton("COS");
        botonCos.setBackground(Color.LIGHT_GRAY);
        botonCos.setFont(new Font("Arial", Font.BOLD, 25));

        botonTan = new JButton("TAN");
        botonTan.setBackground(Color.LIGHT_GRAY);
        botonTan.setFont(new Font("Arial", Font.BOLD, 25));

        panelAbajo = new JPanel();
        panelArriba = new JPanel();
        panelTop = new JPanel();

        panelCientifica = new JPanel();
        panelCientifica.add(new JLabel((Icon) mostrar));



        pantalla = new JTextField();
        container = this.getContentPane();
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        // mostrar = JLabel();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==botonCientifica) {
        System.out.println("asdasd");
        panelCientifica.setPreferredSize(new Dimension(200,200));
        panelCientifica.setLayout(new BorderLayout());
        panelCientifica.setLayout(new GridLayout(2,1));
        panelCientifica.add(botonCos);
        panelCientifica.add(botonTan);
        panelCientifica.add(botonSin);
            if (panelCientifica.isShowing()) {
                container.remove(panelCientifica);
                pack();
            } else {
                    container.add(panelCientifica, BorderLayout.WEST);
                    pack();
            }



    }
        if (e.getSource() == botonUno) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "1");
            } else
                pantalla.setText("1");
            operando = false;
        } else if (e.getSource() == botonDos) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "2");
            } else
                pantalla.setText("2");
            operando = false;
        } else if (e.getSource() == botonTres) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "3");
            } else
                pantalla.setText("3");
            operando = false;
        } else if (e.getSource() == botonCuatro) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "4");
            } else
                pantalla.setText("4");
            operando = false;
        } else if (e.getSource() == botonCinco) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "5");
            } else
                pantalla.setText("5");
            operando = false;
        } else if (e.getSource() == botonSeis) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "6");
            } else
                pantalla.setText("6");
            operando = false;
        } else if (e.getSource() == botonSiete) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "7");
            } else
                pantalla.setText("7");
            operando = false;
        } else if (e.getSource() == botonOcho) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "8");
            } else
                pantalla.setText("8");
            operando = false;
        } else if (e.getSource() == botonNueve) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "9");
            } else
                pantalla.setText("9");
            operando = false;
        } else if (e.getSource() == botonDiez) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "0");
            } else
                pantalla.setText("0");
            operando = false;

        } else if (e.getSource() == botonOnce) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 1;
        } else if (e.getSource() == botonDoce) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 2;
        } else if (e.getSource() == botonCatorce) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 3;
        } else if (e.getSource() == botonTrece) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 4;
        }else if(e.getSource()==botonDieciseis){
            pantalla.setText("");

        } else if (e.getSource() == botonQuince) {
            op2 = Integer.valueOf(pantalla.getText());
            int resultado = 0;
            switch (tipoOperacion) {
                case 1:
                    resultado = op1 + op2;
                    break;
                case 2:
                    resultado = op1 - op2;
                    break;
                case 3:
                    resultado = op1 * op2;
                    break;
                case 4:
                    resultado = op1 / op2;
                    break;
            }

            pantalla.setText(Integer.toString(resultado));

        }
    }
}

