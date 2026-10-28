package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ver implements agek {
    @Override // defpackage.agek
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auav auavVar = (auav) obj;
        aihf aihfVarCreateBuilder = akqc.a.createBuilder();
        if ((auavVar.b & 1) != 0) {
            agek agekVar = vfv.a;
            aimw aimwVar = auavVar.c;
            if (aimwVar == null) {
                aimwVar = aimw.a;
            }
            Object objApply = agekVar.apply(aimwVar);
            aihfVarCreateBuilder.copyOnWrite();
            akqc akqcVar = (akqc) aihfVarCreateBuilder.instance;
            objApply.getClass();
            akqcVar.c = (aqla) objApply;
            akqcVar.b |= 1;
        }
        if ((auavVar.b & 2) != 0) {
            agek agekVar2 = vfv.a;
            aimw aimwVar2 = auavVar.d;
            if (aimwVar2 == null) {
                aimwVar2 = aimw.a;
            }
            Object objApply2 = agekVar2.apply(aimwVar2);
            aihfVarCreateBuilder.copyOnWrite();
            akqc akqcVar2 = (akqc) aihfVarCreateBuilder.instance;
            objApply2.getClass();
            akqcVar2.d = (aqla) objApply2;
            akqcVar2.b |= 2;
        }
        if ((auavVar.b & 4) != 0) {
            agek agekVar3 = vfv.a;
            aimw aimwVar3 = auavVar.e;
            if (aimwVar3 == null) {
                aimwVar3 = aimw.a;
            }
            Object objApply3 = agekVar3.apply(aimwVar3);
            aihfVarCreateBuilder.copyOnWrite();
            akqc akqcVar3 = (akqc) aihfVarCreateBuilder.instance;
            objApply3.getClass();
            akqcVar3.e = (aqla) objApply3;
            akqcVar3.b |= 4;
        }
        if ((auavVar.b & 8) != 0) {
            agek agekVar4 = vfv.a;
            aimw aimwVar4 = auavVar.f;
            if (aimwVar4 == null) {
                aimwVar4 = aimw.a;
            }
            Object objApply4 = agekVar4.apply(aimwVar4);
            aihfVarCreateBuilder.copyOnWrite();
            akqc akqcVar4 = (akqc) aihfVarCreateBuilder.instance;
            objApply4.getClass();
            akqcVar4.f = (aqla) objApply4;
            akqcVar4.b |= 8;
        }
        return (akqc) aihfVarCreateBuilder.build();
    }
}
