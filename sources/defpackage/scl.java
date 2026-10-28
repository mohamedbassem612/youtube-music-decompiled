package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class scl extends scr {
    public scl(awmd awmdVar, rtb rtbVar, rmp rmpVar) {
        super(awmdVar);
        rtbVar.c(new sck());
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        String str;
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        int iOrdinal = aixrVarA.ordinal();
        if (iOrdinal == 76) {
            str = (aizsVar.b == 25 ? (aoin) aizsVar.c : aoin.a).b;
        } else {
            if (iOrdinal != 77) {
                throw new sav("Invalid trigger type for v2 AdEngagementPanelActionTriggerAdapter.", 4);
            }
            str = (aizsVar.b == 26 ? (aoim) aizsVar.c : aoim.a).b;
        }
        if (str.isEmpty()) {
            throw new sav("Triggering layout ID cannot be empty in v2 AdEngagementPanelActionTriggerAdapter.", 4);
        }
    }
}
