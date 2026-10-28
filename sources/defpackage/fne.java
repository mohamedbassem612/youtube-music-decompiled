package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fne extends fmx {
    final /* synthetic */ fnf b;

    public fne(fnf fnfVar) {
        this.b = fnfVar;
    }

    @Override // defpackage.fmx
    public final void c(long j) {
        fnf fnfVar = this.b;
        fnfVar.e = false;
        if (fnfVar.d) {
            if (fnfVar.f != j) {
                fnfVar.c.a(j);
                fnfVar.f = j;
            }
            if (fnfVar.d) {
                fnfVar.a();
            }
        }
    }
}
