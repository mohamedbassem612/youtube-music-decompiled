package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afeb extends afeg {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public afeb(afef afefVar) {
        super(afefVar);
        this.l = new aefn(this, 11);
        this.m = new gxs(this, 6);
        this.n = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: afdz
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                afeb afebVar = this.a;
                AutoCompleteTextView autoCompleteTextView = afebVar.a;
                if (autoCompleteTextView == null || aewo.g(autoCompleteTextView)) {
                    return;
                }
                afebVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = afba.r(afefVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = afba.r(afefVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = afba.y(afefVar.getContext(), R.attr.motionEasingLinearInterpolator, aetz.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 14));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.afeg
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.afeg
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.afeg
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.afeg
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.afeg
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.afeg
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new jjx(this, 4));
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: afdy
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                afeb afebVar = this.a;
                afebVar.n();
                afebVar.k(false);
            }
        });
        this.a.setThreshold(0);
        TextInputLayout textInputLayout = this.e;
        textInputLayout.b.p(null);
        if (!aewo.g(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.p(true);
    }

    @Override // defpackage.afeg
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(this.i, 1.0f, 0.0f);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new afea(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.afeg
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.afeg
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && aewo.g(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new aemk(this, 19, null));
    }

    public final void m() {
        if (this.a != null) {
            if (p()) {
                this.c = false;
            }
            if (this.c) {
                this.c = false;
                return;
            }
            k(!this.o);
            boolean z = this.o;
            AutoCompleteTextView autoCompleteTextView = this.a;
            if (!z) {
                autoCompleteTextView.dismissDropDown();
            } else {
                autoCompleteTextView.requestFocus();
                this.a.showDropDown();
            }
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.afeg
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.afeg
    public final boolean q() {
        return true;
    }

    @Override // defpackage.afeg
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.afeg
    public final boolean s() {
        return true;
    }

    @Override // defpackage.afeg
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.afeg
    public final boolean u() {
        return true;
    }

    @Override // defpackage.afeg
    public final void v(bbz bbzVar) {
        if (!aewo.g(this.a)) {
            bbzVar.v(Spinner.class.getName());
        }
        if (bbzVar.a.isShowingHintText()) {
            bbzVar.F(null);
        }
    }

    @Override // defpackage.afeg
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || aewo.g(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
