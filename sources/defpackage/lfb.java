package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lfb extends lbw {
    final /* synthetic */ lff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfb(lff lffVar, leb lebVar) {
        super(lebVar);
        this.b = lffVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        lff lffVar = this.b;
        lffVar.o();
        if (lffVar.P()) {
            lffVar.aT().k.a("Inactivity, disconnecting from the service");
            lffVar.u();
        }
    }
}
