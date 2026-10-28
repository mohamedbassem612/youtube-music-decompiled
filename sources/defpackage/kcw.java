package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcw {
    public static boolean a;
    public final Context b;
    public final kgw c;
    public final kcr d;
    public final kdz e;
    public final kdl f;
    public Long h;
    public kec i;
    public kyr k;
    private final ExecutorService l;
    public int j = 1;
    public final String g = UUID.randomUUID().toString();

    static {
        new khn("ClientCastAnalytics", (String) null);
        a = true;
    }

    public kcw(Context context, kgw kgwVar, kcr kcrVar, kdz kdzVar, kdl kdlVar) {
        this.b = context;
        this.c = kgwVar;
        this.d = kcrVar;
        this.e = kdzVar;
        this.f = kdlVar;
        ksy ksyVar = kyq.a;
        this.l = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new kyp(0)));
    }

    public final void a(agzp agzpVar, int i) {
        this.l.execute(new qd(this, agzpVar, i, 9, (byte[]) null));
    }
}
