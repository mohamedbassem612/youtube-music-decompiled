package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpw implements kpu {
    final /* synthetic */ kpz a;

    public kpw(kpz kpzVar) {
        this.a = kpzVar;
    }

    @Override // defpackage.kpu
    public final void a(klo kloVar) {
        boolean zD = kloVar.d();
        kpz kpzVar = this.a;
        if (zD) {
            kpzVar.z(null, kpzVar.F());
            return;
        }
        kpr kprVar = kpzVar.w;
        if (kprVar != null) {
            kprVar.c(kloVar);
        }
    }
}
