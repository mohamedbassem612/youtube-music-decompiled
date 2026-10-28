package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xic {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/internal/config/EventLoggingConfigManagerV2");
    public final mbc b;
    public final Executor c;
    public volatile agkz d;
    public volatile agkz e;
    public volatile agkj f;
    public volatile agkj g;
    public volatile akwd h;

    public xic(vyo vyoVar, mbc mbcVar, Executor executor) {
        agpr agprVar = agpr.a;
        this.d = agprVar;
        this.e = agprVar;
        agkj agkjVar = agpn.b;
        this.f = agkjVar;
        this.g = agkjVar;
        this.b = mbcVar;
        this.c = executor;
        this.h = zrs.h();
        vyoVar.c(new xee(3)).B(new xib(0)).af(new jbq(this, executor, 10));
    }

    public final boolean a() {
        return this.h.c;
    }
}
