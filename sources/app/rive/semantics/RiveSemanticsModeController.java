package app.rive.semantics;

import app.rive.RiveSemanticsMode;
import defpackage.awmj;
import defpackage.awqg;
import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSemanticsModeController implements AutoCloseable {
    public static final int $stable = 8;
    private final AccessibilityEnabledListener listener;
    private RiveSemanticsMode mode;
    private boolean observing;
    private final awqg onEnabledChanged;
    private final AccessibilityStateProvider provider;
    private Boolean resolvedEnabled;

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

    public RiveSemanticsModeController(RiveSemanticsMode riveSemanticsMode, AccessibilityStateProvider accessibilityStateProvider, awqg awqgVar) {
        riveSemanticsMode.getClass();
        accessibilityStateProvider.getClass();
        awqgVar.getClass();
        this.provider = accessibilityStateProvider;
        this.onEnabledChanged = awqgVar;
        this.listener = new RiveSemanticsModeController$listener$1(this);
        this.mode = riveSemanticsMode;
        applyMode();
    }

    private final void applyMode() {
        RiveSemanticsMode riveSemanticsMode = this.mode;
        RiveSemanticsMode riveSemanticsMode2 = RiveSemanticsMode.Off;
        int iOrdinal = riveSemanticsMode.ordinal();
        if (iOrdinal == 0) {
            publishEnabled(false);
            return;
        }
        if (iOrdinal == 1) {
            publishEnabled(true);
        } else {
            if (iOrdinal != 2) {
                throw new awmj();
            }
            this.provider.addAccessibilityStateChangeListener(this.listener);
            this.observing = true;
            publishEnabled(this.provider.isEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishEnabled(boolean z) {
        Boolean bool = this.resolvedEnabled;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (awrc.c(bool, boolValueOf)) {
            return;
        }
        this.resolvedEnabled = boolValueOf;
        this.onEnabledChanged.invoke(boolValueOf);
    }

    private final void stopObserving() {
        if (this.observing) {
            this.provider.removeAccessibilityStateChangeListener(this.listener);
            this.observing = false;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        stopObserving();
    }

    public final RiveSemanticsMode getMode() {
        return this.mode;
    }

    public final void setMode(RiveSemanticsMode riveSemanticsMode) {
        riveSemanticsMode.getClass();
        if (this.mode != riveSemanticsMode) {
            stopObserving();
            this.mode = riveSemanticsMode;
            applyMode();
        }
    }
}
