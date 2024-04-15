import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class LotofacilGUI extends JFrame {
    // Atributos

    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou [impar");

    public LotofacilGUI(){
        // Construtor

        this.setTitle("** Lotofácil - Interface Gráfica **");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 203, 219));
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    aposta2();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });
    }

    private void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroAposta = JOptionPane.showInputDialog(null, "Digite o número de 0 a 100", "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        int numeroApostaint = Integer.parseInt(numeroAposta.toString());
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        if (numeroApostaint == numeroSorteado) {
            JOptionPane.showInputDialog(null, "Você ganhou milzão", " Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        } else {
            JOptionPane.showInputDialog(null, "Você perdeu, o número sorteado foi: " + numeroSorteado, "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        }
    }

    private void aposta2() throws IOException{
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object letraApostada = JOptionPane.showInputDialog(null, "Digite a letra de A a Z", "Aposta 2", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        char letraApostadaChar = letraApostada.toString().toUpperCase().charAt(0);
        char letraSorteada = 'I';
        if (Character.isLetter(letraApostadaChar)) {
            if (letraApostadaChar == letraSorteada) {
                JOptionPane.showInputDialog(null, "Parabéns!! Você acaba de ganhar 700 reais", " Aposta 2", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
            } else {
                JOptionPane.showInputDialog(null, "Vish, não foi dessa vez, a letra sorteada foi : " + letraSorteada, "Aposta 2", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
            }
        }
    }

    private void aposta3() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        String numeroDigitado = JOptionPane.showInputDialog(null, "Digite um número", "Aposta 3", JOptionPane.INFORMATION_MESSAGE, icon, null, "").toString();
        int numeroDigitadoInt = Integer.parseInt(textField.getText());


        if (numeroDigitadoInt % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Você ganhou R$200,00. Parabéns!");
        } else {
            JOptionPane.showMessageDialog(null, "Eita, você perdeu! O número digitado é ímpar e a premiação foi para números pares.");
        });

        panel.add(button);

        frame.setVisible(true);
    }
}
