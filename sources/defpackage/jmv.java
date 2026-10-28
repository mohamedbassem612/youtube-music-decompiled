package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class jmv extends abse {
    private final alvl d;

    public jmv(jmx jmxVar, alvl alvlVar, sxu sxuVar, String str) {
        super(jmxVar, alvlVar, sxuVar, str);
        this.d = alvlVar;
    }

    @Override // defpackage.abse
    public final void a() {
        aony aonyVarA = aony.a(this.d.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        if (aonyVarA != aony.AGE_VERIFICATION_REQUIRED) {
            super.a();
        }
    }
}
