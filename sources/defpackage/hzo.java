package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzo {
    public final /* synthetic */ Object a;

    public /* synthetic */ hzo(aany aanyVar) {
        this.a = aanyVar;
    }

    @tcc
    void handleLikeVideoActionEvent(gsg gsgVar) {
        hzp hzpVar = (hzp) this.a;
        aihh aihhVar = hzpVar.g;
        if (aihhVar != null) {
            amks amksVar = (amks) aihhVar.instance;
            if ((amksVar.b & 1) != 0) {
                String str = gsgVar.a;
                amlh amlhVar = amksVar.c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                if (str.equals(amlhVar.c)) {
                    amlg amlgVarEa = yno.ea(aihhVar);
                    amlg amlgVar = gsgVar.b;
                    if (amlgVarEa != amlgVar) {
                        yno.ec(aihhVar, amlgVar);
                    }
                    Iterator it = hzpVar.b.iterator();
                    while (it.hasNext()) {
                        ((hzv) it.next()).m(aihhVar);
                    }
                    hzpVar.f = gsgVar;
                }
            }
        }
    }

    public hzo(Object obj) {
        this.a = obj;
    }
}
