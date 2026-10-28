package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import j$.time.Duration;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hgr {
    public final String a;
    public final ResultReceiver b;
    public final Object c = new Object();
    public final hjy d;
    final /* synthetic */ hgs e;
    private final xir f;
    private final Instant g;

    public hgr(hgs hgsVar, String str, ResultReceiver resultReceiver, hjy hjyVar, aunn aunnVar) {
        this.e = hgsVar;
        this.a = str;
        this.b = resultReceiver;
        this.d = hjyVar;
        this.g = hgsVar.c.f();
        xir xirVarN = ((xit) aunnVar.io()).n(306);
        this.f = xirVarN;
        xirVarN.h(hgm.g(xirVarN.q(), hjyVar.b, hjyVar.c, hjyVar.d, null, str));
    }

    final void a(tau tauVar) {
        this.f.f(tauVar);
    }

    public final void b(Bundle bundle) {
        synchronized (this.c) {
            this.b.send(0, bundle);
            a(tau.MEDIA_SESSION_CUSTOM_COMMAND_COMPLETED);
            Duration durationBetween = Duration.between(this.g, this.e.c.f());
            agrx agrxVar = agso.a;
            durationBetween.toMillis();
        }
    }
}
