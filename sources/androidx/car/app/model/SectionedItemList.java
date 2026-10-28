package androidx.car.app.model;

import defpackage.adg;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SectionedItemList {
    private final CarText mHeader;
    private final ItemList mItemList;

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }

    public static SectionedItemList create(ItemList itemList, CharSequence charSequence) {
        charSequence.getClass();
        CarText carTextCreate = CarText.create(charSequence);
        adg.d.a(carTextCreate);
        itemList.getClass();
        return new SectionedItemList(itemList, carTextCreate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SectionedItemList) {
            SectionedItemList sectionedItemList = (SectionedItemList) obj;
            if (Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader)) {
                return true;
            }
        }
        return false;
    }

    public CarText getHeader() {
        CarText carText = this.mHeader;
        carText.getClass();
        return carText;
    }

    public ItemList getItemList() {
        ItemList itemList = this.mItemList;
        itemList.getClass();
        return itemList;
    }

    public int hashCode() {
        return Objects.hash(this.mItemList, this.mHeader);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        sb.append(this.mItemList);
        sb.append(", has header: ");
        sb.append(this.mHeader != null);
        sb.append(']');
        return sb.toString();
    }

    private SectionedItemList(ItemList itemList, CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }
}
