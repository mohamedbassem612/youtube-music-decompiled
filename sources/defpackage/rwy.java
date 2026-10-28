package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, c = {shr.class, sin.class})
public final class rwy implements rxj, rta {
    public rtb a;
    public int b = 1;
    private final smr c;
    private final sko d;
    private final rsr e;
    private final List f;
    private final List g;
    private final tun h;
    private final saq i;
    private final vyo j;
    private final rsk k;
    private final ruk l;
    private final wxh m;
    private final abnc n;
    private final ayq o;

    public rwy(rsk rskVar, smr smrVar, sko skoVar, rtb rtbVar, rsr rsrVar, ruk rukVar, wxh wxhVar, tun tunVar, saq saqVar, vyo vyoVar, ayq ayqVar, abnc abncVar) {
        this.k = rskVar;
        this.c = smrVar;
        this.d = skoVar;
        this.a = rtbVar;
        this.e = rsrVar;
        this.l = rukVar;
        this.f = (List) skoVar.d(shr.class);
        this.g = (List) skoVar.d(sin.class);
        this.m = wxhVar;
        this.h = tunVar;
        this.i = saqVar;
        this.o = ayqVar;
        this.j = vyoVar;
        this.n = abncVar;
    }

    private final boolean h() {
        wxg wxgVarA = this.m.a();
        long j = wxgVarA.a;
        long j2 = wxgVarA.b;
        long j3 = wxgVarA.c;
        long jMin = Math.min(j, Math.min(j2, j3));
        long jX = taq.X(this.j);
        if (jMin == j && jMin < jX) {
            return true;
        }
        if (jMin == j2 && jMin < jX) {
            return true;
        }
        if (jMin == j3) {
            long jA = wxgVarA.a();
            tun tunVar = this.h;
            long jB = tunVar.c.b();
            long j4 = tunVar.a;
            if ((j4 != -1 ? jB - j4 : -1L) >= jA) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rxj
    public final void M() {
        vyo vyoVar = this.j;
        if (taq.au(vyoVar)) {
            sko skoVar = this.d;
            if (skoVar.b == aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_ONE_BUTTON) {
                rsr rsrVar = this.e;
                smr smrVar = this.c;
                if (!Objects.equals(rsrVar.d(), smrVar.e(sic.class) ? (String) smrVar.d(sic.class) : null)) {
                    this.k.u(smrVar, skoVar, new sas("Current content CPN does not match request-time content CPN", 52), 10);
                    return;
                }
            }
        }
        sko skoVar2 = this.d;
        if (skoVar2.b == aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_ONE_BUTTON && h()) {
            smr smrVar2 = this.c;
            if (!nrj.l(smrVar2) && !nrj.m(smrVar2)) {
                this.k.u(smrVar2, skoVar2, new sas("Exited layout when engagement panel is in state of high engagement", 119), 10);
                return;
            }
        }
        smr smrVar3 = this.c;
        boolean zM = nrj.m(smrVar3);
        aiie aiieVar = afxw.e(vyoVar).R;
        int i = afxw.e(vyoVar).S;
        if (zM) {
            aiieVar.isEmpty();
        }
        if (afxw.e(vyoVar).Q && nrj.l(smrVar3)) {
            try {
                rtb rtbVar = this.a;
                if (rtbVar != null && rtbVar.d()) {
                    this.i.ab(this.d, 6);
                    return;
                }
            } catch (rso e) {
                rmp.m(this.c, this.d, "[BelowPlayerImmersiveAdLayoutRenderingAdapter] Could not get EP visibility ".concat(String.valueOf(e.getMessage())));
            }
        }
        smr smrVar4 = this.c;
        if ((nrj.l(smrVar4) || nrj.m(smrVar4)) && h()) {
            this.i.ab(this.d, 6);
        } else if (this.a != null) {
            f();
        } else {
            rmp.m(smrVar4, this.d, "[BelowPlayerImmersiveAdLayoutRenderingAdapter]Pending entering layout due to missing adsEngagementPanelApi");
            this.b = 2;
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        rtb rtbVar = this.a;
        if (rtbVar != null) {
            try {
                rtbVar.a(this.g);
            } catch (IllegalStateException | rso e) {
                rmp.m(this.c, this.d, e.getMessage());
            }
            this.b = 4;
            this.a = null;
            this.k.d(this.c, this.d, i);
            return;
        }
        smr smrVar = this.c;
        sko skoVar = this.d;
        rmp.m(smrVar, skoVar, "[BelowPlayerImmersiveAdLayoutRenderingAdapter]Failed to stop rendering, no adsEngagementPanelApi available");
        if (this.o.U()) {
            this.b = 4;
            this.k.d(smrVar, skoVar, i);
        }
    }

    @Override // defpackage.rxj
    public final void S() {
        this.a = null;
        this.b = 5;
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final void f() {
        String string;
        try {
            rtb rtbVar = this.a;
            rtbVar.getClass();
            rtbVar.b(this.f, (amco) this.d.n.f());
            sko skoVar = this.d;
            if (skoVar.e(sjv.class) && skoVar.e(sjt.class)) {
                smr smrVar = this.c;
                if (nrj.l(smrVar) || nrj.m(smrVar)) {
                    this.l.a((ajwo) skoVar.d(sjv.class), (Map) skoVar.d(sjt.class));
                } else {
                    vyo vyoVar = this.j;
                    if (!taq.ap(vyoVar) || !taq.be(vyoVar, this.n, nrj.g(smrVar, skoVar))) {
                        this.l.a((ajwo) skoVar.d(sjv.class), (Map) skoVar.d(sjt.class));
                    }
                }
            }
            this.b = 3;
            this.k.b(this.c, skoVar);
        } catch (rso e) {
            smr smrVar2 = this.c;
            if (smrVar2.c() == aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) {
                aixg aixgVar = this.d.b;
                if (aixgVar == aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_ONE_BUTTON) {
                    int i = e.a;
                    string = i != 0 ? Integer.toString(i - 1) : "null";
                    rmp.j(null, "[BelowPlayerImmersiveAdLayoutRenderingAdapter] PanelImageCarouselCardOneButton exception in enterLayout()" + string + e.getMessage());
                } else if (aixgVar == aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_BUTTON_GROUP) {
                    int i2 = e.a;
                    string = i2 != 0 ? Integer.toString(i2 - 1) : "null";
                    rmp.j(null, "[BelowPlayerImmersiveAdLayoutRenderingAdapter] PanelImageCarouselCardButtonGroup exception in enterLayout()" + string + e.getMessage());
                } else if (aixgVar == aixg.LAYOUT_TYPE_PANEL_IMAGE_GRID_BUTTON) {
                    int i3 = e.a;
                    string = i3 != 0 ? Integer.toString(i3 - 1) : "null";
                    rmp.j(null, "[BelowPlayerImmersiveAdLayoutRenderingAdapter] PanelImageGridButton exception in enterLayout()" + string + e.getMessage());
                }
            }
            this.k.u(smrVar2, this.d, new sas(e.getMessage(), e.a), 10);
        }
    }

    public final boolean g() {
        int i = this.b;
        boolean z = i == 5;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    @Override // defpackage.rxj
    public final void b() {
    }
}
