package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hli {
    public static final asfb a;

    static {
        aihf aihfVarCreateBuilder = asfb.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        asfb asfbVar = (asfb) aihfVarCreateBuilder.instance;
        asfbVar.b |= 2;
        asfbVar.d = 1;
        aihfVarCreateBuilder.copyOnWrite();
        asfb asfbVar2 = (asfb) aihfVarCreateBuilder.instance;
        asfbVar2.b |= 4;
        asfbVar2.e = 15;
        aihfVarCreateBuilder.copyOnWrite();
        asfb asfbVar3 = (asfb) aihfVarCreateBuilder.instance;
        asfbVar3.c = 1;
        asfbVar3.b |= 1;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        a = (asfb) aihnVarBuild;
    }
}
