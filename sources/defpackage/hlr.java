package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hlr implements syk {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/OfflineFeedbackTaskRunner");
    private final tfq b;
    private final aapw c;

    public hlr(aapw aapwVar, tfq tfqVar) {
        this.c = aapwVar;
        this.b = tfqVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        ahno.G(bundle.containsKey("task_bundle_feedback_token_key"), "Could not find feedback token in task bundle");
        String string = bundle.getString("task_bundle_feedback_token_key");
        string.getClass();
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!this.b.h()) {
            return 2;
        }
        aapw aapwVar = this.c;
        wpw wpwVarG = aapwVar.g();
        wpwVarG.e(string);
        wpwVarG.o(vzh.b);
        taf.h(aapwVar.h(wpwVarG), MoreExecutors.directExecutor(), new glo(20));
        return 0;
    }
}
