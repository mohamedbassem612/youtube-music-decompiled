package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapg implements yrk {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/player/OfflineStreamAvailabilityHintProviderImpl");
    private static final long b;
    private final awmd c;
    private final aauk d;
    private final abfv e;
    private final grj f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 5000L;
    }

    public aapg(awmd awmdVar, abfv abfvVar, grj grjVar, aauk aaukVar, hno hnoVar) {
        awmdVar.getClass();
        abfvVar.getClass();
        grjVar.getClass();
        aaukVar.getClass();
        hnoVar.getClass();
        this.c = awmdVar;
        this.e = abfvVar;
        this.f = grjVar;
        this.d = aaukVar;
    }

    @Override // defpackage.yrk
    public final boolean a(String str, boolean z) {
        aamt aamtVar;
        aams aamsVar;
        aaqn aaqnVarB;
        aadc aadcVarC;
        str.getClass();
        if (this.e.r()) {
            awmd awmdVar = this.c;
            if (((aanb) awmdVar.io()).g()) {
                try {
                    ListenableFuture listenableFutureE = ((aanb) awmdVar.io()).b().l().e(str);
                    long j = b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    mci.b();
                    aamtVar = (aamt) ((agev) listenableFutureE.get(j, timeUnit)).f();
                } catch (Exception e) {
                    ((agrc) ((agrc) a.b()).j(e).k("com/google/android/libraries/youtube/offline/player/OfflineStreamAvailabilityHintProviderImpl", "getVideoSnapshotBlocking", 76, "OfflineStreamAvailabilityHintProviderImpl.kt")).t("Failed to get OfflineVideoSnapshot");
                    aamtVar = null;
                }
                if (aamtVar != null && (aamsVar = aamtVar.m) != null && aamsVar.g() && (aadcVarC = (aaqnVarB = ((aanb) this.c.io()).b()).c()) != null) {
                    aamm aammVarG = this.d.s() ? aaqnVarB.f().g(str, null) : aamtVar.p;
                    if (aammVarG != null) {
                        return aagu.r(str, z, aamtVar.k(), aammVarG, aadcVarC, this.f).a;
                    }
                }
            }
        }
        return false;
    }
}
