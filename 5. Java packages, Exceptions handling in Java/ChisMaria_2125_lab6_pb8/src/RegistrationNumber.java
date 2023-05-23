public class RegistrationNumber extends NumberException {
    String registrationNumber;

    public RegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void verifyNumber() {
        StringBuilder stringBuilder = new StringBuilder(registrationNumber);
        if (stringBuilder.charAt(0) >= 'A' && stringBuilder.charAt(0) <= 'Z' && stringBuilder.charAt(1) >= 'A' && stringBuilder.charAt(1) <= 'Z') {
            if (stringBuilder.charAt(4) >= '0' && stringBuilder.charAt(4) <= '9') {
                throw new NumberException("This registration number can not have a 3 digits.");
            }
        }
        if (stringBuilder.charAt(0) == 'B' && stringBuilder.charAt(1) >= '0' && stringBuilder.charAt(1) <= '9') {
            if (stringBuilder.charAt(4) == 'O' || stringBuilder.charAt(4) == 'I' || stringBuilder.charAt(6) == 'O' || stringBuilder.charAt(6) == 'I') {
                throw new NumberException("The registration number can not have O or I on the first or last position.");
            }
        }
        if (stringBuilder.charAt(0) >= 'A' && stringBuilder.charAt(0) <= 'Z' && stringBuilder.charAt(1) >= 'A' && stringBuilder.charAt(1) <= 'Z') {
            if (stringBuilder.charAt(4) == 'O' || stringBuilder.charAt(4) == 'I' || stringBuilder.charAt(6) == 'O' || stringBuilder.charAt(6) == 'I') {
                throw new NumberException("The registration number can not have O or I on the first or last position.");
            }
        }
        System.out.println("The registration number is: "+ registrationNumber);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
