package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import app.rive.semantics.SemanticState;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends ga implements LayoutInflater.Factory2, io {
    private static final aha I = new aha(0);
    private static final int[] J = {R.attr.windowBackground};
    private static final boolean K = !"robolectric".equals(Build.FINGERPRINT);
    public gn A;
    boolean B;
    public int C;
    public boolean D;
    public int E;
    public Rect F;
    public Rect G;
    private gh L;
    private CharSequence M;
    private go N;
    private boolean O;
    private TextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private gn[] T;
    private boolean U;
    private boolean V;
    private boolean W;
    private Configuration X;
    private int Y;
    private int Z;
    private boolean aa;
    private gk ab;
    private gk ac;
    private boolean ae;
    private AppCompatViewInflater af;
    private OnBackInvokedDispatcher ag;
    private OnBackInvokedCallback ah;
    private go ai;
    final Object i;
    final Context j;
    public Window k;
    final fy l;
    fl m;
    MenuInflater n;
    public ln o;
    hv p;
    public ActionBarContextView q;
    public PopupWindow r;
    public Runnable s;
    ViewGroup u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    public ci H = null;
    public boolean t = true;
    private final Runnable ad = new bq(this, 13, null);

    public gp(Context context, Window window, fy fyVar, Object obj) {
        fx fxVar = null;
        this.Y = -100;
        this.j = context;
        this.l = fyVar;
        this.i = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof fx)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    fxVar = (fx) context;
                    break;
                }
            }
            if (fxVar != null) {
                this.Y = fxVar.getDelegate().a();
            }
        }
        if (this.Y == -100) {
            aha ahaVar = I;
            Integer num = (Integer) ahaVar.get(this.i.getClass().getName());
            if (num != null) {
                this.Y = num.intValue();
                ahaVar.remove(this.i.getClass().getName());
            }
        }
        if (window != null) {
            ad(window);
        }
        kl.f();
    }

    static final awq W(Context context) {
        awq awqVar;
        awq awqVarB;
        if (Build.VERSION.SDK_INT >= 33 || (awqVar = ga.c) == null) {
            return null;
        }
        awq awqVarC = awq.c(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (awqVar.g()) {
            awqVarB = awq.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < awqVar.a() + awqVarC.a()) {
                Locale localeF = i < awqVar.a() ? awqVar.f(i) : awqVarC.f(i - awqVar.a());
                if (localeF != null) {
                    linkedHashSet.add(localeF);
                }
                i++;
            }
            awqVarB = awq.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return !awqVarB.g() ? awqVarB : awqVarC;
    }

    private final int aa() {
        int i = this.Y;
        return i == -100 ? ga.b : i;
    }

    private final gk ab(Context context) {
        if (this.ac == null) {
            this.ac = new gi(this, context);
        }
        return this.ac;
    }

    private final gk ac(Context context) {
        if (this.ab == null) {
            if (xsc.d == null) {
                Context applicationContext = context.getApplicationContext();
                xsc.d = new xsc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ab = new gl(this, xsc.d);
        }
        return this.ab;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    private final void ad(Window window) {
        if (this.k != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof gh) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        gh ghVar = new gh(this, callback);
        this.L = ghVar;
        window.setCallback(ghVar);
        Context context = this.j;
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes((AttributeSet) null, J));
        Drawable drawableC = ahtoVar.C(0);
        if (drawableC != null) {
            window.setBackgroundDrawable(drawableC);
        }
        ahtoVar.F();
        this.k = window;
        if (Build.VERSION.SDK_INT < 33 || this.ag != null) {
            return;
        }
        Object obj = this.i;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.ag = activity.getOnBackInvokedDispatcher();
            } else {
                this.ag = null;
            }
        } else {
            this.ag = null;
        }
        P();
    }

    private final void ae() {
        ViewGroup viewGroup;
        if (this.O) {
            return;
        }
        Context rtVar = this.j;
        TypedArray typedArrayObtainStyledAttributes = rtVar.obtainStyledAttributes(he.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            y(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            y(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            y(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            y(10);
        }
        this.y = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        af();
        this.k.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(rtVar);
        if (this.z) {
            viewGroup = this.x ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.youtube.music.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.youtube.music.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.y) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.youtube.music.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.w = false;
            this.v = false;
        } else if (this.v) {
            TypedValue typedValue = new TypedValue();
            rtVar.getTheme().resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                rtVar = new rt(rtVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(rtVar).inflate(com.google.android.apps.youtube.music.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ln lnVar = (ln) viewGroup.findViewById(com.google.android.apps.youtube.music.R.id.decor_content_parent);
            this.o = lnVar;
            lnVar.n(H());
            if (this.w) {
                this.o.c(109);
            }
            if (this.Q) {
                this.o.c(2);
            }
            if (this.R) {
                this.o.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.v + ", windowActionBarOverlay: " + this.w + ", android:windowIsFloating: " + this.y + ", windowActionModeOverlay: " + this.x + ", windowNoTitle: " + this.z + " }");
        }
        gb gbVar = new gb(this);
        int i = bac.a;
        azs.c(viewGroup, gbVar);
        if (this.o == null) {
            this.P = (TextView) viewGroup.findViewById(com.google.android.apps.youtube.music.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.youtube.music.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.k.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        if (contentFrameLayout != null) {
            contentFrameLayout.setId(R.id.content);
        }
        this.k.setContentView(viewGroup);
        if (contentFrameLayout != null) {
            contentFrameLayout.i = new hhb(this);
        }
        this.u = viewGroup;
        CharSequence charSequenceI = I();
        if (!TextUtils.isEmpty(charSequenceI)) {
            ln lnVar2 = this.o;
            if (lnVar2 != null) {
                lnVar2.o(charSequenceI);
            } else {
                fl flVar = this.m;
                if (flVar != null) {
                    flVar.o(charSequenceI);
                } else {
                    TextView textView = this.P;
                    if (textView != null) {
                        textView.setText(charSequenceI);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u.findViewById(R.id.content);
        if (contentFrameLayout2 != null) {
            View decorView = this.k.getDecorView();
            contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (contentFrameLayout2.isLaidOut()) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray typedArrayObtainStyledAttributes2 = this.j.obtainStyledAttributes(he.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.c);
            if (typedArrayObtainStyledAttributes2.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
            }
            typedArrayObtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
        }
        this.O = true;
        gn gnVarY = Y(0);
        if (this.B || gnVarY.h != null) {
            return;
        }
        ah(108);
    }

    private final void af() {
        if (this.k == null) {
            Object obj = this.i;
            if (obj instanceof Activity) {
                ad(((Activity) obj).getWindow());
            }
        }
        if (this.k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void ag() {
        ae();
        if (this.v && this.m == null) {
            Object obj = this.i;
            if (obj instanceof Activity) {
                this.m = new hd((Activity) obj, this.w);
            } else if (obj instanceof Dialog) {
                this.m = new hd((Dialog) obj);
            }
            fl flVar = this.m;
            if (flVar != null) {
                flVar.g(this.ae);
            }
        }
    }

    private final void ah(int i) {
        this.E |= 1 << i;
        if (this.D) {
            return;
        }
        View decorView = this.k.getDecorView();
        Runnable runnable = this.ad;
        int i2 = bac.a;
        decorView.postOnAnimation(runnable);
        this.D = true;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    private final void ai(gn gnVar, KeyEvent keyEvent) {
        int i;
        ExpandedMenuView expandedMenuView;
        ViewGroup.LayoutParams layoutParams;
        if (gnVar.m || this.B) {
            return;
        }
        int i2 = gnVar.a;
        if (i2 == 0 && (this.j.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackH = H();
        if (callbackH != null && !callbackH.onMenuOpened(i2, gnVar.h)) {
            L(gnVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.j.getSystemService("window");
        if (windowManager == null || !T(gnVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = gnVar.e;
        if (viewGroup != null) {
            if (!gnVar.n) {
                View view = gnVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    i = layoutParams.width != -1 ? -2 : -1;
                }
            } else if (gnVar.n && viewGroup.getChildCount() > 0) {
                gnVar.e.removeAllViews();
            }
            gnVar.l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = gnVar.c;
            layoutParams2.windowAnimations = gnVar.d;
            windowManager.addView(gnVar.e, layoutParams2);
            gnVar.m = true;
            if (i2 == 0) {
                P();
                return;
            }
            return;
        }
        Context contextE = E();
        TypedValue typedValue = new TypedValue();
        Resources.Theme themeNewTheme = contextE.getResources().newTheme();
        themeNewTheme.setTo(contextE.getTheme());
        themeNewTheme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarPopupTheme, typedValue, true);
        if (typedValue.resourceId != 0) {
            themeNewTheme.applyStyle(typedValue.resourceId, true);
        }
        themeNewTheme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.panelMenuListTheme, typedValue, true);
        if (typedValue.resourceId != 0) {
            themeNewTheme.applyStyle(typedValue.resourceId, true);
        } else {
            themeNewTheme.applyStyle(2132084314, true);
        }
        rt rtVar = new rt(contextE, 0);
        rtVar.getTheme().setTo(themeNewTheme);
        gnVar.j = rtVar;
        TypedArray typedArrayObtainStyledAttributes = rtVar.obtainStyledAttributes(he.j);
        gnVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
        gnVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        gnVar.e = new gm(this, gnVar.j);
        gnVar.c = 81;
        if (gnVar.e == null) {
            return;
        }
        View view2 = gnVar.g;
        if (view2 == null) {
            iq iqVar = gnVar.h;
            if (iqVar != null) {
                go goVar = this.N;
                if (goVar == null) {
                    goVar = new go(this, 0);
                    this.N = goVar;
                }
                if (iqVar == null) {
                    expandedMenuView = null;
                } else {
                    if (gnVar.i == null) {
                        gnVar.i = new im(gnVar.j);
                        im imVar = gnVar.i;
                        imVar.e = goVar;
                        gnVar.h.g(imVar);
                    }
                    im imVar2 = gnVar.i;
                    ViewGroup viewGroup2 = gnVar.e;
                    if (imVar2.d == null) {
                        imVar2.d = (ExpandedMenuView) imVar2.b.inflate(com.google.android.apps.youtube.music.R.layout.abc_expanded_menu_layout, viewGroup2, false);
                        if (imVar2.f == null) {
                            imVar2.f = new il(imVar2);
                        }
                        imVar2.d.setAdapter((ListAdapter) imVar2.f);
                        imVar2.d.setOnItemClickListener(imVar2);
                    }
                    expandedMenuView = imVar2.d;
                }
                gnVar.f = expandedMenuView;
                if (gnVar.f != null) {
                }
            }
            gnVar.n = true;
        }
        gnVar.f = view2;
        if (gnVar.f != null && (gnVar.g != null || gnVar.i.a().getCount() > 0)) {
            ViewGroup.LayoutParams layoutParams3 = gnVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            gnVar.e.setBackgroundResource(gnVar.b);
            ViewParent parent = gnVar.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(gnVar.f);
            }
            gnVar.e.addView(gnVar.f, layoutParams3);
            if (!gnVar.f.hasFocus()) {
                gnVar.f.requestFocus();
            }
            gnVar.l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = gnVar.c;
            layoutParams4.windowAnimations = gnVar.d;
            windowManager.addView(gnVar.e, layoutParams4);
            gnVar.m = true;
            if (i2 == 0) {
                P();
                return;
            }
            return;
        }
        gnVar.n = true;
    }

    private final void aj() {
        if (this.O) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private static final Configuration ak(Context context, int i, awq awqVar, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (awqVar != null) {
            dl.e(configuration2, awqVar);
        }
        return configuration2;
    }

    @Override // defpackage.ga
    public final void A() {
        ae();
    }

    @Override // defpackage.ga
    public final void C() {
        fl flVarD;
        if (this.v && this.O && (flVarD = d()) != null) {
            flVarD.w();
        }
        Context context = this.j;
        kl.d().e(context);
        this.X = new Configuration(context.getResources().getConfiguration());
        V(false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (((defpackage.gi) ab(r21)).a.isPowerSaveMode() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r0 < 22) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int D(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.D(android.content.Context, int):int");
    }

    final Context E() {
        fl flVarD = d();
        Context contextB = flVarD != null ? flVarD.b() : null;
        return contextB == null ? this.j : contextB;
    }

    final gn F(Menu menu) {
        gn[] gnVarArr = this.T;
        int length = gnVarArr != null ? gnVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            gn gnVar = gnVarArr[i];
            if (gnVar != null && gnVar.h == menu) {
                return gnVar;
            }
        }
        return null;
    }

    final hv G(hu huVar) {
        hv hvVarOnWindowStartingSupportActionMode;
        fy fyVar;
        N();
        hv hvVar = this.p;
        if (hvVar != null) {
            hvVar.f();
        }
        fy fyVar2 = this.l;
        if (fyVar2 == null || this.B) {
            hvVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                hvVarOnWindowStartingSupportActionMode = fyVar2.onWindowStartingSupportActionMode(huVar);
            } catch (AbstractMethodError unused) {
                hvVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (hvVarOnWindowStartingSupportActionMode != null) {
            this.p = hvVarOnWindowStartingSupportActionMode;
        } else {
            if (this.q == null) {
                if (this.y) {
                    TypedValue typedValue = new TypedValue();
                    Context context = this.j;
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        rt rtVar = new rt(context, 0);
                        rtVar.getTheme().setTo(themeNewTheme);
                        context = rtVar;
                    }
                    this.q = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.google.android.apps.youtube.music.R.attr.actionModePopupWindowStyle);
                    this.r = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    this.r.setContentView(this.q);
                    this.r.setWidth(-1);
                    context.getTheme().resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarSize, typedValue, true);
                    this.q.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    this.r.setHeight(-2);
                    this.s = new bh(this, 18, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.u.findViewById(com.google.android.apps.youtube.music.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(E());
                        this.q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.q != null) {
                N();
                this.q.i();
                hw hwVar = new hw(this.q.getContext(), this.q, huVar);
                if (huVar.c(hwVar, hwVar.a)) {
                    hwVar.g();
                    this.q.h(hwVar);
                    this.p = hwVar;
                    boolean zU = U();
                    ActionBarContextView actionBarContextView = this.q;
                    if (zU) {
                        actionBarContextView.setAlpha(0.0f);
                        ci ciVarX = bac.x(this.q);
                        ciVarX.q(1.0f);
                        this.H = ciVarX;
                        ciVarX.t(new gd(this));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        this.q.setVisibility(0);
                        if (this.q.getParent() instanceof View) {
                            View view = (View) this.q.getParent();
                            int i = bac.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (this.r != null) {
                        this.k.getDecorView().post(this.s);
                    }
                } else {
                    this.p = null;
                }
            }
        }
        hv hvVar2 = this.p;
        if (hvVar2 != null && (fyVar = this.l) != null) {
            fyVar.onSupportActionModeStarted(hvVar2);
        }
        P();
        return this.p;
    }

    final Window.Callback H() {
        return this.k.getCallback();
    }

    final CharSequence I() {
        Object obj = this.i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.M;
    }

    final void J(int i, gn gnVar, Menu menu) {
        if (menu == null) {
            menu = gnVar.h;
        }
        if (!gnVar.m || this.B) {
            return;
        }
        gh ghVar = this.L;
        Window.Callback callback = this.k.getCallback();
        try {
            ghVar.b = true;
            callback.onPanelClosed(i, menu);
        } finally {
            ghVar.b = false;
        }
    }

    final void K(iq iqVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.o.a();
        Window.Callback callbackH = H();
        if (callbackH != null && !this.B) {
            callbackH.onPanelClosed(108, iqVar);
        }
        this.S = false;
    }

    final void L(gn gnVar, boolean z) {
        ViewGroup viewGroup;
        ln lnVar;
        if (z && gnVar.a == 0 && (lnVar = this.o) != null && lnVar.s()) {
            K(gnVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.j.getSystemService("window");
        if (windowManager != null && gnVar.m && (viewGroup = gnVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                J(gnVar.a, gnVar, null);
            }
        }
        gnVar.k = false;
        gnVar.l = false;
        gnVar.m = false;
        gnVar.f = null;
        gnVar.n = true;
        if (this.A == gnVar) {
            this.A = null;
        }
        if (gnVar.a == 0) {
            P();
        }
    }

    public final void M(int i) {
        gn gnVarY = Y(i);
        if (gnVarY.h != null) {
            Bundle bundle = new Bundle();
            gnVarY.h.o(bundle);
            if (bundle.size() > 0) {
                gnVarY.p = bundle;
            }
            gnVarY.h.s();
            gnVarY.h.clear();
        }
        gnVarY.o = true;
        gnVarY.n = true;
        if ((i == 108 || i == 0) && this.o != null) {
            gn gnVarY2 = Y(0);
            gnVarY2.k = false;
            T(gnVarY2, null);
        }
    }

    public final void N() {
        ci ciVar = this.H;
        if (ciVar != null) {
            ciVar.o();
        }
    }

    @Override // defpackage.io
    public final void O(iq iqVar) {
        ln lnVar = this.o;
        if (lnVar == null || !lnVar.p() || (ViewConfiguration.get(this.j).hasPermanentMenuKey() && !this.o.r())) {
            gn gnVarY = Y(0);
            gnVarY.n = true;
            L(gnVarY, false);
            ai(gnVarY, null);
            return;
        }
        Window.Callback callbackH = H();
        if (this.o.s()) {
            this.o.q();
            if (this.B) {
                return;
            }
            callbackH.onPanelClosed(108, Y(0).h);
            return;
        }
        if (callbackH == null || this.B) {
            return;
        }
        if (this.D && (this.E & 1) != 0) {
            View decorView = this.k.getDecorView();
            Runnable runnable = this.ad;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        gn gnVarY2 = Y(0);
        iq iqVar2 = gnVarY2.h;
        if (iqVar2 == null || gnVarY2.o || !callbackH.onPreparePanel(0, gnVarY2.g, iqVar2)) {
            return;
        }
        callbackH.onMenuOpened(108, gnVarY2.h);
        this.o.u();
    }

    final void P() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ag == null || (!Y(0).m && this.p == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ah;
                if (onBackInvokedCallback != null) {
                    this.ag.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ah = null;
                    return;
                }
                return;
            }
            if (this.ah == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.ag;
                pa paVar = new pa(this, 1);
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, paVar);
                this.ah = paVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
    
        if (T(r0, r7) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00eb, code lost:
    
        if (R() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean Q(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.Q(android.view.KeyEvent):boolean");
    }

    public final boolean R() {
        boolean z = this.U;
        this.U = false;
        gn gnVarY = Y(0);
        if (!gnVarY.m) {
            hv hvVar = this.p;
            if (hvVar != null) {
                hvVar.f();
            } else {
                fl flVarD = d();
                if (flVarD == null || !flVarD.r()) {
                    return false;
                }
            }
        } else if (!z) {
            L(gnVarY, true);
        }
        return true;
    }

    @Override // defpackage.io
    public final boolean S(iq iqVar, MenuItem menuItem) {
        gn gnVarF;
        Window.Callback callbackH = H();
        if (callbackH == null || this.B || (gnVarF = F(iqVar.a())) == null) {
            return false;
        }
        return callbackH.onMenuItemSelected(gnVarF.a, menuItem);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    public final boolean T(gn gnVar, KeyEvent keyEvent) {
        Resources.Theme themeNewTheme;
        ln lnVar;
        ln lnVar2;
        Bundle bundle;
        int deviceId;
        boolean z;
        ln lnVar3;
        ln lnVar4;
        if (this.B) {
            return false;
        }
        if (!gnVar.k) {
            gn gnVar2 = this.A;
            if (gnVar2 != null && gnVar2 != gnVar) {
                L(gnVar2, false);
            }
            Window.Callback callbackH = H();
            if (callbackH != null) {
                gnVar.g = callbackH.onCreatePanelView(gnVar.a);
            }
            int i = gnVar.a;
            boolean z2 = i == 0 || i == 108;
            if (z2 && (lnVar4 = this.o) != null) {
                lnVar4.m();
            }
            if (gnVar.g == null && (!z2 || !(this.m instanceof gx))) {
                if (gnVar.h != null) {
                    if (gnVar.o) {
                    }
                    gnVar.h.s();
                    bundle = gnVar.p;
                    if (bundle != null) {
                        gnVar.h.n(bundle);
                        gnVar.p = null;
                    }
                    if (!callbackH.onPreparePanel(0, gnVar.g, gnVar.h)) {
                        if (z2 && (lnVar3 = this.o) != null) {
                            lnVar3.l(null, this.ai);
                        }
                        gnVar.h.r();
                        return false;
                    }
                    if (keyEvent != null) {
                        deviceId = keyEvent.getDeviceId();
                    } else {
                        deviceId = -1;
                    }
                    if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gnVar.h.setQwertyMode(z);
                    gnVar.h.r();
                } else {
                    Context context = this.j;
                    if ((i == 0 || i == 108) && this.o != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            rt rtVar = new rt(context, 0);
                            rtVar.getTheme().setTo(themeNewTheme);
                            context = rtVar;
                        }
                    }
                    iq iqVar = new iq(context);
                    iqVar.b = this;
                    gnVar.a(iqVar);
                    if (gnVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (lnVar2 = this.o) != null) {
                    if (this.ai == null) {
                        this.ai = new go(this, 1);
                    }
                    lnVar2.l(gnVar.h, this.ai);
                }
                gnVar.h.s();
                if (!callbackH.onCreatePanelMenu(i, gnVar.h)) {
                    gnVar.a(null);
                    if (!z2 || (lnVar = this.o) == null) {
                        return false;
                    }
                    lnVar.l(null, this.ai);
                    return false;
                }
                gnVar.o = false;
                gnVar.h.s();
                bundle = gnVar.p;
                if (bundle != null) {
                    gnVar.h.n(bundle);
                    gnVar.p = null;
                }
                if (!callbackH.onPreparePanel(0, gnVar.g, gnVar.h)) {
                    if (z2) {
                        lnVar3.l(null, this.ai);
                    }
                    gnVar.h.r();
                    return false;
                }
                if (keyEvent != null) {
                    deviceId = keyEvent.getDeviceId();
                } else {
                    deviceId = -1;
                }
                if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                gnVar.h.setQwertyMode(z);
                gnVar.h.r();
            }
            gnVar.k = true;
            gnVar.l = false;
            this.A = gnVar;
        }
        return true;
    }

    public final boolean U() {
        ViewGroup viewGroup;
        return this.O && (viewGroup = this.u) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void V(boolean z, boolean z2) {
        int i;
        Object obj;
        if (this.B) {
            return;
        }
        int iAa = aa();
        Context context = this.j;
        int iD = D(context, iAa);
        byte[] bArr = null;
        awq awqVarW = Build.VERSION.SDK_INT < 33 ? W(context) : null;
        if (!z2 && awqVarW != null) {
            awqVarW = awq.c(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        boolean z3 = false;
        Configuration configurationAk = ak(context, iD, awqVarW, null, false);
        if (this.aa) {
            this.aa = true;
            i = this.Z;
        } else {
            Object obj2 = this.i;
            if (obj2 instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    i = 0;
                } else {
                    try {
                        ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj2.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                        if (activityInfo != null) {
                            this.Z = activityInfo.configChanges;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        this.Z = 0;
                    }
                    this.aa = true;
                    i = this.Z;
                }
            } else {
                this.aa = true;
                i = this.Z;
            }
        }
        Configuration configuration = this.X;
        if (configuration == null) {
            configuration = this.j.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = configurationAk.uiMode & 48;
        awq awqVarC = awq.c(configuration.getLocales().toLanguageTags());
        awq awqVarC2 = awqVarW == null ? null : awq.c(configurationAk.getLocales().toLanguageTags());
        int i4 = i2 != i3 ? SemanticState.LiveRegion : 0;
        if (awqVarC2 != null && !awqVarC.equals(awqVarC2)) {
            i4 |= 8196;
        }
        if (((~i) & i4) != 0 && z && this.V && (K || this.W)) {
            Object obj3 = this.i;
            if (obj3 instanceof Activity) {
                Activity activity = (Activity) obj3;
                if (!activity.isChild()) {
                    if (Build.VERSION.SDK_INT >= 31 && (i4 & SemanticState.Multiline) != 0) {
                        activity.getWindow().getDecorView().setLayoutDirection(configurationAk.getLayoutDirection());
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity.recreate();
                    } else {
                        new Handler(activity.getMainLooper()).post(new mc(activity, 18, bArr));
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            obj = this.i;
            if (obj instanceof fx) {
                if ((i4 & SemanticState.LiveRegion) != 0) {
                    ((fx) obj).onNightModeChanged(iD);
                }
                if ((i4 & 4) != 0) {
                    ((fx) obj).onLocalesChanged(awqVarW);
                }
            }
        } else if (i4 != 0) {
            int i5 = i & i4;
            Context context2 = this.j;
            Resources resources = context2.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i3 | (resources.getConfiguration().uiMode & (-49));
            if (awqVarC2 != null) {
                dl.e(configuration2, awqVarC2);
            }
            resources.updateConfiguration(configuration2, null);
            int i6 = this.C;
            if (i6 != 0) {
                context2.setTheme(i6);
                context2.getTheme().applyStyle(this.C, true);
            }
            if (i5 == i4) {
                Object obj4 = this.i;
                if (obj4 instanceof Activity) {
                    Activity activity2 = (Activity) obj4;
                    if (activity2 instanceof bog) {
                        if (((bog) activity2).getLifecycle().a().a(bob.c)) {
                            activity2.onConfigurationChanged(configuration2);
                            this.k.getDecorView().dispatchConfigurationChanged(configuration2);
                        }
                    } else if (this.W && !this.B) {
                        activity2.onConfigurationChanged(configuration2);
                        this.k.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                }
            }
            obj = this.i;
            if (obj instanceof fx) {
                if ((i4 & SemanticState.LiveRegion) != 0) {
                    ((fx) obj).onNightModeChanged(iD);
                }
                if ((i4 & 4) != 0) {
                    ((fx) obj).onLocalesChanged(awqVarW);
                }
            }
        }
        if (awqVarC2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(awq.c(this.j.getResources().getConfiguration().getLocales().toLanguageTags()).e()));
        }
        if (iAa == 0) {
            ac(this.j).d();
        } else {
            gk gkVar = this.ab;
            if (gkVar != null) {
                gkVar.c();
            }
            if (iAa == 3) {
                ab(this.j).d();
                return;
            }
        }
        gk gkVar2 = this.ac;
        if (gkVar2 != null) {
            gkVar2.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final View X(String str, Context context, AttributeSet attributeSet) {
        View kqVar;
        AppCompatViewInflater appCompatViewInflater = this.af;
        View view = null;
        ?? r0 = appCompatViewInflater;
        if (appCompatViewInflater == null) {
            Context context2 = this.j;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(he.j);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                AppCompatViewInflater appCompatViewInflater2 = new AppCompatViewInflater();
                this.af = appCompatViewInflater2;
                r0 = appCompatViewInflater2;
            } else {
                try {
                    AppCompatViewInflater appCompatViewInflater3 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.af = appCompatViewInflater3;
                    r0 = appCompatViewInflater3;
                } catch (Throwable unused) {
                    AppCompatViewInflater appCompatViewInflater4 = new AppCompatViewInflater();
                    this.af = appCompatViewInflater4;
                    r0 = appCompatViewInflater4;
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, he.y, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context rtVar = (resourceId == 0 || ((context instanceof rt) && ((rt) context).a == resourceId)) ? context : new rt(context, resourceId);
        switch (str) {
            case "RatingBar":
                kqVar = new kq(rtVar, attributeSet);
                break;
            case "CheckedTextView":
                kqVar = new ki(rtVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                kqVar = new km(rtVar, attributeSet);
                break;
            case "TextView":
                kqVar = r0.e(rtVar, attributeSet);
                break;
            case "ImageButton":
                kqVar = new AppCompatImageButton(rtVar, attributeSet);
                break;
            case "SeekBar":
                kqVar = new kr(rtVar, attributeSet);
                break;
            case "Spinner":
                kqVar = new AppCompatSpinner(rtVar, attributeSet);
                break;
            case "RadioButton":
                kqVar = r0.d(rtVar, attributeSet);
                break;
            case "ToggleButton":
                kqVar = new lk(rtVar, attributeSet);
                break;
            case "ImageView":
                kqVar = new AppCompatImageView(rtVar, attributeSet);
                break;
            case "AutoCompleteTextView":
                kqVar = r0.a(rtVar, attributeSet);
                break;
            case "CheckBox":
                kqVar = r0.c(rtVar, attributeSet);
                break;
            case "EditText":
                kqVar = new AppCompatEditText(rtVar, attributeSet);
                break;
            case "Button":
                kqVar = r0.b(rtVar, attributeSet);
                break;
            default:
                kqVar = null;
                break;
        }
        if (kqVar == null && context != rtVar) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = r0.f;
                objArr[0] = rtVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i = 0;
                    while (true) {
                        if (i < 3) {
                            View viewF = r0.f(rtVar, str, AppCompatViewInflater.e[i]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view = viewF;
                                r0 = r0;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                            r0 = r0;
                        }
                    }
                } else {
                    View viewF2 = r0.f(rtVar, str, null);
                    Object[] objArr2 = r0.f;
                    objArr2[0] = null;
                    objArr2[1] = null;
                    view = viewF2;
                    r0 = objArr2;
                }
            } catch (Exception unused2) {
                Object[] objArr3 = r0.f;
                objArr3[0] = view;
                objArr3[1] = view;
            } catch (Throwable th) {
                Object[] objArr4 = r0.f;
                objArr4[0] = view;
                objArr4[1] = view;
                throw th;
            }
            kqVar = view;
        }
        if (kqVar != null) {
            Context context3 = kqVar.getContext();
            if ((context3 instanceof ContextWrapper) && kqVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, AppCompatViewInflater.a);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    kqVar.setOnClickListener(new gt(kqVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = rtVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.b);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    bac.q(kqVar, typedArrayObtainStyledAttributes4.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = rtVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.c);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    bac.r(kqVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = rtVar.obtainStyledAttributes(attributeSet, AppCompatViewInflater.d);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    int i2 = bac.a;
                    new azk(Boolean.class).e(kqVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return kqVar;
    }

    public final gn Y(int i) {
        gn[] gnVarArr = this.T;
        if (gnVarArr == null || gnVarArr.length <= i) {
            gn[] gnVarArr2 = new gn[i + 1];
            if (gnVarArr != null) {
                System.arraycopy(gnVarArr, 0, gnVarArr2, 0, gnVarArr.length);
            }
            this.T = gnVarArr2;
            gnVarArr = gnVarArr2;
        }
        gn gnVar = gnVarArr[i];
        if (gnVar != null) {
            return gnVar;
        }
        gn gnVar2 = new gn(i);
        gnVarArr[i] = gnVar2;
        return gnVar2;
    }

    public final boolean Z(gn gnVar, int i, KeyEvent keyEvent) {
        iq iqVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((gnVar.k || T(gnVar, keyEvent)) && (iqVar = gnVar.h) != null) {
            return iqVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    @Override // defpackage.ga
    public final int a() {
        return this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v46, types: [org.xmlpull.v1.XmlSerializer] */
    @Override // defpackage.ga
    public final Context b(Context context) {
        Configuration configuration;
        this.V = true;
        int iD = D(context, aa());
        if (x(context) && ga.x(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (ga.h) {
                    awq awqVar = ga.c;
                    if (awqVar == null) {
                        if (ga.d == null) {
                            ga.d = awq.c(atf.a(context));
                        }
                        if (!ga.d.g()) {
                            ga.c = ga.d;
                        }
                    } else if (!awqVar.equals(ga.d)) {
                        awq awqVar2 = ga.c;
                        ga.d = awqVar2;
                        String strE = awqVar2.e();
                        synchronized (atf.a) {
                            try {
                                ?? Equals = strE.equals("");
                                if (Equals != 0) {
                                    context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                                } else {
                                    try {
                                        Equals = context.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                        ?? NewSerializer = Xml.newSerializer();
                                        try {
                                            try {
                                                NewSerializer.setOutput(Equals, null);
                                                NewSerializer.startDocument("UTF-8", Boolean.TRUE);
                                                NewSerializer.startTag(null, "locales");
                                                NewSerializer.attribute(null, "application_locales", strE);
                                                NewSerializer.endTag(null, "locales");
                                                NewSerializer.endDocument();
                                                if (Equals != 0) {
                                                    try {
                                                        Equals.close();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                if (Equals != 0) {
                                                    try {
                                                        Equals.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e) {
                                            Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                            if (Equals != 0) {
                                                Equals.close();
                                            }
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        Equals = String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                                        Log.w("AppLocalesStorageHelper", (String) Equals);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } else if (!ga.e) {
                ga.a.execute(new bh(context, 17));
            }
        }
        awq awqVarW = W(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(ak(context, iD, awqVarW, null, false));
                return context;
            } catch (IllegalStateException unused4) {
            }
        }
        if (context instanceof rt) {
            try {
                ((rt) context).a(ak(context, iD, awqVarW, null, false));
                return context;
            } catch (IllegalStateException unused5) {
            }
        }
        if (!K) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                if (configuration3.fontScale != configuration4.fontScale) {
                    configuration.fontScale = configuration4.fontScale;
                }
                if (configuration3.mcc != configuration4.mcc) {
                    configuration.mcc = configuration4.mcc;
                }
                if (configuration3.mnc != configuration4.mnc) {
                    configuration.mnc = configuration4.mnc;
                }
                LocaleList locales = configuration3.getLocales();
                LocaleList locales2 = configuration4.getLocales();
                if (!locales.equals(locales2)) {
                    configuration.setLocales(locales2);
                    configuration.locale = configuration4.locale;
                }
                if (configuration3.touchscreen != configuration4.touchscreen) {
                    configuration.touchscreen = configuration4.touchscreen;
                }
                if (configuration3.keyboard != configuration4.keyboard) {
                    configuration.keyboard = configuration4.keyboard;
                }
                if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                    configuration.keyboardHidden = configuration4.keyboardHidden;
                }
                if (configuration3.navigation != configuration4.navigation) {
                    configuration.navigation = configuration4.navigation;
                }
                if (configuration3.navigationHidden != configuration4.navigationHidden) {
                    configuration.navigationHidden = configuration4.navigationHidden;
                }
                if (configuration3.orientation != configuration4.orientation) {
                    configuration.orientation = configuration4.orientation;
                }
                if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                    configuration.screenLayout |= configuration4.screenLayout & 15;
                }
                if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                    configuration.screenLayout |= configuration4.screenLayout & 192;
                }
                if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                    configuration.screenLayout |= configuration4.screenLayout & 48;
                }
                if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                    configuration.screenLayout |= configuration4.screenLayout & 768;
                }
                if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                    configuration.colorMode |= configuration4.colorMode & 3;
                }
                if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                    configuration.colorMode |= configuration4.colorMode & 12;
                }
                if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                    configuration.uiMode |= configuration4.uiMode & 15;
                }
                if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                    configuration.uiMode |= configuration4.uiMode & 48;
                }
                if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                    configuration.screenWidthDp = configuration4.screenWidthDp;
                }
                if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                    configuration.screenHeightDp = configuration4.screenHeightDp;
                }
                if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                    configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                }
                if (configuration3.densityDpi != configuration4.densityDpi) {
                    configuration.densityDpi = configuration4.densityDpi;
                }
            }
        }
        Configuration configurationAk = ak(context, iD, awqVarW, configuration, true);
        rt rtVar = new rt(context, 2132084326);
        rtVar.a(configurationAk);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = rtVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    theme.rebase();
                } else {
                    synchronized (avs.a) {
                        if (!avs.c) {
                            try {
                                avs.b = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                avs.b.setAccessible(true);
                            } catch (NoSuchMethodException unused6) {
                            }
                            avs.c = true;
                        }
                        Method method = avs.b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException unused7) {
                                avs.b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused8) {
        }
        return rtVar;
    }

    @Override // defpackage.ga
    public final Context c() {
        return this.j;
    }

    @Override // defpackage.ga
    public final fl d() {
        ag();
        return this.m;
    }

    @Override // defpackage.ga
    public final fm e() {
        return new ge();
    }

    @Override // defpackage.ga
    public final hv f(hu huVar) {
        fy fyVar;
        if (huVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        hv hvVar = this.p;
        if (hvVar != null) {
            hvVar.f();
        }
        gg ggVar = new gg(this, huVar);
        fl flVarD = d();
        if (flVarD != null) {
            hv hvVarC = flVarD.c(ggVar);
            this.p = hvVarC;
            if (hvVarC != null && (fyVar = this.l) != null) {
                fyVar.onSupportActionModeStarted(hvVarC);
            }
        }
        if (this.p == null) {
            this.p = G(ggVar);
        }
        P();
        return this.p;
    }

    @Override // defpackage.ga
    public final MenuInflater g() {
        if (this.n == null) {
            ag();
            fl flVar = this.m;
            this.n = new ib(flVar != null ? flVar.b() : this.j);
        }
        return this.n;
    }

    @Override // defpackage.ga
    public final View h(int i) {
        ae();
        return this.k.findViewById(i);
    }

    @Override // defpackage.ga
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.L.a(this.k.getCallback());
    }

    @Override // defpackage.ga
    public final void j() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.j);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // defpackage.ga
    public final void k() {
        if (this.m == null || d().s()) {
            return;
        }
        ah(0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    @Override // defpackage.ga
    public final void l() {
        if (this.i instanceof Activity) {
            synchronized (ga.g) {
                ga.p(this);
            }
        }
        if (this.D) {
            this.k.getDecorView().removeCallbacks(this.ad);
        }
        this.B = true;
        if (this.Y != -100) {
            Object obj = this.i;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                I.put(obj.getClass().getName(), Integer.valueOf(this.Y));
            } else {
                I.remove(this.i.getClass().getName());
            }
        } else {
            I.remove(this.i.getClass().getName());
        }
        fl flVar = this.m;
        if (flVar != null) {
            flVar.e();
        }
        gk gkVar = this.ab;
        if (gkVar != null) {
            gkVar.c();
        }
        gk gkVar2 = this.ac;
        if (gkVar2 != null) {
            gkVar2.c();
        }
    }

    @Override // defpackage.ga
    public final void m() {
        fl flVarD = d();
        if (flVarD != null) {
            flVarD.m(true);
        }
    }

    @Override // defpackage.ga
    public final void n() {
        V(true, false);
    }

    @Override // defpackage.ga
    public final void o() {
        fl flVarD = d();
        if (flVarD != null) {
            flVarD.m(false);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return X(str, context, attributeSet);
    }

    @Override // defpackage.ga
    public final void q(int i) {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            LayoutInflater.from(this.j).inflate(i, viewGroup);
        }
        this.L.a(this.k.getCallback());
    }

    @Override // defpackage.ga
    public final void r(View view) {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
        this.L.a(this.k.getCallback());
    }

    @Override // defpackage.ga
    public final void s(View view, ViewGroup.LayoutParams layoutParams) {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view, layoutParams);
        }
        this.L.a(this.k.getCallback());
    }

    @Override // defpackage.ga
    public final void t(int i) {
        if (this.Y != i) {
            this.Y = i;
            if (this.V) {
                V(true, true);
            }
        }
    }

    @Override // defpackage.ga
    public final void u(Toolbar toolbar) {
        if (this.i instanceof Activity) {
            fl flVarD = d();
            if (flVarD instanceof hd) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.n = null;
            if (flVarD != null) {
                flVarD.e();
            }
            this.m = null;
            if (toolbar != null) {
                gx gxVar = new gx(toolbar, I(), this.L);
                this.m = gxVar;
                this.L.d = gxVar.d;
                if (!toolbar.B) {
                    toolbar.B = true;
                    toolbar.w();
                }
            } else {
                this.L.d = null;
            }
            k();
        }
    }

    @Override // defpackage.ga
    public final void v(int i) {
        this.C = i;
    }

    @Override // defpackage.ga
    public final void w(CharSequence charSequence) {
        this.M = charSequence;
        ln lnVar = this.o;
        if (lnVar != null) {
            lnVar.o(charSequence);
            return;
        }
        fl flVar = this.m;
        if (flVar != null) {
            flVar.o(charSequence);
            return;
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.ga
    public final boolean y(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.z && i == 108) {
            return false;
        }
        if (this.v && i == 1) {
            this.v = false;
        }
        if (i == 1) {
            aj();
            this.z = true;
        } else if (i == 2) {
            aj();
            this.Q = true;
        } else if (i == 5) {
            aj();
            this.R = true;
        } else if (i == 10) {
            aj();
            this.x = true;
        } else if (i == 108) {
            aj();
            this.v = true;
        } else {
            if (i != 109) {
                return this.k.requestFeature(i);
            }
            aj();
            this.w = true;
        }
        return true;
    }

    @Override // defpackage.ga
    public final void z() {
        String strF;
        this.V = true;
        V(false, true);
        af();
        Object obj = this.i;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strF = api.f(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strF = null;
            }
            if (strF != null) {
                fl flVar = this.m;
                if (flVar == null) {
                    this.ae = true;
                } else {
                    flVar.g(true);
                }
            }
            synchronized (ga.g) {
                ga.p(this);
                ga.f.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.j.getResources().getConfiguration());
        this.W = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return X(str, context, attributeSet);
    }

    @Override // defpackage.ga
    public final void B() {
    }
}
