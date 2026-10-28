package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubi extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audy audyVar = (audy) obj;
        aihf aihfVarCreateBuilder = ande.a.createBuilder();
        if ((audyVar.b & 1) != 0) {
            agdy agdyVar = uej.a;
            aucw aucwVarA = aucw.a(audyVar.c);
            if (aucwVarA == null) {
                aucwVarA = aucw.MDE_COLOR_PRIMARIES_UNSPECIFIED;
            }
            anca ancaVar = (anca) agdyVar.b(aucwVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ande andeVar = (ande) aihfVarCreateBuilder.instance;
            andeVar.c = ancaVar.h;
            andeVar.b |= 1;
        }
        if ((audyVar.b & 2) != 0) {
            agdy agdyVar2 = uej.b;
            aucy aucyVarA = aucy.a(audyVar.d);
            if (aucyVarA == null) {
                aucyVarA = aucy.MDE_COLOR_TRANSFER_UNSPECIFIED;
            }
            ancc anccVar = (ancc) agdyVar2.b(aucyVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ande andeVar2 = (ande) aihfVarCreateBuilder.instance;
            andeVar2.d = anccVar.i;
            andeVar2.b |= 2;
        }
        if ((audyVar.b & 4) != 0) {
            agdy agdyVar3 = uej.c;
            aucx aucxVarA = aucx.a(audyVar.e);
            if (aucxVarA == null) {
                aucxVarA = aucx.MDE_COLOR_RANGE_UNSPECIFIED;
            }
            ancb ancbVar = (ancb) agdyVar3.b(aucxVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ande andeVar3 = (ande) aihfVarCreateBuilder.instance;
            andeVar3.e = ancbVar.d;
            andeVar3.b |= 4;
        }
        if ((audyVar.b & 8) != 0) {
            agdy agdyVar4 = uej.d;
            aucz auczVarA = aucz.a(audyVar.f);
            if (auczVarA == null) {
                auczVarA = aucz.MDE_Y_CB_CR_MATRIX_UNSPECIFIED;
            }
            ancd ancdVar = (ancd) agdyVar4.b(auczVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ande andeVar4 = (ande) aihfVarCreateBuilder.instance;
            andeVar4.f = ancdVar.f;
            andeVar4.b |= 8;
        }
        return (ande) aihfVarCreateBuilder.build();
    }
}
