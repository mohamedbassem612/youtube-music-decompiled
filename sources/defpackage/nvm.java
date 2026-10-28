package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvm {
    public static final /* synthetic */ pbv a(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (pbv) aihnVarBuild;
    }

    public static final void b(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pbv pbvVar = (pbv) aihfVar.instance;
        pbv pbvVar2 = pbv.a;
        pbvVar.c = j;
    }

    public static final void c(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pbv pbvVar = (pbv) aihfVar.instance;
        pbv pbvVar2 = pbv.a;
        pbvVar.b = j;
    }
}
