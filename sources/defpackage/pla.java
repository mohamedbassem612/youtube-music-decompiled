package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pla implements pky {
    public final Object a;

    public pla(Object obj) {
        this.a = obj;
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
        if (this != obj) {
            return (obj instanceof pla) && awrc.c(this.a, ((pla) obj).a);
        }
        return true;
    }

    @Override // defpackage.pky
    public final /* synthetic */ Throwable f() {
        return qnl.aC(this);
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // defpackage.pky
    public final /* synthetic */ boolean j() {
        return false;
    }

    public final String toString() {
        return "Success(value=" + this.a + ')';
    }
}
