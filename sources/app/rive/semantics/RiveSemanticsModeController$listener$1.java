package app.rive.semantics;

import defpackage.awmf;
import defpackage.awqy;
import defpackage.awrb;
import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class RiveSemanticsModeController$listener$1 implements AccessibilityEnabledListener, awqy {
    final /* synthetic */ RiveSemanticsModeController $tmp0;

    public RiveSemanticsModeController$listener$1(RiveSemanticsModeController riveSemanticsModeController) {
        this.$tmp0 = riveSemanticsModeController;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AccessibilityEnabledListener) && (obj instanceof awqy)) {
            return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.awqy
    public final awmf getFunctionDelegate() {
        return new awrb(1, this.$tmp0, RiveSemanticsModeController.class, "publishEnabled", "publishEnabled(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // app.rive.semantics.AccessibilityEnabledListener
    public final void onAccessibilityEnabledChanged(boolean z) {
        this.$tmp0.publishEnabled(z);
    }
}
