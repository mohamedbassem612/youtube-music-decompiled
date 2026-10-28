package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrt extends vrk {
    public final acxt d;
    public final awmd e;
    private final Context f;
    private final acxn g;
    private final nuc h;
    private final xgn i;
    private FrameLayout j;
    private acxm k;
    private aczo l;
    private final vxz m;
    private final vxz n;
    private final wjr o;

    public vrt(Context context, acxt acxtVar, awmd awmdVar, acxn acxnVar, nuc nucVar, wjr wjrVar, vxz vxzVar, vxz vxzVar2, xgn xgnVar) {
        this.f = context;
        this.d = acxtVar;
        this.e = awmdVar;
        this.g = acxnVar;
        this.h = nucVar;
        this.o = wjrVar;
        this.m = vxzVar;
        this.n = vxzVar2;
        this.i = xgnVar;
    }

    private final void p() {
        acxm acxmVar = this.k;
        if (acxmVar != null) {
            acxmVar.d();
            this.k = null;
        }
    }

    @Override // defpackage.vox
    public final void c() {
        p();
        aczo aczoVar = this.l;
        if (aczoVar != null) {
            aczoVar.a();
        }
    }

    @Override // defpackage.vrk, defpackage.vro
    public final adxd g() {
        acxm acxmVar = this.k;
        if (acxmVar == null) {
            return null;
        }
        vrs vrsVar = new vrs(acxmVar);
        this.k = null;
        return vrsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, maw] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vrk, defpackage.vro
    public final /* bridge */ /* synthetic */ void j(Object obj, boolean z, adxd adxdVar) {
        aczo aczoVar;
        akrn akrnVar = (akrn) obj;
        if (akrnVar != null && akrnVar != this.b) {
            p();
        }
        super.j(akrnVar, z, adxdVar);
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            Context context = this.f;
            FrameLayout frameLayout2 = new FrameLayout(context);
            vxz vxzVar = this.n;
            if (!vxzVar.l(204, 45685365L, false) && !vxzVar.l(432, 45847339L, false)) {
                frameLayout2.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            }
            this.j = frameLayout2;
            frameLayout = frameLayout2;
        }
        frameLayout.getClass();
        if (akrnVar != null) {
            if (this.l == null) {
                oqe oqeVar = new oqe(this, 7);
                acxn acxnVar = this.g;
                nuc nucVar = this.h;
                int i = this.f.getResources().getDisplayMetrics().widthPixels;
                int i2 = aczo.g;
                aczn acznVar = new aczn(oqeVar, acxnVar, nucVar, i);
                acznVar.a(new oqe(this, 8), new vrr(0));
                this.l = new aczo(acznVar);
                if (this.m.l(83, 45765715L, false) && (aczoVar = this.l) != null) {
                    ?? r1 = this.o.a;
                    aczoVar.e = r1;
                    acxt acxtVar = aczoVar.d;
                    if (acxtVar != 0) {
                        acxtVar.d(r1);
                    }
                }
            }
            adly adlyVar = new adly();
            adlyVar.a(this.i);
            if (adxdVar instanceof vrs) {
                this.k = ((vrs) adxdVar).a;
            } else {
                this.k = this.g.a(akrnVar);
            }
            aczo aczoVar2 = this.l;
            aczoVar2.getClass();
            aczoVar2.b(frameLayout, adlyVar, this.k);
        }
    }

    @Override // defpackage.vro
    public final View k() {
        FrameLayout frameLayout = this.j;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.vro
    public final agev l() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final agev m() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }

    @Override // defpackage.vox
    public final void b() {
    }

    @Override // defpackage.vox
    public final void d() {
    }

    @Override // defpackage.vox
    public final void f() {
    }

    @Override // defpackage.vro
    public final void hP() {
    }

    @Override // defpackage.vro
    public final void o() {
    }

    @Override // defpackage.vro
    public final void q() {
    }

    @Override // defpackage.vro
    public final void r() {
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
    }
}
