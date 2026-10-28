package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpu implements tpw {
    private final aunn a;
    private boolean b = false;
    private final tpv c;
    private final tpz d;

    public tpu(aunn aunnVar, tpv tpvVar, tpz tpzVar) {
        this.a = aunnVar;
        this.c = tpvVar;
        this.d = tpzVar;
    }

    @Override // defpackage.tpw
    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                Iterable iterable = (Iterable) this.a.io();
                iterable.getClass();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    if (iterable instanceof Collection) {
                        ((Collection) iterable).size();
                    } else {
                        aguu.y(iterable.iterator());
                    }
                }
                for (Object obj : iterable) {
                    obj.getClass();
                    this.c.a(obj);
                }
            }
        }
    }

    @Override // defpackage.tpw
    public final void b() {
        if (this.b) {
            synchronized (this) {
                if (this.b) {
                    this.b = false;
                    Iterable iterable = (Iterable) this.a.io();
                    iterable.getClass();
                    for (Object obj : iterable) {
                        obj.getClass();
                        this.d.iU(obj);
                    }
                }
            }
        }
    }
}
