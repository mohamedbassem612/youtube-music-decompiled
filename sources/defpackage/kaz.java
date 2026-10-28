package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kaz extends kry {
    public static final Parcelable.Creator CREATOR = new jys(20);
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    String l;
    public JSONObject m;

    public kaz(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.j = i8;
        this.k = i9;
        this.l = str2;
        if (str2 == null) {
            this.m = null;
            return;
        }
        try {
            this.m = new JSONObject(this.l);
        } catch (JSONException unused) {
            this.m = null;
            this.l = null;
        }
    }

    public static final int a(String str) {
        if (str == null || str.length() != 9 || str.charAt(0) != '#') {
            return 0;
        }
        try {
            return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kaz) {
            kaz kazVar = (kaz) obj;
            JSONObject jSONObject = this.m;
            boolean z = jSONObject == null;
            JSONObject jSONObject2 = kazVar.m;
            if (z == (jSONObject2 == null) && ((jSONObject == null || jSONObject2 == null || ksw.a(jSONObject, jSONObject2)) && this.a == kazVar.a && this.b == kazVar.b && this.c == kazVar.c && this.d == kazVar.d && this.e == kazVar.e && this.f == kazVar.f && this.g == kazVar.g && this.h == kazVar.h && khe.g(this.i, kazVar.i) && this.j == kazVar.j && this.k == kazVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.m));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int iG = ksy.g(parcel, 20293);
        ksy.k(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.l(parcel, 5, this.d);
        ksy.l(parcel, 6, this.e);
        ksy.l(parcel, 7, this.f);
        ksy.l(parcel, 8, this.g);
        ksy.l(parcel, 9, this.h);
        ksy.B(parcel, 10, this.i);
        ksy.l(parcel, 11, this.j);
        ksy.l(parcel, 12, this.k);
        ksy.B(parcel, 13, this.l);
        ksy.h(parcel, iG);
    }

    public kaz() {
        throw null;
    }
}
