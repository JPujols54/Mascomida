package logica;

import javax.swing.*;
import java.awt.*;

public class MenuPizzaFrame extends JFrame {
    private DefaultListModel<Pizza> modeloCarrito;
    private Usuario usuario;

    public MenuPizzaFrame(Usuario usuario) {
        this.usuario = usuario;

        setTitle("Menú de Pizzas");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        modeloCarrito = new DefaultListModel<>();

        JComboBox<String> tipoPizza = new JComboBox<>(new String[]{"Pepperoni", "Hawaiana", "Vegetariana", "4 Quesos"});
        JComboBox<String> tamanoPizza = new JComboBox<>(new String[]{"Pequeña", "Mediana", "Grande"});
        JSpinner cantidadSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));

        JButton btnAgregar = new JButton("Añadir al Carrito");
        JButton btnVerCarrito = new JButton("Ver Carrito");

        btnAgregar.addActionListener(e -> {
            Pizza pizza = new Pizza(tipoPizza.getSelectedItem().toString(), tamanoPizza.getSelectedItem().toString(), (int) cantidadSpinner.getValue());
            modeloCarrito.addElement(pizza);
            JOptionPane.showMessageDialog(this, "Pizza añadida al carrito");
        });

        btnVerCarrito.addActionListener(e -> new CarritoFrame(modeloCarrito, usuario));

        setLayout(new GridLayout(6, 1));
        add(new JLabel("Tipo de Pizza:"));
        add(tipoPizza);
        add(new JLabel("Tamaño:"));
        add(tamanoPizza);
        add(new JLabel("Cantidad:"));
        add(cantidadSpinner);
        add(btnAgregar);
        add(btnVerCarrito);

        setVisible(true);
    }
}
