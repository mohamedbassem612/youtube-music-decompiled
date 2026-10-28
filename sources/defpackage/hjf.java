package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjf implements acdp {
    public final tun a;
    public final xgn b;
    public final aunn c;
    public final hje d;
    public final hji e;
    public final ilx f;
    public final aunn g;
    public final agkj h;
    public boolean i;
    public String j;
    public agke k;
    public agke l;
    private final hjc m;
    private final hjb n;
    private final hjm o;
    private final hjl p;
    private final hjh q;
    private final hjg r;
    private final hjj s;
    private final hjk t;
    private final avlh u;
    private final aunn v;
    private final avmm w;
    private final hjh x;

    public hjf(tun tunVar, xgn xgnVar, aunn aunnVar, hjc hjcVar, hjb hjbVar, hjm hjmVar, hjl hjlVar, hje hjeVar, hji hjiVar, hjh hjhVar, hjh hjhVar2, hjg hjgVar, hjj hjjVar, hjk hjkVar, ilx ilxVar, avlh avlhVar, aunn aunnVar2, aunn aunnVar3) {
        avlr avlrVarR;
        avmm avmmVar = new avmm();
        this.w = avmmVar;
        this.j = "MEDIA_BUTTON_PLACEMENT_SWAP_LIKE_FOR_SHUFFLE";
        agke agkeVar = agpi.a;
        this.k = agkeVar;
        this.l = agkeVar;
        this.a = tunVar;
        this.b = xgnVar;
        this.c = aunnVar;
        this.m = hjcVar;
        this.n = hjbVar;
        this.o = hjmVar;
        this.p = hjlVar;
        this.d = hjeVar;
        this.e = hjiVar;
        this.x = hjhVar;
        this.q = hjhVar2;
        this.r = hjgVar;
        this.s = hjjVar;
        this.t = hjkVar;
        this.f = ilxVar;
        this.u = avlhVar;
        this.v = aunnVar2;
        this.g = aunnVar3;
        HashMap map = new HashMap();
        map.put(hjcVar.e(), hjcVar);
        map.put(hjbVar.e(), hjbVar);
        map.put("waze.thumbUp", hjmVar);
        map.put("waze.thumbDown", hjlVar);
        map.put("loop_mode_action", hjeVar);
        map.put("shuffle_action", hjiVar);
        map.put("fast_forward_action", hjhVar);
        map.put("rewind_action", hjhVar2);
        map.put("playback_rate_action", hjgVar);
        map.put("skip_next_action", hjjVar);
        map.put("skip_previous_action", hjkVar);
        this.h = agkj.h(map);
        agrx agrxVar = agso.a;
        ((acdq) aunnVar.io()).w(this);
        avmmVar.b();
        avmn[] avmnVarArr = new avmn[2];
        vxz vxzVar = (vxz) aunnVar3.io();
        if (vxzVar.b >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vyo vyoVar = vxzVar.a;
        if (vyoVar == null) {
            avlrVarR = new awdh("");
            avnn avnnVar = atqp.l;
        } else {
            avlrVarR = vyoVar.d().K(new vvb(2)).r();
        }
        avmnVarArr[0] = avlrVarR.r().W((avmb) aunnVar2.io()).ag(new hjd(this, 2), new gfh(14));
        avmnVarArr[1] = avlhVar.i(new abwr(1)).p().al(new hjd(this, 3), new gfh(14));
        avmmVar.e(avmnVarArr);
        a(this.j, this.i);
    }

    private final void c(boolean z, String str) {
        boolean z2 = !z;
        this.o.f(z2);
        this.p.f(z2);
        boolean z3 = false;
        if (z && hgm.b(str)) {
            z3 = true;
        }
        this.m.f(z3);
        this.n.f(z3);
        boolean zD = ((acdq) this.c.io()).D();
        Boolean boolValueOf = Boolean.valueOf(zD);
        agrx agrxVar = agso.a;
        hjj hjjVar = this.s;
        boolValueOf.getClass();
        boolean zD2 = hgm.d(zD, z, str);
        boolean zH = hjjVar.h();
        hjjVar.a = zD2;
        if (zH != hjjVar.h()) {
            hjjVar.a();
        }
        hjk hjkVar = this.t;
        boolValueOf.getClass();
        boolean zE = hgm.e(zD, z, str);
        boolean zH2 = hjkVar.h();
        hjkVar.a = zE;
        if (zH2 != hjkVar.h()) {
            hjkVar.a();
        }
    }

    public final void a(String str, boolean z) {
        hjg hjgVar;
        agke agkeVarY;
        agrx agrxVar = agso.a;
        hjc hjcVar = this.m;
        hje hjeVar = this.d;
        hjm hjmVar = this.o;
        hjb hjbVar = this.n;
        hjl hjlVar = this.p;
        hjj hjjVar = this.s;
        hjk hjkVar = this.t;
        hji hjiVar = this.e;
        hjg hjgVar2 = this.r;
        agke agkeVarY2 = agke.y(hjcVar, hjmVar, hjiVar, hjeVar, hjbVar, hjlVar, hjgVar2, hjkVar, hjjVar);
        hjg hjgVar3 = hjgVar2;
        this.k = agkeVarY2;
        boolean z2 = true;
        if (TextUtils.equals(str, "MEDIA_BUTTON_PLACEMENT_SEEK_FOCUSED_SWAP_SKIP")) {
            hjh hjhVar = this.q;
            if (z) {
                agkeVarY = agke.y(hjgVar3, hjhVar, this.x, hjjVar, hjkVar, hjiVar, hjeVar, hjmVar, hjlVar);
            } else {
                hjgVar = hjgVar3;
                agkeVarY = agke.y(hjhVar, this.x, hjgVar, hjjVar, hjkVar, hjiVar, hjeVar, hjmVar, hjlVar);
                hjgVar3 = hjgVar;
                z2 = false;
            }
        } else {
            hjh hjhVar2 = this.q;
            if (z) {
                agkeVarY = agke.y(hjgVar3, hjhVar2, this.x, hjkVar, hjjVar, hjiVar, hjeVar, hjmVar, hjlVar);
            } else {
                hjgVar = hjgVar3;
                agkeVarY = agke.y(hjhVar2, this.x, hjgVar, hjkVar, hjjVar, hjiVar, hjeVar, hjmVar, hjlVar);
                hjgVar3 = hjgVar;
                z2 = false;
            }
        }
        this.l = agkeVarY;
        boolean zH = hjiVar.h();
        hjiVar.e = str;
        if (zH != hjiVar.h()) {
            hjiVar.a();
        }
        boolean zH2 = hjeVar.h();
        hjeVar.e = str;
        if (zH2 != hjeVar.h()) {
            hjeVar.a();
        }
        boolean zH3 = hjgVar3.h();
        hjgVar3.d = str;
        if (zH3 != hjgVar3.h()) {
            hjgVar3.f();
        }
        c(z2, str);
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 262144) != 0) {
            c(this.i, this.j);
        }
    }
}
