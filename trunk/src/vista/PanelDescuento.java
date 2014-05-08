package vista;

import java.awt.Color;

import javax.swing.JPanel;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class PanelDescuento extends JPanel
{	
	private JDatePickerImpl dPInicio;	
	private JDatePickerImpl dPFin;	
	private JSpinner jSocupacionSup;	
	private JSpinner jSOcupacionInf;	
	private JSpinner sPPorcentage;
	private JList list;	
	private JButton btnAgregar;	
	private JButton btnEliminar;	
	private JButton btnLimpiar;
	
	public PanelDescuento() {
		setLayout(null);
		setBackground( new Color(184, 207, 229) );
		dPInicio = new JDatePickerImpl(new JDatePanelImpl(new UtilDateModel()));
		dPInicio.setBounds(480, 74, 126, 23);
		add(dPInicio);
		
		JLabel lblFechaLimiteSuperior = new JLabel("Fecha Limite Superior");
		lblFechaLimiteSuperior.setBounds(325, 74, 142, 24);
		add(lblFechaLimiteSuperior);
		
		JLabel lblFechaLimiteInferior = new JLabel("Fecha Limite inferior");
		lblFechaLimiteInferior.setBounds(325, 121, 142, 23);
		add(lblFechaLimiteInferior);
		
		dPFin = new JDatePickerImpl((new JDatePanelImpl(new UtilDateModel())));
		dPFin.getJFormattedTextField().setSize(117, 23);
		dPFin.getJFormattedTextField().setLocation(266, 0);
		dPFin.setBounds(480, 121, 126, 23);
		add(dPFin);
		
		JLabel lblLimiteSuperiorOcupacion = new JLabel("Limite Superior Ocupacion");
		lblLimiteSuperiorOcupacion.setBounds(325, 163, 155, 14);
		add(lblLimiteSuperiorOcupacion);
		
		JLabel lblLimiteInferiorOcupacion = new JLabel("Limite Inferior Ocupacion");
		lblLimiteInferiorOcupacion.setBounds(325, 198, 155, 14);
		add(lblLimiteInferiorOcupacion);
		
		jSocupacionSup = new JSpinner();
		jSocupacionSup.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		jSocupacionSup.setBounds(551, 161, 55, 18);
		add(jSocupacionSup);
		
		jSOcupacionInf = new JSpinner();
		jSOcupacionInf.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		jSOcupacionInf.setBounds(551, 196, 55, 18);
		add(jSOcupacionInf);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(515, 285, 91, 23);
		add(btnAgregar);
		
		sPPorcentage = new JSpinner();
		sPPorcentage.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		sPPorcentage.setBounds(551, 232, 55, 18);
		add(sPPorcentage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 269, 298);
		add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblPorcentaje = new JLabel("Porcentaje de descuento");
		lblPorcentaje.setBounds(325, 234, 142, 14);
		add(lblPorcentaje);
		
		ImageIcon image = new ImageIcon(getClass().getResource("delete.png"));
		btnEliminar = new JButton(image);
		btnEliminar.setBounds(125, 320, 30, 23);
		add(btnEliminar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(352, 285, 89, 23);
		add(btnLimpiar);
	}

	public JDatePickerImpl getdPInicio( )
	{
		return dPInicio;
	}

	public JDatePickerImpl getdPFin( )
	{
		return dPFin;
	}

	public JSpinner getjSocupacionSup( )
	{
		return jSocupacionSup;
	}

	public JSpinner getjSOcupacionInf( )
	{
		return jSOcupacionInf;
	}

	public JSpinner getsPPorcentage( )
	{
		return sPPorcentage;
	}

	public JList getList( )
	{
		return list;
	}

	public JButton getBtnAgregar( )
	{
		return btnAgregar;
	}

	public JButton getBtnEliminar( )
	{
		return btnEliminar;
	}

	public JButton getBtnLimpiar( )
	{
		return btnLimpiar;
	}	
}
