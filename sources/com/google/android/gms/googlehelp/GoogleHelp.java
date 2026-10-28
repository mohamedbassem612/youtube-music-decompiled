package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.ixt;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvv;
import defpackage.kxb;
import defpackage.kxw;
import defpackage.qcb;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleHelp extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kxb();
    public boolean A;
    public boolean B;
    public int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    public ixt R;
    public qcb S;
    final int a;
    String b;
    public Account c;
    public Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public kvv s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, kvv kvvVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            kvv kvvVar2 = new kvv(3, 0);
            kvvVar2.a = i4;
            this.s = kvvVar2;
        } else {
            this.s = kvvVar == null ? new kvv(3, 0) : kvvVar;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    public final void a(int i, String str, Intent intent) {
        this.r.add(new kxw(i, str, intent));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.A(parcel, 3, this.c, i);
        ksy.p(parcel, 4, this.d);
        ksy.i(parcel, 5, this.h);
        ksy.i(parcel, 6, this.i);
        ksy.D(parcel, 7, this.j);
        ksy.p(parcel, 10, this.k);
        ksy.A(parcel, 11, this.l, i);
        ksy.B(parcel, 14, this.p);
        ksy.A(parcel, 15, this.q, i);
        ksy.F(parcel, 16, this.r);
        ksy.l(parcel, 17, 0);
        ksy.F(parcel, 18, this.t);
        ksy.q(parcel, 19, this.m);
        ksy.l(parcel, 20, this.n);
        ksy.l(parcel, 21, this.o);
        ksy.i(parcel, 22, this.u);
        ksy.A(parcel, 23, this.v, i);
        ksy.A(parcel, 25, this.s, i);
        ksy.B(parcel, 28, this.e);
        ksy.A(parcel, 31, this.w, i);
        ksy.l(parcel, 32, this.x);
        ksy.A(parcel, 33, this.y, i);
        ksy.B(parcel, 34, this.f);
        ksy.A(parcel, 35, this.g, i);
        ksy.l(parcel, 36, this.z);
        ksy.i(parcel, 37, this.A);
        ksy.i(parcel, 38, this.B);
        ksy.l(parcel, 39, this.C);
        ksy.B(parcel, 40, this.D);
        ksy.i(parcel, 41, this.E);
        ksy.B(parcel, 42, this.F);
        ksy.i(parcel, 43, this.G);
        ksy.A(parcel, 44, this.H, i);
        ksy.i(parcel, 45, this.I);
        ksy.F(parcel, 46, this.J);
        ksy.B(parcel, 47, this.K);
        ksy.l(parcel, 48, this.L);
        ksy.l(parcel, 49, this.M);
        ksy.F(parcel, 50, this.N);
        ksy.B(parcel, 51, this.O);
        ksy.A(parcel, 52, this.P, i);
        ksy.D(parcel, 53, this.Q);
        ksy.h(parcel, iG);
    }
}
