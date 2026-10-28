package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbg extends kry {
    public static final Parcelable.Creator CREATOR = new lbh();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;
    public final long G;
    public final boolean H;
    public final long I;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public lbg(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9, long j10, boolean z6, long j11) {
        kro.i(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
        this.G = j10;
        this.H = z6;
        this.I = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        String str = this.a;
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        String str2 = this.b;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        String str3 = this.c;
        if (str3 != null) {
            int iG4 = ksy.g(parcel, 4);
            parcel.writeString(str3);
            ksy.h(parcel, iG4);
        }
        String str4 = this.d;
        if (str4 != null) {
            int iG5 = ksy.g(parcel, 5);
            parcel.writeString(str4);
            ksy.h(parcel, iG5);
        }
        long j = this.e;
        parcel.writeInt(524294);
        parcel.writeLong(j);
        long j2 = this.f;
        parcel.writeInt(524295);
        parcel.writeLong(j2);
        String str5 = this.g;
        if (str5 != null) {
            int iG6 = ksy.g(parcel, 8);
            parcel.writeString(str5);
            ksy.h(parcel, iG6);
        }
        boolean z = this.h;
        parcel.writeInt(262153);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.i;
        parcel.writeInt(262154);
        parcel.writeInt(z2 ? 1 : 0);
        long j3 = this.j;
        parcel.writeInt(524299);
        parcel.writeLong(j3);
        String str6 = this.k;
        if (str6 != null) {
            int iG7 = ksy.g(parcel, 12);
            parcel.writeString(str6);
            ksy.h(parcel, iG7);
        }
        long j4 = this.l;
        parcel.writeInt(524302);
        parcel.writeLong(j4);
        int i2 = this.m;
        parcel.writeInt(262159);
        parcel.writeInt(i2);
        boolean z3 = this.n;
        parcel.writeInt(262160);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.o;
        parcel.writeInt(262162);
        parcel.writeInt(z4 ? 1 : 0);
        ksy.o(parcel, 21, this.p);
        long j5 = this.q;
        parcel.writeInt(524310);
        parcel.writeLong(j5);
        List<String> list = this.r;
        if (list != null) {
            int iG8 = ksy.g(parcel, 23);
            parcel.writeStringList(list);
            ksy.h(parcel, iG8);
        }
        String str7 = this.s;
        if (str7 != null) {
            int iG9 = ksy.g(parcel, 25);
            parcel.writeString(str7);
            ksy.h(parcel, iG9);
        }
        String str8 = this.t;
        if (str8 != null) {
            int iG10 = ksy.g(parcel, 26);
            parcel.writeString(str8);
            ksy.h(parcel, iG10);
        }
        String str9 = this.u;
        if (str9 != null) {
            int iG11 = ksy.g(parcel, 27);
            parcel.writeString(str9);
            ksy.h(parcel, iG11);
        }
        boolean z5 = this.v;
        parcel.writeInt(262172);
        parcel.writeInt(z5 ? 1 : 0);
        long j6 = this.w;
        parcel.writeInt(524317);
        parcel.writeLong(j6);
        int i3 = this.x;
        parcel.writeInt(262174);
        parcel.writeInt(i3);
        String str10 = this.y;
        if (str10 != null) {
            int iG12 = ksy.g(parcel, 31);
            parcel.writeString(str10);
            ksy.h(parcel, iG12);
        }
        int i4 = this.z;
        parcel.writeInt(262176);
        parcel.writeInt(i4);
        long j7 = this.A;
        parcel.writeInt(524322);
        parcel.writeLong(j7);
        String str11 = this.B;
        if (str11 != null) {
            int iG13 = ksy.g(parcel, 35);
            parcel.writeString(str11);
            ksy.h(parcel, iG13);
        }
        String str12 = this.C;
        if (str12 != null) {
            int iG14 = ksy.g(parcel, 36);
            parcel.writeString(str12);
            ksy.h(parcel, iG14);
        }
        long j8 = this.D;
        parcel.writeInt(524325);
        parcel.writeLong(j8);
        int i5 = this.E;
        parcel.writeInt(262182);
        parcel.writeInt(i5);
        long j9 = this.F;
        parcel.writeInt(524327);
        parcel.writeLong(j9);
        long j10 = this.G;
        parcel.writeInt(524328);
        parcel.writeLong(j10);
        boolean z6 = this.H;
        parcel.writeInt(262185);
        parcel.writeInt(z6 ? 1 : 0);
        long j11 = this.I;
        parcel.writeInt(524330);
        parcel.writeLong(j11);
        ksy.h(parcel, iG);
    }

    public lbg(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9, long j10, boolean z6, long j11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
        this.G = j10;
        this.H = z6;
        this.I = j11;
    }
}
