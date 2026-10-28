package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lka extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(16);
    public int a;

    public lka(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                this.a = i;
                return;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lka) {
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((lka) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("EnumVal", Integer.valueOf(this.a), arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }

    private lka() {
    }
}
