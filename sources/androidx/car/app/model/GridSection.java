package androidx.car.app.model;

import defpackage.aau;
import defpackage.aav;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class GridSection extends Section {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_EXTRA_LARGE = 4;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mIncompleteLastRowStrategy;
    private final int mItemImageShape;
    private final int mItemSize;

    private GridSection(aau aauVar) {
        super(aauVar);
        int i = aauVar.a;
        this.mItemSize = 0;
        int i2 = aauVar.b;
        this.mItemImageShape = 0;
        int i3 = aauVar.c;
        this.mIncompleteLastRowStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof GridSection)) {
                return false;
            }
            GridSection gridSection = (GridSection) obj;
            if (!super.equals(gridSection) || this.mItemImageShape != gridSection.mItemImageShape || this.mItemSize != gridSection.mItemSize || this.mIncompleteLastRowStrategy != gridSection.mIncompleteLastRowStrategy) {
                return false;
            }
        }
        return true;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mItemImageShape), Integer.valueOf(this.mItemSize), Integer.valueOf(this.mIncompleteLastRowStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "GridSection { itemSize: " + this.mItemSize + ", itemImageShape: " + this.mItemImageShape + ", incompleteLastRowStrategy: " + this.mIncompleteLastRowStrategy + ", " + super.toString() + " }";
    }

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mIncompleteLastRowStrategy = 1;
    }

    /* synthetic */ GridSection(aau aauVar, aav aavVar) {
        this(aauVar);
    }
}
