package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ppc implements pkz {
    public final UserRecoverableAuthException a;
    public final pkx b;

    public ppc(UserRecoverableAuthException userRecoverableAuthException, pkx pkxVar) {
        this.a = userRecoverableAuthException;
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
        if (obj instanceof ppc) {
            ppc ppcVar = (ppc) obj;
            if (awrc.c(this.a, ppcVar.a) && this.b == ppcVar.b) {
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
        return (this.a.hashCode() * 31) + this.b.hashCode();
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
        return "AuthTokenRecoverableFailure(exception=" + this.a + ", failureType=" + this.b + ')';
    }
}
