package Vistas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaVentanaPrincipal {

	private JFrame frmVentana;
	private JTextField txtEscribaAqui;

	public VistaVentanaPrincipal() 
	{
		initialize();
	}

	public void crearVentana()
	{
		frmVentana.setVisible(true);
	}
	
	private void initialize() 
	{
		frmVentana = new JFrame();
		frmVentana.setTitle("Ventana");
		frmVentana.setBounds(100, 100, 450, 300);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(null);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(188, 158, 89, 23);
		frmVentana.getContentPane().add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener()
	    {
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "Alguien hizo click en el boton");
			}
	    });
		
		
		txtEscribaAqui = new JTextField();
		txtEscribaAqui.setText("escriba aqui");
		txtEscribaAqui.setBounds(216, 88, 86, 20);
		frmVentana.getContentPane().add(txtEscribaAqui);
		txtEscribaAqui.setColumns(10);
		
		JLabel lblEtiqueta = new JLabel("Esto es una etiqueta");
		lblEtiqueta.setBounds(52, 91, 119, 14);
		frmVentana.getContentPane().add(lblEtiqueta);
	}

}
