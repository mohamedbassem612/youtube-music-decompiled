package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.HorizontalScrollView;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fha extends bdl {
    private static final Rect b = new Rect(0, 0, 1, 1);
    public fkl a;
    private final View c;
    private final axx d;

    public fha(View view, fkl fklVar, boolean z, int i) {
        super(view);
        this.c = view;
        this.a = fklVar;
        this.d = new fgz(this);
        view.setFocusable(z);
        int i2 = bac.a;
        view.setImportantForAccessibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [fiz, java.lang.Object] */
    public static fiz a(fvi fviVar) {
        ?? r0 = ((qx) fviVar.d.c).c;
        if (r0 == 0) {
            return null;
        }
        return r0;
    }

    private static fvi j(View view) {
        if (!(view instanceof ComponentHost)) {
            return null;
        }
        ComponentHost componentHost = (ComponentHost) view;
        for (int i = 0; i < componentHost.a(); i++) {
            fvi fviVarB = componentHost.b(i);
            if (fviVarB != null && fja.a(fviVarB).c()) {
                return fviVarB;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1.ak(a(r0)) > 0) goto L11;
     */
    @Override // defpackage.bdl, defpackage.axx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bcc getAccessibilityNodeProvider(android.view.View r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.c
            fvi r0 = j(r0)
            if (r0 == 0) goto L2f
            fja r1 = defpackage.fja.a(r0)
            fgy r1 = r1.c
            boolean r2 = r1.U()
            if (r2 == 0) goto L2f
            boolean r2 = defpackage.fna.M
            if (r2 == 0) goto L26
            fhd r2 = defpackage.fjr.a(r0)
            fiz r0 = a(r0)     // Catch: java.lang.Exception -> L2b
            int r0 = r1.ak(r0)     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L2f
        L26:
            bcc r3 = super.getAccessibilityNodeProvider(r4)
            goto L30
        L2b:
            r3 = move-exception
            defpackage.gzj.bv(r2, r3)
        L2f:
            r3 = 0
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fha.getAccessibilityNodeProvider(android.view.View):bcc");
    }

    @Override // defpackage.bdl
    protected final int getVirtualViewAt(float f, float f2) {
        fvi fviVarJ = j(this.c);
        if (fviVarJ == null) {
            return Integer.MIN_VALUE;
        }
        fgy fgyVar = fja.a(fviVarJ).c;
        fhd fhdVarA = fjr.a(fviVarJ);
        try {
            if (fgyVar.ak(a(fviVarJ)) == 0) {
                return Integer.MIN_VALUE;
            }
            Rect bounds = ((Drawable) fviVarJ.a).getBounds();
            int iAj = fgyVar.aj(((int) f) - bounds.left, ((int) f2) - bounds.top, a(fviVarJ));
            if (iAj >= 0) {
                return iAj;
            }
            return Integer.MIN_VALUE;
        } catch (Exception e) {
            gzj.bv(fhdVarA, e);
            return Integer.MIN_VALUE;
        }
    }

    @Override // defpackage.bdl
    protected final void getVisibleVirtualViews(List list) {
        fvi fviVarJ = j(this.c);
        if (fviVarJ != null) {
            fgy fgyVar = fja.a(fviVarJ).c;
            fhd fhdVarA = fjr.a(fviVarJ);
            try {
                int iAk = fgyVar.ak(a(fviVarJ));
                for (int i = 0; i < iAk; i++) {
                    list.add(Integer.valueOf(i));
                }
            } catch (Exception e) {
                gzj.bv(fhdVarA, e);
            }
        }
    }

    @Override // defpackage.bdl, defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        CharSequence charSequence;
        int i;
        String str;
        fip fipVar;
        fvi fviVarJ = j(this.c);
        fkl fklVar = this.a;
        if (fklVar != null && (fipVar = fklVar.B) != null) {
            axx axxVar = this.d;
            gzj.aS();
            if (fhz.d == null) {
                fhz.d = new acv();
            }
            acv acvVar = fhz.d;
            acvVar.b = view;
            acvVar.a = bbzVar;
            acvVar.c = axxVar;
            fipVar.b.n().z(fipVar, fhz.d);
            acv acvVar2 = fhz.d;
            acvVar2.b = null;
            acvVar2.a = null;
            acvVar2.c = null;
        } else if (fviVarJ != null) {
            super.onInitializeAccessibilityNodeInfo(view, bbzVar);
            fgy fgyVar = fja.a(fviVarJ).c;
            fhd fhdVar = ((fjr) fviVarJ.d.b).c;
            try {
                fgyVar.ao(view, bbzVar);
            } catch (Exception e) {
                gzj.bv(fhdVar, e);
            }
        } else {
            super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        }
        fkl fklVar2 = this.a;
        if (fklVar2 != null && (str = fklVar2.A) != null) {
            bbzVar.v(str);
        }
        fkl fklVar3 = this.a;
        if (fklVar3 != null && (i = fklVar3.I) != 0) {
            bbzVar.E(i == 1);
        }
        fkl fklVar4 = this.a;
        if (fklVar4 == null || (charSequence = fklVar4.b) == null) {
            return;
        }
        bbzVar.P(charSequence);
    }

    @Override // defpackage.bdl
    protected final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.bdl
    protected final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // defpackage.bdl
    protected final void onPopulateNodeForVirtualView(int i, bbz bbzVar) {
        View view = this.c;
        fvi fviVarJ = j(view);
        if (fviVarJ == null) {
            Log.e("ComponentAccessibility", "No accessible mount item found for view: ".concat(String.valueOf(String.valueOf(view))));
            bbzVar.z("");
            bbzVar.q(b);
            return;
        }
        Rect bounds = ((Drawable) fviVarJ.a).getBounds();
        fgy fgyVar = fja.a(fviVarJ).c;
        fhd fhdVarA = fjr.a(fviVarJ);
        bbzVar.v(fgyVar.getClass().getName());
        try {
            if (i >= fgyVar.ak(a(fviVarJ))) {
                Log.e("ComponentAccessibility", a.bR(i, "Received unrecognized virtual view id: "));
                bbzVar.z("");
                bbzVar.q(b);
            } else {
                fgyVar.ap(bbzVar, i, bounds.left, bounds.top, a(fviVarJ));
            }
        } catch (Exception e) {
            gzj.bv(fhdVarA, e);
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        fip fipVar;
        if (fna.N && i == 64) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof HorizontalScrollView) {
                    view.requestRectangleOnScreen(new Rect(0, 0, view.getWidth(), view.getHeight()));
                    break;
                }
            }
            i = 64;
        }
        fkl fklVar = this.a;
        if (fklVar == null || (fipVar = fklVar.C) == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        axx axxVar = this.d;
        gzj.aS();
        if (fhz.e == null) {
            fhz.e = new acb();
        }
        acb acbVar = fhz.e;
        acbVar.b = view;
        acbVar.a = i;
        acbVar.d = bundle;
        acbVar.c = axxVar;
        Object objZ = fipVar.b.n().z(fipVar, fhz.e);
        acb acbVar2 = fhz.e;
        acbVar2.b = null;
        acbVar2.a = 0;
        acbVar2.d = null;
        acbVar2.c = null;
        return objZ != null && ((Boolean) objZ).booleanValue();
    }
}
