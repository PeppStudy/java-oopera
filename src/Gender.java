public enum Gender {
    MALE("мужской"),
    FEMALE("женский");

    private final String russianLabel;

    Gender(String russianLabel) {
        this.russianLabel = russianLabel;
    }

    public String getRussianLabel() {
        return russianLabel;
    }

}
