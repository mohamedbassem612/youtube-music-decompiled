package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kpt {
    public Object e;
    public boolean f = false;
    final /* synthetic */ kpz g;

    public kpt(kpz kpzVar, Object obj) {
        this.g = kpzVar;
        this.e = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.e = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.g.u;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
