package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icq implements jlf, abdz {
    static final abdj r;
    static final abdj s;
    static final abdj t;
    static final abdj u;
    static final abdj v;
    private static final agke y;
    private String A;
    private final abte B;
    public final abea a;
    public final aerv b;
    public wgi g;
    public byte[] h;
    public abnw i;
    public icp j;
    public boolean k;
    public String m;
    public String n;
    public String o;
    public String p;
    public final vxz w;
    public final vxz x;
    public final avmm c = new avmm();
    private boolean z = false;
    public boolean q = false;
    public final awkx f = new awkx();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final afx l = new afx(0);

    static {
        agke agkeVarT = agke.t(xhb.b(99176), xhb.b(99175), xhb.b(173811), xhb.b(173810));
        y = agkeVarT;
        r = new abdj(xhb.b(22156), xhb.b(36840), xhb.b(36841));
        s = new abdj(agke.s(xhb.b(22156), xhb.b(36840), xhb.b(36841)), agkeVarT);
        t = new hfv(xhb.b(22156), xhb.b(36840), xhb.b(36841), xhb.b(26627));
        u = new hfv(agke.t(xhb.b(22156), xhb.b(36840), xhb.b(36841), xhb.b(26627)), agkeVarT);
        v = new hft(new xhc[0]);
    }

    public icq(abea abeaVar, aerv aervVar, vxz vxzVar, vxz vxzVar2, abte abteVar) {
        this.a = abeaVar;
        this.b = aervVar;
        this.w = vxzVar;
        this.x = vxzVar2;
        this.B = abteVar;
    }

    private final abdj r() {
        return this.w.l(122, 45828708L, false) ? s : r;
    }

    @Override // defpackage.jlf
    public final void a() {
        this.a.q(abdi.g);
    }

    @Override // defpackage.jlf
    public final void b() {
        this.a.q(r());
    }

    public final String c(ajwo ajwoVar) {
        aoar aoarVar;
        if (ajwoVar == null) {
            return "";
        }
        if (fhz.ai(ajwoVar)) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aoarVar = (aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        } else {
            aoarVar = aoar.a;
        }
        return aoarVar.c;
    }

    public final void d(byte[] bArr) {
        this.l.add(bArr);
        e();
    }

    public final void e() {
        afw afwVar = new afw(this.l);
        while (afwVar.hasNext()) {
            f((byte[]) afwVar.next());
        }
    }

    public final void f(byte[] bArr) {
        if (bArr != null) {
            this.a.a().d(new xgj(bArr));
        }
        if (this.w.l(121, 45828707L, false)) {
            h(null);
        } else if (this.m != null) {
            this.a.a().r(this.m);
        }
    }

    public final void g(acjy acjyVar) {
        f(acjyVar.d());
    }

    public final void h(abdy abdyVar) {
        String str;
        if (!this.w.l(121, 45828707L, false) || (str = this.m) == null || TextUtils.equals(str, this.o)) {
            return;
        }
        if (abdyVar == null) {
            abdyVar = this.a.d();
        }
        if (abdyVar == null || !abdyVar.a(abdy.b)) {
            return;
        }
        this.a.a().r(this.m);
        this.o = this.m;
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        vxz vxzVar = this.w;
        if (vxzVar.l(121, 45828707L, false) && abdyVar == abdy.a && TextUtils.equals(this.m, this.o)) {
            n();
        }
        if (this.z && abdyVar.a(abdy.b)) {
            this.a.q(r());
            this.z = false;
        }
        if (vxzVar.l(121, 45828707L, false)) {
            h(abdyVar);
        }
    }

    public final void i() {
        if (this.w.l(75, 45733835L, false)) {
            abea abeaVar = this.a;
            v.a(abeaVar.a(), null, null);
            abeaVar.k(null);
        }
    }

    public final void j(ieg iegVar, boolean z) {
        int i;
        if (z) {
            i = 4;
        } else if (iegVar == null) {
            i = 7;
        } else {
            i = iegVar.a.isEmpty() ? 6 : 5;
        }
        q(i, 2);
    }

    public final void k(ieg iegVar) {
        agrx agrxVar = agso.a;
        agke agkeVar = iegVar.m;
        ajwo ajwoVar = iegVar.q;
        m(new icp(agkeVar, ajwoVar), c(ajwoVar));
    }

    public final void l(wgi wgiVar, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 9;
        } else if (wgiVar != null) {
            i = p(wgiVar) ? 11 : 10;
        } else {
            i = 12;
        }
        q(i, true != z2 ? 2 : 3);
    }

    public final void m(icp icpVar, String str) {
        this.j = icpVar;
        abdj abdjVar = this.w.l(122, 45828708L, false) ? u : t;
        abea abeaVar = this.a;
        abeaVar.q(abdjVar);
        this.z = true;
        if (!str.isEmpty()) {
            abeaVar.n(new abec(str, null));
        }
        this.l.addAll(icpVar.a);
    }

    public final void n() {
        String str;
        if (!this.w.l(121, 45828707L, false) || (str = this.m) == null) {
            return;
        }
        this.p = str;
        this.m = null;
    }

    public final void o() {
        this.A = this.B.a();
    }

    public final boolean p(wgi wgiVar) {
        aouj aoujVarAb = fhz.ab(wgiVar.a);
        if (aoujVarAb == null) {
            return true;
        }
        return aoujVarAb.g.isEmpty();
    }

    public final void q(int i, int i2) {
        xfh xfhVar = new xfh(i - 1, 77);
        aihf aihfVarCreateBuilder = anvr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anvr anvrVar = (anvr) aihfVarCreateBuilder.instance;
        anvrVar.c = i2 - 1;
        anvrVar.b |= 1;
        if (this.A == null) {
            this.A = this.B.a();
        }
        abte abteVar = this.B;
        aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
        anvr anvrVar2 = (anvr) aihfVarCreateBuilder.build();
        anvrVar2.getClass();
        akzkVar.p = anvrVar2;
        akzkVar.c |= 131072;
        xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
        abteVar.e(xfhVar, alai.FLOW_TYPE_MUSIC_QUEUE_RESTORATION, this.A);
    }
}
