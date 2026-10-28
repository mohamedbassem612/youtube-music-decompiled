package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbb implements sbf {
    public rtd a;
    private final rmp b;
    private final oml c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public sbb(omj omjVar, rmp rmpVar, oml omlVar) {
        this.b = rmpVar;
        this.c = omlVar;
        omjVar.a.add(this);
    }

    @Override // defpackage.sbf
    public final sba a(rsk rskVar, smr smrVar) throws sbe {
        if (nrj.d(saw.class, smrVar)) {
            return new saw(rskVar, this, smrVar, this.c);
        }
        throw new sbe("BelowPlayerSlotAdapterFactory received unsupported metadata");
    }
}
