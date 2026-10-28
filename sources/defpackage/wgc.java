package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wgc implements Parcelable, acjy {
    public static final Parcelable.Creator CREATOR = new uwz(4);
    public alxi a;
    public List b;
    private Object c;

    public wgc(alxi alxiVar) {
        this.a = alxiVar;
    }

    @Override // defpackage.acjy
    public final apjh a() {
        apjh apjhVar = this.a.e;
        return apjhVar == null ? apjh.a : apjhVar;
    }

    @Override // defpackage.acjy
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.acjy
    public final void c(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        return this.a.f.G();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
    }
}
