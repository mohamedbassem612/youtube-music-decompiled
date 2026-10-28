package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xoi implements tng {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xoi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        tnm tnmVar;
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) xoj.a.b().i(agso.a, "MDX.CastFeedback")).k("com/google/android/libraries/youtube/mdx/feedback/CastFeedbackHelper", "sendLogReportRequest", 100, "CastFeedbackHelper.java")).w("Failed getting crash report id: %s", toeVar.getMessage());
            ((ahhp) this.a).d(null);
            return;
        }
        if (i != 1) {
            Object obj = this.a;
            if (i != 2) {
                ((abzc) obj).A = true;
                return;
            } else {
                ((zty) obj).g(toeVar);
                return;
            }
        }
        agrf agrfVar = uxt.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "createRequest", 271, "VideoEffectsFileManager.java")).w("Error fetching asset: %s", this.a);
        if (toeVar == null || (tnmVar = toeVar.b) == null) {
            return;
        }
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "createRequest", 273, "VideoEffectsFileManager.java")).u("Response status code: %d", tnmVar.d);
    }
}
