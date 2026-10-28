package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pue implements pkz {
    private final Throwable a;
    private final pxk b;
    private final pkx c;

    public pue(Throwable th, pxk pxkVar, pkx pkxVar) {
        pxkVar.getClass();
        this.a = th;
        this.b = pxkVar;
        this.c = pkxVar;
    }

    @Override // defpackage.pku
    public final pkx a() {
        return this.c;
    }

    @Override // defpackage.pku
    public final Throwable b() {
        return this.a;
    }

    @Override // defpackage.pky
    public final /* synthetic */ pkx c() {
        return qnl.az(this);
    }

    @Override // defpackage.pky
    public final /* synthetic */ Object d() {
        return qnl.aA(this);
    }

    @Override // defpackage.pky
    public final /* synthetic */ String e() {
        return qnl.aB(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pue) {
            pue pueVar = (pue) obj;
            if (awrc.c(this.a, pueVar.a) && awrc.c(this.b, pueVar.b) && this.c == pueVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pky
    public final /* synthetic */ Throwable f() {
        return qnl.aC(this);
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean j() {
        return false;
    }

    public final String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + this.c + ')';
    }
}
