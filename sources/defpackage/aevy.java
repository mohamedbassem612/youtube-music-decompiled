package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aevy extends gs {
    private boolean yT;

    private final boolean jo(boolean z) {
        Dialog dialog = this.f;
        if (dialog instanceof aevw) {
            aevw aevwVar = (aevw) dialog;
            BottomSheetBehavior bottomSheetBehaviorA = aevwVar.a();
            if (bottomSheetBehaviorA.C && aevwVar.c) {
                this.yT = z;
                if (bottomSheetBehaviorA.F == 5) {
                    R();
                } else {
                    Dialog dialog2 = this.f;
                    if (dialog2 instanceof aevw) {
                        aevw aevwVar2 = (aevw) dialog2;
                        aevwVar2.a.D(aevwVar2.h);
                    }
                    bottomSheetBehaviorA.y(new aevx(this));
                    bottomSheetBehaviorA.I(5);
                }
                return true;
            }
        }
        return false;
    }

    public final void R() {
        if (this.yT) {
            super.iQ(true, false, false);
        } else {
            super.iQ(false, false, false);
        }
    }

    @Override // defpackage.bp
    public void dismiss() {
        if (jo(false)) {
            return;
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.gs, defpackage.bp
    public Dialog iH(Bundle bundle) {
        return new aevw(getContext(), this.b);
    }

    @Override // defpackage.bp
    public void iN() {
        if (jo(true)) {
            return;
        }
        super.iQ(true, false, false);
    }
}
