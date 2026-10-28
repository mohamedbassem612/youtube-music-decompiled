package androidx.car.app.model;

import defpackage.aat;
import defpackage.abc;
import defpackage.abn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class GridItem implements abc {

    @Deprecated
    public static final int IMAGE_TYPE_ICON = 1;

    @Deprecated
    public static final int IMAGE_TYPE_LARGE = 2;
    private final Badge mBadge;
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final abn mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CarText mText;
    private final CarText mTitle;

    GridItem(aat aatVar) {
        boolean z = aatVar.f;
        this.mIsLoading = false;
        CarText carText = aatVar.a;
        this.mTitle = null;
        CarText carText2 = aatVar.b;
        this.mText = null;
        CarIcon carIcon = aatVar.c;
        this.mImage = null;
        int i = aatVar.d;
        this.mImageType = 0;
        abn abnVar = aatVar.e;
        this.mOnClickDelegate = null;
        Badge badge = aatVar.g;
        this.mBadge = null;
        boolean z2 = aatVar.h;
        this.mIndexable = false;
        CarProgressBar carProgressBar = aatVar.i;
        this.mProgressBar = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GridItem) {
            GridItem gridItem = (GridItem) obj;
            if (this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage)) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable && Objects.equals(this.mProgressBar, gridItem.mProgressBar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Badge getBadge() {
        return this.mBadge;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + ", progressBar: " + this.mProgressBar + ']';
    }

    private GridItem() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
        this.mImageType = 2;
        this.mOnClickDelegate = null;
        this.mBadge = null;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
