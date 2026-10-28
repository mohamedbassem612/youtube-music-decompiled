package app.rive.semantics;

import android.content.Context;
import app.rive.RiveSemanticsMode;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahm;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.aia;
import defpackage.aid;
import defpackage.aii;
import defpackage.aog;
import defpackage.awmj;
import defpackage.awqg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityKt {

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiveSemanticsMode.values().length];
            try {
                iArr[RiveSemanticsMode.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiveSemanticsMode.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiveSemanticsMode.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean rememberAccessibilityEnabled(final AccessibilityStateProvider accessibilityStateProvider, ahk ahkVar, int i) {
        accessibilityStateProvider.getClass();
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && ahkVar.t()) || (i & 6) == 4;
        Object objC = ahkVar.c();
        if (z || objC == ahj.a) {
            aid aidVar = new aid(Boolean.valueOf(accessibilityStateProvider.isEnabled()), aii.c);
            ahkVar.D();
            objC = aidVar;
        }
        final aia aiaVar = (aia) objC;
        boolean zT = ahkVar.t() | ((i2 > 4 && ahkVar.v()) || (i & 6) == 4);
        Object objC2 = ahkVar.c();
        if (zT || objC2 == ahj.a) {
            objC2 = new awqg() { // from class: app.rive.semantics.AccessibilityKt$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return AccessibilityKt.rememberAccessibilityEnabled$lambda$4$0(accessibilityStateProvider, aiaVar, (ahs) obj);
                }
            };
            ahkVar.D();
        }
        ahs.b(ahkVar);
        return rememberAccessibilityEnabled$lambda$2(aiaVar);
    }

    private static final boolean rememberAccessibilityEnabled$lambda$2(aia aiaVar) {
        return ((Boolean) aiaVar.e()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberAccessibilityEnabled$lambda$3(aia aiaVar, boolean z) {
        aiaVar.f(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr rememberAccessibilityEnabled$lambda$4$0(final AccessibilityStateProvider accessibilityStateProvider, final aia aiaVar, ahs ahsVar) {
        ahsVar.getClass();
        final AccessibilityEnabledListener accessibilityEnabledListener = new AccessibilityEnabledListener() { // from class: app.rive.semantics.AccessibilityKt$$ExternalSyntheticLambda1
            @Override // app.rive.semantics.AccessibilityEnabledListener
            public final void onAccessibilityEnabledChanged(boolean z) {
                AccessibilityKt.rememberAccessibilityEnabled$lambda$3(aiaVar, z);
            }
        };
        accessibilityStateProvider.addAccessibilityStateChangeListener(accessibilityEnabledListener);
        rememberAccessibilityEnabled$lambda$3(aiaVar, accessibilityStateProvider.isEnabled());
        return new ahr() { // from class: app.rive.semantics.AccessibilityKt$rememberAccessibilityEnabled$lambda$4$0$$inlined$onDispose$1
            public void dispose() {
                accessibilityStateProvider.removeAccessibilityStateChangeListener(accessibilityEnabledListener);
            }
        };
    }

    public static final boolean rememberRiveSemanticsEnabled(RiveSemanticsMode riveSemanticsMode, AccessibilityStateProvider accessibilityStateProvider, ahk ahkVar, int i) {
        riveSemanticsMode.getClass();
        accessibilityStateProvider.getClass();
        RiveSemanticsMode riveSemanticsMode2 = RiveSemanticsMode.Off;
        int iOrdinal = riveSemanticsMode.ordinal();
        if (iOrdinal == 0) {
            ahkVar.A();
            ahkVar.h();
            return false;
        }
        if (iOrdinal == 1) {
            ahkVar.A();
            ahkVar.h();
            return true;
        }
        if (iOrdinal != 2) {
            ahkVar.A();
            ahkVar.h();
            throw new awmj();
        }
        ahkVar.A();
        boolean zRememberAccessibilityEnabled = rememberAccessibilityEnabled(accessibilityStateProvider, ahkVar, (i >> 3) & 14);
        ahkVar.h();
        return zRememberAccessibilityEnabled;
    }

    public static final boolean rememberRiveSemanticsEnabled(RiveSemanticsMode riveSemanticsMode, ahk ahkVar, int i) {
        riveSemanticsMode.getClass();
        RiveSemanticsMode riveSemanticsMode2 = RiveSemanticsMode.Off;
        int iOrdinal = riveSemanticsMode.ordinal();
        if (iOrdinal == 0) {
            ahkVar.A();
            ahkVar.h();
            return false;
        }
        if (iOrdinal == 1) {
            ahkVar.A();
            ahkVar.h();
            return true;
        }
        if (iOrdinal == 2) {
            ahkVar.A();
            boolean zRememberAccessibilityEnabled = rememberAccessibilityEnabled(ahkVar, 0);
            ahkVar.h();
            return zRememberAccessibilityEnabled;
        }
        ahkVar.A();
        ahkVar.h();
        throw new awmj();
    }

    private static final boolean rememberAccessibilityEnabled(ahk ahkVar, int i) {
        ahm ahmVar = aog.a;
        Context applicationContext = ((Context) ahkVar.w()).getApplicationContext();
        boolean zT = ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            applicationContext.getClass();
            objC = new AndroidAccessibilityStateProvider(applicationContext);
            ahkVar.D();
        }
        return rememberAccessibilityEnabled((AndroidAccessibilityStateProvider) objC, ahkVar, 0);
    }
}
