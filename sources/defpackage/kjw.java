package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjw extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(11);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public kjw(String str, int i, String str2, String str3, int i2, kja kjaVar) {
        int i3;
        boolean zA = kjaVar.a(kjb.ANDROID_ID);
        boolean zEquals = kjaVar.equals(kja.b);
        if (kjaVar.equals(kja.a)) {
            i3 = 0;
        } else {
            agqr it = kjaVar.d.iterator();
            int i4 = -1;
            while (it.hasNext()) {
                i4 &= ~((kjb) it.next()).e;
            }
            i3 = i4;
        }
        this(str, i, -1, str3, zA, str2, zEquals, i2 - 1, null, false, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kjw) {
            kjw kjwVar = (kjw) obj;
            if (Objects.equals(this.a, kjwVar.a) && this.b == kjwVar.b && this.c == kjwVar.c && Objects.equals(this.f, kjwVar.f) && Objects.equals(this.d, kjwVar.d) && this.e == kjwVar.e && this.g == kjwVar.g && this.h == kjwVar.h && Objects.equals(this.i, kjwVar.i) && this.j == kjwVar.j && this.k == kjwVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.i(parcel, 7, this.e);
        ksy.B(parcel, 8, this.f);
        ksy.i(parcel, 9, this.g);
        ksy.l(parcel, 10, this.h);
        ksy.w(parcel, 11, this.i);
        ksy.i(parcel, 12, this.j);
        ksy.l(parcel, 13, this.k);
        ksy.h(parcel, iG);
    }

    public kjw(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }
}
