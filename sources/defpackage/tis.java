package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tis extends thf {
    public RequestFinishedInfo b;
    final /* synthetic */ tit c;
    private final the d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tis(tit titVar, tfx tfxVar, Executor executor, the theVar, awmd awmdVar) {
        super(tfxVar, executor, awmdVar);
        this.c = titVar;
        this.d = theVar;
    }

    @Override // defpackage.thf, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        requestFinishedInfo.getClass();
        synchronized (this.c) {
            if (this.d.b()) {
                super.onRequestFinished(requestFinishedInfo);
            } else {
                this.b = requestFinishedInfo;
            }
        }
    }
}
