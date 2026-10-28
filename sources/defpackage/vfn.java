package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vfn extends veq {
    static final agek a = new vem(6);

    @Override // defpackage.veq
    public final void a(auhb auhbVar, aihf aihfVar) {
        aqkj aqkjVar = auhbVar.o;
        if (aqkjVar == null) {
            aqkjVar = aqkj.a;
        }
        if ((aqkjVar.b & 1) != 0) {
            aqkj aqkjVar2 = auhbVar.o;
            if (aqkjVar2 == null) {
                aqkjVar2 = aqkj.a;
            }
            aqkm aqkmVar = aqkjVar2.c;
            if (aqkmVar == null) {
                aqkmVar = aqkm.a;
            }
            String str = aqkmVar.c;
            aihfVar.copyOnWrite();
            akql akqlVar = (akql) aihfVar.instance;
            akql akqlVar2 = akql.a;
            str.getClass();
            akqlVar.b |= SemanticState.Hidden;
            akqlVar.k = str;
        }
    }

    @Override // defpackage.veq
    public final void b(auhb auhbVar, aihf aihfVar) {
        akqk akqkVarA = vfo.a(auhbVar.d);
        aihfVar.copyOnWrite();
        akql akqlVar = (akql) aihfVar.instance;
        akql akqlVar2 = akql.a;
        akqkVarA.getClass();
        akqlVar.d = akqkVarA;
        akqlVar.b |= 2;
    }

    @Override // defpackage.veq
    public final void c(auhb auhbVar, aihf aihfVar) {
        arfq arfqVarApply = new vfu().apply(ujq.d(auhbVar.g));
        aihfVar.copyOnWrite();
        akql akqlVar = (akql) aihfVar.instance;
        akql akqlVar2 = akql.a;
        akqlVar.g = arfqVarApply.u;
        akqlVar.b |= 16;
    }
}
