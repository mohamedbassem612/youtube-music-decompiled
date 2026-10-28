package defpackage;

import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbx implements AccessibilityManager.TouchExplorationStateChangeListener {
    final ci a;

    public bbx(ci ciVar) {
        this.a = ciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbx) {
            return this.a.equals(((bbx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        fjw.E((WeakReference) this.a.a);
    }
}
