package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zxt implements zyh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/net/request/AsyncRequester");
    public final zyh b;
    private final Executor c;

    public zxt(Executor executor, zyh zyhVar) {
        this.c = executor;
        this.b = zyhVar;
    }

    @Override // defpackage.zyh
    public final void a(Object obj, sxu sxuVar) {
        obj.getClass();
        try {
            this.c.execute(afwl.i(new yag(this, obj, sxuVar, 13)));
        } catch (RejectedExecutionException e) {
            sxuVar.iT(obj, e);
        }
    }
}
