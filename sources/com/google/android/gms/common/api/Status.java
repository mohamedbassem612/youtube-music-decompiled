package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.fh;
import defpackage.klo;
import defpackage.kni;
import defpackage.kro;
import defpackage.kry;
import defpackage.ksy;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends kry implements ReflectedParcelable, kni {
    public static final Parcelable.Creator CREATOR;
    public static final Status a = new Status(0, null, null, null);
    public static final Status b = new Status(14, null, null, null);
    public static final Status c = new Status(8, null, null, null);
    public static final Status d = new Status(15, null, null, null);
    public static final Status e = new Status(16, null, null, null);
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final klo i;

    static {
        kro.r(23);
        CREATOR = new fh(15);
    }

    public Status(int i, String str, PendingIntent pendingIntent, klo kloVar) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = kloVar;
    }

    public final String b() {
        String str = this.g;
        return str == null ? kro.r(this.f) : str;
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && Objects.equals(this.g, status.g) && Objects.equals(this.h, status.h) && Objects.equals(this.i, status.i);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f), this.g, this.h, this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("statusCode", b(), arrayList);
        kro.p("resolution", this.h, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.B(parcel, 2, this.g);
        ksy.A(parcel, 3, this.h, i);
        ksy.A(parcel, 4, this.i, i);
        ksy.h(parcel, iG);
    }

    @Deprecated
    public Status(klo kloVar, String str, int i) {
        this(i, str, kloVar.a(), kloVar);
    }

    @Override // defpackage.kni
    public final Status a() {
        return this;
    }
}
