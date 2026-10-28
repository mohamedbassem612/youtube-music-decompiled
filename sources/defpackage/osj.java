package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osj extends View implements osd {
    private static final boolean g;
    public Size a;
    public avw b;
    public Executor c;
    public int d;
    public aduk e;
    public kjc f;
    private final AtomicBoolean h;
    private WindowInsets i;
    private AccessibilityManager j;
    private AccessibilityManager.TouchExplorationStateChangeListener k;
    private UiModeManager l;
    private UiModeManager$ContrastChangeListener m;
    private Optional n;
    private Optional o;
    private axo p;
    private final ArrayList q;
    private int r;

    static {
        g = Build.VERSION.SDK_INT >= 34;
    }

    public osj(Context context, AccessibilityManager accessibilityManager) {
        super(context);
        this.h = new AtomicBoolean();
        this.q = new ArrayList();
        if (accessibilityManager != null) {
            this.j = accessibilityManager;
            this.e = new aduk(accessibilityManager);
        }
        mew mewVar = FlagServices.a;
        if (Memory.peekByte((mewVar == null ? FlagServices.a() : mewVar).c + 75) == 0 || g) {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            uiModeManager.getClass();
            this.l = uiModeManager;
        }
        this.f = new kjc(context, (byte[]) null, (byte[]) null);
    }

    public static final int i(float f) {
        return f >= 0.33333334f ? 2 : 1;
    }

    private final void j(int i) {
        int i2 = 1;
        if (i == 1) {
            i2 = 4;
        } else if (i == 2 || i == 3) {
            i2 = 2;
        }
        this.d = i2;
    }

    private final void k() {
        this.h.set(getContext().getResources().getConfiguration().getLayoutDirection() == 1);
    }

    @Override // defpackage.osd
    public final Size a() {
        return this.a;
    }

    @Override // defpackage.osd
    public final avw b() {
        return this.b;
    }

    @Override // defpackage.osd
    public final boolean c() {
        return this.h.get();
    }

    @Override // defpackage.osd
    public final boolean d() {
        Boolean boolE;
        aduk adukVar = this.e;
        return (adukVar == null || (boolE = adukVar.e()) == null || !boolE.booleanValue()) ? false : true;
    }

    @Override // defpackage.osd
    public final int e() {
        UiModeManager uiModeManager;
        if (!g || (uiModeManager = this.l) == null) {
            return 1;
        }
        return i(uiModeManager.getContrast());
    }

    @Override // defpackage.osd
    public final synchronized void f(NodeTreeProcessorImpl nodeTreeProcessorImpl) {
        aga agaVar = ElementsServices.a;
        mew mewVarA = FlagServices.a;
        if (mewVarA == null) {
            mewVarA = FlagServices.a();
        }
        if (Memory.peekByte(mewVarA.c + 74) == 0 || !this.q.contains(nodeTreeProcessorImpl)) {
            this.q.add(nodeTreeProcessorImpl);
        }
    }

    @Override // defpackage.osd
    public final synchronized void g(NodeTreeProcessorImpl nodeTreeProcessorImpl) {
        this.q.remove(nodeTreeProcessorImpl);
    }

    public final void h(final Consumer consumer) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.q);
        }
        Executor executor = this.c;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: osg
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        consumer.r((NodeTreeProcessorImpl) arrayList2.get(i));
                    }
                }
            });
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            consumer.r((NodeTreeProcessorImpl) arrayList.get(i));
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int iMax;
        int iMax2;
        int iMax3;
        int iMax4;
        aga agaVar = ElementsServices.a;
        mew mewVarA = FlagServices.a;
        if (mewVarA == null) {
            mewVarA = FlagServices.a();
        }
        boolean z = Memory.peekByte(mewVarA.c + 74) != 0;
        WindowInsets windowInsets2 = this.i;
        if (!z) {
            if (!windowInsets.equals(windowInsets2)) {
            }
            return windowInsets;
        }
        if (windowInsets == windowInsets2) {
            return windowInsets;
        }
        this.i = windowInsets;
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.systemBars());
            iMax = Math.max(insets.top, insets2.top);
            iMax2 = Math.max(insets.bottom, insets2.bottom);
            iMax3 = Math.max(insets.left, insets2.left);
            iMax4 = Math.max(insets.right, insets2.right);
        } else {
            bbn bbnVarO = bbn.o(windowInsets, this);
            avw avwVarF = bbnVarO.f(519);
            avw avwVarF2 = bbnVarO.f(SemanticState.Focused);
            int i = avwVarF2.c;
            int i2 = avwVarF.c;
            int i3 = avwVarF2.e;
            int i4 = avwVarF.e;
            int i5 = avwVarF2.b;
            int i6 = avwVarF.b;
            int i7 = avwVarF2.d;
            int i8 = avwVarF.d;
            iMax = Math.max(i, i2);
            iMax2 = Math.max(i3, i4);
            iMax3 = Math.max(i5, i6);
            iMax4 = Math.max(i7, i8);
        }
        Resources resources = getContext().getResources();
        j(resources.getConfiguration().orientation);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.density;
        Size size = new Size((int) ((displayMetrics.widthPixels / f) + 0.5f), (int) ((displayMetrics.heightPixels / f) + 0.5f));
        avw avwVarD = avw.d((int) ((iMax3 / f) + 0.5f), (int) ((iMax / f) + 0.5f), (int) ((iMax4 / f) + 0.5f), (int) ((iMax2 / f) + 0.5f));
        if (!z || !Objects.equals(size, this.a) || !Objects.equals(avwVarD, this.b) || this.d != this.r) {
            this.a = size;
            this.b = avwVarD;
            this.r = this.d;
            h(new kjk(this, 7));
        }
        return windowInsets;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        Optional optionalEmpty;
        super.onAttachedToWindow();
        k();
        int i = bac.a;
        requestApplyInsets();
        if (this.j != null) {
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: osh
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    osj osjVar = this.a;
                    osjVar.e.f();
                    osjVar.h(new kjk(osjVar, 6));
                }
            };
            this.k = touchExplorationStateChangeListener;
            this.j.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        int i2 = 8;
        if (g && this.l != null) {
            UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener = new UiModeManager$ContrastChangeListener() { // from class: osi
                public final void onContrastChanged(float f) {
                    this.a.h(new ulc(osj.i(f), 1));
                }
            };
            this.m = uiModeManager$ContrastChangeListener;
            Executor executor = this.c;
            UiModeManager uiModeManager = this.l;
            if (executor != null) {
                uiModeManager.addContrastChangeListener(executor, uiModeManager$ContrastChangeListener);
            } else {
                uiModeManager.addContrastChangeListener(new cte(8), this.m);
            }
        }
        if (this.f != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    optionalEmpty = Optional.empty();
                    break;
                } else {
                    if (context instanceof Activity) {
                        optionalEmpty = Optional.of((Activity) context);
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.n = optionalEmpty;
            if (true == optionalEmpty.isPresent()) {
                Object obj = optionalEmpty.get();
                int i3 = dws.a;
                optionalEmpty = Optional.ofNullable(new dwn(dwu.a.a((Context) obj)));
            }
            this.o = optionalEmpty;
            if (optionalEmpty.isPresent() && this.n.isPresent()) {
                this.p = new cd(this, i2);
                Executor executor2 = this.c;
                Optional optional = this.o;
                if (executor2 != null) {
                    ((dwn) optional.get()).a((Activity) this.n.get(), this.c, this.p);
                    return;
                }
                ((dwn) optional.get()).a((Activity) this.n.get(), new cte(9), this.p);
            }
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        j(configuration.orientation);
        k();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        UiModeManager uiModeManager;
        super.onDetachedFromWindow();
        AccessibilityManager accessibilityManager = this.j;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.k);
        }
        if (g && (uiModeManager = this.l) != null) {
            uiModeManager.removeContrastChangeListener(this.m);
        }
        if (this.f != null && this.o.isPresent() && this.n.isPresent()) {
            ((dwn) this.o.get()).b(this.p);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public osj(Context context) {
        super(context);
        this.h = new AtomicBoolean();
        this.q = new ArrayList();
    }
}
