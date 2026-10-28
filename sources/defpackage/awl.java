package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class awl {
    public boolean a;
    public Object b;
    public boolean c;
    public adbm d;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            adbm adbmVar = this.d;
            Object obj = this.b;
            if (adbmVar != null) {
                try {
                    adbmVar.b();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }
}
