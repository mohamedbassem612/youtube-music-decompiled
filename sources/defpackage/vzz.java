package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzz implements waa {
    public final awmd a;
    public final int b;
    private final waa c;

    public vzz(waa waaVar, int i, awmd awmdVar) {
        this.c = waaVar;
        this.b = i;
        this.a = awmdVar;
    }

    @Override // defpackage.waa
    public final byte[] a(String str) {
        return this.c.a(str);
    }

    @Override // defpackage.waa
    public final asje c() {
        return this.c.c();
    }

    @Override // defpackage.waa
    public final String d() {
        return this.c.d();
    }

    @Override // defpackage.waa
    public final List e(aihl aihlVar) {
        return this.c.e(aihlVar);
    }

    public final boolean equals(Object obj) {
        return this.c.equals(obj);
    }

    @Override // defpackage.waa
    public final boolean f(aihl aihlVar) {
        return this.c.f(aihlVar);
    }

    @Override // defpackage.waa
    public final long h() {
        return this.c.h();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
