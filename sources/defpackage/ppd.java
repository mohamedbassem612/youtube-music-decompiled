package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ppd implements pld {
    public final IOException a;
    public final pkx b;

    public ppd(IOException iOException, pkx pkxVar) {
        this.a = iOException;
        this.b = pkxVar;
    }

    @Override // defpackage.pku
    public final pkx a() {
        return this.b;
    }

    @Override // defpackage.pku
    public final /* synthetic */ Throwable b() {
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
        if (obj instanceof ppd) {
            ppd ppdVar = (ppd) obj;
            if (awrc.c(this.a, ppdVar.a) && this.b == ppdVar.b) {
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
        return "AuthTokenTransientFailure(exception=" + this.a + ", failureType=" + this.b + ')';
    }
}
