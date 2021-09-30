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
    private static final String EVEN_NUMBER = "Сейчас четное число";
    private static final String ODD_NUMBER = "А вот теперь нечетное!";

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

        JLabel paneEvenOrOddNumber = new JLabel(EVEN_NUMBER);
        paneEvenOrOddNumber.setHorizontalAlignment(SwingConstants.CENTER);
        add(paneEvenOrOddNumber, BorderLayout.SOUTH);


        //Уменьшение значений
        JButton decrement = new JButton("-5");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        //Увеличение значений
        JButton increment = new JButton("+2");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        //Добавляем слушателей на кнопки инкремента и декремента
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 5;
                counterValue.setText(String.valueOf(value));
                paneEvenOrOddNumber.setText(checkingEvenOrOddNumber(value));
                infoPane.setText(checkingCounter(value));
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 2;
                counterValue.setText(String.valueOf(value));
                paneEvenOrOddNumber.setText(checkingEvenOrOddNumber(value));
                infoPane.setText(checkingCounter(value));
            }
        });

        setVisible(true);

    }

    public static String checkingEvenOrOddNumber(int value) {
        if (value % 2 == 0) {
            return EVEN_NUMBER;
        } else return ODD_NUMBER;
    }

    public static String checkingCounter(int value) {
        if (value > 20) {
            return COUNTER_IS_TOO_BIG;
        } else if (value < -20) {
            return COUNTER_IS_TOO_LOW;
        } else return COUNTER_NORMAL;
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
