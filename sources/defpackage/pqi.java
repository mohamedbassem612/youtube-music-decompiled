package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pqi implements pld {
    public final boolean a;
    private final Throwable b;
    private final pkx c;

    public pqi(Throwable th, pkx pkxVar, boolean z) {
        this.b = th;
        this.c = pkxVar;
        this.a = z;
    }

    @Override // defpackage.pku
    public final pkx a() {
        return this.c;
    }

    @Override // defpackage.pku
    public final Throwable b() {
        return this.b;
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
        if (obj instanceof pqi) {
            pqi pqiVar = (pqi) obj;
            if (awrc.c(this.b, pqiVar.b) && this.c == pqiVar.c && this.a == pqiVar.a) {
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
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + a.aj(this.a);
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
        return "TokenRegenerationFailure(exception=" + this.b + ", failureType=" + this.c + ", hasDeletedToken=" + this.a + ')';
    }
}
