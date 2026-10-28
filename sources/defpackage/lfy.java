package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfy extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(7);
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public lfy(String str, long j, Object obj, String str2) {
        kro.i(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        }
    }

    public final Object a() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kwo.b(this, parcel);
    }

    public lfy(aaqp aaqpVar) {
        this((String) aaqpVar.d, aaqpVar.a, aaqpVar.c, (String) aaqpVar.e);
    }

    public lfy(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.g = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.e = str2;
        this.f = str3;
    }
}
