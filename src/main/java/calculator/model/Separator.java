package calculator.model;

import static calculator.common.exception.ErrorMessage.SEPARATOR_FORMAT_ERROR;

public record Separator(String separator) {

    public Separator(String separator) {
        this.separator = Validator.validate(separator);
    }

    private static class Validator {
        private static String validate(String separator) {
            validateLength(separator);
            return separator;
        }

        private static void validateLength(String separator) {
            if (separator.length() != 1) {
                throw new IllegalArgumentException(SEPARATOR_FORMAT_ERROR);
            }
        }
    }
}