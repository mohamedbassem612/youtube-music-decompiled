package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aazz {
    public final abmt a;
    public final acip b;
    public final avlh c;
    public avlh d;

    public aazz(acip acipVar, abmt abmtVar) {
        this.b = acipVar;
        avlh avlhVarF = acipVar.F();
        avlhVarF.getClass();
        this.c = avlhVarF;
        this.a = abmtVar;
    }

    public static final asgy a(wiw wiwVar) {
        aihf aihfVarCreateBuilder = asgy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asgy asgyVar = (asgy) aihfVarCreateBuilder.instance;
        asgyVar.b |= 2;
        asgyVar.d = wiwVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        asgy asgyVar2 = (asgy) aihfVarCreateBuilder.instance;
        asgyVar2.g = wiwVar.e.s;
        asgyVar2.b |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        asgy asgyVar3 = (asgy) aihfVarCreateBuilder.instance;
        String str = wiwVar.b;
        str.getClass();
        asgyVar3.b |= 1;
        asgyVar3.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        asgy asgyVar4 = (asgy) aihfVarCreateBuilder.instance;
        asgyVar4.b |= 4;
        asgyVar4.e = wiwVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        asgy asgyVar5 = (asgy) aihfVarCreateBuilder.instance;
        aihv aihvVar = asgyVar5.f;
        if (!aihvVar.c()) {
            asgyVar5.f = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(wiwVar.d, asgyVar5.f);
        return (asgy) aihfVarCreateBuilder.build();
    }
}
