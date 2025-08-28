package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.annotation.Nullable;

public class BaseListDiffCallback <TYPE_UI extends ListDiffInterface<TYPE_UI>> extends DiffUtil.ItemCallback<TYPE_UI> {
    @Override
    public boolean areItemsTheSame(@NonNull TYPE_UI oldItem, @NonNull TYPE_UI newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull TYPE_UI oldItem, @NonNull TYPE_UI newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull TYPE_UI oldItem, @NonNull TYPE_UI newItem) {
        return newItem;
    }
}
