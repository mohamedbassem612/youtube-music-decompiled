package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbw implements AccessibilityManager.AccessibilityStateChangeListener {
    final bbv a;

    public bbw(bbv bbvVar) {
        this.a = bbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbw) {
            return this.a.equals(((bbw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        fjw.E(((fjt) this.a).a);
    }
}
