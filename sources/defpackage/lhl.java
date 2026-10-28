package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhl extends lbw {
    public final /* synthetic */ lhm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhl(lhm lhmVar, leb lebVar) {
        super(lebVar);
        this.b = lhmVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        lhm lhmVar = this.b;
        lhmVar.aT().k.a("[sgtm] Starting client upload from DelayedRunnable");
        lhmVar.i().R(new lei(this, 13));
    }
}
