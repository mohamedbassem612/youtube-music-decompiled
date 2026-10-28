package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwb {
    public final Set a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public wwb() {
        Set setAj = ahng.aj();
        setAj.getClass();
        this.a = setAj;
    }

    public final void a(wwa wwaVar) {
        wwaVar.getClass();
        this.a.add(wwaVar);
    }

    public final void b() {
        if (this.b != 0) {
            this.b = 0;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((wwa) it.next()).a();
            }
        }
    }

    public final void c(wwa wwaVar) {
        wwaVar.getClass();
        this.a.remove(wwaVar);
    }
}
