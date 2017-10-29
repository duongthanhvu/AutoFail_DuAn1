/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Guillaume Polet @https://stackoverflow.com/questions/10506789/how-to-display-faint-gray-ghost-text-in-a-jtextfield
 */
public class GhostText implements FocusListener, DocumentListener, PropertyChangeListener {

    private final JTextField textfield;
    private boolean isEmpty;
    private Color ghostColor;
    private Color foregroundColor;
    private final String ghostText;

    protected GhostText(final JTextField textfield, String ghostText) {
        super();
        this.textfield = textfield;
        this.ghostText = ghostText;
        this.ghostColor = Color.LIGHT_GRAY;
        textfield.addFocusListener(this);
        registerListeners();
        updateState();
        if (!this.textfield.hasFocus()) {
            focusLost(null);
        }
    }

    public void delete() {
        unregisterListeners();
        textfield.removeFocusListener(this);
    }

    private void registerListeners() {
        textfield.getDocument().addDocumentListener(this);
        textfield.addPropertyChangeListener("foreground", this);
    }

    private void unregisterListeners() {
        textfield.getDocument().removeDocumentListener(this);
        textfield.removePropertyChangeListener("foreground", this);
    }

    public Color getGhostColor() {
        return ghostColor;
    }

    public void setGhostColor(Color ghostColor) {
        this.ghostColor = ghostColor;
    }

    private void updateState() {
        isEmpty = textfield.getText().length() == 0;
        foregroundColor = textfield.getForeground();
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (isEmpty) {
            unregisterListeners();
            try {
                textfield.setText("");
                textfield.setForeground(foregroundColor);
                if(textfield.getClass().getName().equals("javax.swing.JPasswordField")){
                    JPasswordField pwdfield = (JPasswordField)textfield;
                    //char dauCham = pwdfield.getEchoChar();
                    pwdfield.setEchoChar('●');
                }
            } finally {
                registerListeners();
            }
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (isEmpty) {
            unregisterListeners();
            try {
                textfield.setText(ghostText);
                textfield.setForeground(ghostColor);
                if(textfield.getClass().getName().equals("javax.swing.JPasswordField")){
                    JPasswordField pwdfield = (JPasswordField)textfield;
                    pwdfield.setEchoChar((char) 0);
                }
            } finally {
                registerListeners();
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        updateState();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateState();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateState();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateState();
    }

}