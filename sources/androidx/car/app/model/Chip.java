package androidx.car.app.model;

import defpackage.aak;
import defpackage.abc;
import defpackage.abn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Chip implements abc {
    private final CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final abn mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final ChipStyle mStyle;
    private final CarText mTitle;

    Chip(aak aakVar) {
        Object obj = aakVar.b;
        this.mTitle = null;
        Object obj2 = aakVar.c;
        this.mStartIcon = null;
        Object obj3 = aakVar.d;
        this.mEndIcon = null;
        boolean z = aakVar.a;
        this.mIsSelected = false;
        Object obj4 = aakVar.e;
        this.mOnClickDelegate = null;
        Object obj5 = aakVar.f;
        this.mStyle = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Chip) {
            Chip chip = (Chip) obj;
            if (Objects.equals(this.mTitle, chip.mTitle) && Objects.equals(this.mStartIcon, chip.mStartIcon) && Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(chip.mOnClickDelegate == null)) && Objects.equals(this.mStyle, chip.mStyle)) {
                    return true;
                }
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mStartIcon, this.mEndIcon, Boolean.valueOf(this.mIsSelected), Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle);
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + '}';
    }

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }
}
