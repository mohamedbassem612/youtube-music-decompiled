package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgn {
    private static volatile boolean a = false;
    private static volatile boolean b;

    public static synchronized void a() {
        a = false;
    }

    public static boolean b(Context context) {
        if (!a) {
            d((AccessibilityManager) context.getSystemService("accessibility"));
        }
        return b;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        if (!a) {
            d(accessibilityManager);
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[EDGE_INSN: B:21:0x0040->B:22:0x0041 BREAK  A[LOOP:0: B:15:0x0026->B:34:0x0026]] */
    private static synchronized void d(AccessibilityManager accessibilityManager) {
        boolean z;
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            z = true;
            break;
        }
        z = false;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            if (accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
                break;
            }
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if ((accessibilityServiceInfo.eventTypes & SemanticState.Modal) == 2048 && (accessibilityServiceInfo.getCapabilities() & 1) == 1) {
                        z = true;
                        break;
                    }
                }
            }
        }
        b = z;
        a = true;
    }
}
