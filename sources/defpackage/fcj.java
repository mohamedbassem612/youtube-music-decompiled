package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fcj {
    public final eta a;
    public final List b;
    public final esq c;
    public boolean d;
    public fci e;
    public boolean f;
    public fci g;
    public Bitmap h;
    public fci i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final ewn n;
    private boolean o;
    private esn p;

    public fcj(erj erjVar, eta etaVar, int i, int i2, euc eucVar, Bitmap bitmap) {
        ewn ewnVar = erjVar.a;
        esq esqVarD = erj.d(erjVar.a());
        esn esnVarL = erj.d(erjVar.a()).b().l(((fec) ((fec) fec.b(evs.b).R()).I(true)).B(i, i2));
        this.b = new ArrayList();
        this.c = esqVarD;
        Handler handler = new Handler(Looper.getMainLooper(), new ogb(this, 1));
        this.n = ewnVar;
        this.m = handler;
        this.p = esnVarL;
        this.a = etaVar;
        e(eucVar, bitmap);
    }

    final int a() {
        return ((ete) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        fci fciVar = this.i;
        if (fciVar != null) {
            this.i = null;
            c(fciVar);
            return;
        }
        this.o = true;
        eta etaVar = this.a;
        ete eteVar = (ete) etaVar;
        etc etcVar = eteVar.f;
        int i2 = etcVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = eteVar.e) >= 0) {
            i3 = i < i2 ? ((etb) etcVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i3);
        etaVar.b();
        this.g = new fci(this.m, eteVar.e, jUptimeMillis);
        this.p.l((fec) new fec().H(new ffd(Double.valueOf(Math.random())))).h(etaVar).q(this.g);
    }

    public final void c(fci fciVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, fciVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = fciVar;
            return;
        }
        if (fciVar.b != null) {
            d();
            fci fciVar2 = this.e;
            this.e = fciVar;
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                fce fceVar = (fce) list.get(size);
                Object callback = fceVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    fceVar.stop();
                    fceVar.invalidateSelf();
                } else {
                    fceVar.invalidateSelf();
                    fcj fcjVar = fceVar.a.a;
                    fci fciVar3 = fcjVar.e;
                    if ((fciVar3 != null ? fciVar3.a : -1) == fcjVar.a() - 1) {
                        fceVar.c++;
                    }
                    int i = fceVar.d;
                    if (i != -1 && fceVar.c >= i) {
                        fceVar.stop();
                        List list2 = fceVar.e;
                        if (list2 != null) {
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((dta) fceVar.e.get(i2)).b(fceVar);
                            }
                        }
                    }
                }
            }
            if (fciVar2 != null) {
                this.m.obtainMessage(2, fciVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(euc eucVar, Bitmap bitmap) {
        gzj.bM(bitmap);
        this.h = bitmap;
        this.p = this.p.l(new fec().P(eucVar));
        this.j = ffs.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
