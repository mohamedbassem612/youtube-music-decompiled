package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kpm;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvf;
import defpackage.kvn;
import defpackage.kvp;
import defpackage.kvq;
import defpackage.kvr;
import defpackage.kvv;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorReport extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpm(14);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public kvp[] U;
    public String[] V;
    public boolean W;
    public String X;
    public kvv Y;
    public kvq Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public kvf aq;
    public kvr[] ar;
    public String as;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, kvp[] kvpVarArr, String[] strArr4, boolean z3, String str29, kvv kvvVar, kvq kvqVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, kvf kvfVar, kvr[] kvrVarArr, String str33) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = kvpVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = kvvVar;
        this.Z = kvqVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = kvfVar;
        this.ar = kvrVarArr;
        this.as = str33;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, this.a, i);
        ksy.B(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.B(parcel, 8, this.g);
        ksy.B(parcel, 9, this.h);
        ksy.B(parcel, 10, this.i);
        ksy.B(parcel, 11, this.j);
        ksy.l(parcel, 12, this.k);
        ksy.B(parcel, 13, this.l);
        ksy.B(parcel, 14, this.m);
        ksy.B(parcel, 15, this.n);
        ksy.B(parcel, 16, this.o);
        ksy.B(parcel, 17, this.p);
        ksy.C(parcel, 18, this.q);
        ksy.C(parcel, 19, this.r);
        ksy.C(parcel, 20, this.s);
        ksy.B(parcel, 21, this.t);
        ksy.B(parcel, 22, this.u);
        ksy.q(parcel, 23, this.v);
        ksy.l(parcel, 24, this.w);
        ksy.l(parcel, 25, this.x);
        ksy.l(parcel, 26, this.y);
        ksy.l(parcel, 27, this.z);
        ksy.B(parcel, 28, this.A);
        ksy.B(parcel, 29, this.B);
        ksy.B(parcel, 30, this.C);
        ksy.p(parcel, 31, this.D);
        ksy.i(parcel, 32, this.E);
        ksy.l(parcel, 33, this.F);
        ksy.l(parcel, 34, this.G);
        ksy.i(parcel, 35, this.H);
        ksy.B(parcel, 36, this.I);
        ksy.B(parcel, 37, this.J);
        ksy.l(parcel, 38, this.K);
        ksy.B(parcel, 39, this.L);
        ksy.B(parcel, 40, this.M);
        ksy.B(parcel, 41, this.N);
        ksy.B(parcel, 42, this.O);
        ksy.B(parcel, 43, this.P);
        ksy.B(parcel, 44, this.Q);
        ksy.B(parcel, 45, this.R);
        ksy.A(parcel, 46, this.S, i);
        ksy.B(parcel, 47, this.T);
        ksy.E(parcel, 48, this.U, i);
        ksy.C(parcel, 49, this.V);
        ksy.i(parcel, 50, this.W);
        ksy.B(parcel, 51, this.X);
        ksy.A(parcel, 52, this.Y, i);
        ksy.A(parcel, 53, this.Z, i);
        ksy.B(parcel, 54, this.aa);
        ksy.i(parcel, 55, this.ab);
        ksy.p(parcel, 56, this.ac);
        ksy.F(parcel, 57, this.ad);
        ksy.i(parcel, 58, this.ae);
        ksy.A(parcel, 59, this.af, i);
        ksy.B(parcel, 60, this.ag);
        ksy.D(parcel, 61, this.ah);
        ksy.l(parcel, 62, this.ai);
        ksy.l(parcel, 63, this.aj);
        ksy.C(parcel, 64, this.ak);
        ksy.C(parcel, 65, this.al);
        ksy.C(parcel, 66, this.am);
        ksy.i(parcel, 67, this.an);
        ksy.i(parcel, 68, this.ao);
        ksy.B(parcel, 69, this.ap);
        ksy.A(parcel, 70, this.aq, i);
        ksy.E(parcel, 71, this.ar, i);
        ksy.B(parcel, 72, this.as);
        ksy.h(parcel, iG);
    }

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(kvn kvnVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = kvnVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = kvnVar.b;
        }
        if (!TextUtils.isEmpty(kvnVar.a)) {
            this.B = kvnVar.a;
        }
        if (!TextUtils.isEmpty(kvnVar.c)) {
            this.b = kvnVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = kvnVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        kvv kvvVar = kvnVar.j;
        if (kvvVar != null) {
            this.Y = kvvVar;
        }
        if (!TextUtils.isEmpty(kvnVar.e)) {
            this.P = kvnVar.e;
        }
        String str = kvnVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(kvnVar.n)) {
            this.ag = kvnVar.n;
        }
        if (!TextUtils.isEmpty(kvnVar.t)) {
            this.as = kvnVar.t;
        }
        Bitmap bitmap = kvnVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = kvnVar.f;
            List list = kvnVar.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kvp) it.next()).e = file;
                }
                this.U = (kvp[]) list.toArray(new kvp[0]);
            }
        }
        kvq kvqVar = kvnVar.k;
        if (kvqVar != null) {
            this.Z = kvqVar;
        }
        this.W = kvnVar.i;
        this.ae = kvnVar.l;
        this.E = kvnVar.o;
        this.an = kvnVar.q;
        this.ap = kvnVar.r;
        this.aq = kvnVar.s;
    }
}
