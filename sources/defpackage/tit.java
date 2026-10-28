package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tit {
    public final tfx a;
    public final Executor b;
    public final awmd c;
    public the d;
    public tis e;

    public tit(tfx tfxVar, Executor executor, awmd awmdVar) {
        this.a = tfxVar;
        this.b = executor;
        this.c = awmdVar;
    }

    public final void a(Collection collection) {
        RequestFinishedInfo requestFinishedInfo;
        synchronized (this) {
            the theVar = this.d;
            if (theVar != null) {
                theVar.a(collection);
                tis tisVar = this.e;
                if (tisVar != null && (requestFinishedInfo = tisVar.b) != null) {
                    tisVar.getExecutor().execute(afwl.i(new sxk(tisVar, requestFinishedInfo, 6)));
                }
            }
        }
    }
}
