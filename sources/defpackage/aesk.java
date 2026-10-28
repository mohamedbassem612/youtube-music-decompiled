package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesk {
    public final long a;
    public final long b;
    public final long c;
    public final aesb d;
    public final Handler e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final aess h;
    public ScheduledExecutorService i;
    public final boolean j;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public aesk(aess aessVar, aesb aesbVar, tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        this.h = aessVar;
        trl trlVar = (trl) aessVar.e;
        this.a = trlVar.a(334, 250, 250);
        this.b = trlVar.a(467, 50, 50);
        this.c = Math.max(trlVar.a(474, 50, 50), 50L);
        this.d = aesbVar;
        this.i = aessVar.b;
        int i = tqr.a;
        int iC = (int) tqjVar.c(1074004832);
        if (iC == 1) {
            this.i = (ScheduledExecutorService) awmdVar2.io();
        } else if (iC == 2) {
            this.i = (ScheduledExecutorService) awmdVar.io();
        } else if (iC == 3) {
            this.i = Executors.newScheduledThreadPool(1, new szw(-1, "anrV2"));
        } else if (iC == 5) {
            this.i = Executors.newScheduledThreadPool(1, new szw(0, "anrV2Critical"));
        } else if (iC == 6) {
            this.i = Executors.newScheduledThreadPool(1, new szw(1, "anrV2Background"));
        }
        this.e = new Handler(((Context) aessVar.c).getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference(new yvt(aessVar.d.e().toMillis(), 3, null));
        this.j = tqjVar.k(1073830916);
    }
}
