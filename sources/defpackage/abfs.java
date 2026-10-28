package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abfs implements AccessibilityManager.AccessibilityStateChangeListener {
    public final Context a;
    public Boolean c;
    public boolean e;
    private final AccessibilityManager.AccessibilityStateChangeListener f;
    public final awku b = new awku(abfq.a(false));
    public final awku d = new awku(abfq.a(false));

    public abfs(Context context) {
        this.a = context;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: abfr
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                this.a.d.kk(abfq.a(z));
            }
        };
        this.f = accessibilityStateChangeListener;
        int i = twb.a;
        ((AccessibilityManager) context.getSystemService("accessibility")).addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    public final void a() {
        boolean zB = b();
        abfq abfqVar = (abfq) this.b.aD();
        if (abfqVar == null || zB != abfqVar.a) {
            onAccessibilityStateChanged(zB);
        }
        abfq abfqVar2 = (abfq) this.d.aD();
        if (abfqVar2 == null || zB != abfqVar2.a) {
            onAccessibilityStateChanged(zB);
        }
    }

    public final boolean b() {
        return twb.c(this.a);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.b.kk(abfq.a(b()));
        this.d.kk(abfq.a(twb.d(this.a)));
    }
}
