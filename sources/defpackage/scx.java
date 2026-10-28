package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class scx extends scr implements aclo {
    public final vxz a;
    private final scw b;
    private final snu e;

    public scx(awmd awmdVar, auor auorVar, rmp rmpVar, vxz vxzVar) {
        super(awmdVar);
        this.b = new scw(this);
        this.e = new snu(this);
        this.a = vxzVar;
        auorVar.l(this);
    }

    @Override // defpackage.scr
    public final boolean ae(aizs aizsVar, smr smrVar, sgp sgpVar) {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_ON_PAGE_ENTERED) {
            if (((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).b & 1) != 0) {
                return this.b.a.contains((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).c);
            }
        }
        if (sgpVar.b.isEmpty()) {
            return false;
        }
        int i = aizsVar.e;
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aglz, java.lang.Object] */
    @Override // defpackage.scr
    public final void v(int i, aizs aizsVar, smr smrVar, sgp sgpVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED || aixrVarA == aixr.TRIGGER_TYPE_MINI_APP_ABANDONED) {
            return;
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_ON_PAGE_ENTERED) {
            if (((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).b & 1) != 0) {
                return;
            }
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_ON_PAGE_EXITED) {
            if (((aizsVar.b == 22 ? (aois) aizsVar.c : aois.b).c & 1) != 0) {
                return;
            }
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_MINI_APP_PLAYBACK_ENDED) {
            if (((aizsVar.b == 49 ? (anht) aizsVar.c : anht.a).b & 1) != 0) {
                return;
            }
        }
        Optional optional = sgpVar.b;
        if (optional.isEmpty()) {
            throw new sav("Reel page identifier is not present in AdOpportunityContextModel.", 4);
        }
        this.e.a.c((String) optional.get()).add(aizsVar.d);
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void ag() {
    }
}
