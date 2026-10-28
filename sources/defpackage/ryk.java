package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryk extends ryj {
    public rtb a;
    public int b;
    public final rmp c;
    private List g;
    private List h;
    private final tun i;
    private final vyo j;
    private final spv k;
    private aitm l;
    private final ruk m;
    private final wxh n;
    private final abnc o;
    private final ryp p;

    public ryk(smr smrVar, sko skoVar, rsk rskVar, ruk rukVar, wxh wxhVar, tun tunVar, rmp rmpVar, vyo vyoVar, ryp rypVar, spv spvVar, abnc abncVar) {
        super(smrVar, skoVar, rskVar);
        this.a = null;
        this.m = rukVar;
        this.n = wxhVar;
        this.i = tunVar;
        this.c = rmpVar;
        this.j = vyoVar;
        this.b = 1;
        this.p = rypVar;
        this.k = spvVar;
        this.o = abncVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    private final void e() {
        ajwo ajwoVar;
        aitm aitmVar = this.l;
        List list = this.g;
        if (aitmVar == null) {
            rmp.m(this.d, this.e, "[BelowPlayerImmersiveRenderingAdapter#enterLayout] adEngagementPanelsRenderer is null");
            return;
        }
        if (list == null) {
            rmp.m(this.d, this.e, "[BelowPlayerImmersiveRenderingAdapter#enterLayout] adsEngagementPanels is null");
            return;
        }
        rtb rtbVar = this.a;
        if (rtbVar == null) {
            rmp.m(this.d, this.e, "[BelowPlayerImmersiveRenderingAdapter#enterLayout] adsEngagementPanelApi is null");
            return;
        }
        try {
            rtbVar.b(list, (amco) this.e.n.f());
            if ((aitmVar.b & 1) != 0) {
                smr smrVar = this.d;
                if (nrj.l(smrVar) || nrj.m(smrVar)) {
                    ruk rukVar = this.m;
                    ajwoVar = aitmVar.d;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    rukVar.a(ajwoVar, null);
                } else {
                    vyo vyoVar = this.j;
                    if (!taq.ap(vyoVar) || !taq.be(vyoVar, this.o, nrj.g(smrVar, this.e))) {
                        ruk rukVar2 = this.m;
                        ajwoVar = aitmVar.d;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        rukVar2.a(ajwoVar, null);
                    }
                }
            }
            this.b = 3;
            this.f.b(this.d, this.e);
        } catch (rso e) {
            int i = e.a;
            if (i == 0) {
                throw null;
            }
            rmp.j(null, "[BelowPlayerImmersiveRenderingAdapter] exception in enterLayout() " + afxw.aC(i) + e.getMessage());
            this.f.u(this.d, this.e, new sas(ahno.Z(e.getMessage()), i), 10);
        }
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        rtb rtbVar = this.a;
        if (rtbVar == null) {
            rmp.m(this.d, this.e, "[BelowPlayerImmersiveRenderingAdapter]Failed to stop rendering, no adsEngagementPanelApi available");
            return;
        }
        try {
            List list = this.h;
            if (list != null) {
                rtbVar.a(list);
            }
        } catch (IllegalStateException | rso e) {
            rmp.m(this.d, this.e, ahno.Z(e.getMessage()));
        }
        this.b = 4;
        this.f.d(this.d, this.e, i);
    }

    @Override // defpackage.ryj
    public final void a() {
        String str;
        int i;
        ryp rypVar = this.p;
        rypVar.q.add(this);
        rtb rtbVar = rypVar.r;
        if (rtbVar != null) {
            d(rtbVar);
        }
        sko skoVar = this.e;
        Optional optionalJ = skoVar.p.j();
        if (optionalJ.isPresent()) {
            apji apjiVar = (apji) optionalJ.get();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = (apji) optionalJ.get();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aitn.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                aitm aitmVar = (aitm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                this.l = aitmVar;
                aiie aiieVar = aitmVar.c;
                this.g = aiieVar;
                if (aiieVar.isEmpty()) {
                    this.f.u(this.d, skoVar, new sas("AdEngagementPanelsList is empty in the layout server rendering content.", 3), 16);
                    return;
                }
                List<akuf> list = this.g;
                smr smrVar = this.d;
                vyo vyoVar = this.j;
                ArrayList arrayList = new ArrayList();
                for (akuf akufVar : list) {
                    int i2 = akufVar.b;
                    akuj akujVar = i2 == 138681066 ? i2 == 138681066 ? (akuj) akufVar.c : akuj.b : null;
                    if (akujVar == null) {
                        str = null;
                    } else {
                        int i3 = akujVar.e;
                        str = i3 == 1 ? i3 == 1 ? (String) akujVar.f : "" : null;
                        if (str == null) {
                            rmp.n(null, "[BelowPlayerImmersiveRenderingAdapter] Ad engagement panel has no panel ID.");
                            str = null;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        rmp.n(null, "[BelowPlayerImmersiveRenderingAdapter] Missing panel ID for ads engagement panel. Slot id: ".concat(smrVar.a));
                    } else {
                        if (taq.aw(vyoVar) && (i = akufVar.b) == 138681066) {
                            if (((i == 138681066 ? (akuj) akufVar.c : akuj.b).c & 67108864) == 0) {
                            }
                        }
                        arrayList.add(str);
                    }
                }
                this.h = arrayList;
                return;
            }
        }
        this.f.u(this.d, skoVar, new sas("AdEngagementPanelsRenderer is not present in the layout server rendering content.", 3), 16);
    }

    @Override // defpackage.ryj
    public final void b() {
        if (this.a == null) {
            this.b = 2;
        } else {
            e();
        }
    }

    public final void d(rtb rtbVar) {
        rtb rtbVar2 = this.a;
        if (rtbVar2 != null && !Objects.equals(rtbVar2, rtbVar)) {
            rmp.n(null, "[BelowPlayerImmersiveRenderingAdapter#onEngagementPanelApiRegistered]Received mismatching registration request for adsEngagementPanelApi");
        }
        this.a = rtbVar;
        if (this.b == 2) {
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if ((r7 != -1 ? r5 - r7 : -1) >= r2) goto L25;
     */
    @Override // defpackage.ryj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryk.s():void");
    }

    @Override // defpackage.ryj
    public final void t() {
        this.a = null;
        this.p.q.remove(this);
    }
}
