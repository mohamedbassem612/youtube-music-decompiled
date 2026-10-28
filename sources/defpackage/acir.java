package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acir {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final String e;
    public final abyt f;
    public final acit g;

    public acir(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readLong();
        this.f = (abyt) parcel.readParcelable(classLoader);
        this.g = (acit) parcel.readParcelable(classLoader);
        this.e = parcel.readString();
    }

    public final void a(Parcel parcel) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acir) {
            acir acirVar = (acir) obj;
            if (this.a == acirVar.a && this.b == acirVar.b && this.c == acirVar.c && this.d == acirVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int iHashCode = str != null ? str.hashCode() : 0;
        boolean z = this.a;
        boolean z2 = this.b;
        long j = this.d;
        return (((((((((((z ? 1 : 0) + 527) * 31) + (z2 ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31) + iHashCode;
    }

    public final String toString() {
        return "VideoState{" + Integer.toHexString(System.identityHashCode(this)) + " playOnResume=" + this.a + " wasEnded=" + this.b + " restoreFromBackStack=" + this.c + " videoPositionMillis=" + this.d + " playbackClientMangerState=" + String.valueOf(this.f) + '}';
    }

    public acir(boolean z, boolean z2, boolean z3, long j, abyt abytVar, acit acitVar, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.f = abytVar;
        this.g = acitVar;
        this.e = str;
    }
}
