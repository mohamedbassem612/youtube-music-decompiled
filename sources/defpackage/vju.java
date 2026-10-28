package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class vju extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aimw aimwVar = (aimw) obj;
        aihf aihfVarCreateBuilder = aqla.a.createBuilder();
        if ((aimwVar.b & 1) != 0) {
            double d = aimwVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aqla aqlaVar = (aqla) aihfVarCreateBuilder.instance;
            aqlaVar.b |= 1;
            aqlaVar.c = d;
        }
        if ((aimwVar.b & 2) != 0) {
            double d2 = aimwVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            aqla aqlaVar2 = (aqla) aihfVarCreateBuilder.instance;
            aqlaVar2.b |= 2;
            aqlaVar2.d = d2;
        }
        if ((aimwVar.b & 4) != 0) {
            double d3 = aimwVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            aqla aqlaVar3 = (aqla) aihfVarCreateBuilder.instance;
            aqlaVar3.b |= 4;
            aqlaVar3.e = d3;
        }
        if ((aimwVar.b & 8) != 0) {
            double d4 = aimwVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aqla aqlaVar4 = (aqla) aihfVarCreateBuilder.instance;
            aqlaVar4.b |= 8;
            aqlaVar4.f = d4;
        }
        return (aqla) aihfVarCreateBuilder.build();
    }
}
