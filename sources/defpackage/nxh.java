package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nxh {
    public static aicb a(poq poqVar) {
        aihf aihfVarCreateBuilder = aicb.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        String strE = poqVar.e();
        aihfVarCreateBuilder.copyOnWrite();
        aicb aicbVar = (aicb) aihfVarCreateBuilder.instance;
        aicbVar.b |= 1;
        aicbVar.c = strE;
        long jB = poqVar.b();
        aihfVarCreateBuilder.copyOnWrite();
        aicb aicbVar2 = (aicb) aihfVarCreateBuilder.instance;
        aicbVar2.b |= 2;
        aicbVar2.d = jB;
        long jA = poqVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        aicb aicbVar3 = (aicb) aihfVarCreateBuilder.instance;
        aicbVar3.b |= 4;
        aicbVar3.e = jA;
        aigj aigjVarD = poqVar.d();
        aihfVarCreateBuilder.copyOnWrite();
        aicb aicbVar4 = (aicb) aihfVarCreateBuilder.instance;
        aicbVar4.b |= 8;
        aicbVar4.f = aigjVarD;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aicb) aihnVarBuild;
    }
}
