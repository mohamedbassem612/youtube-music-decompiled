package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jys;
import defpackage.khe;
import defpackage.kry;
import defpackage.ksw;
import defpackage.ksy;
import j$.util.Objects;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaTrack extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jys(19);
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    String i;
    private final JSONObject j;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = list;
        this.j = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaTrack) {
            MediaTrack mediaTrack = (MediaTrack) obj;
            JSONObject jSONObject = this.j;
            boolean z = jSONObject == null;
            JSONObject jSONObject2 = mediaTrack.j;
            if (z == (jSONObject2 == null) && ((jSONObject == null || jSONObject2 == null || ksw.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && khe.g(this.c, mediaTrack.c) && khe.g(this.d, mediaTrack.d) && khe.g(this.e, mediaTrack.e) && khe.g(this.f, mediaTrack.f) && this.g == mediaTrack.g && khe.g(this.h, mediaTrack.h))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h, String.valueOf(this.j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.l(parcel, 8, this.g);
        ksy.D(parcel, 9, this.h);
        ksy.B(parcel, 10, this.i);
        ksy.h(parcel, iG);
    }
}
