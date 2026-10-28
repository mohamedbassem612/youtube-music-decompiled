package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axer implements avmd {
    final /* synthetic */ awuc a;

    public axer(awuc awucVar) {
        this.a = awucVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.resumeWith(atqp.i(th));
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avkz.l(this.a, avmnVar);
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a.resumeWith(obj);
    }
}
