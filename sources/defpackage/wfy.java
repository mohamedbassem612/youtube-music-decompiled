package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfy implements Parcelable, acjy {
    public static final Parcelable.Creator CREATOR = new kwo(12);
    public final almd a;
    private Object b = null;
    private agke c = null;

    public wfy(almd almdVar) {
        this.a = almdVar;
        new HashMap();
    }

    @Override // defpackage.acjy
    public final apjh a() {
        apjh apjhVar = this.a.i;
        return apjhVar == null ? apjh.a : apjhVar;
    }

    @Override // defpackage.acjy
    public final synchronized Object b() {
        return this.b;
    }

    @Override // defpackage.acjy
    public final synchronized void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        return this.a.k.G();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        alop alopVar = this.a.c;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        return timeUnit.toMillis(alopVar.e);
    }

    public final synchronized agke f() {
        agke agkeVar;
        agkeVar = this.c;
        if (agkeVar == null) {
            alme almeVar = this.a.f;
            if (almeVar == null) {
                almeVar = alme.a;
            }
            agkeVar = (agke) Collection.EL.stream((almeVar.b == 58173949 ? (almj) almeVar.c : almj.a).b).filter(new gqn(14)).map(new rmm(9)).collect(aghu.a);
            this.c = agkeVar;
        }
        return agkeVar;
    }

    public final boolean g() {
        return (this.a.b & 64) == 0;
    }

    public final String toString() {
        almd almdVar = this.a;
        return almdVar == null ? "(null)" : almdVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
    }
}
