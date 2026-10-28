package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnk extends kry implements kni {
    public static final Parcelable.Creator CREATOR = new kvu(14);
    public Status a;
    public List b;
    public Bundle c;

    public lnk(Status status, List list, Bundle bundle) {
        this.a = status;
        this.b = list;
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
        ksy.F(parcel, 2, this.b);
        ksy.p(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }

    public lnk() {
    }
}
