package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljw extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(12);
    public long a;
    public String b;
    public int c;
    public Long d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public String j;

    public ljw(long j, String str, int i, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljw) {
            ljw ljwVar = (ljw) obj;
            if (Objects.equals(Long.valueOf(this.a), Long.valueOf(ljwVar.a)) && Objects.equals(this.b, ljwVar.b) && Objects.equals(Integer.valueOf(this.c), Integer.valueOf(ljwVar.c)) && Objects.equals(this.d, ljwVar.d) && Objects.equals(this.e, ljwVar.e) && Objects.equals(this.f, ljwVar.f) && Objects.equals(this.g, ljwVar.g) && Objects.equals(this.h, ljwVar.h) && Objects.equals(this.i, ljwVar.i) && Objects.equals(this.j, ljwVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.z(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.z(parcel, 7, this.g);
        ksy.z(parcel, 8, this.h);
        ksy.z(parcel, 9, this.i);
        ksy.B(parcel, 10, this.j);
        ksy.h(parcel, iG);
    }

    private ljw() {
    }
}
