package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abd {
    public final List a;
    public int b;
    public abv c;
    public abt d;
    public CarText e;

    public abd(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }

    public final ItemList a() {
        if (this.c != null) {
            List<abc> list = this.a;
            int size = list.size();
            if (size == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            if (this.b >= size) {
                throw new IllegalStateException("The selected item index (" + this.b + ") is larger than the size of the list (" + size + ')');
            }
            for (abc abcVar : list) {
                if (ItemList.getOnClickDelegate(abcVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(abcVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(this);
    }

    public final void b(abc abcVar) {
        abcVar.getClass();
        this.a.add(abcVar);
    }

    public abd() {
        this.a = new ArrayList();
    }
}
