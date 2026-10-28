package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vfe extends veg {
    static final agek a = new vem(2);

    @Override // defpackage.veg
    public final void a(auih auihVar, aihf aihfVar) {
        aqcx aqcxVar = (auihVar.c == 3 ? (auib) auihVar.d : auib.a).c;
        if (aqcxVar == null) {
            aqcxVar = aqcx.a;
        }
        String str = aqcxVar.c;
        aihfVar.copyOnWrite();
        akqd akqdVar = (akqd) aihfVar.instance;
        akqd akqdVar2 = akqd.a;
        str.getClass();
        akqdVar.b |= 1;
        akqdVar.c = str;
    }

    @Override // defpackage.veg
    public final void b(auih auihVar, aihf aihfVar) {
        agek agekVar = a;
        aqcx aqcxVar = (auihVar.c == 3 ? (auib) auihVar.d : auib.a).c;
        if (aqcxVar == null) {
            aqcxVar = aqcx.a;
        }
        aqlb aqlbVar = aqcxVar.d;
        if (aqlbVar == null) {
            aqlbVar = aqlb.a;
        }
        Object objApply = agekVar.apply(aqlbVar);
        aihfVar.copyOnWrite();
        akqd akqdVar = (akqd) aihfVar.instance;
        akqd akqdVar2 = akqd.a;
        objApply.getClass();
        akqdVar.d = (akqc) objApply;
        akqdVar.b |= 2;
    }
}
