package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnr {
    private static int i;
    public fns a;
    public double e;
    public final fnq b = new fnq();
    public final fnq c = new fnq();
    public final fnq d = new fnq();
    public boolean f = true;
    public double g = 0.0d;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public fnr() {
        i++;
        this.a = fns.a;
    }

    public final boolean a() {
        fnq fnqVar = this.b;
        if (Math.abs(fnqVar.b) > 0.005d) {
            return false;
        }
        if (Math.abs(this.e - fnqVar.a) <= 0.005d) {
            return true;
        }
        double d = this.a.c;
        return false;
    }

    public final void b(double d) {
        if (this.e == d && a()) {
            return;
        }
        this.e = d;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fnt) it.next()).c();
        }
    }
}
