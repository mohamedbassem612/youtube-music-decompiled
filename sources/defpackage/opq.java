package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import j$.lang.Iterable$EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opq implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, AutoCloseable {
    public volatile List d;
    grj f;
    private final Context g;
    private volatile AccessibilityManager h;
    public volatile boolean a = false;
    public volatile boolean b = false;
    public volatile boolean c = false;
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());

    public opq(Context context) {
        this.g = context;
    }

    public static boolean d() {
        if (FlagServices.a == null) {
            FlagServices.a();
        }
        mew mewVarA = FlagServices.a;
        if (mewVarA == null) {
            mewVarA = FlagServices.a();
        }
        return Memory.peekByte(mewVarA.c + 73) != 0;
    }

    private final boolean e(AccessibilityManager accessibilityManager) {
        if (accessibilityManager == null) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.d;
        if (enabledAccessibilityServiceList == null && (Build.VERSION.SDK_INT < 33 || d())) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.d = enabledAccessibilityServiceList;
        }
        if (enabledAccessibilityServiceList == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if ((accessibilityServiceInfo.eventTypes & SemanticState.Modal) == 2048 && (accessibilityServiceInfo.getCapabilities() & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    private final boolean f() {
        return this.b && (this.c || e(this.h));
    }

    public final AccessibilityManager a() {
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager == null) {
            synchronized (this) {
                accessibilityManager = this.h;
                if (accessibilityManager == null) {
                    accessibilityManager = (AccessibilityManager) this.g.getSystemService("accessibility");
                    if (!d()) {
                        this.h = accessibilityManager;
                    }
                    if (accessibilityManager != null) {
                        this.b = accessibilityManager.isEnabled();
                        this.c = accessibilityManager.isTouchExplorationEnabled();
                        if (d()) {
                            if (this.b && !this.c) {
                                this.d = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                            }
                            boolean z = false;
                            if (this.b && (this.c || e(accessibilityManager))) {
                                z = true;
                            }
                            this.a = z;
                        } else {
                            this.d = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                            this.a = f();
                        }
                        accessibilityManager.addAccessibilityStateChangeListener(this);
                        accessibilityManager.addTouchExplorationStateChangeListener(this);
                        if (Build.VERSION.SDK_INT >= 33) {
                            this.f = new grj(this, accessibilityManager);
                        }
                    }
                    this.h = accessibilityManager;
                }
            }
        }
        return accessibilityManager;
    }

    public final void b() {
        boolean zC = c();
        if (zC != this.a) {
            this.a = zC;
            Iterable$EL.forEach(this.e, new kjk(this, 5));
        }
    }

    public final boolean c() {
        return a() != null && f();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener, java.lang.Object] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        grj grjVar;
        this.e.clear();
        if (this.h != null) {
            this.h.removeAccessibilityStateChangeListener(this);
            this.h.removeTouchExplorationStateChangeListener(this);
            if (Build.VERSION.SDK_INT < 33 || (grjVar = this.f) == null) {
                return;
            }
            this.h.removeAccessibilityServicesStateChangeListener(grjVar.a);
            this.f = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.b = z;
        if (!z && d()) {
            this.d = null;
        }
        b();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.c = z;
        b();
    }
}
