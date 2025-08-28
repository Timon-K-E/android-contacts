package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<TYPE_UI> {
    boolean theSameAs(TYPE_UI type_ui);

    boolean equals(Object object);
}
