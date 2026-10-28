package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klq extends kry {
    public static final Parcelable.Creator CREATOR = new fh(12);
    public final String a;

    @Deprecated
    public final int b;
    public final boolean c;
    private final long d;

    public klq(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.c = z;
    }

    public final long a() {
        long j = this.d;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        klq klqVar;
        return (obj instanceof klq) && (klqVar = (klq) obj) != null && Objects.equals(this.a, klqVar.a) && a() == klqVar.a() && this.c == klqVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(a()), Boolean.valueOf(this.c));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("name", this.a, arrayList);
        kro.p("version", Long.valueOf(a()), arrayList);
        kro.p("is_fully_rolled_out", Boolean.valueOf(this.c), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        if (str != null) {
            int iG2 = ksy.g(parcel, 1);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        long jA = a();
        parcel.writeInt(524291);
        parcel.writeLong(jA);
        boolean z = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        ksy.h(parcel, iG);
    }
}
