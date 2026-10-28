package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xjk implements xjj {
    private final String a;

    public xjk(String str) {
        this.a = str;
    }

    @Override // defpackage.xjj
    public final void a(String str, aihf aihfVar) {
        aihf aihfVarCreateBuilder = amit.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amit amitVar = (amit) aihfVarCreateBuilder.instance;
        amitVar.b |= 1;
        amitVar.c = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        amit amitVar2 = (amit) aihfVarCreateBuilder.instance;
        amitVar2.b |= 2;
        amitVar2.d = str;
        amit amitVar3 = (amit) aihfVarCreateBuilder.build();
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amitVar3.getClass();
        aiie aiieVar = amiuVar.T;
        if (!aiieVar.c()) {
            amiuVar.T = aihn.mutableCopy(aiieVar);
        }
        amiuVar.T.add(amitVar3);
    }
}
