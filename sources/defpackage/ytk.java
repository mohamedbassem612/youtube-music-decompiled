package defpackage;

import com.google.android.libraries.youtube.media.interfaces.LatencyLogger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ytk extends LatencyLogger {
    public static final /* synthetic */ int a = 0;
    private static final agfr b = aguu.al(new cln(14));
    private final zjd c;
    private final xeu d;
    private final zjr e;

    public ytk(zjd zjdVar, xeu xeuVar, zjr zjrVar) {
        zjr.fJ();
        this.c = zjdVar;
        this.d = xeuVar;
        this.e = zjrVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.LatencyLogger
    public final void logLatencyTick(String str) {
        try {
            agfr agfrVar = (agfr) ((agkj) b.io()).get(str);
            tas tasVar = agfrVar == null ? null : (tas) agfrVar.io();
            if (tasVar != null) {
                this.c.aQ(tasVar);
            }
        } catch (Throwable th) {
            yno.Q(this.d, th, "Fail to logKeyValue");
            if (!this.e.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.LatencyLogger
    public final void logOnesieServerTimingInfo(String str) {
        try {
            this.c.aa(str);
        } catch (Throwable th) {
            yno.Q(this.d, th, "Fail to logKeyValue");
            if (!this.e.dU()) {
                throw th;
            }
        }
    }
}
