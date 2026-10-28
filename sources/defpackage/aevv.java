package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevv extends aevq {
    private final Boolean a;
    private final bbn b;
    private Window c;
    private boolean d;

    public aevv(View view, bbn bbnVar) {
        this.b = bbnVar;
        afbe afbeVar = BottomSheetBehavior.x(view).j;
        ColorStateList colorStateListJ = afbeVar != null ? afbeVar.j() : view.getBackgroundTintList();
        if (colorStateListJ != null) {
            this.a = Boolean.valueOf(afba.O(colorStateListJ.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListD = afba.D(view.getBackground());
        Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(afba.O(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void d(View view) {
        bbn bbnVar = this.b;
        if (view.getTop() < bbnVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                aewo.f(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), bbnVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                aewo.f(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
        d(view);
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        d(view);
    }

    public final void c(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = ((bbm) new zf(window, window.getDecorView()).a).e();
            }
        }
    }

    @Override // defpackage.aevq
    public final void r(View view) {
        d(view);
    }
}
