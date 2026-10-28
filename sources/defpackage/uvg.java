package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvg extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uvg(long j) {
        aihl aihlVar = aufn.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufn aufnVar = (aufn) obj;
        if (aufnVar == null) {
            aufnVar = aufn.a;
            aufnVar.getClass();
        }
        aihf builder = aufnVar.toBuilder();
        builder.getClass();
        long j = this.a;
        builder.copyOnWrite();
        aufn aufnVar2 = (aufn) builder.instance;
        aufnVar2.c |= 1;
        aufnVar2.d = j;
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (aufn) aihnVarBuild;
    }
}
