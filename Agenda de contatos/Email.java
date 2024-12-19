public class Email {
    private String email;
    private String rotulo;

    public Email(String email , String rotulo){
        this.email = email;
        this.rotulo = rotulo;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return rotulo+" : "+email;
    }
}
