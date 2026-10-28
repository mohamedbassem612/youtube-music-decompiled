package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vnw implements vnx {
    public final FrameLayout a;
    akrn b;
    public acxm c;
    public int d;
    public final vxz e;
    private final acxn f;
    private final acxt g;
    private final adly h;
    private final xgn i;
    private final Activity j;
    private int k = 0;
    private final vxz l;

    public vnw(Activity activity, acxt acxtVar, acxn acxnVar, vxz vxzVar, vxz vxzVar2, xgn xgnVar, amdd amddVar, vnv vnvVar) {
        this.j = activity;
        this.g = acxtVar;
        this.f = acxnVar;
        this.l = vxzVar;
        this.e = vxzVar2;
        this.i = xgnVar;
        vnt vntVar = new vnt(activity, vnvVar);
        this.a = vntVar;
        vntVar.setVisibility(8);
        vntVar.addView(acxtVar.a());
        adly adlyVar = new adly();
        this.h = adlyVar;
        adlyVar.g(new HashMap());
        adlyVar.a(xgnVar);
        if (amddVar != null) {
            adlyVar.d = amddVar;
        }
    }

    private final void i() {
        acxm acxmVar = this.c;
        if (acxmVar != null) {
            acxmVar.d();
            this.c = null;
        }
    }

    private final void j() {
        akrn akrnVar = this.b;
        FrameLayout frameLayout = this.a;
        if (akrnVar == null) {
            frameLayout.setVisibility(8);
            return;
        }
        tym.h(frameLayout, tym.g(-1, -2), FrameLayout.LayoutParams.class);
        tym.h(frameLayout, new tyj(80, 1, null), FrameLayout.LayoutParams.class);
        frameLayout.setVisibility(0);
    }

    @Override // defpackage.vnx
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.vox
    public final void b() {
        d();
    }

    @Override // defpackage.vox
    public final void c() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        if (this.l.l(182, 45834706L, false)) {
            i();
        }
        this.g.b(null);
    }

    @Override // defpackage.vox
    public final void d() {
        Window window = this.j.getWindow();
        if (window != null) {
            window.setSoftInputMode(this.k);
            this.k = 0;
        }
        this.a.setVisibility(8);
    }

    @Override // defpackage.vox
    public final void f() {
        akrn akrnVar = this.b;
        if (akrnVar != null) {
            this.i.d(new xgj(akrnVar.d, (amud) null));
        }
        Window window = this.j.getWindow();
        if (window != null) {
            int i = this.d;
            if (i == 0 || i != 2) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    this.k = attributes.softInputMode;
                }
                window.setSoftInputMode(32);
            } else {
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                if (attributes2 != null) {
                    this.k = attributes2.softInputMode;
                }
                window.setSoftInputMode(16);
            }
        }
        j();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @Override // defpackage.vnx
    public final /* synthetic */ void g(Object obj, adwq adwqVar, adxd adxdVar) {
        akrn akrnVar;
        acxm acxmVarA;
        aksk akskVar = (aksk) obj;
        if (akskVar == null) {
            akrnVar = null;
        } else {
            apji apjiVar = akskVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = akskVar.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                akrnVar = null;
            }
        }
        if (!Objects.equals(akrnVar, this.b)) {
            if (this.l.l(182, 45834706L, false) && this.b != null) {
                i();
                this.g.b(null);
            }
            if (akrnVar != null) {
                if (adwqVar != null) {
                    maw mawVar = adwqVar.a;
                    if (mawVar != null) {
                        this.g.d(mawVar);
                    } else {
                        agfr agfrVar = adwqVar.b;
                        if (agfrVar != null) {
                            this.g.e(agfrVar);
                        }
                    }
                }
                if (this.e.l(412, 45835819L, false) && (adxdVar instanceof vnu)) {
                    acxmVarA = ((vnu) adxdVar).a;
                    this.c = acxmVarA;
                } else {
                    acxmVarA = this.f.a(akrnVar);
                    this.c = acxmVarA;
                }
                this.g.h(this.h, acxmVarA, false, false);
            }
        }
        this.b = akrnVar;
        j();
    }

    @Override // defpackage.vnx
    public final boolean h(apji apjiVar) {
        return false;
    }

    @Override // defpackage.vox
    public final /* synthetic */ void e() {
    }
}
