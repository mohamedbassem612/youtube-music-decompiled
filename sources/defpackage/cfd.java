package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfd {
    public static final cfd a;
    public final String b;
    private final cfc c;

    static {
        new cfd("");
        a = new cfd("preload");
    }

    public cfd(String str) {
        this.b = str;
        this.c = Build.VERSION.SDK_INT >= 31 ? new cfc() : null;
    }

    public final synchronized LogSessionId a() {
        cfc cfcVar;
        cfcVar = this.c;
        cfcVar.getClass();
        return cfcVar.a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        cfc cfcVar = this.c;
        cfcVar.getClass();
        if (!cfcVar.a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            throw new IllegalStateException();
        }
        cfcVar.a = logSessionId;
    }
}
