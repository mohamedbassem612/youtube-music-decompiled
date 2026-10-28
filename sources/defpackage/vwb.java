package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/attestation/DelayedAttestationChallengeController");
    public final ScheduledExecutorService b;
    public final zwb c;
    public final zvu d;
    public final wof e;
    public final ek f;
    public final dov g;
    private final wof h;

    public vwb(ScheduledExecutorService scheduledExecutorService, dov dovVar, zwb zwbVar, zvu zvuVar, wof wofVar, wof wofVar2, ek ekVar) {
        this.b = scheduledExecutorService;
        this.g = dovVar;
        this.c = zwbVar;
        this.d = zvuVar;
        this.e = wofVar;
        this.h = wofVar2;
        this.f = ekVar;
    }

    public final void a(String str, String str2, byte[] bArr) {
        zwa zwaVarE = this.c.e();
        String strK = this.d.k();
        boolean zM = zwaVarE.m();
        wof wofVar = this.h;
        woe woeVar = new woe(wofVar.b, zwaVarE, strK, zM, bArr);
        woeVar.a = str;
        if (str2 != null) {
            woeVar.b = str2;
        }
        taf.i(wofVar.c.b(woeVar, this.b, null), MoreExecutors.directExecutor(), new roc(this, 20), new ixb(this, 10), null);
    }
}
