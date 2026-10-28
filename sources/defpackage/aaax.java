package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaax {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/push/NotificationInteractionController");
    public final vxe b;
    public final Context c;
    public final zwb d;
    public final Optional e;
    public final wrk f;
    public final awmd g;
    public final xgn h;
    public final mbc i;
    public final vxz j;

    public aaax(vxe vxeVar, zwb zwbVar, Optional optional, wva wvaVar, Context context, awmd awmdVar, xgn xgnVar, Executor executor, mbc mbcVar, vxz vxzVar) {
        context.getClass();
        this.c = context;
        this.b = vxeVar;
        this.d = zwbVar;
        this.e = optional;
        this.f = new wrk(wvaVar, null, executor);
        this.g = awmdVar;
        this.h = xgnVar;
        this.i = mbcVar;
        this.j = vxzVar;
    }
}
