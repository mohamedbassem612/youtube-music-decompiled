package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends fl implements jp {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    hc f;
    hv g;
    hu h;
    public int i;
    public boolean j;
    public boolean k;
    public id l;
    boolean m;
    final baj n;
    final baj o;
    ph p;
    final qcb q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public hd(Activity activity, boolean z) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ha(this);
        this.o = new hb(this);
        this.q = new qcb(this);
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    static boolean D(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.youtube.music.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((hd) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int i2 = bac.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        View viewFindViewById = view.findViewById(com.google.android.apps.youtube.music.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).A();
        this.d = (ActionBarContextView) view.findViewById(com.google.android.apps.youtube.music.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.youtube.music.R.id.action_bar_container);
        this.c = actionBarContainer;
        ph phVar = this.p;
        if (phVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = phVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i3 = context.getApplicationInfo().targetSdkVersion;
        qa.C(context);
        F();
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, he.a, com.google.android.apps.youtube.music.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.c;
            int i4 = bac.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void F() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    public final void A(boolean z) {
        ci ciVarG;
        ci ciVarG2;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                C(false);
            }
        } else if (z2) {
            this.x = false;
            C(false);
        }
        if (!this.c.isLaidOut()) {
            ph phVar = this.p;
            if (z) {
                phVar.l(4);
                this.d.setVisibility(0);
                return;
            } else {
                phVar.l(0);
                this.d.setVisibility(8);
                return;
            }
        }
        ph phVar2 = this.p;
        if (z) {
            ciVarG = phVar2.r(4, 100L);
            ciVarG2 = this.d.g(0, 200L);
        } else {
            ci ciVarR = phVar2.r(0, 200L);
            ciVarG = this.d.g(8, 100L);
            ciVarG2 = ciVarR;
        }
        id idVar = new id();
        ArrayList arrayList = idVar.a;
        arrayList.add(ciVarG);
        View view = (View) ((WeakReference) ciVarG.a).get();
        ciVarG2.u(view != null ? view.animate().getDuration() : 0L);
        arrayList.add(ciVarG2);
        idVar.b();
    }

    public final void B(int i, int i2) {
        ph phVar = this.p;
        int i3 = phVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        phVar.d((i & i2) | (i3 & (~i2)));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    public final void C(boolean z) {
        View view;
        View view2;
        View view3;
        boolean zD = D(this.k, this.x);
        boolean z2 = this.y;
        if (!zD) {
            if (z2) {
                this.y = false;
                id idVar = this.l;
                if (idVar != null) {
                    idVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    id idVar2 = new id();
                    float f = -this.c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    ci ciVarX = bac.x(this.c);
                    ciVarX.w(f);
                    ciVarX.aF(this.q);
                    idVar2.f(ciVarX);
                    if (this.j && (view = this.e) != null) {
                        ci ciVarX2 = bac.x(view);
                        ciVarX2.w(f);
                        idVar2.f(ciVarX2);
                    }
                    idVar2.d(r);
                    idVar2.c();
                    idVar2.e(this.n);
                    this.l = idVar2;
                    idVar2.b();
                    return;
                }
                this.n.a(null);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.y = true;
        id idVar3 = this.l;
        if (idVar3 != null) {
            idVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a(null);
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j) {
                        view2.setTranslationY(0.0f);
                    }
                    this.o.a(null);
                }
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.c.setTranslationY(f2);
            id idVar4 = new id();
            ci ciVarX3 = bac.x(this.c);
            ciVarX3.w(0.0f);
            ciVarX3.aF(this.q);
            idVar4.f(ciVarX3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                ci ciVarX4 = bac.x(this.e);
                ciVarX4.w(0.0f);
                idVar4.f(ciVarX4);
            }
            idVar4.d(s);
            idVar4.c();
            idVar4.e(this.o);
            this.l = idVar4;
            idVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int i = bac.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.fl
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.fl
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.youtube.music.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.fl
    public final hv c(hu huVar) {
        hc hcVar = this.f;
        if (hcVar != null) {
            hcVar.f();
        }
        this.b.k(false);
        this.d.i();
        hc hcVar2 = new hc(this, this.d.getContext(), huVar);
        iq iqVar = hcVar2.a;
        iqVar.s();
        try {
            boolean zC = hcVar2.b.c(hcVar2, iqVar);
            hcVar2.a.r();
            if (!zC) {
                return null;
            }
            this.f = hcVar2;
            hcVar2.g();
            this.d.h(hcVar2);
            A(true);
            return hcVar2;
        } catch (Throwable th) {
            hcVar2.a.r();
            throw th;
        }
    }

    @Override // defpackage.fl
    public final void d(boolean z) {
        if (z != this.v) {
            this.v = z;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fk) arrayList.get(i)).a();
            }
        }
    }

    @Override // defpackage.fl
    public final void f(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.c;
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.b);
        }
        actionBarContainer.b = drawable;
        drawable.setCallback(actionBarContainer);
        boolean z = false;
        if (actionBarContainer.a != null) {
            drawable.setBounds(0, 0, actionBarContainer.getMeasuredWidth(), actionBarContainer.getMeasuredHeight());
        }
        if (!actionBarContainer.e ? !(actionBarContainer.b != null || actionBarContainer.c != null) : actionBarContainer.d == null) {
            z = true;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
        actionBarContainer.invalidateOutline();
    }

    @Override // defpackage.fl
    public final void g(boolean z) {
        if (this.u) {
            return;
        }
        B(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.fl
    public final void h(boolean z) {
        B(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.fl
    public final void i(boolean z) {
        B(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.fl
    public final void j(boolean z) {
        B(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.fl
    public final void k(Drawable drawable) {
        this.p.j(drawable);
    }

    @Override // defpackage.fl
    public final void l(int i) {
        this.p.e(i);
    }

    @Override // defpackage.fl
    public final void m(boolean z) {
        id idVar;
        this.z = z;
        if (z || (idVar = this.l) == null) {
            return;
        }
        idVar.a();
    }

    @Override // defpackage.fl
    public final void n(CharSequence charSequence) {
        this.p.k(charSequence);
    }

    @Override // defpackage.fl
    public final void o(CharSequence charSequence) {
        this.p.m(charSequence);
    }

    @Override // defpackage.fl
    public final boolean r() {
        ph phVar = this.p;
        if (phVar == null || !phVar.n()) {
            return false;
        }
        phVar.b();
        return true;
    }

    @Override // defpackage.fl
    public final boolean t(int i, KeyEvent keyEvent) {
        hc hcVar = this.f;
        if (hcVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        iq iqVar = hcVar.a;
        iqVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return iqVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.fl
    public final void w() {
        qa.C(this.a);
        F();
    }

    @Override // defpackage.fl
    public final void x() {
        B(0, 1);
    }

    @Override // defpackage.fl
    public final void y() {
        this.p.i(com.google.android.apps.youtube.music.R.string.navigate_back);
    }

    @Override // defpackage.fl
    public final void z() {
        this.p.g(null);
    }

    @Override // defpackage.fl
    public final void p() {
    }

    public hd(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ha(this);
        this.o = new hb(this);
        this.q = new qcb(this);
        E(dialog.getWindow().getDecorView());
    }
}
