package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uak extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubt aubtVar = (aubt) obj;
        aihf aihfVarCreateBuilder = anav.a.createBuilder();
        if ((aubtVar.b & 1) != 0) {
            agdy agdyVar = uds.a;
            aubu aubuVar = aubtVar.c;
            if (aubuVar == null) {
                aubuVar = aubu.a;
            }
            anaw anawVar = (anaw) agdyVar.b(aubuVar);
            aihfVarCreateBuilder.copyOnWrite();
            anav anavVar = (anav) aihfVarCreateBuilder.instance;
            anawVar.getClass();
            anavVar.c = anawVar;
            anavVar.b |= 1;
        }
        if ((aubtVar.b & 2) != 0) {
            agdy agdyVar2 = uds.b;
            aubj aubjVar = aubtVar.d;
            if (aubjVar == null) {
                aubjVar = aubj.a;
            }
            anal analVar = (anal) agdyVar2.b(aubjVar);
            aihfVarCreateBuilder.copyOnWrite();
            anav anavVar2 = (anav) aihfVarCreateBuilder.instance;
            analVar.getClass();
            anavVar2.d = analVar;
            anavVar2.b |= 2;
        }
        return (anav) aihfVarCreateBuilder.build();
    }
}
