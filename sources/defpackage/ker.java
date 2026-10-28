package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ker {
    long b;
    final LruCache e;
    public boolean i;
    public knf j;
    public knf k;
    private final kfm m;
    public final Set l = DesugarCollections.synchronizedSet(new HashSet());
    public final khn a = new khn("MediaQueue", (String) null);
    private final int n = 20;
    List c = new ArrayList();
    final SparseIntArray d = new SparseIntArray();
    final List f = new ArrayList();
    final Deque g = new ArrayDeque(20);
    final Deque h = new ArrayDeque();
    private final Handler o = new afkg(Looper.getMainLooper(), (byte[]) null);
    private final TimerTask p = new keo(this);

    public ker(kfm kfmVar) {
        this.m = kfmVar;
        kfmVar.B(new keq(this));
        this.e = new kep(this);
        this.b = a();
        f();
    }

    public static /* synthetic */ void g(ker kerVar) {
        Set set = kerVar.l;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    private final void h() {
        this.o.removeCallbacks(this.p);
        this.i = false;
    }

    private final void i() {
        knf knfVar = this.k;
        if (knfVar != null) {
            knfVar.e();
            this.k = null;
        }
    }

    private final void j() {
        knf knfVar = this.j;
        if (knfVar != null) {
            knfVar.e();
            this.j = null;
        }
    }

    public final long a() {
        kax kaxVarH = this.m.h();
        if (kaxVarH != null) {
            MediaInfo mediaInfo = kaxVarH.a;
            if (!kax.f(kaxVarH.e, kaxVarH.f, kaxVarH.l, mediaInfo == null ? -1 : mediaInfo.a)) {
                return kaxVarH.b;
            }
        }
        return 0L;
    }

    public final void b() {
        g(this);
        this.c.clear();
        this.d.clear();
        this.e.evictAll();
        this.f.clear();
        h();
        this.g.clear();
        this.h.clear();
        i();
        j();
        g(this);
        g(this);
    }

    public final void c() {
        if (!this.h.isEmpty()) {
            d();
        } else {
            if (this.g.isEmpty() || this.i) {
                return;
            }
            d();
        }
    }

    public final void d() {
        Deque deque;
        knf knfVarU;
        if (this.b != 0) {
            Deque deque2 = this.h;
            if (deque2.isEmpty() && this.g.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            while (!deque2.isEmpty() && arrayList.size() < this.n) {
                arrayList.add((Integer) deque2.removeFirst());
            }
            while (true) {
                deque = this.g;
                if (deque.isEmpty() || arrayList.size() >= this.n) {
                    break;
                } else {
                    arrayList.add((Integer) deque.removeFirst());
                }
            }
            if (deque.isEmpty()) {
                h();
            } else if (!this.i) {
                h();
                this.o.postDelayed(this.p, 500L);
                this.i = true;
            }
            kfm kfmVar = this.m;
            int[] iArrH = khe.h(arrayList);
            kro.f("Must be called from the main thread.");
            if (kfmVar.m()) {
                kfa kfaVar = new kfa(kfmVar, iArrH);
                kfm.v(kfaVar);
                knfVarU = kfaVar;
            } else {
                knfVarU = kfm.u();
            }
            this.j = knfVarU;
            knfVarU.f(new ken(this, 0));
        }
    }

    public final void e() {
        SparseIntArray sparseIntArray = this.d;
        sparseIntArray.clear();
        for (int i = 0; i < this.c.size(); i++) {
            sparseIntArray.put(((Integer) this.c.get(i)).intValue(), i);
        }
    }

    public final void f() {
        knf knfVarU;
        kro.f("Must be called from the main thread.");
        if (this.b == 0 || this.k != null) {
            return;
        }
        i();
        j();
        kfm kfmVar = this.m;
        kro.f("Must be called from the main thread.");
        if (kfmVar.m()) {
            kez kezVar = new kez(kfmVar);
            kfm.v(kezVar);
            knfVarU = kezVar;
        } else {
            knfVarU = kfm.u();
        }
        this.k = knfVarU;
        knfVarU.f(new ken(this, 1));
    }
}
