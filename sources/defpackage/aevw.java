package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevw extends gr {
    public BottomSheetBehavior a;
    public FrameLayout b;
    boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public aevv g;
    public aevq h;
    private FrameLayout i;
    private CoordinatorLayout j;
    private boolean k;
    private axlj l;

    public aevw(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.d = true;
        this.e = true;
        this.h = new aevu(this);
        e();
        i();
    }

    private final View h(int i, View view, ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.i.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.k) {
            FrameLayout frameLayout = this.i;
            bcs bcsVar = new bcs(this, 9, null);
            int i2 = bac.a;
            azs.c(frameLayout, bcsVar);
        }
        this.b.removeAllViews();
        FrameLayout frameLayout2 = this.b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new aefn(this, 9, null));
        bac.p(this.b, new aevt(this));
        this.b.setOnTouchListener(new vsl(5));
        return this.i;
    }

    private final void i() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aeyt, java.lang.Object] */
    private final void j() {
        axlj axljVar = this.l;
        if (axljVar != null) {
            if (!this.d) {
                axljVar.e();
                return;
            }
            Object obj = axljVar.a;
            if (obj != null) {
                ((aeyu) obj).b(axljVar.b, (View) axljVar.c, false);
            }
        }
    }

    private final void k() {
        if (this.i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.i = frameLayout;
            this.j = (CoordinatorLayout) this.i.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.i.findViewById(R.id.design_bottom_sheet);
            this.b = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorX = BottomSheetBehavior.x(frameLayout2);
            this.a = bottomSheetBehaviorX;
            bottomSheetBehaviorX.y(this.h);
            this.a.H(this.d);
            this.l = new axlj(this.a, this.b);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.a == null) {
            k();
        }
        return this.a;
    }

    public final void b() {
        this.c = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorA = a();
        if (!this.c || bottomSheetBehaviorA.F == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorA.I(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.k && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            azz.c(window, z2);
            aevv aevvVar = this.g;
            if (aevvVar != null) {
                aevvVar.c(window);
            }
        }
        j();
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        aevv aevvVar = this.g;
        if (aevvVar != null) {
            aevvVar.c(null);
        }
        axlj axljVar = this.l;
        if (axljVar != null) {
            axljVar.e();
        }
    }

    @Override // defpackage.qg, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.F != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(z);
            }
            if (getWindow() != null) {
                j();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(0, view, null));
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(i, null, null));
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(0, view, layoutParams));
    }

    public aevw(Context context) {
        this(context, 0);
        i();
    }
}
