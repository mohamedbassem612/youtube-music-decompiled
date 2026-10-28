package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wjn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(17);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final aigj f;
    private final arhk g;

    public wjn(arhk arhkVar) {
        this.g = arhkVar;
        this.f = arhkVar.c;
        this.a = arhkVar.d;
        arhl arhlVar = arhkVar.b;
        arhlVar = arhlVar == null ? arhl.a : arhlVar;
        this.b = arhlVar.b;
        this.c = arhlVar.c;
        this.e = arhlVar.e;
        this.d = arhlVar.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.g, parcel);
    }
}
