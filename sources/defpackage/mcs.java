package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcs implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new afx(0);
    private int d;

    public mcs(int i) {
        this.d = i;
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((mcr) it.next()).a(i);
            }
            afw afwVar = new afw((afx) this.c);
            while (afwVar.hasNext()) {
                ((mcr) afwVar.next()).a(i);
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        mcr mcrVar;
        synchronized (this.a) {
            mcrVar = new mcr(this.d, runnable);
            this.b.add(mcrVar);
            char[] cArr = null;
            mcrVar.a = new lph(this, mcrVar, 5, cArr);
            mcrVar.b = new lph(this, mcrVar, 6, cArr);
        }
        return mcrVar;
    }
}
