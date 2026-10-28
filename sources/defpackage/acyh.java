package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acyh implements nuh {
    public final awmd a;
    private final tqj b;
    private final awmd c;
    private boolean d;

    public acyh(awmd awmdVar, tqj tqjVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = tqjVar;
        this.c = awmdVar2;
    }

    private final synchronized void b(Boolean bool) {
        if (!this.d && tym.aq(this.b)) {
            this.d = true;
            tes tesVar = (tes) this.c.io();
            tesVar.g(new acyg(new acqu(this, 6)), tew.b);
            tesVar.g(new acyg(new acqu(this, 7)), tew.c, tew.d, tew.e, tew.f);
        }
        bool.booleanValue();
    }

    @Override // defpackage.nuh
    public final void a() {
        b(Boolean.FALSE);
    }
}
