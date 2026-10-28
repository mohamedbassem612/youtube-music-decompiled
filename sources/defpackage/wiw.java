package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wiw implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(9);
    public final int a;
    public final String b;
    public final boolean c;
    public final agkz d;
    public final aipc e;

    public wiw(wgs wgsVar, aipc aipcVar, agkz agkzVar) {
        this(wgsVar.f(), aipcVar, wgsVar.A(), wgsVar.W(), agkzVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wiw wiwVar = (wiw) obj;
        if (wiwVar == null) {
            return 1;
        }
        return this.a - wiwVar.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wiw) {
            wiw wiwVar = (wiw) obj;
            if (this.a == wiwVar.a && this.e == wiwVar.e && this.b.equals(wiwVar.b) && this.c == wiwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.e.s);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        agkz agkzVar = this.d;
        if (agkzVar == null || agkzVar.isEmpty()) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(agkzVar.size());
            parcel.writeIntArray(Collection.EL.stream(agkzVar).mapToInt(new ddc(12)).toArray());
        }
    }

    public wiw(int i, aipc aipcVar, String str, boolean z, agkz agkzVar) {
        this.a = i;
        this.e = aipcVar;
        typ.f(str);
        this.b = str;
        this.c = z;
        this.d = agkzVar;
    }

    public wiw(int i, aipc aipcVar, String str, boolean z) {
        this(i, aipcVar, str, z, agpr.a);
    }
}
