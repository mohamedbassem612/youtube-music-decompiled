package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ypc extends RequestFinishedInfo.Listener {
    private final zjx a;

    public ypc(Executor executor, zjx zjxVar) {
        super(executor);
        this.a = zjxVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        Date responseStart = metrics.getResponseStart();
        Date requestEnd = metrics.getRequestEnd();
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (responseStart == null || requestEnd == null || receivedByteCount == null) {
            return;
        }
        long time = requestEnd.getTime() - responseStart.getTime();
        zjx zjxVar = this.a;
        long jLongValue = receivedByteCount.longValue();
        if (time <= 0 || jLongValue < 16384) {
            return;
        }
        Iterator it = zjxVar.a.a.iterator();
        while (it.hasNext()) {
            ((zhp) it.next()).d(time, jLongValue);
        }
    }
}
