package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrl {
    static final agkz a = ahng.ad(asnd.SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS, asnd.SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS, asnd.SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS, asnd.SUBSCRIPTION_WINDOW_SIZE);
    static final boolean b;
    public static final /* synthetic */ int p = 0;
    public final Context c;
    public final AccessibilityManager d;
    public final UiModeManager e;
    public DisplayMetrics f;
    public bbn g;
    public final mrb h;
    public asnh i = mrb.a;
    public final boolean j;
    public final boolean k;
    public int l;
    public final abhi m;
    public final omj n;
    public final ci o;
    private Handler q;
    private final boolean r;
    private final boolean s;

    static {
        b = Build.VERSION.SDK_INT >= 34;
    }

    public mrl(Context context, omj omjVar, mrb mrbVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.c = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        accessibilityManager.getClass();
        this.d = accessibilityManager;
        this.m = new abhi(accessibilityManager);
        this.f = context.getResources().getDisplayMetrics();
        this.n = omjVar;
        this.o = (ci) optional.orElse(null);
        this.h = mrbVar;
        Boolean bool = Boolean.FALSE;
        this.k = ((Boolean) optional2.orElse(bool)).booleanValue();
        this.r = ((Boolean) optional3.orElse(bool)).booleanValue();
        this.j = ((Boolean) optional4.orElse(bool)).booleanValue();
        this.s = ((Boolean) optional5.orElse(bool)).booleanValue();
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        uiModeManager.getClass();
        this.e = uiModeManager;
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static final int d(float f) {
        return f >= 0.33333334f ? 2 : 1;
    }

    public final void b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        Handler handler = this.q;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.q = handler;
        }
        handler.post(runnable);
    }

    public final mrk c(View view, int i, int i2, boolean z) {
        int i3;
        int height;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        if (view != null) {
            float width = view.getWidth() / this.f.density;
            height = (int) ((view.getHeight() / this.f.density) + 0.5f);
            i3 = (int) (width + 0.5f);
        } else {
            i3 = i;
            height = i2;
        }
        if (view != null && this.k) {
            this.f = view.getContext().getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = this.f;
        float f = displayMetrics.widthPixels / displayMetrics.density;
        DisplayMetrics displayMetrics2 = this.f;
        int i6 = (int) ((displayMetrics2.heightPixels / displayMetrics2.density) + 0.5f);
        int i7 = (int) (f + 0.5f);
        if (i7 == 0 || i6 == 0) {
            i4 = 1;
        } else {
            i4 = i6 > i7 ? 4 : 2;
        }
        if (view != null) {
            z2 = this.r;
            int i8 = view.getContext().getResources().getConfiguration().orientation;
            if (i8 == 2) {
                i5 = 2;
            } else {
                i5 = i8 == 1 ? 4 : 1;
            }
            z3 = true;
            if (z2) {
                z4 = false;
            } else if (i4 != i5) {
                z4 = true;
                i5 = 0;
            } else {
                i5 = 0;
                z4 = false;
            }
        } else {
            z2 = false;
            i5 = 0;
            z3 = false;
            z4 = false;
        }
        aihf aihfVarCreateBuilder = asne.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar = (asne) aihfVarCreateBuilder.instance;
        asneVar.g = 0;
        asneVar.b |= 16;
        float f2 = i3;
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar2 = (asne) aihfVarCreateBuilder.instance;
        asneVar2.b |= 1;
        asneVar2.c = f2;
        float f3 = height;
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar3 = (asne) aihfVarCreateBuilder.instance;
        asneVar3.b |= 2;
        asneVar3.d = f3;
        aihf aihfVarCreateBuilder2 = asmj.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asmj asmjVar = (asmj) aihfVarCreateBuilder2.instance;
        if (i5 != 0) {
            i4 = i5;
        }
        asmjVar.c = i4 - 1;
        asmjVar.b |= 1;
        asmj asmjVar2 = (asmj) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar4 = (asne) aihfVarCreateBuilder.instance;
        asmjVar2.getClass();
        asneVar4.e = asmjVar2;
        asneVar4.b |= 4;
        aihf aihfVarCreateBuilder3 = ason.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ason asonVar = (ason) aihfVarCreateBuilder3.instance;
        asonVar.b |= 1;
        asonVar.c = i7;
        aihfVarCreateBuilder3.copyOnWrite();
        ason asonVar2 = (ason) aihfVarCreateBuilder3.instance;
        asonVar2.b |= 2;
        asonVar2.d = i6;
        ason asonVar3 = (ason) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar5 = (asne) aihfVarCreateBuilder.instance;
        asonVar3.getClass();
        asneVar5.f = asonVar3;
        asneVar5.b |= 8;
        int i9 = this.c.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar6 = (asne) aihfVarCreateBuilder.instance;
        asneVar6.h = i9 - 1;
        asneVar6.b |= 32;
        bbn bbnVar = this.g;
        DisplayMetrics displayMetrics3 = this.f;
        avw avwVarF = bbnVar.f(519);
        avw avwVarF2 = bbnVar.f(SemanticState.Focused);
        aihf aihfVarCreateBuilder4 = asmk.a.createBuilder();
        asml asmlVar = asml.a;
        aihf aihfVarCreateBuilder5 = asmlVar.createBuilder();
        float fMax = Math.max(avwVarF.c, avwVarF2.c) / displayMetrics3.density;
        aihfVarCreateBuilder5.copyOnWrite();
        asml asmlVar2 = (asml) aihfVarCreateBuilder5.instance;
        asmlVar2.b |= 1;
        asmlVar2.c = (int) (fMax + 0.5f);
        asml asmlVar3 = (asml) aihfVarCreateBuilder5.build();
        aihfVarCreateBuilder4.copyOnWrite();
        asmk asmkVar = (asmk) aihfVarCreateBuilder4.instance;
        asmlVar3.getClass();
        asmkVar.c = asmlVar3;
        asmkVar.b |= 1;
        aihf aihfVarCreateBuilder6 = asmlVar.createBuilder();
        float fMax2 = Math.max(avwVarF.e, avwVarF2.e) / displayMetrics3.density;
        aihfVarCreateBuilder6.copyOnWrite();
        asml asmlVar4 = (asml) aihfVarCreateBuilder6.instance;
        asmlVar4.b |= 1;
        asmlVar4.c = (int) (fMax2 + 0.5f);
        asml asmlVar5 = (asml) aihfVarCreateBuilder6.build();
        aihfVarCreateBuilder4.copyOnWrite();
        asmk asmkVar2 = (asmk) aihfVarCreateBuilder4.instance;
        asmlVar5.getClass();
        asmkVar2.e = asmlVar5;
        asmkVar2.b |= 4;
        aihf aihfVarCreateBuilder7 = asmlVar.createBuilder();
        float fMax3 = (Math.max(avwVarF.b, avwVarF2.b) / displayMetrics3.density) + 0.5f;
        aihfVarCreateBuilder7.copyOnWrite();
        asml asmlVar6 = (asml) aihfVarCreateBuilder7.instance;
        asmlVar6.b |= 1;
        asmlVar6.c = (int) fMax3;
        asml asmlVar7 = (asml) aihfVarCreateBuilder7.build();
        aihfVarCreateBuilder4.copyOnWrite();
        asmk asmkVar3 = (asmk) aihfVarCreateBuilder4.instance;
        asmlVar7.getClass();
        asmkVar3.d = asmlVar7;
        asmkVar3.b |= 2;
        aihf aihfVarCreateBuilder8 = asmlVar.createBuilder();
        float fMax4 = Math.max(avwVarF.d, avwVarF2.d) / displayMetrics3.density;
        aihfVarCreateBuilder8.copyOnWrite();
        asml asmlVar8 = (asml) aihfVarCreateBuilder8.instance;
        asmlVar8.b |= 1;
        asmlVar8.c = (int) (fMax4 + 0.5f);
        asml asmlVar9 = (asml) aihfVarCreateBuilder8.build();
        aihfVarCreateBuilder4.copyOnWrite();
        asmk asmkVar4 = (asmk) aihfVarCreateBuilder4.instance;
        asmlVar9.getClass();
        asmkVar4.f = asmlVar9;
        asmkVar4.b |= 8;
        asmk asmkVar5 = (asmk) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar7 = (asne) aihfVarCreateBuilder.instance;
        asmkVar5.getClass();
        asneVar7.j = asmkVar5;
        asneVar7.b |= SemanticState.Focused;
        asnh asnhVar = this.i;
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar8 = (asne) aihfVarCreateBuilder.instance;
        asnhVar.getClass();
        asneVar8.l = asnhVar;
        asneVar8.b |= SemanticState.LiveRegion;
        int i10 = this.l;
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar9 = (asne) aihfVarCreateBuilder.instance;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        asneVar9.m = i11;
        asneVar9.b |= SemanticState.ReadOnly;
        Boolean boolE = this.m.e();
        if (boolE != null) {
            boolean zBooleanValue = boolE.booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            asne asneVar10 = (asne) aihfVarCreateBuilder.instance;
            asneVar10.b |= 64;
            asneVar10.i = zBooleanValue;
        }
        aihfVarCreateBuilder.copyOnWrite();
        asne asneVar11 = (asne) aihfVarCreateBuilder.instance;
        asneVar11.b |= SemanticState.Hidden;
        asneVar11.k = z;
        return new mrk(((asne) aihfVarCreateBuilder.build()).toByteArray(), z3, z4, z2);
    }

    public final avlr e(nsl nslVar, final omj omjVar) {
        final agfr cbrVar = this.s ? new cbr(new WeakReference(nslVar), 16) : new cbq(nslVar, 20);
        awbl awblVar = new awbl(new avlt() { // from class: mrc
            /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
            /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:53:0x00de  */
            /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
            @Override // defpackage.avlt
            public final void a(avls avlsVar) {
                Optional optionalEmpty;
                bbb bauVar;
                bbn bbnVarA;
                Optional optionalOfNullable;
                final int i;
                final boolean z;
                final mrl mrlVar;
                final int i2;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
                final View.OnLayoutChangeListener onLayoutChangeListener;
                View view;
                final int i3;
                int i4;
                boolean z2;
                ayx ayxVar;
                View view2;
                final int i5;
                final View view3;
                final int i6;
                final boolean z3;
                final Optional optional;
                final axo axoVar;
                UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener;
                nsl nslVar2 = (nsl) cbrVar.io();
                if (nslVar2 == null) {
                    avlsVar.a();
                    return;
                }
                final awbk awbkVar = new awbk(avlsVar);
                Integer num = nslVar2.c;
                final View viewA = nslVar2.a();
                boolean z4 = false;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = nslVar2.d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                mrl mrlVar2 = this.a;
                if (mrlVar2.k) {
                    mrlVar2.f = mrlVar2.c.getResources().getDisplayMetrics();
                }
                float f = iIntValue / mrlVar2.f.density;
                float f2 = iIntValue2 / mrlVar2.f.density;
                if (viewA != null) {
                    Context context = viewA.getContext();
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
                } else {
                    optionalEmpty = Optional.empty();
                }
                Optional optional2 = optionalEmpty;
                if (!mrlVar2.j) {
                    if (viewA != null) {
                        int i7 = bac.a;
                        bbnVarA = azt.a(viewA);
                        if (bbnVarA == null) {
                            if (Build.VERSION.SDK_INT >= 36) {
                                bauVar = new bba();
                            } else if (Build.VERSION.SDK_INT >= 35) {
                                bauVar = new baz();
                            } else if (Build.VERSION.SDK_INT >= 34) {
                                bauVar = new bay();
                            } else if (Build.VERSION.SDK_INT >= 31) {
                                bauVar = new bax();
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                bauVar = new baw();
                            } else if (Build.VERSION.SDK_INT >= 29) {
                                bauVar = new bav();
                            } else {
                                bauVar = new bau();
                            }
                            avw avwVar = avw.a;
                            bauVar.g(519, avwVar);
                            bauVar.g(SemanticState.Focused, avwVar);
                            bbnVarA = bauVar.a();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 36) {
                            bauVar = new bba();
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            bauVar = new baz();
                        } else if (Build.VERSION.SDK_INT >= 34) {
                            bauVar = new bay();
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            bauVar = new bax();
                        } else if (Build.VERSION.SDK_INT >= 30) {
                            bauVar = new baw();
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            bauVar = new bav();
                        } else {
                            bauVar = new bau();
                        }
                        avw avwVar2 = avw.a;
                        bauVar.g(519, avwVar2);
                        bauVar.g(SemanticState.Focused, avwVar2);
                        bbnVarA = bauVar.a();
                    }
                    mrlVar2.g = bbnVarA;
                } else if (mrlVar2.g == null) {
                    if (optional2.isPresent() && Build.VERSION.SDK_INT >= 30) {
                        bbnVarA = bbn.o(((Activity) optional2.get()).getWindow().getWindowManager().getCurrentWindowMetrics().getWindowInsets(), viewA);
                    } else if (viewA != null) {
                        int i8 = bac.a;
                        bbnVarA = azt.a(viewA);
                        if (bbnVarA == null) {
                            if (Build.VERSION.SDK_INT >= 36) {
                                bauVar = new bba();
                            } else if (Build.VERSION.SDK_INT >= 35) {
                                bauVar = new baz();
                            } else if (Build.VERSION.SDK_INT >= 34) {
                                bauVar = new bay();
                            } else if (Build.VERSION.SDK_INT >= 31) {
                                bauVar = new bax();
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                bauVar = new baw();
                            } else if (Build.VERSION.SDK_INT >= 29) {
                                bauVar = new bav();
                            } else {
                                bauVar = new bau();
                            }
                            avw avwVar3 = avw.a;
                            bauVar.g(519, avwVar3);
                            bauVar.g(SemanticState.Focused, avwVar3);
                            bbnVarA = bauVar.a();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 36) {
                            bauVar = new bba();
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            bauVar = new baz();
                        } else if (Build.VERSION.SDK_INT >= 34) {
                            bauVar = new bay();
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            bauVar = new bax();
                        } else if (Build.VERSION.SDK_INT >= 30) {
                            bauVar = new baw();
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            bauVar = new bav();
                        } else {
                            bauVar = new bau();
                        }
                        avw avwVar4 = avw.a;
                        bauVar.g(519, avwVar4);
                        bauVar.g(SemanticState.Focused, avwVar4);
                        bbnVarA = bauVar.a();
                    }
                    mrlVar2.g = bbnVarA;
                }
                if (true != optional2.isPresent()) {
                    optionalOfNullable = optional2;
                } else {
                    Object obj = optional2.get();
                    int i9 = dws.a;
                    optionalOfNullable = Optional.ofNullable(new dwn(dwu.a.a((Context) obj)));
                }
                omj omjVar2 = omjVar;
                if (omjVar2.z(asnd.SUBSCRIPTION_IS_REDUCE_ANIMATIONS_SETTING_ENABLED) && Settings.Global.getFloat(mrlVar2.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                    z4 = true;
                }
                if (mrlVar2.l == 0) {
                    mrlVar2.l = mrl.b ? mrl.d(mrlVar2.e.getContrast()) : 1;
                }
                int i10 = (int) (f + 0.5f);
                int i11 = (int) (f2 + 0.5f);
                if (omjVar2.z(asnd.SUBSCRIPTION_IS_SCREEN_READER_ACTIVE)) {
                    i = i10;
                    z = z4;
                    mrlVar = mrlVar2;
                    i2 = i11;
                    touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: mre
                        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                        public final void onTouchExplorationStateChanged(boolean z5) {
                            mrl mrlVar3 = mrlVar;
                            mrlVar3.m.f();
                            awbkVar.c(mrlVar3.c(viewA, i, i2, z));
                        }
                    };
                } else {
                    i = i10;
                    z = z4;
                    mrlVar = mrlVar2;
                    i2 = i11;
                    touchExplorationStateChangeListener = null;
                }
                if (touchExplorationStateChangeListener != null) {
                    mrlVar.d.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                }
                if (viewA == null) {
                    onLayoutChangeListener = null;
                    view = null;
                } else if (omjVar2.A(mrl.a)) {
                    onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: mrf
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view4, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                            awbkVar.c(mrlVar.c(viewA, i, i2, z));
                        }
                    };
                    view = viewA;
                } else {
                    view = viewA;
                    onLayoutChangeListener = null;
                }
                if (view == null || !omjVar2.A(mrl.a)) {
                    i3 = i;
                    i4 = i2;
                    z2 = z;
                    ayxVar = null;
                } else {
                    i3 = i;
                    final int i12 = i2;
                    final boolean z5 = z;
                    ayxVar = new ayx() { // from class: mrg
                        @Override // defpackage.ayx
                        public final bbn a(View view4, bbn bbnVar) {
                            mrl mrlVar3 = mrlVar;
                            if (mrlVar3.j) {
                                if (bbnVar.equals(mrlVar3.g)) {
                                    return bac.f(view4, bbnVar);
                                }
                                mrlVar3.g = bbnVar;
                            }
                            boolean z6 = z5;
                            int i13 = i12;
                            awbkVar.c(mrlVar3.c(view4, i3, i13, z6));
                            return bac.f(view4, bbnVar);
                        }
                    };
                    i4 = i12;
                    z2 = z5;
                }
                if (view == null || !omjVar2.A(mrl.a)) {
                    view2 = view;
                } else {
                    mrl mrlVar3 = mrlVar;
                    View.OnLayoutChangeListener onLayoutChangeListener2 = onLayoutChangeListener;
                    View view4 = view;
                    mrh mrhVar = new mrh(mrlVar3, onLayoutChangeListener2, view4, ayxVar, 0);
                    onLayoutChangeListener = onLayoutChangeListener2;
                    view2 = view4;
                    mrlVar = mrlVar3;
                    mrlVar.b(mrhVar);
                }
                final ket ketVar = omjVar2.z(asnd.SUBSCRIPTION_DEVICE_ORIENTATION) ? new ket(null) : null;
                if (ketVar != null) {
                    mrlVar.n.ab(ketVar);
                }
                if (omjVar2.z(asnd.SUBSCRIPTION_FOLDING_DISPLAY_INFO)) {
                    i5 = i3;
                    i6 = i4;
                    final View view5 = view2;
                    z3 = z2;
                    axo axoVar2 = new axo() { // from class: mri
                        @Override // defpackage.axo
                        public final void accept(Object obj2) {
                            mrb mrbVar;
                            asnh asnhVarA;
                            dwr dwrVar;
                            dwy dwyVar = (dwy) obj2;
                            View view6 = view5;
                            if (view6 != null) {
                                mrl mrlVar4 = mrlVar;
                                Iterator it = dwyVar.a.iterator();
                                do {
                                    mrbVar = mrlVar4.h;
                                    if (it.hasNext()) {
                                        dwrVar = (dwr) it.next();
                                    } else {
                                        asnhVarA = mrbVar.a(null, view6);
                                    }
                                    boolean z6 = z3;
                                    int i13 = i6;
                                    int i14 = i5;
                                    avls avlsVar2 = awbkVar;
                                    mrlVar4.i = asnhVarA;
                                    avlsVar2.c(mrlVar4.c(view6, i14, i13, z6));
                                } while (!(dwrVar instanceof dwr));
                                asnhVarA = mrbVar.a(dwrVar, view6);
                                boolean z7 = z3;
                                int i15 = i6;
                                int i16 = i5;
                                avls avlsVar3 = awbkVar;
                                mrlVar4.i = asnhVarA;
                                avlsVar3.c(mrlVar4.c(view6, i16, i15, z7));
                            }
                        }
                    };
                    view3 = view5;
                    awbkVar = awbkVar;
                    Optional optional3 = optionalOfNullable;
                    axoVar = axoVar2;
                    optional = optional3;
                } else {
                    i5 = i3;
                    view3 = view2;
                    i6 = i4;
                    z3 = z2;
                    optional = optionalOfNullable;
                    axoVar = null;
                }
                if (optional.isPresent() && optional2.isPresent() && axoVar != null) {
                    ((dwn) optional.get()).a((Activity) optional2.get(), new cck(mrlVar, 11), axoVar);
                }
                if (mrl.b && omjVar2.z(asnd.SUBSCRIPTION_COLOR_CONTRAST_MODE)) {
                    uiModeManager$ContrastChangeListener = new UiModeManager$ContrastChangeListener() { // from class: mrj
                        public final void onContrastChanged(float f3) {
                            mrl mrlVar4 = mrlVar;
                            mrlVar4.l = mrl.d(f3);
                            awbkVar.c(mrlVar4.c(view3, i5, i6, z3));
                        }
                    };
                    mrlVar.e.addContrastChangeListener(new cck(mrlVar, 11), uiModeManager$ContrastChangeListener);
                } else {
                    uiModeManager$ContrastChangeListener = null;
                }
                final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = touchExplorationStateChangeListener;
                final mrl mrlVar4 = mrlVar;
                boolean z6 = z3;
                final View view6 = view3;
                final UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener2 = uiModeManager$ContrastChangeListener;
                awbkVar.a.d(new avnh() { // from class: mrd
                    @Override // defpackage.avnh
                    public final void a() {
                        UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener3;
                        axo axoVar3;
                        mrl mrlVar5 = mrlVar4;
                        View view7 = view6;
                        if (view7 != null) {
                            mrlVar5.b(new msh(view7, onLayoutChangeListener, 1, null));
                        }
                        ket ketVar2 = ketVar;
                        if (ketVar2 != null) {
                            mrlVar5.n.ac(ketVar2);
                        }
                        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener3 = touchExplorationStateChangeListener2;
                        if (touchExplorationStateChangeListener3 != null) {
                            mrlVar5.d.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener3);
                        }
                        Optional optional4 = optional;
                        if (optional4.isPresent() && (axoVar3 = axoVar) != null) {
                            ((dwn) optional4.get()).b(axoVar3);
                        }
                        if (!mrl.b || (uiModeManager$ContrastChangeListener3 = uiModeManager$ContrastChangeListener2) == null) {
                            return;
                        }
                        mrlVar5.e.removeContrastChangeListener(uiModeManager$ContrastChangeListener3);
                    }
                });
                awbkVar.c(mrlVar4.c(view6, i5, i6, z6));
            }
        });
        avnn avnnVar = atqp.l;
        return awblVar.s(new mkv(2)).x(new jqi(this, 7)).K(new igz(12));
    }
}
