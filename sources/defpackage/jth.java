package defpackage;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.media3.decoder.CryptoConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jth implements cju {
    public final ckd a;
    public final bvi b;
    public final jte c;
    public jth d;
    final UUID e;
    final jtg f;
    public int g;
    protected jtf h;
    protected byte[] i;
    public byte[] j;
    public final zjd k;
    public final ywj l;
    public final String m;
    public final mgk n;
    public volatile eol o;
    private final byte[] p;
    private final String q;
    private final HashMap r;
    private final cfd s;
    private int t;
    private HandlerThread u;
    private CryptoConfig v;
    private cjt w;
    private final long x;
    private final ywn y;
    private final qcb z;

    public jth(UUID uuid, ckd ckdVar, byte[] bArr, String str, byte[] bArr2, HashMap map, yvk yvkVar, Looper looper, long j, int i, int i2, boolean z, jte jteVar, jth jthVar, qcb qcbVar, cfd cfdVar, ywn ywnVar, zjd zjdVar, ywj ywjVar, String str2, mgk mgkVar) {
        this.e = uuid;
        this.a = ckdVar;
        this.j = bArr2;
        this.r = map;
        yvkVar.n = yvq.a(ckdVar);
        this.c = jteVar;
        this.d = jthVar;
        this.z = qcbVar;
        this.x = j;
        this.s = cfdVar;
        this.y = ywnVar;
        this.k = zjdVar;
        this.l = ywjVar;
        this.m = str2;
        this.n = mgkVar;
        this.g = 2;
        this.b = new bvi();
        jtg jtgVar = new jtg(this, looper);
        this.f = jtgVar;
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.u = handlerThread;
        handlerThread.start();
        this.h = new jtf(this.u.getLooper(), ywnVar, z, yvkVar, jtgVar, i2, i);
        if (bArr2 == null) {
            this.p = bArr;
            this.q = str;
        } else {
            this.p = null;
            this.q = null;
        }
    }

    private final void v(int i, boolean z) {
        byte[] bArr = this.i;
        try {
            zjd zjdVar = this.k;
            zjdVar.n();
            eol eolVarP = this.a.p(bArr, this.j == null ? agke.q(new brz(brt.d, null, this.q, this.p)) : null, i, this.r);
            zjdVar.m();
            zjdVar.p();
            this.h.obtainMessage(1, z ? 1 : 0, 0, eolVarP).sendToTarget();
        } catch (Exception e) {
            j(e, true);
        }
    }

    @Override // defpackage.cju
    public final int a() {
        return this.g;
    }

    @Override // defpackage.cju
    public final CryptoConfig b() {
        return this.v;
    }

    @Override // defpackage.cju
    public final cjt c() {
        if (this.g == 1) {
            return this.w;
        }
        return null;
    }

    @Override // defpackage.cju
    public final Map d() {
        byte[] bArr = this.i;
        if (bArr == null) {
            return null;
        }
        return this.a.d(bArr);
    }

    @Override // defpackage.cju
    public final UUID e() {
        return this.e;
    }

    public final Integer f() {
        jte jteVar = this.c;
        if (jteVar == null) {
            return null;
        }
        return Integer.valueOf(jteVar.b);
    }

    public final void g(bvh bvhVar) {
        Iterator it = this.b.b().iterator();
        while (it.hasNext()) {
            bvhVar.a((aae) it.next());
        }
    }

    public final void h(boolean z) {
        long jMin;
        byte[] bArr = this.j;
        if (bArr == null) {
            v(1, z);
            return;
        }
        if (this.g != 4) {
            try {
                this.a.h(this.i, bArr);
            } catch (Exception e) {
                Log.e("YTDrmSession", "Error trying to restore Widevine keys.", e);
                i(e, 1);
                return;
            }
        }
        if (brt.d.equals(this.e)) {
            Pair pairF = auq.f(this);
            jMin = Math.min(((Long) pairF.first).longValue(), ((Long) pairF.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            v(2, z);
        } else {
            this.g = 4;
            g(new cjj(5));
        }
    }

    public final void i(Exception exc, int i) {
        this.w = new cjt(exc, exc instanceof jti ? 6003 : aup.l(exc, i));
        g(new cji(exc, 3));
        if (this.g != 4) {
            this.g = 1;
        }
    }

    public final void j(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            i(exc, true != z ? 2 : 1);
            return;
        }
        ywn ywnVar = this.y;
        zhv zhvVar = new zhv("provision");
        zhvVar.e = false;
        zhvVar.b = zhw.e;
        ywnVar.k(zhvVar.a());
        this.n.d(this);
    }

    public final void k() {
        if (this.g == 4) {
            this.g = 3;
            i(new ckk(), 2);
        }
    }

    public final void l() {
        try {
            eol eolVarO = this.a.o();
            this.o = eolVarO;
            this.h.obtainMessage(0, 1, 0, eolVarO).sendToTarget();
        } catch (RuntimeException e) {
            Log.e("YTDrmSession", "Error trying to get provision request.", e);
            i(e, 1);
        }
    }

    @Override // defpackage.cju
    public final boolean m() {
        return true;
    }

    @Override // defpackage.cju
    public final boolean n(String str) {
        return this.a.l(this.i, str);
    }

    @Override // defpackage.cju
    public final void o(aae aaeVar) {
        if (aaeVar != null) {
            this.b.c(aaeVar);
        }
        int i = this.t + 1;
        this.t = i;
        if (i != 1) {
            if (aaeVar != null) {
                aaeVar.p(this.g);
            }
        } else {
            if (this.g == 1 || !t(true)) {
                return;
            }
            if (this.d == null) {
                h(true);
            } else {
                jte jteVar = this.c;
                this.h.postDelayed(new ixe(this, 16), new Random().nextInt(jteVar != null ? jteVar.c * 500 : 60000));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.cju
    public final void p(aae aaeVar) {
        g(new cjj(4));
        if (aaeVar != null) {
            this.b.d(aaeVar);
        }
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            this.g = 0;
            jtg jtgVar = this.f;
            jtgVar.removeCallbacksAndMessages(null);
            this.h.removeCallbacksAndMessages(null);
            this.h = null;
            this.u.quit();
            this.u = null;
            this.v = null;
            this.w = null;
            this.o = null;
            byte[] bArr = this.i;
            if (bArr != null) {
                this.i = null;
                long j = this.x;
                if (j > 0) {
                    jtgVar.postDelayed(new jmi(this, bArr, 3), j);
                } else {
                    try {
                        this.a.e(bArr);
                    } catch (RuntimeException unused) {
                    }
                }
            }
            jtj jtjVar = (jtj) this.z.a;
            if (jtjVar.b == this) {
                jtjVar.b = null;
            }
            List list = jtjVar.a;
            list.remove(this);
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jth jthVar = (jth) arrayList.get(i2);
                jth jthVar2 = jthVar.d;
                if (jthVar2 == null) {
                    jthVar2 = jthVar;
                }
                if (jthVar2 == this && jthVar != this) {
                    jthVar.p(null);
                }
            }
            mgk mgkVar = jtjVar.k;
            ?? r0 = mgkVar.a;
            r0.remove(this);
            if (mgkVar.b == this) {
                mgkVar.b = null;
                if (!r0.isEmpty()) {
                    mgkVar.b = (jth) r0.iterator().next();
                    ((jth) mgkVar.b).l();
                }
            }
            list.size();
        }
    }

    public final boolean q(byte[] bArr) {
        return Arrays.equals(this.i, bArr);
    }

    public final boolean r() {
        int i = this.g;
        return i == 3 || i == 4;
    }

    public final boolean s() {
        return this.g == 4;
    }

    public final boolean t(boolean z) {
        if (r()) {
            return true;
        }
        try {
            zjd zjdVar = this.k;
            zjdVar.r();
            ckd ckdVar = this.a;
            this.i = ckdVar.m();
            zjdVar.q();
            ckdVar.j(this.i, this.s);
            this.v = ((cki) ckdVar).b(this.i);
            this.g = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                ywn ywnVar = this.y;
                zhv zhvVar = new zhv("provision");
                zhvVar.e = false;
                zhvVar.b = zhw.e;
                ywnVar.k(zhvVar.a());
                this.n.d(this);
            } else {
                i(e, 1);
            }
            return false;
        } catch (Exception e2) {
            i(e2, 1);
            return false;
        }
    }

    public final byte[] u() {
        jte jteVar = this.c;
        if (jteVar == null) {
            return null;
        }
        return jteVar.a;
    }
}
