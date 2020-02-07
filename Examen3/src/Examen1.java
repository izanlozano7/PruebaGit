import javax.swing.*;
import java.awt.*;
public class Examen1 {

	public static void main(String[] args){
		
		
		Ventana v = new Ventana();
		v.setVisible(true);
	}
	
	
}

class Ventana extends JFrame{
	public Ventana() {
		super("Ejemplo de programa");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		FlowLayout fl = new FlowLayout();
		FlowLayout fl2 = new FlowLayout();
		GridLayout gl = new GridLayout();
		GridLayout gl2 = new GridLayout();
		
		pan.setLayout(fl);
		pan3.setLayout(fl2);
		pan2.setLayout(gl);
		
		
		pan2.setSize(400,290);
		gl2.setColumns(2);
		gl2.setRows(2);
		gl2.setHgap(2);
		gl2.setVgap(2);
		
		gl.setColumns(3);
		gl.setRows(5);
		gl.setHgap(3);
		gl.setVgap(5);
		
		
		JLabel label = new JLabel("Escribe la operacion");
		JTextField text = new JTextField(10);
		
		JButton cero = new JButton("0");
		JButton uno = new JButton("1");
		JButton dos = new JButton("2");
		JButton tres = new JButton("3");
		JButton cuatro = new JButton("4");
		JButton cinco = new JButton("5");
		JButton seis = new JButton("6");
		JButton siete = new JButton("7");
		JButton ocho = new JButton("8");
		JButton nueve = new JButton("9");
		
		JButton calcular = new JButton("Calcular");
		
		JButton sumar = new JButton("+");
		JButton restar = new JButton("-");
		
		JCheckBox radianes = new JCheckBox("Radianes");
		JCheckBox grados = new JCheckBox("Grados");
		
		
		
		pan.add(label);
		pan.add(text);
		
		pan3.add(sumar);
		pan3.add(restar);
		
		
		pan.add(pan2);
		pan2.add(uno);
		pan2.add(dos);
		pan2.add(tres);
		pan2.add(cuatro);
		pan2.add(cinco);
		pan2.add(seis);
		pan2.add(ocho);
		pan2.add(siete);
		pan2.add(nueve);
		pan2.add(radianes);
		pan2.add(cero);
		pan2.add(pan3);
		pan2.add(grados);	
		pan2.add(calcular);
		
		
		
		cp.add(pan);
		
		
		
		
		
	}
}