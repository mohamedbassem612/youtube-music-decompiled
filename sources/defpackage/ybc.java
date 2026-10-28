package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybc extends wnn implements yba {
    public static final String c;
    public final awkx d;
    private final Executor e;
    private final zwb f;
    private final xmw g;
    private final wnh h;

    static {
        String strB = twu.b("MDx.GetActiveDevicesService");
        strB.getClass();
        c = strB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybc(wlp wlpVar, abxv abxvVar, tgg tggVar, Executor executor, vxz vxzVar, zwb zwbVar, xmw xmwVar) {
        super(abxvVar, tggVar);
        wlpVar.getClass();
        abxvVar.getClass();
        tggVar.getClass();
        executor.getClass();
        vxzVar.getClass();
        zwbVar.getClass();
        xmwVar.getClass();
        this.e = executor;
        this.f = zwbVar;
        this.g = xmwVar;
        this.d = new awkx();
        this.h = f(alpn.a, wlpVar, new wut(15), new wvb(7));
    }

    @Override // defpackage.yba
    public final ListenableFuture a(String str, String str2) {
        zwb zwbVar = this.f;
        if (!zwbVar.u()) {
            return ahng.n(alpn.a);
        }
        aihf aihfVarCreateBuilder = alpm.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alpm alpmVar = (alpm) aihfVarCreateBuilder.instance;
            alpmVar.b |= 4;
            alpmVar.e = str;
        }
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alpm alpmVar2 = (alpm) aihfVarCreateBuilder.instance;
            alpmVar2.b |= 2;
            alpmVar2.d = str2;
        }
        amyf amyfVar = this.g.l;
        if (amyfVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alpm alpmVar3 = (alpm) aihfVarCreateBuilder.instance;
            alpmVar3.f = amyfVar;
            alpmVar3.b |= 8;
        }
        abxv abxvVar = this.b;
        zwa zwaVarE = zwbVar.e();
        zwaVarE.getClass();
        ybb ybbVar = new ybb(abxvVar, zwaVarE, aihfVarCreateBuilder);
        ybbVar.m();
        wnh wnhVar = this.h;
        Executor executor = this.e;
        ListenableFuture listenableFutureB = wnhVar.b(ybbVar, executor, null);
        ahno.at(listenableFutureB, new ryh(this, 6), executor);
        return listenableFutureB;
    }
}
