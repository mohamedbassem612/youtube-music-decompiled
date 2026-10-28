package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdi extends awav {
    final omj b;

    public awdi(avlu avluVar, omj omjVar) {
        super(avluVar);
        this.b = omjVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            omj omjVar = this.b;
            nyp nypVar = new nyp(omjVar, avlwVar);
            omjVar.toString();
            this.a.ak(nypVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
