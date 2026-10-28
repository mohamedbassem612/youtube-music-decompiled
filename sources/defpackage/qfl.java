package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qfl {
    private final agfp c;
    private volatile Process d;
    public volatile boolean b = false;
    public final agek a = new onn(this, 2);

    public qfl(agfx agfxVar) {
        this.c = new agfp(agfxVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        Process process = this.d;
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            agfp agfpVar = this.c;
            if (!agfpVar.a || agfpVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                agfpVar.d();
                agfpVar.e();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
