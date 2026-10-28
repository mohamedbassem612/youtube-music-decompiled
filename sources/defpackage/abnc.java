package defpackage;

import android.text.TextUtils;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnc implements Observer {
    private static final agrf v = agrf.h("com/google/android/libraries/youtube/player/modality/PlaybackModality");
    public boolean c;
    public zki d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    boolean j;
    public boolean k;
    boolean l;
    boolean m;
    boolean n;
    public final adws t;
    final abhh u;
    private abmy w;
    String o = "";
    public jrj p = jrj.AUDIO_ROUTE_UNSPECIFIED;
    public abnq q = new abnq();
    public aboa r = aboa.DEFAULT_VALUE;
    public final zkk a = new abnb(this);
    public float b = 1.0f;
    public int s = 1;

    public abnc(adws adwsVar, abhh abhhVar) {
        this.h = true;
        this.t = adwsVar;
        this.u = abhhVar;
        this.h = true;
    }

    private final abnr w() {
        if (this.f) {
            return abnr.FULLSCREEN;
        }
        return this.e ? abnr.MINIMIZED : abnr.DEFAULT;
    }

    public final float a() {
        if ((this.q.a & 1) != 0) {
            return 0.0f;
        }
        if (this.c) {
            return 0.1f;
        }
        return this.b;
    }

    public final zkj b() {
        Object objIo;
        abmy abmyVar = this.w;
        if (abmyVar == null) {
            return zkj.a;
        }
        int iOrdinal = w().ordinal();
        if (iOrdinal == 0) {
            objIo = abmyVar.a.io();
        } else if (iOrdinal == 1) {
            objIo = abmyVar.d.io();
        } else if (iOrdinal != 2) {
            objIo = iOrdinal != 4 ? zkj.a : abmyVar.c.io();
        } else {
            objIo = abmyVar.b.io();
        }
        return (zkj) objIo;
    }

    public final aaxo c() {
        zkj zkjVarB = b();
        abnr abnrVarE = e();
        abnr abnrVarW = w();
        int i = zkjVarB.c;
        int i2 = zkjVarB.d;
        zki zkiVar = this.d;
        boolean z = false;
        if (zkiVar != null && zkiVar.l()) {
            z = true;
        }
        return new aaxo(abnrVarE, abnrVarW, i, i2, z, false, this.o);
    }

    public final abnd d() {
        return new abnd(this.e, this.f, this.i, this.j, this.k, this.g, this.q, this.r);
    }

    public final abnr e() {
        if (this.k) {
            return abnr.REMOTE;
        }
        if (this.i) {
            return abnr.BACKGROUND;
        }
        return this.g ? abnr.PICTURE_IN_PICTURE : w();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axsp, java.lang.Object] */
    public final void f() {
        this.t.g.kk(c());
        this.a.notifyObservers();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [axsp, java.lang.Object] */
    public final void g() {
        this.t.f.kk(new aazg(this.r, this.j));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [axsp, java.lang.Object] */
    public final void h() {
        m(null);
        this.d = null;
        this.u.a.kk(abmd.a);
    }

    public final void i(boolean z) {
        if (!this.j || this.m) {
            return;
        }
        k(z, false);
        if (this.d != null) {
            o();
        } else {
            ((agrc) ((agrc) v.b()).k("com/google/android/libraries/youtube/player/modality/PlaybackModality", "disableAudioOnlyMode", 503, "PlaybackModality.java")).t("Error: no UI elements available to display video");
        }
        this.l = false;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [axsp, java.lang.Object] */
    public final void j(boolean z, boolean z2) {
        if (z || z2) {
            this.l = true;
        }
        if (this.j) {
            return;
        }
        this.u.a.kk(abmd.a);
        k(z, true);
    }

    final void k(boolean z, boolean z2) {
        if (z2 != this.j) {
            this.j = z2;
            f();
            if (z2) {
                if (z) {
                    this.r = aboa.IS_UAO;
                }
            } else if (z) {
                this.r = aboa.DEFAULT_VALUE;
            }
            g();
        }
    }

    public final void l(boolean z) {
        if (z != this.i) {
            this.i = z;
            f();
        }
    }

    public final void m(abmy abmyVar) {
        abmy abmyVar2 = this.w;
        if (abmyVar2 != null) {
            abmyVar2.deleteObserver(this);
        }
        this.w = abmyVar;
        if (abmyVar != null) {
            abmyVar.addObserver(this);
        }
    }

    public final void n(String str) {
        if (TextUtils.equals(this.o, str)) {
            return;
        }
        this.o = str;
        f();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [axsp, java.lang.Object] */
    public final void o() {
        this.u.a.kk(s() ? abmd.a : new abmd(this.d));
    }

    public final void p(abnq abnqVar) {
        if (abnqVar.equals(this.q)) {
            return;
        }
        this.q = abnqVar;
    }

    public final void q(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                p(new abnq(3, 5));
            } else {
                p(new abnq());
            }
        }
    }

    public final void r(boolean z) {
        this.m = z;
        if (z) {
            j(false, false);
        } else {
            if (this.l) {
                return;
            }
            i(false);
        }
    }

    public final boolean s() {
        return this.j || this.i;
    }

    public final boolean t() {
        return e() == abnr.INLINE_IN_FEED;
    }

    public final boolean u() {
        return w() == abnr.DEFAULT;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.w && (obj instanceof Integer)) {
            abnr abnrVarW = w();
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 0) {
                if (abnrVarW == abnr.DEFAULT) {
                    f();
                }
            } else if (iIntValue == 1) {
                if (abnrVarW == abnr.FULLSCREEN) {
                    f();
                }
            } else if (iIntValue == 2) {
                if (abnrVarW == abnr.INLINE_IN_FEED) {
                    f();
                }
            } else if (iIntValue == 3 && abnrVarW == abnr.MINIMIZED) {
                f();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [axsp, java.lang.Object] */
    public final void v(int i) {
        this.s = i;
        if (i != 1) {
            this.t.e.kk(new aayn(i == 2, false));
        }
    }
}
