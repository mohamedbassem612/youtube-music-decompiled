package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rpy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/account/signin/flow/DefaultModularOnboardingController");
    public final Executor b;
    public final rre c;
    public final rlw d;
    public final zza e;
    public final long f;
    public final awmd g;
    public final rqc h;
    public final syn i;

    public rpy(zwb zwbVar, Executor executor, rre rreVar, vxe vxeVar, rqa rqaVar, rlw rlwVar, syn synVar, rqc rqcVar, vxu vxuVar, cf cfVar, awmd awmdVar) {
        this.c = rreVar;
        this.b = executor;
        this.d = rlwVar;
        this.i = synVar;
        this.h = rqcVar;
        this.g = awmdVar;
        this.e = new rpx(zwbVar, rqaVar, vxeVar, cfVar);
        rqcVar.a.add(this);
        aiqh aiqhVar = vxuVar.c().i;
        aiqhVar = aiqhVar == null ? aiqh.a : aiqhVar;
        if ((aiqhVar.b & 8) != 0) {
            this.f = TimeUnit.MINUTES.toSeconds(aiqhVar.c);
        } else {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            this.f = 3600L;
        }
    }

    public final void a() {
        this.b.execute(new mbo(this, 19));
    }
}
