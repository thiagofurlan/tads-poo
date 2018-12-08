package modificado;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Dialogo extends JDialog implements ActionListener, KeyListener {
  
  private JTextField campo;
  private JButton botao;
  private Retorno retorno;
  private IDocumento documento;

  public Dialogo(IDocumento d) {
	this.documento = d;
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setLayout(new FlowLayout());
    this.setTitle(d.getTexto());
    this.setSize(300, 100);    
    this.campo = new JTextField("", documento.getTamanho());
    this.campo.addKeyListener(this);
    this.botao = new JButton("OK");
    this.botao.addActionListener(this);
    this.getContentPane().add(campo);
    this.getContentPane().add(botao);
    this.pack();    
  }
  
  public void mostra() {
    this.setVisible(true);
  }
  
  public void quandoOk(Retorno retorno) {
    this.retorno = retorno;
  }
 
  @Override
  public void actionPerformed(ActionEvent e) {
    documento.setValor(campo.getText());
    if (documento.getValor().length() != documento.getTamanho()) {
      JOptionPane.showMessageDialog(this, documento.getSizeError(), "ERRO", JOptionPane.ERROR_MESSAGE);
      campo.requestFocus();
      campo.selectAll();
      return;
    }
    for (int i = 0; i < documento.getValor().length(); i++) {
      char c = documento.getValor().charAt(i);
      if (c < 48 || c > 57) { // só números
        JOptionPane.showMessageDialog(this, documento.getNumberError(), "ERRO", JOptionPane.ERROR_MESSAGE);
        campo.requestFocus();
        campo.select(i, i + 1);
        return;
      }
    }  
    // 
    if (retorno != null) retorno.recebe(documento);
    this.dispose(); // fecha o diálogo
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // deixa apertar backspace e delete
    if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_DELETE) return;
    if (campo.getText().length() == documento.getTamanho()) e.consume();   
  }

  @Override
  public void keyPressed(KeyEvent e) { /* NOPE */ }

  @Override
  public void keyReleased(KeyEvent e) { /* NOPE */ }
 
}
