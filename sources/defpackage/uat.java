package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uat extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucb aucbVar = (aucb) obj;
        aihf aihfVarCreateBuilder = anbd.a.createBuilder();
        if ((aucbVar.b & 1) != 0) {
            agdy agdyVar = udy.a;
            aucl auclVar = aucbVar.c;
            if (auclVar == null) {
                auclVar = aucl.a;
            }
            anbn anbnVar = (anbn) agdyVar.b(auclVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbd anbdVar = (anbd) aihfVarCreateBuilder.instance;
            anbnVar.getClass();
            anbdVar.c = anbnVar;
            anbdVar.b |= 1;
        }
        return (anbd) aihfVarCreateBuilder.build();
    }
}
