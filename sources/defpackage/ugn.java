package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugn {
    private static final Duration b = ahng.E(1);
    public final String a;
    private final Duration c;
    private final Duration d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final String h;

    public /* synthetic */ ugn(String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        Duration duration = (i & 4) != 0 ? b : null;
        str2 = (i & 64) != 0 ? null : str2;
        str.getClass();
        duration.getClass();
        this.a = str;
        this.c = null;
        this.d = duration;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = str2;
        if (duration.compareTo(Duration.ZERO) <= 0) {
            throw new IllegalArgumentException("totalWork must be positive");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ugn) {
            ugn ugnVar = (ugn) obj;
            if (awrc.c(this.a, ugnVar.a)) {
                Duration duration = ugnVar.c;
                if (awrc.c(null, null) && awrc.c(this.d, ugnVar.d)) {
                    boolean z = ugnVar.e;
                    boolean z2 = ugnVar.f;
                    String str = ugnVar.g;
                    if (awrc.c(null, null) && awrc.c(this.h, ugnVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 961) + this.d.hashCode();
        String str = this.h;
        return (((((iHashCode * 31) + a.aj(false)) * 31) + a.aj(false)) * 961) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PendingTask(id=" + this.a + ", currentProgress=null, totalWork=" + this.d + ", cancellable=false, cancelRequested=false, statusMessage=null, debugLabel=" + this.h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ugn() {
        String str = null;
        this(str, str, 127);
    }
}
