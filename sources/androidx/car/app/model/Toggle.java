package androidx.car.app.model;

import defpackage.abl;
import defpackage.ada;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final abl mOnCheckedChangeDelegate;

    public Toggle(ada adaVar) {
        this.mIsChecked = adaVar.b;
        boolean z = adaVar.c;
        this.mIsEnabled = true;
        this.mOnCheckedChangeDelegate = adaVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Toggle) {
            Toggle toggle = (Toggle) obj;
            if (this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public abl getOnCheckedChangeDelegate() {
        abl ablVar = this.mOnCheckedChangeDelegate;
        ablVar.getClass();
        return ablVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + ']';
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}
