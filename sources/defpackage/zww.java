package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zww extends RequestFinishedInfo.Listener {
    private final xsc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zww(Executor executor, xsc xscVar) {
        super(executor);
        executor.getClass();
        xscVar.getClass();
        this.a = xscVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [awmi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo != null) {
            xsc xscVar = this.a;
            new elq(requestFinishedInfo);
            ?? r2 = xscVar.b;
            if (r2.isEmpty() && xscVar.c.b() && xscVar.x().isEmpty()) {
                return;
            }
            Iterator it = xscVar.x().iterator();
            while (it.hasNext()) {
                xsc.y((zwv) it.next());
            }
            Iterator it2 = ((CopyOnWriteArraySet) r2).iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next = it2.next();
                next.getClass();
                xsc.y((zwv) next);
            }
        }
    }
}
