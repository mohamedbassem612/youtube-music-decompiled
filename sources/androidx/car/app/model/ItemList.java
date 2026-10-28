package androidx.car.app.model;

import defpackage.aad;
import defpackage.abc;
import defpackage.abd;
import defpackage.abn;
import defpackage.abt;
import defpackage.abv;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ItemList {
    private final List mItems;
    private final CarText mNoItemsMessage;
    private final abt mOnItemVisibilityChangedDelegate;
    private final abv mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(abd abdVar) {
        this.mSelectedIndex = abdVar.b;
        this.mItems = aad.b(abdVar.a);
        this.mNoItemsMessage = abdVar.e;
        this.mOnSelectedDelegate = abdVar.c;
        this.mOnItemVisibilityChangedDelegate = abdVar.d;
    }

    public static abn getOnClickDelegate(abc abcVar) {
        if (abcVar instanceof Row) {
            return ((Row) abcVar).getOnClickDelegate();
        }
        if (abcVar instanceof GridItem) {
            return ((GridItem) abcVar).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(abc abcVar) {
        if (abcVar instanceof Row) {
            return ((Row) abcVar).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemList) {
            ItemList itemList = (ItemList) obj;
            if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
                if (Objects.equals(Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                    if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List getItems() {
        return aad.a(this.mItems);
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public abt getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public abv getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public abd toBuilder() {
        return new abd(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append(']');
        return sb.toString();
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
