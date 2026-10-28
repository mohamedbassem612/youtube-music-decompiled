package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface AccessibilityStateProvider {
    void addAccessibilityStateChangeListener(AccessibilityEnabledListener accessibilityEnabledListener);

    boolean isEnabled();

    void removeAccessibilityStateChangeListener(AccessibilityEnabledListener accessibilityEnabledListener);
}
