package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jys;
import defpackage.khe;
import defpackage.kry;
import defpackage.ksy;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MediaError extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jys(13);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    String e;
    private final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        jSONObject.optString("type", "ERROR");
        jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            jSONObject.optInt("detailedErrorCode");
        }
        khe.c(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.m(parcel, 3, this.b);
        ksy.w(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.h(parcel, iG);
    }
}
