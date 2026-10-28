package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uch extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucg aucgVar = (aucg) obj;
        aihf aihfVarCreateBuilder = anbi.a.createBuilder();
        if ((aucgVar.b & 1) != 0) {
            agdy agdyVar = ufa.d;
            aucb aucbVar = aucgVar.e;
            if (aucbVar == null) {
                aucbVar = aucb.a;
            }
            anbd anbdVar = (anbd) agdyVar.b(aucbVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbi anbiVar = (anbi) aihfVarCreateBuilder.instance;
            anbdVar.getClass();
            anbiVar.e = anbdVar;
            anbiVar.b |= 1;
        }
        if (aucgVar.c == 2 && atxy.b(2) == 3) {
            anbr anbrVar = (anbr) ufa.b.b(aucgVar.c == 2 ? (aucp) aucgVar.d : aucp.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbi anbiVar2 = (anbi) aihfVarCreateBuilder.instance;
            anbrVar.getClass();
            anbiVar2.d = anbrVar;
            anbiVar2.c = 2;
        }
        if (aucgVar.c == 3 && atxy.b(3) == 4) {
            anbf anbfVar = (anbf) ufa.c.b(aucgVar.c == 3 ? (aucd) aucgVar.d : aucd.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbi anbiVar3 = (anbi) aihfVarCreateBuilder.instance;
            anbfVar.getClass();
            anbiVar3.d = anbfVar;
            anbiVar3.c = 3;
        }
        if (aucgVar.c == 4 && atxy.b(4) == 5) {
            anbk anbkVar = (anbk) ufa.a.b(aucgVar.c == 4 ? (auci) aucgVar.d : auci.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbi anbiVar4 = (anbi) aihfVarCreateBuilder.instance;
            anbkVar.getClass();
            anbiVar4.d = anbkVar;
            anbiVar4.c = 4;
        }
        return (anbi) aihfVarCreateBuilder.build();
    }
}
