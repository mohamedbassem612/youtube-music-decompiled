package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uz extends vm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(20);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;
    public final List h;
    public final Map i;
    private Integer j;

    public uz(String str, String str2, String str3, long j, long j2, int i, List list, List list2) {
        afv afvVar = new afv(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            vi viVar = (vi) list.get(i2);
            afvVar.put(viVar.a, viVar);
        }
        super((byte[]) null);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = list;
        this.i = afvVar;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uz) {
            uz uzVar = (uz) obj;
            if (this.a.equals(uzVar.a) && this.b.equals(uzVar.b) && this.c.equals(uzVar.c) && this.e == uzVar.e && this.d == uzVar.d && this.f == uzVar.f && Objects.equals(this.g, uzVar.g) && Objects.equals(this.i, uzVar.i) && Objects.equals(this.h, uzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.j;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Objects.hash(this.a, this.b, this.c, Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.d), Integer.valueOf(Objects.hashCode(this.g)), Integer.valueOf(Objects.hashCode(this.i)), Integer.valueOf(Objects.hashCode(this.h))));
            this.j = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ax.a(this, parcel);
    }
}
