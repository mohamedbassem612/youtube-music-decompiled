package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aacq implements aalt {
    private static final long a;
    private final vyo b;
    private final syn c;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 3600L;
    }

    public aacq(syn synVar, vyo vyoVar) {
        this.c = synVar;
        this.b = vyoVar;
    }

    @Override // defpackage.aalt
    public final void a() {
        aoev aoevVar = this.b.b().i;
        if (aoevVar == null) {
            aoevVar = aoev.a;
        }
        aogn aognVar = aoevVar.d;
        if (aognVar == null) {
            aognVar = aogn.a;
        }
        if (aognVar.b) {
            this.c.d("offline_client_state", Math.max(a, aognVar.c), 1, 1, false, null, null, false);
        }
    }
}
