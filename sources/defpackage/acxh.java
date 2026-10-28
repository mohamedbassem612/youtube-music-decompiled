package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class acxh implements agek {
    @Override // defpackage.agek
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        asna asnaVar = (asna) obj;
        aihf aihfVarCreateBuilder = akse.a.createBuilder();
        if ((asnaVar.b & 1) != 0) {
            agek agekVar = acye.a;
            asmx asmxVar = asnaVar.c;
            if (asmxVar == null) {
                asmxVar = asmx.a;
            }
            Object objApply = agekVar.apply(asmxVar);
            aihfVarCreateBuilder.copyOnWrite();
            akse akseVar = (akse) aihfVarCreateBuilder.instance;
            objApply.getClass();
            akseVar.c = (aksb) objApply;
            akseVar.b |= 1;
        }
        return (akse) aihfVarCreateBuilder.build();
    }
}
