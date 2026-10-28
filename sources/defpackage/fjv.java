package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fjv implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    private final WeakReference a;

    public fjv(fjw fjwVar) {
        this.a = new WeakReference(fjwVar);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        fjw.E(this.a);
    }
}
