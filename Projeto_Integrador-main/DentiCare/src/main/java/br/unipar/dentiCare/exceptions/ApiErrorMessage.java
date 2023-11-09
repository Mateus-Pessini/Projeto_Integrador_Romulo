package br.unipar.dentiCare.exceptions;

import java.util.Arrays;
import java.util.List;

public class ApiErrorMessage {

    private List<String> errors;

    public List<String> getError() {
        return errors;
    }

    public void setError(List<String> errors) {
        this.errors = errors;
    }

    public ApiErrorMessage(List<String> error) {
        this.errors = error;
    }

    public ApiErrorMessage(String error) {
        this.errors = Arrays.asList(error);
    }


}
