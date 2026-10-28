package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twb {
    public static final /* synthetic */ int a = 0;
    private static final agkz b = agkz.u("com.google.android.apps.userpanel", "com.google.audio.hearing.visualization.accessibility.scribe", "com.google.android.accessibility.soundamplifier", "com.google.android.accessibility.reader", "com.google.android.apps.internal.betterbug", "com.google.android.retaildemo", "com.google.pixel_concierge", "com.google.android.apps.deviceusagestudy", "com.google.android.apps.onlineinsightspanel");

    public static AccessibilityManager a(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static void b(Context context, View view, CharSequence charSequence) {
        if (c(context)) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(charSequence);
            accessibilityEventObtain.setEnabled(true);
            accessibilityEventObtain.setClassName(view.getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            new bcd(accessibilityEventObtain).a.setSource(view);
            a(context).sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    public static boolean c(Context context) {
        Optional.empty().isPresent();
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled() || f(context);
    }

    public static boolean d(Context context) {
        return e(context) || f(context);
    }

    public static boolean e(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    private static boolean f(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo != null && accessibilityServiceInfo.getId() != null) {
                    String id = accessibilityServiceInfo.getId();
                    if (id.startsWith("com.google")) {
                        agqr it = b.iterator();
                        while (it.hasNext()) {
                            if (id.startsWith((String) it.next())) {
                            }
                        }
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
