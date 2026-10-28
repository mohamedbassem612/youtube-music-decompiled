package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnr extends kry implements kni {
    public static final Parcelable.Creator CREATOR = new lof(1);
    public Status a;
    public jxk b;
    public Bundle c;

    public lnr(Status status, jxk jxkVar, Bundle bundle) {
        this.a = status;
        this.b = jxkVar;
        this.c = bundle;
    }

    @Override // defpackage.kni
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.p(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }

    public lnr() {
    }
}
