package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzq extends kry {
    public static final Parcelable.Creator CREATOR = new jys(4);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final kba l;

    public jzq(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, kba kbaVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = kbaVar;
        if (TextUtils.isEmpty(str6)) {
            new JSONObject();
            return;
        }
        try {
            new JSONObject(this.g);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
            this.g = null;
            new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jzq) {
            jzq jzqVar = (jzq) obj;
            if (khe.g(this.a, jzqVar.a) && khe.g(this.b, jzqVar.b) && this.c == jzqVar.c && khe.g(this.d, jzqVar.d) && khe.g(this.e, jzqVar.e) && khe.g(this.f, jzqVar.f) && khe.g(this.g, jzqVar.g) && khe.g(this.h, jzqVar.h) && khe.g(this.i, jzqVar.i) && this.j == jzqVar.j && khe.g(this.k, jzqVar.k) && khe.g(this.l, jzqVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, str);
        ksy.B(parcel, 3, this.b);
        ksy.m(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.B(parcel, 8, this.g);
        ksy.B(parcel, 9, this.h);
        ksy.B(parcel, 10, this.i);
        ksy.m(parcel, 11, this.j);
        ksy.B(parcel, 12, this.k);
        ksy.A(parcel, 13, this.l, i);
        ksy.h(parcel, iG);
    }
}
