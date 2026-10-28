package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qbk implements ppw {
    public static final /* synthetic */ int i = 0;
    public final Context a;
    public final awou b;
    public final pxh c;
    public final pwf d;
    public final pls e;
    public final qbh f;
    public final String g;
    public final ijt h;
    private final awou j;
    private final int k;

    static {
        agsn.h("GnpSdk");
    }

    public qbk(Context context, awou awouVar, awou awouVar2, pxh pxhVar, pwf pwfVar, ijt ijtVar, pls plsVar, qbh qbhVar, String str, int i2) {
        this.a = context;
        this.j = awouVar;
        this.b = awouVar2;
        this.c = pxhVar;
        this.d = pwfVar;
        this.h = ijtVar;
        this.e = plsVar;
        this.f = qbhVar;
        this.g = str;
        this.k = i2;
    }

    @Override // defpackage.ppw
    public final int a() {
        return this.k;
    }

    @Override // defpackage.ppw
    public final long b() {
        return this.f.a();
    }

    @Override // defpackage.ppw
    public final Object c(Bundle bundle, awoq awoqVar) {
        return awro.p(this.j, new qbj(this, bundle, (awoq) null, 0), awoqVar);
    }

    @Override // defpackage.ppw
    public final String d() {
        return this.g;
    }

    @Override // defpackage.ppw
    public final boolean e() {
        return this.f.e();
    }

    @Override // defpackage.ppw
    public final int f() {
        return this.f.f();
    }

    @Override // defpackage.ppw
    public final int g() {
        return 1;
    }

    @Override // defpackage.ppw
    public final void h() {
    }

    @Override // defpackage.ppw
    public final void i() {
    }
}
