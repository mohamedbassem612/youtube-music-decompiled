package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfj implements acfi {
    private acfi a;

    public final synchronized void a(acfi acfiVar) {
        this.a = acfiVar;
    }

    @Override // defpackage.acfi
    public final synchronized boolean k(zhz zhzVar) {
        acfi acfiVar = this.a;
        if (acfiVar == null) {
            return false;
        }
        return acfiVar.k(zhzVar);
    }
}
