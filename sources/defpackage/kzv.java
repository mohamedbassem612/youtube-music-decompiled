package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzv extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(3);
    public final int a;
    public final String b;
    public final Intent c;

    public kzv(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static kzv a(Activity activity) {
        return new kzv(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzv) {
            kzv kzvVar = (kzv) obj;
            if (this.a == kzvVar.a && Objects.equals(this.b, kzvVar.b) && Objects.equals(this.c, kzvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.A(parcel, 3, this.c, i);
        ksy.h(parcel, iG);
    }
}
