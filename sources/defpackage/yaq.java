package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yaq extends Handler {
    public volatile long a;
    private final vxz b;

    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, xla] */
    public yaq(xla xlaVar, awmd awmdVar, vxz vxzVar) {
        ListenableFuture listenableFutureAr;
        super(Looper.getMainLooper());
        this.b = vxzVar;
        this.a = xlaVar.G();
        if (xlaVar.E() > 0) {
            xsc xscVar = (xsc) awmdVar.io();
            ?? r7 = xscVar.b;
            if (r7.E() <= 0) {
                listenableFutureAr = new aher(Boolean.TRUE);
            } else {
                listenableFutureAr = ahno.ar(((yck) xscVar.a.io()).a(), new tvm(xscVar, Duration.ofDays(r7.E()), 15), MoreExecutors.directExecutor());
            }
            xwl xwlVar = new xwl(this, xlaVar, 8);
            Executor executor = taf.a;
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            taa taaVar = new taa(xwlVar, null, taf.b);
            long j = afwl.a;
            listenableFutureAr.addListener(new ahei(listenableFutureAr, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        yap yapVar = (yap) message.obj;
        yar yarVar = yapVar.a;
        if (yarVar.u) {
            int i = message.what;
            if (i == 1) {
                if (this.b.l(166, 45677766L, false)) {
                    return;
                }
                yarVar.q();
                if (hasMessages(1)) {
                    return;
                }
                sendMessageDelayed(obtainMessage(1, new yap(yarVar, agpr.a)), TimeUnit.SECONDS.toMillis(this.a));
                return;
            }
            if (i == 2) {
                Set<xvn> set = yapVar.b;
                if (set.isEmpty()) {
                    return;
                }
                for (xvn xvnVar : set) {
                    xwc xwcVar = xvnVar.n;
                    ConcurrentHashMap concurrentHashMap = yarVar.j;
                    Integer num = (Integer) concurrentHashMap.get(xwcVar);
                    yco ycoVar = ((ycp) yarVar.h.io()).e;
                    if (ycoVar == null || !xvnVar.g(ycoVar.j()) || ((num == null || num.intValue() >= 5) && yarVar.o.ad())) {
                        Uri uri = xvnVar.a;
                        if (uri != null) {
                            agrx agrxVar = agso.a;
                            String str = xvnVar.c;
                            yarVar.l.execute(afwl.i(new yag(yarVar, xvnVar, uri, 2)));
                        } else {
                            yarVar.i(xvnVar, xva.b(-2));
                        }
                    } else if (num != null) {
                        agrx agrxVar2 = agso.a;
                        String str2 = xvnVar.c;
                        num.intValue();
                        concurrentHashMap.put(xwcVar, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
        }
    }
}
