package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjp {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager");
    public final abjr b;
    public volatile abjl c;
    private final abjv d;
    private final SparseArray h;
    private final abmt j;
    private volatile abje k;
    private final hfn l;
    private final Set e = new CopyOnWriteArraySet();
    private final Set f = new CopyOnWriteArraySet();
    private final Set g = new CopyOnWriteArraySet();
    private final abjo i = new abjo();

    public abjp(abjv abjvVar, hfn hfnVar, abmt abmtVar) {
        this.l = hfnVar;
        this.d = abjvVar;
        this.j = abmtVar;
        abjd abjdVar = new abjd();
        this.c = abjdVar;
        this.k = abjdVar;
        abjr abjrVar = new abjr();
        this.b = abjrVar;
        abjrVar.c(this.c);
        this.h = new SparseArray(2);
        int[] iArr = abjl.F;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            abjt abjtVar = new abjt(i2);
            abjtVar.d(this.c);
            this.h.put(i2, abjtVar);
        }
        p(abjvVar);
        p(this.i);
        q(this.i);
    }

    public final synchronized void A() {
        if (!(this.c instanceof abka)) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "unshuffle", 312, "PlaybackQueueManager.java")).t("Trying to call unshuffle on a non shuffleable queue.");
            return;
        }
        abjv abjvVar = this.d;
        Object objB = abjvVar.b();
        ((abka) this.c).l();
        abjvVar.c(objB);
    }

    public final synchronized boolean B(int i, int i2) {
        boolean z = true;
        if (tym.C(i2, this.c.hc(i))) {
            if (i != 0) {
                z = false;
            } else if (i2 != this.c.hd()) {
                return false;
            }
        }
        return z;
    }

    public final synchronized void C(abjl abjlVar) {
        x(abjlVar, null, abjk.a);
    }

    public final int a() {
        return this.c.hd();
    }

    public final int b(boolean z) {
        return z ? c() : a();
    }

    public final int c() {
        return this.i.b;
    }

    public final tbk d(int i) {
        return (tbk) this.h.get(i);
    }

    public final synchronized abje e() {
        return this.k;
    }

    public final synchronized abjk f() {
        return this.c.b();
    }

    public final synchronized abjl g() {
        return this.c;
    }

    public final synchronized abjl h() {
        abjl abjlVar;
        boolean z = this.c instanceof abiz;
        abjlVar = this.c;
        if (z) {
            abjlVar = ((abiz) abjlVar).k;
        }
        return abjlVar;
    }

    public final synchronized abjz i() {
        abjz abjzVarD;
        if (this.c instanceof abka) {
            abjzVarD = ((abka) this.c).d();
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "getShuffleType", 346, "PlaybackQueueManager.java")).t("Trying to call getShuffleType on a non shuffleable queue.");
            abjzVarD = abjz.a;
        }
        return abjzVarD;
    }

    public final abke j() {
        abjl abjlVar = this.c;
        int iHd = abjlVar.hd();
        if (iHd != -1) {
            return abjlVar.O(0, iHd);
        }
        return null;
    }

    public final abke k(boolean z) {
        return z ? l() : j();
    }

    public final abke l() {
        return this.i.a;
    }

    public final Object m() {
        return this.d.b();
    }

    public final List n() {
        abjr abjrVar = this.b;
        return abjrVar.subList(0, abjrVar.size());
    }

    public final List o(int i) {
        return d(i).subList(0, d(i).size());
    }

    public final void p(abji abjiVar) {
        this.g.add(abjiVar);
        this.c.hf(abjiVar);
    }

    public final void q(abjj abjjVar) {
        this.f.add(abjjVar);
        this.c.hg(abjjVar);
    }

    public final void r() {
        this.c.hb();
    }

    public final void s(abji abjiVar) {
        this.g.remove(abjiVar);
        this.c.hk(abjiVar);
    }

    public final void t(abjj abjjVar) {
        this.f.remove(abjjVar);
        this.c.hl(abjjVar);
    }

    public final synchronized void u(List list, List list2, int i, abjm abjmVar) {
        abmt abmtVar;
        abjl abjlVar = this.c;
        int i2 = abjg.a;
        abjy abjyVar = abjlVar instanceof abjy ? (abjy) abjlVar : null;
        if (abjyVar == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "replaceQueueContents", 262, "PlaybackQueueManager.java")).t("Trying to call replaceQueueContents on a non replaceable queue.");
            return;
        }
        if (list == null || list.isEmpty()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "replaceQueueContents", 266, "PlaybackQueueManager.java")).t("Trying to call replaceQueueContents with an empty queue.");
            return;
        }
        abjv abjvVar = this.d;
        Object objB = abjvVar.b();
        if (abjyVar.m(list, list2, i, abjmVar) || (abmtVar = this.j) == null || !abmtVar.aN()) {
            abjvVar.d(j(), abjmVar, true);
        }
        abjvVar.c(objB);
    }

    public final synchronized void v() {
        if (this.c instanceof abka) {
            ((abka) this.c).i();
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "resetShuffleState", 333, "PlaybackQueueManager.java")).t("Trying to call resetShuffleState on a non shuffleable queue.");
        }
    }

    public final void w(Object obj) {
        this.d.c(obj);
    }

    public final synchronized void x(abjl abjlVar, abjm abjmVar, abjk abjkVar) {
        abjlVar.getClass();
        if (this.c != abjlVar) {
            abjv abjvVar = this.d;
            Object objB = abjvVar.b();
            abjl abjlVar2 = this.c;
            int iA = a();
            abke abkeVarJ = j();
            this.c = abjlVar;
            if (this.c instanceof abje) {
                this.k = (abje) this.c;
            } else {
                this.k = new abjb(this.c, this.l, this.j);
            }
            this.b.c(this.c);
            int[] iArr = abjl.F;
            for (int i = 0; i < 2; i++) {
                ((abjt) this.h.get(iArr[i])).d(this.c);
            }
            int iA2 = a();
            abke abkeVarJ2 = j();
            for (abjj abjjVar : this.f) {
                abjlVar2.hl(abjjVar);
                abjlVar.hg(abjjVar);
                if (iA != iA2) {
                    abjjVar.ho(iA, iA2);
                }
            }
            boolean zEquals = Objects.equals(abkeVarJ, abkeVarJ2);
            for (abji abjiVar : this.g) {
                abjlVar2.hk(abjiVar);
                abjlVar.hf(abjiVar);
                if (!zEquals) {
                    abjiVar.hp(abkeVarJ2, abjmVar);
                }
            }
            abke abkeVarJ3 = j();
            if (abjkVar == abjk.b) {
                ((abvk) abjvVar.a.io()).D();
            } else {
                abjvVar.d(abkeVarJ3, abjmVar, true);
            }
            abjvVar.c(objB);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((abjn) it.next()).a();
            }
        }
    }

    public final synchronized void y() {
        if (!(this.c instanceof abka)) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "shuffle", 291, "PlaybackQueueManager.java")).t("Trying to call shuffle on a non shuffleable queue.");
            return;
        }
        abjv abjvVar = this.d;
        Object objB = abjvVar.b();
        ((abka) this.c).j();
        abjvVar.c(objB);
    }

    public final void z(wgi wgiVar, boolean z, abjm abjmVar) {
        abkd abkdVarA = abjg.a(this.c);
        if (abkdVarA != null) {
            abkdVarA.k(wgiVar, z, abjmVar);
        }
    }
}
