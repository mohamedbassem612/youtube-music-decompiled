package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.decoder.CryptoConfig;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjo implements cju {
    public final List a;
    public final ckd b;
    public final crj c;
    public final ckm d;
    public final UUID e;
    public final cjm f;
    public final Object g;
    public int h;
    public byte[] i;
    public final aaf j;
    public aaf k;
    public eol l;
    private final boolean m = true;
    private final boolean n;
    private final HashMap o;
    private final bvi p;
    private final cfd q;
    private final Looper r;
    private int s;
    private HandlerThread t;
    private cjk u;
    private CryptoConfig v;
    private cjt w;
    private byte[] x;
    private eol y;
    private final qcb z;

    public cjo(UUID uuid, ckd ckdVar, aaf aafVar, qcb qcbVar, List list, boolean z, boolean z2, byte[] bArr, HashMap map, ckm ckmVar, Looper looper, crj crjVar, cfd cfdVar) {
        this.e = uuid;
        this.j = aafVar;
        this.z = qcbVar;
        this.b = ckdVar;
        this.n = z2;
        if (bArr != null) {
            this.x = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.o = map;
        this.d = ckmVar;
        this.p = new bvi();
        this.c = crjVar;
        this.q = cfdVar;
        this.h = 2;
        this.r = looper;
        this.f = new cjm(this, looper);
        this.g = new Object();
    }

    private final void q(bvh bvhVar) {
        Iterator it = this.p.b().iterator();
        while (it.hasNext()) {
            bvhVar.a((aae) it.next());
        }
    }

    private final void r(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || aup.m(th)) {
            this.j.c(this);
        } else {
            g(th, true != z ? 2 : 1);
        }
    }

    private final void s(byte[] bArr, int i, boolean z) {
        try {
            synchronized (this.g) {
                aaf aafVar = new aaf((byte[]) null);
                this.k = aafVar;
                List list = this.a;
                if (list != null) {
                    aafVar.a = agke.n(list);
                }
            }
            this.y = this.b.p(bArr, this.a, i, this.o);
            cjk cjkVar = this.u;
            int i2 = bwp.a;
            eol eolVar = this.y;
            eolVar.getClass();
            cjkVar.a(2, eolVar, z);
        } catch (Exception | NoSuchMethodError e) {
            r(e, true);
        }
    }

    private final boolean t() {
        try {
            this.b.h(this.i, this.x);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            g(e, 1);
            return false;
        }
    }

    @Override // defpackage.cju
    public final int a() {
        j();
        return this.h;
    }

    @Override // defpackage.cju
    public final CryptoConfig b() {
        j();
        return this.v;
    }

    @Override // defpackage.cju
    public final cjt c() {
        j();
        if (this.h == 1) {
            return this.w;
        }
        return null;
    }

    @Override // defpackage.cju
    public final Map d() {
        j();
        byte[] bArr = this.i;
        if (bArr == null) {
            return null;
        }
        return this.b.d(bArr);
    }

    @Override // defpackage.cju
    public final UUID e() {
        j();
        return this.e;
    }

    public final void f(boolean z) {
        long jMin;
        if (this.n) {
            return;
        }
        byte[] bArr = this.i;
        int i = bwp.a;
        if (this.x == null) {
            s(bArr, 1, z);
            return;
        }
        if (this.h == 4 || t()) {
            if (brt.d.equals(this.e)) {
                Pair pairF = auq.f(this);
                pairF.getClass();
                jMin = Math.min(((Long) pairF.first).longValue(), ((Long) pairF.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (jMin <= 60) {
                bvx.g(a.bS(jMin, "Offline license has expired or will expire soon. Remaining seconds: "));
                s(bArr, 2, z);
            } else {
                this.h = 4;
                q(new cjj(0));
            }
        }
    }

    public final void g(Throwable th, int i) {
        this.w = new cjt(th, aup.l(th, i));
        bvx.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            q(new cji(th, 0));
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!aup.n(th) && !aup.m(th)) {
                throw ((Error) th);
            }
        }
        if (this.h != 4) {
            this.h = 1;
        }
    }

    public final void h(Object obj, Object obj2) {
        auq auqVar;
        if (obj == this.y && k()) {
            this.y = null;
            synchronized (this.g) {
                aaf aafVar = this.k;
                aafVar.getClass();
                auqVar = new auq(aafVar);
                this.k = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                r((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrN = this.b.n(this.i, (byte[]) ((eol) obj2).a);
                if (this.x != null && bArrN != null && bArrN.length != 0) {
                    this.x = bArrN;
                }
                this.h = 4;
                q(new cji(auqVar, 1));
            } catch (Exception | NoSuchMethodError e) {
                r(e, true);
            }
        }
    }

    public final void i() {
        this.l = this.b.o();
        cjk cjkVar = this.u;
        int i = bwp.a;
        eol eolVar = this.l;
        eolVar.getClass();
        cjkVar.a(1, eolVar, true);
    }

    public final void j() {
        Looper looper = this.r;
        if (Thread.currentThread() != looper.getThread()) {
            bvx.f("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    public final boolean k() {
        int i = this.h;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public final boolean l() {
        if (k()) {
            return true;
        }
        try {
            ckd ckdVar = this.b;
            byte[] bArrM = ckdVar.m();
            this.i = bArrM;
            ckdVar.j(bArrM, this.q);
            this.v = ckdVar.b(this.i);
            this.h = 3;
            q(new cjj(1));
            this.i.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.j.c(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (aup.m(e)) {
                this.j.c(this);
            } else {
                g(e, 1);
            }
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (aup.m(e)) {
                this.j.c(this);
            } else {
                g(e, 1);
            }
            return false;
        }
    }

    @Override // defpackage.cju
    public final boolean m() {
        j();
        return true;
    }

    @Override // defpackage.cju
    public final boolean n(String str) {
        j();
        byte[] bArr = this.i;
        bArr.getClass();
        return this.b.l(bArr, str);
    }

    @Override // defpackage.cju
    public final void o(aae aaeVar) {
        j();
        int i = this.s;
        if (i < 0) {
            bvx.c("DefaultDrmSession", a.bR(i, "Session reference count less than zero: "));
            this.s = 0;
        }
        if (aaeVar != null) {
            this.p.c(aaeVar);
        }
        int i2 = this.s + 1;
        this.s = i2;
        if (i2 == 1) {
            ahno.O(this.h == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.t = handlerThread;
            handlerThread.start();
            this.u = new cjk(this, this.t.getLooper());
            if (l()) {
                f(true);
            }
        } else if (aaeVar != null && k() && this.p.a(aaeVar) == 1) {
            aaeVar.p(this.h);
        }
        cjs cjsVar = (cjs) this.z.a;
        cjsVar.d.remove(this);
        Handler handler = cjsVar.i;
        handler.getClass();
        handler.removeCallbacksAndMessages(this);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.cju
    public final void p(aae aaeVar) {
        j();
        int i = this.s;
        if (i <= 0) {
            bvx.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.s = i2;
        if (i2 == 0) {
            this.h = 0;
            cjm cjmVar = this.f;
            int i3 = bwp.a;
            cjmVar.removeCallbacksAndMessages(null);
            this.u.b();
            this.u = null;
            this.t.quit();
            this.t = null;
            this.v = null;
            this.w = null;
            this.y = null;
            synchronized (this.g) {
                this.k = null;
            }
            this.l = null;
            byte[] bArr = this.i;
            if (bArr != null) {
                this.b.e(bArr);
                this.i = null;
            }
        }
        if (aaeVar != null) {
            bvi bviVar = this.p;
            bviVar.d(aaeVar);
            if (bviVar.a(aaeVar) == 0) {
                aaeVar.r();
            }
        }
        qcb qcbVar = this.z;
        int i4 = this.s;
        if (i4 == 1) {
            cjs cjsVar = (cjs) qcbVar.a;
            if (cjsVar.e > 0) {
                cjsVar.d.add(this);
                Handler handler = cjsVar.i;
                handler.getClass();
                handler.postAtTime(new bkn(this, 17), this, SystemClock.uptimeMillis() + cjsVar.a);
            }
        } else if (i4 == 0) {
            cjs cjsVar2 = (cjs) qcbVar.a;
            cjsVar2.b.remove(this);
            if (cjsVar2.f == this) {
                cjsVar2.f = null;
            }
            if (cjsVar2.g == this) {
                cjsVar2.g = null;
            }
            aaf aafVar = cjsVar2.l;
            ?? r3 = aafVar.b;
            r3.remove(this);
            if (aafVar.a == this) {
                aafVar.a = null;
                if (!r3.isEmpty()) {
                    aafVar.a = (cjo) r3.iterator().next();
                    ((cjo) aafVar.a).i();
                }
            }
            Handler handler2 = cjsVar2.i;
            handler2.getClass();
            handler2.removeCallbacksAndMessages(this);
            cjsVar2.d.remove(this);
        }
        ((cjs) qcbVar.a).b();
    }
}
