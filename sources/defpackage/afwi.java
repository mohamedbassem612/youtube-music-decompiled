package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwi implements agek {
    final /* synthetic */ afvl a;
    final /* synthetic */ agek b;

    public afwi(afvl afvlVar, agek agekVar) {
        this.a = afvlVar;
        this.b = agekVar;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, this.a);
        try {
            Object objApply = this.b.apply(obj);
            afty.e(afvhVar, afvlVarE);
            return objApply;
        } catch (Throwable th) {
            try {
                aftt.a(th);
                throw th;
            } catch (Throwable th2) {
                afty.e(afvhVar, afvlVarE);
                throw th2;
            }
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + ']';
    }
}
