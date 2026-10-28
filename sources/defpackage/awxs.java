package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxs extends awxt implements awvb {
    public final Handler a;
    private final String b;
    private final boolean c;
    private final awxs d;

    public awxs(Handler handler, String str, boolean z) {
        this.a = handler;
        this.b = str;
        this.c = z;
        this.d = z ? this : new awxs(handler, str, true);
    }

    private final void k(awou awouVar, Runnable runnable) {
        awro.z(awouVar, new CancellationException(a.bV(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        awuq awuqVar = awvi.a;
        axew.a.a(awouVar, runnable);
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        k(awouVar, runnable);
    }

    @Override // defpackage.awxt, defpackage.awvb
    public final awvk c(long j, final Runnable runnable, awou awouVar) {
        if (this.a.postDelayed(runnable, awro.n(j))) {
            return new awvk() { // from class: awxr
                @Override // defpackage.awvk
                public final void kv() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        k(awouVar, runnable);
        return awwr.a;
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        aves avesVar = new aves(awucVar, this, 17, (char[]) null);
        if (this.a.postDelayed(avesVar, awro.n(j))) {
            awucVar.b(new acjo(this, avesVar, 12));
        } else {
            k(((awud) awucVar).b, avesVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awxs) {
            awxs awxsVar = (awxs) obj;
            if (awxsVar.a == this.a && awxsVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awuq
    public final boolean fX(awou awouVar) {
        if (this.c) {
            if (awrc.c(Looper.myLooper(), this.a.getLooper())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (true != this.c ? 1237 : 1231);
    }

    @Override // defpackage.awxt, defpackage.awwo
    public final /* synthetic */ awwo j() {
        return this.d;
    }

    @Override // defpackage.awwo, defpackage.awuq
    public final String toString() {
        String strH = h();
        if (strH != null) {
            return strH;
        }
        String string = this.b;
        if (string == null) {
            string = this.a.toString();
        }
        return this.c ? String.valueOf(string).concat(".immediate") : string;
    }
}
