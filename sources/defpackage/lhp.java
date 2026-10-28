package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lhp extends lbw {
    final /* synthetic */ lhq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhp(lhq lhqVar, leb lebVar) {
        super(lebVar);
        this.b = lhqVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        lhq lhqVar = this.b;
        lhqVar.e();
        lhqVar.aT().k.a("Starting upload from DelayedRunnable");
        lhqVar.l.Z();
    }
}
