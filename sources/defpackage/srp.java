package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srp extends advj implements srx {
    private final abfv A;
    private final lqa B;
    private final xsc C;
    public final vxe a;
    public amge b;
    public String c;
    public acjx d;
    public final adxv e;
    private final List m;
    private final tbt n;
    private final xgn o;
    private final acyx p;
    private final sry q;
    private final avmn r;
    private final stp s;
    private final acxn t;
    private Object u;
    private String v;
    private int w;
    private final vxz x;
    private final roq y;
    private final roq z;

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.List] */
    public srp(advb advbVar, tbt tbtVar, ttm ttmVar, roq roqVar, acyx acyxVar, lqa lqaVar, vxz vxzVar, vxz vxzVar2, roq roqVar2, xsc xscVar, sry sryVar, lqa lqaVar2, stp stpVar, lqa lqaVar3, aciz acizVar, acxn acxnVar, vxe vxeVar, vxz vxzVar3, wnf wnfVar, xgn xgnVar, adxd adxdVar, advq advqVar) {
        super(wnfVar, advbVar, tbtVar, ttmVar, xgnVar, adxd.a(adxdVar), vxzVar3);
        this.m = new ArrayList();
        this.y = roqVar;
        this.x = vxzVar;
        this.p = acyxVar;
        this.z = roqVar2;
        this.n = tbtVar;
        this.o = xgnVar;
        this.C = xscVar;
        this.q = sryVar;
        this.s = stpVar;
        this.B = lqaVar3;
        this.t = acxnVar;
        this.a = vxeVar;
        agkx agkxVar = new agkx();
        agkxVar.k(((agkz) sryVar.b).iterator());
        agkxVar.c(this);
        sryVar.b = agkxVar.g();
        sryVar.a(this);
        boolean z = adxdVar instanceof sro;
        this.e = acizVar.m(advqVar, z ? (sro) adxdVar : null);
        int i = 6;
        if (vxzVar.l(16, 45766495L, false)) {
            this.r = ((avlr) lqaVar2.a).af(new sqk(this, i));
        } else {
            this.r = null;
        }
        this.ao = new gnu(this, 3);
        if (z) {
            sro sroVar = (sro) adxdVar;
            this.v = sroVar.a;
            if (vxzVar2.k(45856076L, false)) {
                this.c = sroVar.b;
            }
            this.d = sroVar.c;
        }
        ((adty) this).f.e(new jeo(roqVar, 6));
        abfv abfvVar = new abfv();
        this.A = abfvVar;
        abfvVar.d(new advg());
        if (acyxVar != null) {
            Q(acyxVar);
            abfvVar.d(acyxVar);
        }
        roqVar2.a.add(this);
        lqaVar.a.clear();
    }

    private final Object S() {
        Object obj = this.u;
        if (obj != null) {
            return obj;
        }
        amge amgeVar = this.b;
        if (amgeVar != null) {
            int i = amgeVar.b;
            if ((i & 64) != 0) {
                akrn akrnVar = amgeVar.i;
                return akrnVar == null ? akrn.a : akrnVar;
            }
            if ((i & 4) != 0) {
                ajzb ajzbVar = amgeVar.e;
                return ajzbVar == null ? ajzb.a : ajzbVar;
            }
        }
        return null;
    }

    private final void T(List list, int i) {
        z();
        int i2 = this.b == null ? 0 : 1;
        adlr adlrVar = ((adty) this).f;
        int iA = adlrVar.a() - i2;
        int iMin = Math.min(iA, i);
        int iMax = Math.max(0, iA - iMin);
        int iMin2 = Math.min(iMax, list.size());
        int iMin3 = Math.min(iMin + i2, adlrVar.a());
        for (int i3 = 0; i3 < iMin2; i3++) {
            J(adlrVar.d(iMin3 + i3), list.get(i3));
        }
        if (iMax < list.size()) {
            G(list.subList(iMax, list.size()));
        } else if (iMax > list.size()) {
            int size = list.size() + iMin3;
            adlrVar.hL(size, adlrVar.a() - size);
        }
    }

    private final void U(wga wgaVar) {
        amge amgeVar = wgaVar.a.d;
        if (amgeVar == null) {
            amgeVar = amge.a;
        }
        int i = amgeVar.b;
        if ((i & 64) != 0) {
            akrn akrnVar = amgeVar.i;
            if (akrnVar == null) {
                akrnVar = akrn.a;
            }
            if (this.b == null) {
                F(akrnVar, 0);
            } else {
                J(S(), akrnVar);
            }
            aihf aihfVarCreateBuilder = amge.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amge amgeVar2 = (amge) aihfVarCreateBuilder.instance;
            akrnVar.getClass();
            amgeVar2.i = akrnVar;
            amgeVar2.b |= 64;
            this.b = (amge) aihfVarCreateBuilder.build();
            this.u = akrnVar;
            return;
        }
        if ((i & 4) != 0) {
            ajzb ajzbVar = amgeVar.e;
            if (ajzbVar == null) {
                ajzbVar = ajzb.a;
            }
            if (this.b == null) {
                F(ajzbVar, 0);
            } else {
                J(S(), ajzbVar);
            }
            aihf aihfVarCreateBuilder2 = amge.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amge amgeVar3 = (amge) aihfVarCreateBuilder2.instance;
            ajzbVar.getClass();
            amgeVar3.e = ajzbVar;
            amgeVar3.b |= 4;
            this.b = (amge) aihfVarCreateBuilder2.build();
            this.u = ajzbVar;
        }
    }

    @Override // defpackage.advj
    /* JADX INFO: renamed from: A */
    protected final void hs(wga wgaVar, acjx acjxVar) {
        acjw acjwVar = acjw.c;
        acjx acjxVarHQ = hQ(acjwVar);
        acjw acjwVar2 = acjw.b;
        acjx acjxVarHQ2 = hQ(acjwVar2);
        super.hs(wgaVar, acjxVar);
        if (wgaVar != null) {
            if (acjxVar.a() == acjwVar && acjxVarHQ2 != null && !o(acjwVar2)) {
                aH(acjxVarHQ2);
            } else {
                if (acjxVar.a() != acjwVar2 || acjxVarHQ == null || o(acjwVar)) {
                    return;
                }
                aH(acjxVarHQ);
            }
        }
    }

    public final void B(alnu alnuVar) {
        adxv adxvVar;
        alna alnaVar = null;
        if (this.x.l(16, 45766495L, false)) {
            int i = alnuVar.b;
            if ((i & SemanticState.Focused) != 0 && (adxvVar = this.e) != null) {
                xsc xscVar = this.C;
                if ((i & 4) != 0 && (alnaVar = alnuVar.f) == null) {
                    alnaVar = alna.a;
                }
                xscVar.W(alnaVar, agkj.j("sectionController", this), R.string.comment_added);
                apok apokVar = alnuVar.i;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                adxvVar.a(apokVar, new srm(2));
                return;
            }
        }
        alnv alnvVar = alnuVar.d;
        if (alnvVar == null) {
            alnvVar = alnv.a;
        }
        if (alnvVar.b != 153515154 || this.p == null) {
            return;
        }
        xsc xscVar2 = this.C;
        if ((alnuVar.b & 4) != 0 && (alnaVar = alnuVar.f) == null) {
            alnaVar = alna.a;
        }
        xscVar2.W(alnaVar, agkj.j("sectionController", this), R.string.comment_added);
        alnv alnvVar2 = alnuVar.d;
        if (alnvVar2 == null) {
            alnvVar2 = alnv.a;
        }
        akrn akrnVar = alnvVar2.b == 153515154 ? (akrn) alnvVar2.c : akrn.a;
        if ((akrnVar.b & 8) != 0) {
            this.o.d(new xgj(akrnVar.d.G()));
        }
        nsf.d(this.t.a(akrnVar), ((adty) this).f, this, this);
    }

    public final void C(int i) {
        if (this.w != 0) {
            int i2 = i + (this.b == null ? 0 : 1);
            adlr adlrVar = ((adty) this).f;
            ahno.O(i2 < adlrVar.a() && (adlrVar.d(i2) instanceof stc));
            adlrVar.hL(i2, Math.min(this.w, adlrVar.a() - i2));
            this.w = 0;
        }
    }

    @Override // defpackage.advj
    protected final void D(wga wgaVar, acjw acjwVar) {
        int iOrdinal = acjwVar.ordinal();
        if (iOrdinal == 2) {
            w(wgaVar);
        } else if (iOrdinal != 3) {
            v(wgaVar);
        } else {
            e(wgaVar);
        }
    }

    @Override // defpackage.advj
    public final void e(wga wgaVar) {
        tbt tbtVar = this.n;
        final int i = 0;
        if (tbtVar != null) {
            List list = this.m;
            tbtVar.j(list);
            list.clear();
            String str = wgaVar.a.i;
            if (str.startsWith("community-tab")) {
                final int i2 = 1;
                list.add(tbtVar.b(this, vvp.class, str, new tbu() { // from class: srl
                    @Override // defpackage.tbu
                    public final void a(Object obj) {
                        if (i2 != 0) {
                            throw null;
                        }
                        throw null;
                    }

                    @Override // defpackage.tbu
                    public final /* synthetic */ boolean b() {
                        return false;
                    }
                }));
                list.add(tbtVar.b(this, vvx.class, str, new tbu() { // from class: srl
                    @Override // defpackage.tbu
                    public final void a(Object obj) {
                        if (i != 0) {
                            throw null;
                        }
                        throw null;
                    }

                    @Override // defpackage.tbu
                    public final /* synthetic */ boolean b() {
                        return false;
                    }
                }));
            }
        }
        ((dov) ((wjr) this.B.a).a).ac(this);
        amgg amggVar = wgaVar.a;
        this.v = amggVar.i;
        this.c = amggVar.g;
        this.y.b();
        U(wgaVar);
        T(this.A.c(amggVar.e), 0);
        aI(wgaVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    @Override // defpackage.srx
    public final void h(alnr alnrVar) {
        alna alnaVar;
        adxv adxvVar = this.e;
        if (adxvVar != null) {
            int i = alnrVar.b;
            if ((i & 64) != 0) {
                if ((i & 16) == 0) {
                    xsc xscVar = this.C;
                    if ((alnrVar.b & 16) != 0) {
                        alnaVar = alnrVar.f;
                        if (alnaVar == null) {
                            alnaVar = alna.a;
                        }
                    } else {
                        alnaVar = null;
                    }
                    xscVar.W(alnaVar, agkj.j("sectionController", this), R.string.reply_added);
                } else {
                    alna alnaVar2 = alnrVar.f;
                    if (alnaVar2 == null) {
                        alnaVar2 = alna.a;
                    }
                    if (!alnaVar2.h) {
                        xsc xscVar2 = this.C;
                        if ((alnrVar.b & 16) != 0) {
                            alnaVar = alnrVar.f;
                            if (alnaVar == null) {
                                alnaVar = alna.a;
                            }
                        } else {
                            alnaVar = null;
                        }
                        xscVar2.W(alnaVar, agkj.j("sectionController", this), R.string.reply_added);
                    }
                }
                apok apokVar = alnrVar.g;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                adxvVar.a(apokVar, new srm(3));
            }
        }
    }

    @tcc
    public void handleCommentsStreamReloadEvent(adtd adtdVar) {
        ajzv ajzvVar = (ajzv) adtdVar.e;
        if (TextUtils.equals(ajzvVar.f, this.v)) {
            if ((ajzvVar.c & 16) == 0 || !ajzvVar.h) {
                int iAS = a.aS(ajzvVar.e);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i = iAS - 1;
                if (i == 1) {
                    ajzw ajzwVar = ajzvVar.d;
                    if (ajzwVar == null) {
                        ajzwVar = ajzw.a;
                    }
                    apho aphoVar = ajzwVar.c;
                    if (aphoVar == null) {
                        aphoVar = apho.a;
                    }
                    j(aphoVar, null);
                    return;
                }
                if (i != 2) {
                    ajzw ajzwVar2 = ajzvVar.d;
                    if (ajzwVar2 == null) {
                        ajzwVar2 = ajzw.a;
                    }
                    apho aphoVar2 = ajzwVar2.c;
                    if (aphoVar2 == null) {
                        aphoVar2 = apho.a;
                    }
                    iM(aawb.ae(aphoVar2));
                    return;
                }
                ajzw ajzwVar3 = ajzvVar.d;
                if (ajzwVar3 == null) {
                    ajzwVar3 = ajzw.a;
                }
                apho aphoVar3 = ajzwVar3.c;
                if (aphoVar3 == null) {
                    aphoVar3 = apho.a;
                }
                y(aphoVar3, Math.max(0, ajzvVar.g));
            }
        }
    }

    @Override // defpackage.advj
    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        super.handleHideEnclosingEvent(vvtVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleItemDismissedEvent(adve adveVar) {
        super.handleItemDismissedEvent(adveVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleRemoveItemEvent(vvu vvuVar) {
        super.handleRemoveItemEvent(vvuVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        super.handleServiceResponseRemoveEvent(wpxVar);
    }

    @Override // defpackage.advj, defpackage.adty, defpackage.adtv, defpackage.advw
    public final adxd hq() {
        return new sro(super.hq(), this.v, this.c, this.d);
    }

    @Override // defpackage.advj, defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        hs((wga) obj, acjxVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.advj, defpackage.adty, defpackage.adtv, defpackage.twn
    public final void i() {
        super.i();
        this.z.a.remove(this);
        agkx agkxVar = new agkx();
        sry sryVar = this.q;
        agqr it = ((agkz) sryVar.b).iterator();
        while (it.hasNext()) {
            srp srpVar = (srp) it.next();
            if (srpVar != this) {
                agkxVar.c(srpVar);
            }
        }
        sryVar.b = agkxVar.g();
        sryVar.d(this);
        this.s.c();
        this.B.z(this);
        Object obj = this.r;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
    }

    @Override // defpackage.advj, defpackage.adtb
    public final void j(apho aphoVar, ajwo ajwoVar) {
        z();
        if (((adty) this).f.a() != 0) {
            this.w = 0;
            T(agpi.a, 0);
        }
        iM(aawb.ae(aphoVar));
    }

    @Override // defpackage.advj
    public final String p() {
        return this.v;
    }

    @Override // defpackage.advj, defpackage.advp
    public final String q() {
        return this.c;
    }

    @Override // defpackage.adtv
    public final void t(List list) {
        aobx aobxVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acjx acjxVar = (acjx) it.next();
            if (!this.x.l(19, 45854010L, false) || (aobxVar = (aobx) aawb.ag(acjxVar, aobx.class)) == null || (aobxVar.b & 64) == 0 || aobxVar.g) {
                arrayList.add(acjxVar);
            } else {
                this.d = acjxVar;
            }
        }
        super.t(arrayList);
    }

    @Override // defpackage.advj
    public final void u(Object obj, int i) {
        F(obj, i + (this.b == null ? 0 : 1));
    }

    @Override // defpackage.advj
    protected final void v(wga wgaVar) {
        U(wgaVar);
        super.v(wgaVar);
    }

    @Override // defpackage.advj
    protected final void w(wga wgaVar) {
        U(wgaVar);
        aI(wgaVar.a());
        I(this.A.c(wgaVar.a.e), this.b == null ? 0 : 1);
    }

    @Override // defpackage.adty
    public final void x() {
        super.x();
        this.b = null;
        this.u = null;
        this.w = 0;
        this.B.z(this);
    }

    public final void y(apho aphoVar, int i) {
        if (this.w == 0) {
            this.y.b();
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < 10; i2++) {
                linkedList.add(new stc());
            }
            T(linkedList, i);
            this.w = 10;
        }
        aB(aawb.ae(aphoVar), new srn(this, i));
    }

    @Override // defpackage.adtv
    public final void z() {
        super.z();
        this.d = null;
    }
}
