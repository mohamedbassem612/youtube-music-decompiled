package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.fh;
import defpackage.kro;
import defpackage.kry;
import defpackage.ksy;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TokenData extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fh(5);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        kro.i(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && Objects.equals(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && Objects.equals(this.f, tokenData.f) && Objects.equals(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.z(parcel, 3, this.c);
        ksy.i(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.D(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }
}
