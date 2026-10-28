package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tqm implements tqo {
    public final tqj a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile int d;
    public volatile boolean e;
    public volatile boolean f;
    public final int g;
    public volatile int h;
    private final int i;

    public tqm(tqj tqjVar, tqv tqvVar, awmd awmdVar) {
        this.a = tqjVar;
        int i = tqr.a;
        int iA = tqjVar.a(1074004054);
        final int iA2 = tqjVar.a(1073938522);
        int iA3 = tqjVar.a(1074004032);
        this.i = iA3;
        this.d = tqjVar.a(1073938500);
        int iA4 = tqjVar.a(1074069599);
        this.g = iA4;
        this.h = tqjVar.a(1074004068);
        this.e = tqjVar.k(1073807464);
        this.f = tqjVar.k(1073807465);
        int i2 = ((iA <= 0 || iA3 < iA) ? 0 : 1) | ((iA2 <= 0 || this.d < iA2) ? 0 : 2);
        int i3 = 4;
        if (i2 == 0) {
            this.b = false;
            this.c = false;
        } else {
            this.c = true;
            this.b = (tqjVar.a(1073872989) & i2) != 0;
            if (this.b) {
                tqjVar.h();
                tqh tqhVarD = tqjVar.d(4);
                tqhVarD.b(1073807464, 1L);
                tqhVarD.b(1073807465, 1L);
                tqhVarD.b(1074069599, iA4);
                tqhVarD.b(1074004068, this.h);
                tqhVarD.a();
            } else {
                tqh tqhVarA = a();
                tqhVarA.b(1073807465, 1L);
                tqhVarA.a();
            }
        }
        c();
        ((trd) awmdVar.io()).d().E(new mgd(this, tqvVar.a.B(new sqj(3)).ao().e().E(new hoi(this, 17)), tqjVar.l(1074814102, 32768) ? ((trd) awmdVar.io()).f(new sqj(i3)).e().E(new avnd() { // from class: tql
            @Override // defpackage.avnd
            public final void a() {
                int i4;
                tqm tqmVar = this.a;
                tqmVar.b();
                int i5 = tqr.a;
                tqj tqjVar2 = tqmVar.a;
                tqmVar.d = tqjVar2.a(1073938500);
                tqmVar.h = tqjVar2.a(1074004068);
                if (tqmVar.c || (i4 = iA2) <= 0 || tqmVar.d < i4) {
                    return;
                }
                tqmVar.c = true;
                tqmVar.f = true;
                tqmVar.b = (tqjVar2.a(1073872989) & 2) != 0;
                if (!tqmVar.b) {
                    tqh tqhVarA2 = tqmVar.a();
                    tqhVarA2.b(1074004032, 1L);
                    tqhVarA2.b(1073807465, 1L);
                    tqhVarA2.a();
                    return;
                }
                tqmVar.e = true;
                tqjVar2.h();
                tqh tqhVarD2 = tqjVar2.d(4);
                tqhVarD2.b(1073807464, 1L);
                tqhVarD2.b(1073807465, 1L);
                tqhVarD2.b(1074069599, tqmVar.g);
                tqhVarD2.b(1074004068, tqmVar.h);
                tqhVarD2.a();
                tqmVar.c();
            }
        }) : null, 11));
    }

    public final tqh a() {
        tqh tqhVarD = this.a.d(10);
        int i = tqr.a;
        tqhVarD.b(1074004032, 0L);
        tqhVarD.b(1073938500, 0L);
        return tqhVarD;
    }

    public final void b() {
        tqh tqhVarD = this.a.d(2);
        int i = tqr.a;
        tqhVarD.e(1073938500);
        tqhVarD.e(1074004068);
        tqhVarD.a();
    }

    public final void c() {
        tqh tqhVarD = this.a.d(2);
        int i = tqr.a;
        tqhVarD.e(1074004032);
        tqhVarD.e(1074069599);
        tqhVarD.a();
    }

    @Override // defpackage.tqo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.tqo
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.tqo
    public final /* synthetic */ void d(Executor executor) {
    }
}
