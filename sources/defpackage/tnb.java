package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tnb implements tny {
    private ainp a;

    public tnb(ainp ainpVar) {
        if (ainpVar == null) {
            ainpVar = ainp.a;
            ainpVar.getClass();
        }
        this.a = ainpVar;
    }

    @Override // defpackage.tny
    public final synchronized ainp a() {
        return this.a;
    }

    @Override // defpackage.tny
    public final synchronized void b(awqg awqgVar) {
        aihf builder = this.a.toBuilder();
        builder.getClass();
        aihh aihhVar = (aihh) builder;
        awqgVar.invoke(aihhVar);
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        this.a = (ainp) aihnVarBuild;
    }
}
