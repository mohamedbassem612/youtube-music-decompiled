package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qji {
    public volatile qjl a;
    public volatile boolean b;
    public volatile qjd c;

    public qji(final Context context, final Executor executor, final qjk qjkVar, final aunn aunnVar, boolean z, agev agevVar, final awmd awmdVar, final ahek ahekVar) {
        this.a = qjk.a;
        this.b = true;
        this.c = new qjg(1);
        if (!z || agevVar.g()) {
            awmdVar = null;
        }
        executor.execute(new Runnable() { // from class: qjh
            @Override // java.lang.Runnable
            public final void run() {
                qji qjiVar = this.a;
                aunn aunnVar2 = aunnVar;
                ahek ahekVar2 = ahekVar;
                Context context2 = context;
                if (mef.i(context2)) {
                    qjiVar.c(aunnVar2, ahekVar2);
                } else {
                    mef.d(context2, new mrh(qjiVar, aunnVar2, ahekVar2, executor, 3, (short[]) null));
                }
                if (qjiVar.b) {
                    qjiVar.b(qjkVar, awmdVar);
                }
            }
        });
    }

    public final axhi a(qjj qjjVar) {
        boolean z = this.b;
        qjl qjlVar = this.a;
        return z ? qjlVar.b(qjjVar) : qjlVar.e();
    }

    public final void b(qjk qjkVar, awmd awmdVar) {
        if (awmdVar == null) {
            aihf aihfVarCreateBuilder = axhi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            axhi axhiVar = (axhi) aihfVarCreateBuilder.instance;
            axhiVar.e = 2;
            axhiVar.b |= 2;
            this.a = qjkVar.a((axhi) aihfVarCreateBuilder.build());
            return;
        }
        try {
            this.a = qjkVar.a((axhi) awmdVar.io());
        } catch (Throwable th) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(th)).k("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 145, "Sampler.java")).t("Couldn't get sampling strategy");
            aihf aihfVarCreateBuilder2 = axhi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            axhi axhiVar2 = (axhi) aihfVarCreateBuilder2.instance;
            axhiVar2.c = 2;
            axhiVar2.d = 1;
            aihfVarCreateBuilder2.copyOnWrite();
            axhi axhiVar3 = (axhi) aihfVarCreateBuilder2.instance;
            axhiVar3.e = 3;
            axhiVar3.b |= 2;
            this.a = qjkVar.a((axhi) aihfVarCreateBuilder2.build());
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, mbc] */
    public final void c(aunn aunnVar, ahek ahekVar) {
        try {
            qen qenVar = (qen) aunnVar.io();
            this.b = qenVar.b();
            final int iA = qenVar.a();
            this.c = ahekVar.a ? new qjg(1) : new qjf(new awmd() { // from class: qje
                @Override // defpackage.awmd, defpackage.awmc
                public final Object io() {
                    return Integer.valueOf(iA);
                }
            }, ahekVar.b);
        } catch (Throwable th) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(th)).k("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", '|', "Sampler.java")).t("Couldn't get config");
            this.b = false;
        }
    }

    public qji(qjk qjkVar, awmd awmdVar) {
        this.a = qjk.a;
        this.b = true;
        this.c = new qjg(0);
        this.b = true;
        b(qjkVar, awmdVar);
    }
}
