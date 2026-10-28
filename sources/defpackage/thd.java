package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class thd extends thf {
    private final boolean b;

    public thd(tfx tfxVar, Executor executor, boolean z, awmd awmdVar) {
        super(tfxVar, executor, awmdVar);
        this.b = z;
    }

    @Override // defpackage.thf, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (!this.b || requestFinishedInfo.getUrl().contains("initplayback")) {
            if (requestFinishedInfo.getUrl().contains("initplayback") || requestFinishedInfo.getUrl().contains("videoplayback")) {
                super.onRequestFinished(requestFinishedInfo);
            }
        }
    }
}
