package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tlg extends thf {
    final /* synthetic */ tlh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlg(tlh tlhVar, String str, tfx tfxVar, Executor executor, awmd awmdVar) {
        super(tfxVar, executor, awmdVar);
        this.b = tlhVar;
        this.a = str;
    }

    @Override // defpackage.thf, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        tlh tlhVar = this.b;
        if (tlhVar.a.b()) {
            super.onRequestFinished(requestFinishedInfo);
        } else {
            tlhVar.e = requestFinishedInfo;
        }
    }
}
