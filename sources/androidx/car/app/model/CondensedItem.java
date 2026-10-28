package androidx.car.app.model;

import defpackage.aan;
import defpackage.aao;
import defpackage.abc;
import defpackage.abn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CondensedItem implements abc {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final boolean mIndexable;
    private final CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final abn mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CondensedItemStyle mStyle;
    private final CarText mText;
    private final CarText mTitle;
    private final CarIcon mTrailingImage;
    private final int mTrailingImageType;

    private CondensedItem(aan aanVar) {
        CarText carText = aanVar.a;
        this.mTitle = null;
        CarText carText2 = aanVar.b;
        this.mText = null;
        CarIcon carIcon = aanVar.c;
        this.mLeadingImage = null;
        int i = aanVar.d;
        this.mLeadingImageType = 0;
        CarIcon carIcon2 = aanVar.e;
        this.mTrailingImage = null;
        int i2 = aanVar.f;
        this.mTrailingImageType = 0;
        CondensedItemStyle condensedItemStyle = aanVar.g;
        this.mStyle = null;
        abn abnVar = aanVar.h;
        this.mOnClickDelegate = null;
        CarProgressBar carProgressBar = aanVar.i;
        this.mProgressBar = null;
        boolean z = aanVar.j;
        this.mIndexable = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedItem) {
            CondensedItem condensedItem = (CondensedItem) obj;
            if (Objects.equals(this.mTitle, condensedItem.mTitle) && Objects.equals(this.mText, condensedItem.mText) && Objects.equals(this.mLeadingImage, condensedItem.mLeadingImage) && this.mLeadingImageType == condensedItem.mLeadingImageType && Objects.equals(this.mTrailingImage, condensedItem.mTrailingImage) && this.mTrailingImageType == condensedItem.mTrailingImageType && Objects.equals(this.mStyle, condensedItem.mStyle)) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(condensedItem.mOnClickDelegate == null)) && this.mIndexable == condensedItem.mIndexable && Objects.equals(this.mProgressBar, condensedItem.mProgressBar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public CarIcon getLeadingImage() {
        return this.mLeadingImage;
    }

    public int getLeadingImageType() {
        return this.mLeadingImageType;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CondensedItemStyle getStyle() {
        return this.mStyle;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public CarIcon getTrailingImage() {
        return this.mTrailingImage;
    }

    public int getTrailingImageType() {
        return this.mTrailingImageType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mLeadingImage, Integer.valueOf(this.mLeadingImageType), this.mTrailingImage, Integer.valueOf(this.mTrailingImageType), this.mStyle, this.mOnClickDelegate, this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        return "CondensedItem { title: " + this.mTitle + ", text: " + this.mText + ", leadingImage: " + this.mLeadingImage + ", leadingImageType: " + this.mLeadingImageType + ", trailingImage: " + this.mTrailingImage + ", trailingImageType: " + this.mTrailingImageType + ", style: " + this.mStyle + ", onClickDelegate: " + this.mOnClickDelegate + ", progressBar: " + this.mProgressBar + " }";
    }

    /* synthetic */ CondensedItem(aan aanVar, aao aaoVar) {
        this(aanVar);
    }

    private CondensedItem() {
        this.mTitle = null;
        this.mText = null;
        this.mLeadingImage = null;
        this.mLeadingImageType = 1;
        this.mTrailingImage = null;
        this.mTrailingImageType = 1;
        this.mStyle = null;
        this.mOnClickDelegate = null;
        this.mProgressBar = null;
        this.mIndexable = true;
    }
}
