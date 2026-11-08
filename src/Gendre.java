public enum Gendre {
    MALE("мужской"),
    FEMALE("женский");

    private final String russianLabel;

    Gendre(String russianLabel) {
        this.russianLabel = russianLabel;
    }

    public String getRussianLabel() {
        return russianLabel;
    }

}
