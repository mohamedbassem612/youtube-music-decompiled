package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ray extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aueb auebVar = (aueb) obj;
        aihf aihfVarCreateBuilder = andh.a.createBuilder();
        if ((auebVar.b & 1) != 0) {
            agdy agdyVar = rbg.a;
            audd auddVarA = audd.a(auebVar.c);
            if (auddVarA == null) {
                auddVarA = audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
            }
            ancg ancgVar = (ancg) agdyVar.b(auddVarA);
            aihfVarCreateBuilder.copyOnWrite();
            andh andhVar = (andh) aihfVarCreateBuilder.instance;
            andhVar.c = ancgVar.ap;
            andhVar.b |= 1;
        }
        if ((auebVar.b & 2) != 0) {
            String str = auebVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andh andhVar2 = (andh) aihfVarCreateBuilder.instance;
            str.getClass();
            andhVar2.b |= 2;
            andhVar2.d = str;
        }
        if ((auebVar.b & 4) != 0) {
            String str2 = auebVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andh andhVar3 = (andh) aihfVarCreateBuilder.instance;
            str2.getClass();
            andhVar3.b |= 4;
            andhVar3.e = str2;
        }
        return (andh) aihfVarCreateBuilder.build();
    }
}
