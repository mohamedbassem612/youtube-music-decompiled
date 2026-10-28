package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class scz extends scr {
    public scz(awmd awmdVar, ovo ovoVar, rmp rmpVar) {
        super(awmdVar);
        scy scyVar = new scy();
        if (ovoVar.c == null) {
            ovoVar.c = scyVar;
        } else {
            Object obj = ovoVar.a;
            rmp.n(null, "Tried to override existing v2 survey listener");
        }
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_SURVEY_SUBMITTED) {
            throw new sav("Invalid trigger type for v2 SurveyActionTriggerAdapter.", 4);
        }
        if ((aizsVar.b == 9 ? (aqhh) aizsVar.c : aqhh.a).b.isEmpty()) {
            throw new sav("Triggering layout ID cannot be empty in v2 SurveyActionTriggerAdapter.", 4);
        }
    }
}
