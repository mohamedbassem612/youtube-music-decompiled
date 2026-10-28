package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aecp {
    public final aczo a;
    akrn b;
    private final adly c;
    private FrameLayout d;
    private boolean e;

    public aecp(Context context, awmd awmdVar, acxn acxnVar, nuc nucVar, ElementsServices elementsServices, abxu abxuVar, xgn xgnVar, amdd amddVar, boolean z) {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = aczo.g;
        aczn acznVar = new aczn(awmdVar, acxnVar, nucVar, i);
        acznVar.a(new glj(elementsServices, 14), new aeco(abxuVar, xgnVar, 0));
        acznVar.e = z;
        this.a = new aczo(acznVar);
        adly adlyVar = new adly();
        this.c = adlyVar;
        adlyVar.g(new HashMap());
        adlyVar.a(xgnVar);
        if (amddVar != null) {
            adlyVar.d = amddVar;
        }
    }

    public final void a() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.a.a();
    }

    public final void b(FrameLayout frameLayout) {
        View viewA;
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = frameLayout;
        aczo aczoVar = this.a;
        oso osoVar = aczoVar.c;
        if (osoVar == null || !aczoVar.f) {
            if (aczoVar.d == null) {
                aczoVar.d = (acxt) aczoVar.a.io();
                aczoVar.d.d(aczoVar.e);
            }
            viewA = aczoVar.d.a();
        } else {
            viewA = osoVar.a();
        }
        frameLayout.addView(viewA);
    }

    public final void c(akrn akrnVar) {
        if (this.e) {
            if (akrnVar != null && !akrnVar.equals(this.b)) {
                aczo aczoVar = this.a;
                FrameLayout frameLayout = this.d;
                frameLayout.getClass();
                aczoVar.b(frameLayout, this.c, aczoVar.b.a(akrnVar));
            }
            this.b = akrnVar;
            d(Boolean.valueOf(akrnVar != null));
        }
    }

    public final void d(Boolean bool) {
        if (this.d != null) {
            boolean zBooleanValue = bool.booleanValue();
            FrameLayout frameLayout = this.d;
            if (zBooleanValue) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        }
    }
}
