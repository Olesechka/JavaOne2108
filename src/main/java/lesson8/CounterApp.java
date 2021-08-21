package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CounterApp extends JFrame {
    private int value;
    private static final String COUNTER_NORMAL = "Счетчик в норме";
    private static final String COUNTER_IS_TOO_BIG = "Счетчик слишком большой";
    private static final String COUNTER_IS_TOO_LOW = "Счетчик слишком маленький";

    //camelCase
    //snake_case_text
    //kebab-case-text

    public CounterApp(int initialValue) {
        this.value = value;
        setBounds(500, 500, 300, 150);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Создадим шрифт
        Font font = new Font("Arial", Font.BOLD, 32);

        //Создадим сам счетчик
        JLabel counterValue = new JLabel(String.valueOf(value));
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);

        JLabel infoPane = new JLabel(COUNTER_NORMAL);
        infoPane.setHorizontalAlignment(SwingConstants.CENTER);
        add(infoPane, BorderLayout.NORTH);


        //Уменьшение значений
        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        //Увеличение значений
        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        //Добавляем слушателей на кнопки инкремента и декремента
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
                if (value < -10) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
                if (value > 10) {
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        setVisible(true);


    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
