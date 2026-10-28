package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjs implements cjz {
    public final long a;
    public final List b;
    public final Set c;
    public final Set d;
    public int e;
    public cjo f;
    public cjo g;
    public Looper h;
    public Handler i;
    public byte[] j;
    public volatile cjp k;
    public final aaf l;
    private final UUID n;
    private final ckm o;
    private final HashMap p;
    private final int[] q;
    private final crj r;
    private ckd s;
    private cfd t;
    private final qcb u;

    public cjs(UUID uuid, ckm ckmVar, HashMap map, int[] iArr, crj crjVar) {
        ahno.G(!brt.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.o = ckmVar;
        this.p = map;
        this.q = iArr;
        this.r = crjVar;
        this.l = new aaf();
        this.u = new qcb(this);
        this.b = new ArrayList();
        this.c = ahng.ak();
        this.d = ahng.ak();
        this.a = 300000L;
    }

    private static List i(bsa bsaVar, UUID uuid, boolean z) {
        int i = bsaVar.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            brz brzVarA = bsaVar.a(i2);
            if ((brzVarA.c(uuid) || (brt.c.equals(uuid) && brzVarA.c(brt.b))) && (brzVarA.d != null || z)) {
                arrayList.add(brzVarA);
            }
        }
        return arrayList;
    }

    private final synchronized void j(Looper looper) {
        Looper looper2 = this.h;
        if (looper2 == null) {
            this.h = looper;
            this.i = new Handler(looper);
        } else {
            ahno.O(looper2 == looper);
            this.i.getClass();
        }
    }

    private final void k() {
        agqr it = agkz.n(this.d).iterator();
        while (it.hasNext()) {
            ((cju) it.next()).p(null);
        }
    }

    private final void l() {
        agqr it = agkz.n(this.c).iterator();
        while (it.hasNext()) {
            ((cjr) it.next()).a();
        }
    }

    private final void m(boolean z) {
        if (z && this.h == null) {
            bvx.f("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.h;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            bvx.f("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.h.getThread().getName(), new IllegalStateException());
        }
    }

    private static boolean n(cju cjuVar) {
        if (cjuVar.a() != 1) {
            return false;
        }
        cjt cjtVarC = cjuVar.c();
        cjtVarC.getClass();
        Throwable cause = cjtVarC.getCause();
        return (cause instanceof ResourceBusyException) || aup.n(cause);
    }

    private final cjo o(List list, boolean z, aae aaeVar) {
        ckd ckdVar = this.s;
        ckdVar.getClass();
        byte[] bArr = this.j;
        Looper looper = this.h;
        looper.getClass();
        cfd cfdVar = this.t;
        cfdVar.getClass();
        crj crjVar = this.r;
        HashMap map = this.p;
        ckm ckmVar = this.o;
        cjo cjoVar = new cjo(this.n, ckdVar, this.l, this.u, list, true, z, bArr, map, ckmVar, looper, crjVar, cfdVar);
        cjoVar.o(aaeVar);
        cjoVar.o(null);
        return cjoVar;
    }

    private final cjo p(List list, boolean z, aae aaeVar, boolean z2) {
        cjo cjoVarO = o(list, z, aaeVar);
        if (n(cjoVarO) && !this.d.isEmpty()) {
            k();
            q(cjoVarO, aaeVar);
            cjoVarO = o(list, z, aaeVar);
        }
        if (!n(cjoVarO) || !z2 || this.c.isEmpty()) {
            return cjoVarO;
        }
        l();
        if (!this.d.isEmpty()) {
            k();
        }
        q(cjoVarO, aaeVar);
        return o(list, z, aaeVar);
    }

    private static final void q(cju cjuVar, aae aaeVar) {
        cjuVar.p(aaeVar);
        cjuVar.p(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ("cens".equals(r4) != false) goto L26;
     */
    @Override // defpackage.cjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.bse r5) {
        /*
            r4 = this;
            r0 = 0
            r4.m(r0)
            ckd r1 = r4.s
            r1.getClass()
            int r1 = r1.a()
            bsa r2 = r5.u
            if (r2 != 0) goto L21
            java.lang.String r5 = r5.q
            int r5 = defpackage.bsy.b(r5)
            int[] r4 = r4.q
            int r4 = defpackage.bwp.s(r4, r5)
            r5 = -1
            if (r4 == r5) goto L78
            goto L77
        L21:
            byte[] r5 = r4.j
            if (r5 != 0) goto L77
            java.util.UUID r4 = r4.n
            r5 = 1
            java.util.List r3 = i(r2, r4, r5)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L51
            int r3 = r2.c
            if (r3 != r5) goto L75
            brz r0 = r2.a(r0)
            java.util.UUID r3 = defpackage.brt.b
            boolean r0 = r0.c(r3)
            if (r0 == 0) goto L75
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "DefaultDrmSessionMgr"
            defpackage.bvx.e(r0, r4)
        L51:
            java.lang.String r4 = r2.b
            if (r4 == 0) goto L77
            java.lang.String r0 = "cenc"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "cbcs"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "cbc1"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L75
            java.lang.String r0 = "cens"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L77
        L75:
            r0 = r5
            goto L78
        L77:
            r0 = r1
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjs.a(bse):int");
    }

    public final void b() {
        if (this.s != null && this.e == 0 && this.b.isEmpty() && this.c.isEmpty()) {
            ckd ckdVar = this.s;
            ckdVar.getClass();
            ckdVar.g();
            this.s = null;
        }
    }

    @Override // defpackage.cjz
    public final void c() {
        ckd ckaVar;
        m(true);
        int i = this.e;
        this.e = i + 1;
        if (i != 0) {
            return;
        }
        if (this.s == null) {
            UUID uuid = this.n;
            try {
                ckaVar = cki.r(uuid);
            } catch (cko unused) {
                bvx.c("FrameworkMediaDrm", a.cn((byte) 46, uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: "));
                ckaVar = new cka();
            }
            this.s = ckaVar;
            ckaVar.i(new zag(this, 1));
            return;
        }
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 >= list.size()) {
                return;
            }
            ((cjo) list.get(i2)).o(null);
            i2++;
        }
    }

    @Override // defpackage.cjz
    public final void d() {
        m(true);
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            ArrayList arrayList = new ArrayList(this.b);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((cjo) arrayList.get(i2)).p(null);
            }
            l();
            b();
        }
    }

    @Override // defpackage.cjz
    public final void e(Looper looper, cfd cfdVar) {
        j(looper);
        this.t = cfdVar;
    }

    @Override // defpackage.cjz
    public final cju f(aae aaeVar, bse bseVar) {
        m(false);
        ahno.O(this.e > 0);
        Looper looper = this.h;
        looper.getClass();
        return g(looper, aaeVar, bseVar, true);
    }

    public final cju g(Looper looper, aae aaeVar, bse bseVar, boolean z) {
        if (this.k == null) {
            this.k = new cjp(this, looper);
        }
        bsa bsaVar = bseVar.u;
        List listI = null;
        if (bsaVar == null) {
            int iB = bsy.b(bseVar.q);
            ckd ckdVar = this.s;
            ckdVar.getClass();
            if (ckdVar.a() == 2) {
                int i = bst.a;
                if (cke.a) {
                    return null;
                }
            }
            if (bwp.s(this.q, iB) == -1 || ckdVar.a() == 1) {
                return null;
            }
            cjo cjoVar = this.f;
            if (cjoVar == null) {
                cjo cjoVarP = p(agpi.a, true, null, z);
                this.b.add(cjoVarP);
                this.f = cjoVarP;
            } else {
                cjoVar.o(null);
            }
            return this.f;
        }
        if (this.j == null) {
            UUID uuid = this.n;
            listI = i(bsaVar, uuid, false);
            if (listI.isEmpty()) {
                cjq cjqVar = new cjq(uuid);
                bvx.d("DefaultDrmSessionMgr", "DRM error", cjqVar);
                if (aaeVar != null) {
                    aaeVar.q(cjqVar);
                }
                return new ckb(new cjt(cjqVar, 6003));
            }
        }
        cjo cjoVar2 = this.g;
        if (cjoVar2 != null) {
            cjoVar2.o(aaeVar);
            return cjoVar2;
        }
        cjo cjoVarP2 = p(listI, false, aaeVar, z);
        this.g = cjoVarP2;
        this.b.add(cjoVarP2);
        return cjoVarP2;
    }

    @Override // defpackage.cjz
    public final cjy h(aae aaeVar, bse bseVar) {
        ahno.O(this.e > 0);
        this.h.getClass();
        cjr cjrVar = new cjr(this, aaeVar);
        Handler handler = cjrVar.c.i;
        handler.getClass();
        handler.post(new cfv(cjrVar, bseVar, 8));
        return cjrVar;
    }
}
