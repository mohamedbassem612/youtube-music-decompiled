package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pkw implements pld {
    private final Throwable a;
    private final pkx b;

    public pkw(String str, pkx pkxVar) {
        this(new Exception(str), pkxVar);
    }

    @Override // defpackage.pku
    public final pkx a() {
        return this.b;
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
        if (obj instanceof pkw) {
            pkw pkwVar = (pkw) obj;
            if (awrc.c(this.a, pkwVar.a) && this.b == pkwVar.b) {
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
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean j() {
        return true;
    }

    public final String toString() {
        return "GenericTransientFailure(exception=" + this.a + ", failureType=" + this.b + ')';
    }

    public pkw(Throwable th, pkx pkxVar) {
        this.a = th;
        this.b = pkxVar;
    }
}
