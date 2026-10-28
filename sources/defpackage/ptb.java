package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptb implements pkz, pta {
    private final Throwable a;
    private final boolean b;
    private final pkx c;

    public ptb(Throwable th, boolean z, pkx pkxVar) {
        this.a = th;
        this.b = z;
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
        if (obj instanceof ptb) {
            ptb ptbVar = (ptb) obj;
            if (awrc.c(this.a, ptbVar.a) && this.b == ptbVar.b && this.c == ptbVar.c) {
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
        return (((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + this.c.hashCode();
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.pta
    public final boolean k() {
        return this.b;
    }

    public final String toString() {
        return "RegistrationPermanentAuthFailure(exception=" + this.a + ", isRegistrationStoredInBackend=" + this.b + ", failureType=" + this.c + ')';
    }
}
