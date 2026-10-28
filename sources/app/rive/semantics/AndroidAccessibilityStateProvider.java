package app.rive.semantics;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidAccessibilityStateProvider implements AccessibilityStateProvider {
    public static final int $stable = 8;
    private final AccessibilityManager accessibilityManager;
    private final Map listenerAdapters;

    public AndroidAccessibilityStateProvider(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (AccessibilityManager) systemService;
        this.listenerAdapters = new LinkedHashMap();
    }

    @Override // app.rive.semantics.AccessibilityStateProvider
    public void addAccessibilityStateChangeListener(final AccessibilityEnabledListener accessibilityEnabledListener) {
        accessibilityEnabledListener.getClass();
        if (this.listenerAdapters.containsKey(accessibilityEnabledListener)) {
            return;
        }
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: app.rive.semantics.AndroidAccessibilityStateProvider$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                accessibilityEnabledListener.onAccessibilityEnabledChanged(z);
            }
        };
        this.listenerAdapters.put(accessibilityEnabledListener, accessibilityStateChangeListener);
        this.accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    @Override // app.rive.semantics.AccessibilityStateProvider
    public boolean isEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    @Override // app.rive.semantics.AccessibilityStateProvider
    public void removeAccessibilityStateChangeListener(AccessibilityEnabledListener accessibilityEnabledListener) {
        accessibilityEnabledListener.getClass();
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = (AccessibilityManager.AccessibilityStateChangeListener) this.listenerAdapters.remove(accessibilityEnabledListener);
        if (accessibilityStateChangeListener != null) {
            this.accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
    }
}
