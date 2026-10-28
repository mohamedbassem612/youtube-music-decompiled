package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class koo implements Runnable {
    private WeakReference a;
    private knn b;
    private final int c;
    private final elq d;

    public koo(kol kolVar, elq elqVar, knn knnVar, int i) {
        this.a = new WeakReference(kolVar);
        this.d = elqVar;
        this.b = knnVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            WeakReference weakReference = this.a;
            kol kolVar = weakReference != null ? (kol) weakReference.get() : null;
            knn knnVar = this.b;
            if (kolVar != null && knnVar != null) {
                int i = this.c;
                koq koqVar = kolVar.l;
                kro.e(koqVar.q);
                try {
                    if (knnVar.d) {
                        koqVar.i().k(i);
                        knnVar.d = false;
                    }
                    kolVar.m(knnVar);
                } catch (Throwable th) {
                    kolVar.m(knnVar);
                    throw th;
                }
            } else if (knnVar != null && knnVar.d) {
                this.d.k(this.c);
                knnVar.d = false;
            }
            this.a = null;
            this.b = null;
        } catch (Throwable th2) {
            this.a = null;
            this.b = null;
            throw th2;
        }
    }
}
