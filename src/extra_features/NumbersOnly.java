package extra_features;

import javax.swing.text.*;

public class NumbersOnly extends DocumentFilter {

    private final int maxCharacters;

    public NumbersOnly(int maxChars) {
        maxCharacters = maxChars;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (isInputValid(fb, string, offset)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (isInputValid(fb, text, offset)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isInputValid(FilterBypass fb, String text, int adjustment) throws BadLocationException {
        String newText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()))
                .insert(adjustment, text).toString();
        return newText.matches("\\d*") && newText.length() <= maxCharacters;
    }
}