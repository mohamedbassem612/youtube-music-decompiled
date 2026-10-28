package defpackage;

import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeLogger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ytl extends QoeLogger {
    private final ywn a;
    private final xeu b;
    private final zjr c;

    public ytl(ywn ywnVar, xeu xeuVar, zjr zjrVar) {
        this.a = ywnVar;
        this.b = xeuVar;
        this.c = zjrVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.QoeLogger
    public final void logBandwidthSample(long j, long j2) {
        try {
            this.a.e(j, j2);
        } catch (Throwable th) {
            yno.R(this.a, th);
            yno.Q(this.b, th, "Fail to logBandwidthSample");
            if (!this.c.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.QoeLogger
    public final void logCacheBytesLoaded(long j) {
        try {
            this.a.f(j);
        } catch (Throwable th) {
            yno.R(this.a, th);
            yno.Q(this.b, th, "Fail to logCacheBytesLoaded");
            if (!this.c.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.QoeLogger
    public final void logKeyValue(String str, String str2) {
        try {
            this.a.l(str, str2);
        } catch (Throwable th) {
            yno.R(this.a, th);
            yno.Q(this.b, th, "Fail to logKeyValue");
            if (!this.c.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.QoeLogger
    public final void logNonFatalError(QoeError qoeError) {
        try {
            this.a.k(zhz.d(qoeError, false));
        } catch (Throwable th) {
            yno.R(this.a, th);
            yno.Q(this.b, th, "Fail to logNonFatalError");
            if (!this.c.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.QoeLogger
    public final void logTimedKeyValue(String str, String str2) {
        try {
            this.a.w(str, str2);
        } catch (Throwable th) {
            yno.R(this.a, th);
            yno.Q(this.b, th, "Fail to logTimedKeyValue");
            if (!this.c.dU()) {
                throw th;
            }
        }
    }
}
