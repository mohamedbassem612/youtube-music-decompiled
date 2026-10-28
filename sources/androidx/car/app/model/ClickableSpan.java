package androidx.car.app.model;

import defpackage.abn;
import defpackage.abp;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ClickableSpan extends CarSpan {
    private final abn mOnClickDelegate;

    private ClickableSpan(abp abpVar) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(abpVar);
    }

    public static ClickableSpan create(abp abpVar) {
        abpVar.getClass();
        return new ClickableSpan(abpVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public abn getOnClickDelegate() {
        abn abnVar = this.mOnClickDelegate;
        abnVar.getClass();
        return abnVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
