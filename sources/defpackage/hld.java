package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hld {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/notifications/MusicNotificationStateProvider");
    public final awmd a;
    private final mbc c;

    public hld(awmd awmdVar, mbc mbcVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        mbcVar.getClass();
        this.c = mbcVar;
    }

    public static final ListenableFuture d() {
        return ahng.n(Boolean.TRUE);
    }

    public final long a() {
        long j;
        awmd awmdVar = this.a;
        agev agevVarK = ((aaas) awmdVar.io()).k();
        long jLongValue = ((Long) agevVarK.e(0L)).longValue();
        mbc mbcVar = this.c;
        if (jLongValue == 0) {
            j = -1;
        } else {
            long epochMilli = mbcVar.f().toEpochMilli() - ((Long) agevVarK.c()).longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j = epochMilli / 1000;
        }
        if (j != -1) {
            return j;
        }
        ListenableFuture listenableFutureQ = ((aaas) awmdVar.io()).q(mbcVar.f().toEpochMilli());
        glo gloVar = new glo(19);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, gloVar);
        long j2 = afwl.a;
        listenableFutureQ.addListener(new ahei(listenableFutureQ, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        return -1L;
    }

    public final boolean c(Context context) {
        return new auy(context).c();
    }
}
