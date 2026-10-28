package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ewe implements ewf, ffy {
    private static final axr a = fga.a(20, new exm(1));
    private ewf b;
    private boolean c;
    private boolean d;
    private final wkr e = new wkr(null);

    static ewe d(ewf ewfVar) {
        ewe eweVar = (ewe) a.a();
        eweVar.d = false;
        eweVar.c = true;
        eweVar.b = ewfVar;
        return eweVar;
    }

    @Override // defpackage.ewf
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ewf
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.ewf
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.ewf
    public final synchronized void e() {
        this.e.b();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            a.b(this);
        }
    }

    final synchronized void f() {
        this.e.b();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }

    @Override // defpackage.ffy
    public final wkr g() {
        return this.e;
    }
}
