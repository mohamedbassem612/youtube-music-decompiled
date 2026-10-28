package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpi extends wnn {
    public static final /* synthetic */ int g = 0;
    public final Executor c;
    public final zwb d;
    public final xmw e;
    public final wnh f;

    static {
        twu.b("MDx/RemoteControlService");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpi(wlp wlpVar, abxv abxvVar, tgg tggVar, Executor executor, zwb zwbVar, xmw xmwVar) {
        super(abxvVar, tggVar);
        wlpVar.getClass();
        abxvVar.getClass();
        tggVar.getClass();
        executor.getClass();
        zwbVar.getClass();
        xmwVar.getClass();
        this.c = executor;
        this.d = zwbVar;
        this.e = xmwVar;
        this.f = f(alwu.a, wlpVar, new wql(8), new wre(6));
    }
}
