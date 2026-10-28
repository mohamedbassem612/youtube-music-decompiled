package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tlh {
    public final the a;
    public final tfx b;
    public final Executor c;
    public final String d;
    public RequestFinishedInfo e;
    public final awmd f;

    public tlh(the theVar, tfx tfxVar, Executor executor, String str, awmd awmdVar) {
        this.a = theVar;
        this.b = tfxVar;
        this.c = executor;
        this.d = str;
        this.f = awmdVar;
    }

    public final void a() {
        Executor executor;
        if (this.e == null || (executor = this.c) == null) {
            return;
        }
        executor.execute(afwl.i(new szq(this, 3)));
    }
}
