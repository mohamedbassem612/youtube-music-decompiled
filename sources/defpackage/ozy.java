package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozy implements ppw {
    public static final agsn a = agsn.h("GnpSdk");
    public final pgs b;
    public final tld c;
    private final awou d;
    private final String e;

    public ozy(pgs pgsVar, awou awouVar, tld tldVar) {
        pgsVar.getClass();
        awouVar.getClass();
        tldVar.getClass();
        this.b = pgsVar;
        this.d = awouVar;
        this.c = tldVar;
        this.e = "CHIME_REFRESH_SINGLE_NOTIFICATION";
    }

    @Override // defpackage.ppw
    public final int a() {
        return 18;
    }

    @Override // defpackage.ppw
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ppw
    public final Object c(Bundle bundle, awoq awoqVar) {
        return awro.p(this.d, new gmc(bundle, this, (awoq) null, 8), awoqVar);
    }

    @Override // defpackage.ppw
    public final String d() {
        return this.e;
    }

    @Override // defpackage.ppw
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ppw
    public final /* synthetic */ int f() {
        return 3;
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
