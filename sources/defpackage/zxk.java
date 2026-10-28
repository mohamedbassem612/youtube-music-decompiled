package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zxk implements tnh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zxk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tnh
    public final void a(Object obj) {
        String string;
        if (this.$cid == 0) {
            ((zty) this.a).g((Void) obj);
            return;
        }
        try {
            string = ((JSONObject) obj).getString("crash_report_id");
        } catch (JSONException e) {
            ((agrc) ((agrc) ((agrc) xoj.a.b().i(agso.a, "MDX.CastFeedback")).j(e)).k("com/google/android/libraries/youtube/mdx/feedback/CastFeedbackHelper", "sendLogReportRequest", '^', "CastFeedbackHelper.java")).t("Failed extracting crash report id from response");
            string = null;
        }
        ((ahhp) this.a).d(string);
    }
}
