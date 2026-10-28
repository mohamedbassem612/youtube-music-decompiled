package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vos implements vny {
    public final xgn a;
    public akrn b;
    public acxm c;
    public vnr d;
    private final Context e;
    private final aunn f;
    private final acxt g;
    private final aeas h;
    private final amdd i;
    private final String j;
    private ViewGroup k;
    private View l;
    private avmn m;
    private mav n;
    private afzg o;
    private final vxz p;
    private final vxz q;

    public vos(Context context, acxt acxtVar, aeas aeasVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, vxz vxzVar, vxz vxzVar2, xgn xgnVar, amdd amddVar, akrn akrnVar, String str) {
        this.e = context;
        this.f = aunnVar;
        this.g = acxtVar;
        this.h = aeasVar;
        this.a = xgnVar;
        this.b = akrnVar;
        this.p = vxzVar;
        this.j = str;
        this.i = amddVar;
        this.q = vxzVar2;
        if (vxzVar.l(296, 45739301L, true)) {
            mav mavVar = (mav) ((wjr) aunnVar3.io()).a;
            this.n = mavVar;
            acxtVar.d(mavVar);
            this.o = (afzg) ((vwt) aunnVar2.io()).a;
        }
    }

    private final void t() {
        if (this.k == null) {
            this.k = (ViewGroup) LayoutInflater.from(this.e).inflate(R.layout.engagement_panel_elements_header, (ViewGroup) null, false);
        }
    }

    private final void u(boolean z) {
        String str;
        afzg afzgVar = this.o;
        if (afzgVar == null || (str = this.j) == null) {
            return;
        }
        Optional.empty();
        aihf aihfVarCreateBuilder = asdp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asdp asdpVar = (asdp) aihfVarCreateBuilder.instance;
        asdpVar.b |= 1;
        asdpVar.c = z;
        aihfVarCreateBuilder.copyOnWrite();
        asdp asdpVar2 = (asdp) aihfVarCreateBuilder.instance;
        asdpVar2.b |= 2;
        asdpVar2.d = str;
        afzf afzfVar = new afzf(Optional.of((asdp) aihfVarCreateBuilder.build()));
        aihf aihfVarCreateBuilder2 = asdq.a.createBuilder();
        Optional optional = afzfVar.a;
        adyu adyuVar = new adyu(aihfVarCreateBuilder2, 10);
        optional.isPresent();
        Object obj = adyuVar.a;
        Object obj2 = optional.get();
        aihf aihfVar = (aihf) obj;
        aihfVar.copyOnWrite();
        asdq asdqVar = (asdq) aihfVar.instance;
        asdqVar.c = (asdp) obj2;
        asdqVar.b |= 1;
        InstanceProxy instanceProxyD = afzgVar.d();
        afzh afzhVar = instanceProxyD instanceof afzi ? ((afzi) instanceProxyD).a : null;
        if (afzhVar != null) {
            afzhVar.a((asdq) aihfVarCreateBuilder2.build());
            return;
        }
        asdq asdqVar2 = (asdq) aihfVarCreateBuilder2.build();
        aigv aigvVar = aigv.a;
    }

    @Override // defpackage.vny
    public final View a() {
        return this.l;
    }

    @Override // defpackage.vny
    public final View b() {
        t();
        return this.k;
    }

    @Override // defpackage.vny
    public final /* synthetic */ View c(Context context) {
        return b();
    }

    @Override // defpackage.vny
    public final void d() {
        vxz vxzVar = this.p;
        afzg afzgVar = this.o;
        mav mavVar = this.n;
        if (!vxzVar.l(296, 45739301L, true) || afzgVar == null || mavVar == null || this.j == null) {
            return;
        }
        u(false);
    }

    @Override // defpackage.vny
    public final void e() {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (this.p.l(296, 45739301L, true)) {
                acxm acxmVar = this.c;
                if (acxmVar instanceof acxm) {
                    acxmVar.d();
                }
            }
            this.g.b(null);
        }
        if (this.q.l(329, 45801387L, false)) {
            this.h.b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vny
    public final void g() {
        xgj xgjVar = new xgj(this.b.d, (amud) null);
        xgn xgnVar = this.a;
        xgnVar.d(xgjVar);
        vxz vxzVar = this.p;
        afzg afzgVar = this.o;
        mav mavVar = this.n;
        if (vxzVar.l(296, 45739301L, true) && afzgVar != null && mavVar != null && this.j != null) {
            u(true);
        }
        if (this.c == null) {
            t();
            acxm acxmVarC = ((acyx) this.f.io()).c(this.b);
            int length = acxmVarC.c.length;
            ViewGroup viewGroup = this.k;
            if (length == 0) {
                viewGroup.setVisibility(8);
                return;
            }
            viewGroup.setVisibility(0);
            this.c = acxmVarC;
            adly adlyVar = new adly();
            adlyVar.g(new HashMap());
            adlyVar.a(xgnVar);
            amdd amddVar = this.i;
            if (amddVar != null) {
                adlyVar.d = amddVar;
            }
            acxt acxtVar = this.g;
            if (acxtVar.a().getParent() == null) {
                this.k.addView(acxtVar.a());
            }
            acxtVar.h(adlyVar, acxmVarC, false, false);
            if (this.l != null) {
                avmn avmnVar = this.m;
                if (avmnVar != 0 && !avmnVar.f()) {
                    avnr.b((AtomicReference) avmnVar);
                }
                this.m = this.h.d().af(new var(this, 19));
            }
        }
    }

    @Override // defpackage.vny
    public final void m(apji apjiVar) {
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akyv.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akyv.b);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                adly adlyVar = new adly();
                aeas aeasVar = this.h;
                aeasVar.hU(adlyVar, (akyv) objC);
                this.l = aeasVar.a();
                return;
            }
        }
        this.l = null;
        if (this.q.l(329, 45801387L, false)) {
            this.h.b(null);
        }
    }

    @Override // defpackage.vny
    public final boolean p() {
        return false;
    }

    @Override // defpackage.vny
    public final void q(vnr vnrVar) {
        this.d = vnrVar;
    }

    @Override // defpackage.vny
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.vny
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vny
    public final void i(boolean z) {
    }

    @Override // defpackage.vny
    public final void j(boolean z) {
    }

    @Override // defpackage.vny
    public final void k(aqaw aqawVar) {
    }

    @Override // defpackage.vny
    public final void l(voa voaVar) {
    }

    @Override // defpackage.vny
    public final void n(CharSequence charSequence) {
    }

    @Override // defpackage.vny
    public final void o(TextUtils.TruncateAt truncateAt) {
    }

    @Override // defpackage.vny
    public final void r(yhi yhiVar) {
    }

    @Override // defpackage.vny
    public final void s(yhi yhiVar) {
    }
}
