package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afwf implements ahdd {
    public final /* synthetic */ afvl a;
    public final /* synthetic */ ahdd b;

    public /* synthetic */ afwf(afvl afvlVar, ahdd ahddVar) {
        this.a = afvlVar;
        this.b = ahddVar;
    }

    @Override // defpackage.ahdd
    public final ahdm a(ahud ahudVar, Object obj) {
        long j = afwl.a;
        ahudVar.getClass();
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, this.a);
        try {
            ahdm ahdmVarA = this.b.a(ahudVar, obj);
            afty.e(afvhVar, afvlVarE);
            return ahdmVarA;
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
}
