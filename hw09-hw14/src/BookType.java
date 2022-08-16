public enum BookType {
    FICTION("Fiction"), NONFICTION("Non-Fiction"), SCIENTIFIC("Scientific"),
    CLASSICS("Classics"), FANTASY("Fantasy");

    private String description;

    BookType(String description) {
        this.description = description;

    }

    public void setDescription(String description) {
        this.description = description;
    }
}
