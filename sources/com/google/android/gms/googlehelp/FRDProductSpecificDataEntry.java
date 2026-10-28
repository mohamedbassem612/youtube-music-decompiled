package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kpm;
import defpackage.kry;
import defpackage.ksy;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class FRDProductSpecificDataEntry extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpm(20);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FRDProductSpecificDataEntry) {
            FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
            if (this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && Objects.equals(this.c, fRDProductSpecificDataEntry.c) && Objects.equals(this.d, fRDProductSpecificDataEntry.d) && Objects.equals(this.e, fRDProductSpecificDataEntry.e) && Objects.equals(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && Objects.equals(this.h, fRDProductSpecificDataEntry.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.D(parcel, 4, this.c);
        ksy.y(parcel, 5, this.d);
        ksy.D(parcel, 6, this.e);
        ksy.y(parcel, 7, this.f);
        ksy.r(parcel, 8, this.g);
        ksy.o(parcel, 9, this.h);
        ksy.h(parcel, iG);
    }
}
