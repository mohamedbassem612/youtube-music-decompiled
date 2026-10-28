package androidx.car.app.model;

import defpackage.aad;
import defpackage.abc;
import defpackage.abn;
import defpackage.acc;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Row implements abc {
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;

    @Deprecated
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_MEDIUM = 16;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final String YOUR_BOAT = "🚣";
    private final List mActions;
    private final CarIcon mEndImage;
    private final CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final Metadata mMetadata;
    private final int mNumericDecoration;
    private final abn mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final int mRowEndImageType;
    private final int mRowImageType;
    private final List mTexts;
    private final CarText mTitle;
    private final Toggle mToggle;

    public Row(acc accVar) {
        this.mTitle = accVar.b;
        this.mTexts = aad.b(accVar.c);
        CarIcon carIcon = accVar.d;
        this.mImage = null;
        CarIcon carIcon2 = accVar.e;
        this.mEndImage = null;
        this.mActions = aad.b(accVar.f);
        int i = accVar.g;
        this.mNumericDecoration = -1;
        this.mToggle = accVar.h;
        abn abnVar = accVar.i;
        this.mOnClickDelegate = null;
        this.mMetadata = accVar.j;
        boolean z = accVar.k;
        this.mIsBrowsable = false;
        int i2 = accVar.l;
        this.mRowImageType = 1;
        int i3 = accVar.m;
        this.mRowEndImageType = 1;
        boolean z2 = accVar.a;
        this.mIsEnabled = true;
        boolean z3 = accVar.n;
        this.mIndexable = true;
        CarProgressBar carProgressBar = accVar.o;
        this.mProgressBar = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Row) {
            Row row = (Row) obj;
            if (Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mEndImage, row.mEndImage) && Objects.equals(this.mActions, row.mActions) && this.mNumericDecoration == row.mNumericDecoration && Objects.equals(this.mToggle, row.mToggle)) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(row.mOnClickDelegate == null)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mRowEndImageType == row.mRowEndImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable && Objects.equals(this.mProgressBar, row.mProgressBar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List getActions() {
        return this.mActions;
    }

    public CarIcon getEndImage() {
        return this.mEndImage;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public Metadata getMetadata() {
        return this.mMetadata;
    }

    public int getNumericDecoration() {
        return this.mNumericDecoration;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public int getRowEndImageType() {
        return this.mRowEndImageType;
    }

    public int getRowImageType() {
        return this.mRowImageType;
    }

    public List getTexts() {
        return aad.a(this.mTexts);
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Toggle getToggle() {
        return this.mToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mTexts, this.mImage, this.mEndImage, this.mActions, Integer.valueOf(this.mNumericDecoration), this.mToggle, Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, Boolean.valueOf(this.mIsBrowsable), Integer.valueOf(this.mRowImageType), Integer.valueOf(this.mRowEndImageType), Boolean.valueOf(this.mIsEnabled), Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", text count: ");
        List list = this.mTexts;
        sb.append(list != null ? list.size() : 0);
        sb.append(", image: ");
        sb.append(this.mImage);
        sb.append(", endImage: ");
        sb.append(this.mEndImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append(", progressBar: ");
        sb.append(this.mProgressBar);
        sb.append(']');
        return sb.toString();
    }

    public CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    public Row row() {
        return this;
    }

    private Row() {
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mImage = null;
        this.mEndImage = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mRowEndImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
