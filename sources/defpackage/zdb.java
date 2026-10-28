package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zdb extends cpm {
    public final int o;
    public final yxr p;

    public zdb(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, cpf cpfVar, yxr yxrVar, int i3) {
        super(byeVar, byiVar, bseVar, i, obj, j, j2, j3, j4, j5, i2, j6, cpfVar);
        this.o = i3;
        this.p = yxrVar;
    }

    @Override // defpackage.cpm
    protected final cph i(final cpd cpdVar) {
        return new cph() { // from class: zda
            @Override // defpackage.cph
            public final cwj a(int i, int i2) {
                cwj cwjVarA = cpdVar.a(i, i2);
                zdb zdbVar = this.a;
                return new zdc(cwjVarA, zdbVar.p, zdbVar.o, zdbVar.h);
            }
        };
    }
}
