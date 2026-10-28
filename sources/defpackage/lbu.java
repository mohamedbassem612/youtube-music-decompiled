package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbu extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(15);
    public final Bundle a;

    public lbu(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.p(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }
}
