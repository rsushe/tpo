package org.tpo.story;

public enum Book {
    GALACTIC_GUIDEBOOK("Путеводитель по Галактике для автостопщиков");

    private final String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
