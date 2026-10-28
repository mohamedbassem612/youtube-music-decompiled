package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukp {
    public final uks a;

    static {
        Optional optional = uks.a;
    }

    public ukp(uks uksVar) {
        this.a = uksVar;
    }

    public final ukq a() {
        return this.a.a();
    }

    public final usd b() {
        return this.a.b();
    }

    public final auhs c() {
        return this.a.c();
    }

    public final avlr d() {
        return this.a.b.H();
    }

    public final avlr e() {
        return this.a.d();
    }

    public final void f() {
        uks uksVar = this.a;
        ukq ukqVarA = uksVar.a();
        usc uscVar = uksVar.d;
        if (ukqVarA != null && uscVar != null) {
            ukqVarA.a.m(uscVar);
            uksVar.d = null;
        }
        uksVar.b.kk(uks.a);
    }
}
