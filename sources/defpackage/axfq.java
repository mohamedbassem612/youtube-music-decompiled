package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfq implements lot {
    final /* synthetic */ awuc a;

    public axfq(awuc awucVar) {
        this.a = awucVar;
    }

    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        Exception excE = lpaVar.e();
        if (excE != null) {
            this.a.resumeWith(atqp.i(excE));
            return;
        }
        boolean z = ((lpf) lpaVar).c;
        awuc awucVar = this.a;
        if (z) {
            awucVar.f(null);
        } else {
            awucVar.resumeWith(lpaVar.f());
        }
    }
}
