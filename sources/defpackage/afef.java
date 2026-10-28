package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afef extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final afee n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final avgj t;

    public afef(TextInputLayout textInputLayout, ahto ahtoVar) {
        super(textInputLayout.getContext());
        int i = 0;
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new afed(this);
        avgj avgjVar = new avgj(this);
        this.t = avgjVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonW = w(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.b = checkableImageButtonW;
        CheckableImageButton checkableImageButtonW2 = w(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.d = checkableImageButtonW2;
        this.n = new afee(this, ahtoVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = afen.a;
        if (ahtoVar.H(38)) {
            this.c = afba.Y(getContext(), ahtoVar, 38);
        }
        if (ahtoVar.H(39)) {
            this.m = a.l(ahtoVar.w(39, -1), null);
        }
        if (ahtoVar.H(37)) {
            p(ahtoVar.B(37));
        }
        checkableImageButtonW.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonW.setImportantForAccessibility(2);
        checkableImageButtonW.setClickable(false);
        checkableImageButtonW.c = false;
        checkableImageButtonW.a(false);
        checkableImageButtonW.setFocusable(false);
        if (!ahtoVar.H(54)) {
            if (ahtoVar.H(32)) {
                this.f = afba.Y(getContext(), ahtoVar, 32);
            }
            if (ahtoVar.H(33)) {
                this.g = a.l(ahtoVar.w(33, -1), null);
            }
        }
        int i2 = 1;
        if (ahtoVar.H(30)) {
            n(ahtoVar.w(30, 0));
            if (ahtoVar.H(27)) {
                k(ahtoVar.D(27));
            }
            j(ahtoVar.G(26, true));
        } else if (ahtoVar.H(54)) {
            if (ahtoVar.H(55)) {
                this.f = afba.Y(getContext(), ahtoVar, 55);
            }
            if (ahtoVar.H(56)) {
                this.g = a.l(ahtoVar.w(56, -1), null);
            }
            n(ahtoVar.G(54, false) ? 1 : 0);
            k(ahtoVar.D(52));
        }
        int iV = ahtoVar.v(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iV < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iV != this.p) {
            this.p = iV;
            aewp.g(checkableImageButtonW2, iV);
            aewp.g(checkableImageButtonW, iV);
        }
        if (ahtoVar.H(31)) {
            ImageView.ScaleType scaleTypeD = aewp.d(ahtoVar.w(31, -1));
            checkableImageButtonW2.setScaleType(scaleTypeD);
            checkableImageButtonW.setScaleType(scaleTypeD);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ahtoVar.z(73, 0));
        if (ahtoVar.H(74)) {
            appCompatTextView.setTextColor(ahtoVar.A(74));
        }
        CharSequence charSequenceD = ahtoVar.D(72);
        this.h = true != TextUtils.isEmpty(charSequenceD) ? charSequenceD : null;
        appCompatTextView.setText(charSequenceD);
        y();
        frameLayout.addView(checkableImageButtonW2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonW);
        checkableImageButtonW.d = new afec(this, i2);
        checkableImageButtonW2.d = new afec(this, i);
        textInputLayout.n.add(avgjVar);
        if (textInputLayout.c != null) {
            avgjVar.d(textInputLayout);
        }
        addOnAttachStateChangeListener(new jh(this, 8));
    }

    private final CheckableImageButton w(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (afba.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void x() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || v()) ? 8 : 0);
        char c = (this.h == null || this.q) ? '\b' : (char) 0;
        if (!u() && !v() && c != 0) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void y() {
        TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        x();
        textView.setVisibility(i);
        this.a.K();
    }

    public final int a() {
        int marginStart;
        if (u() || v()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final afeg c() {
        int i = this.e;
        afee afeeVar = this.n;
        SparseArray sparseArray = (SparseArray) afeeVar.c;
        afeg afduVar = (afeg) sparseArray.get(i);
        if (afduVar == null) {
            if (i == -1) {
                afduVar = new afdu((afef) afeeVar.d);
            } else if (i == 0) {
                afduVar = new afeg((afef) afeeVar.d);
            } else if (i == 1) {
                afduVar = new afem((afef) afeeVar.d, afeeVar.b);
            } else if (i == 2) {
                afduVar = new afdt((afef) afeeVar.d);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a.bR(i, "Invalid end icon mode: "));
                }
                afduVar = new afeb((afef) afeeVar.d);
            }
            sparseArray.append(i, afduVar);
        }
        return afduVar;
    }

    final CharSequence d() {
        return this.d.getContentDescription();
    }

    public final void e() {
        AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void f(boolean z) {
        this.q = z;
        y();
    }

    public final void g() {
        aewp.f(this.a, this.d, this.f);
    }

    final void h(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        CheckableImageButton checkableImageButton2;
        boolean z2;
        afeg afegVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (afegVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != afegVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!afegVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == afegVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            g();
        }
    }

    public final void i() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void j(boolean z) {
        this.d.a(z);
    }

    final void k(CharSequence charSequence) {
        if (d() != charSequence) {
            CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setContentDescription(charSequence);
            aewp.j(checkableImageButton, charSequence);
        }
    }

    public final void l(int i) {
        m(i != 0 ? dl.d(getContext(), i) : null);
    }

    public final void m(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            aewp.e(this.a, checkableImageButton, this.f, this.g);
            g();
        }
    }

    public final void n(int i) {
        if (this.e != i) {
            afeg afegVarC = c();
            i();
            this.s = null;
            afegVarC.j();
            this.e = i;
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((afes) it.next()).a();
            }
            o(i != 0);
            afeg afegVarC2 = c();
            int iB = this.n.a;
            if (iB == 0) {
                iB = afegVarC2.b();
            }
            l(iB);
            j(afegVarC2.s());
            TextInputLayout textInputLayout = this.a;
            int i2 = textInputLayout.m;
            if (!afegVarC2.o(i2)) {
                throw new IllegalStateException(a.bQ(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
            }
            afegVarC2.i();
            this.s = afegVarC2.A();
            e();
            View.OnClickListener onClickListenerC = afegVarC2.c();
            CheckableImageButton checkableImageButton = this.d;
            aewp.h(checkableImageButton, onClickListenerC);
            int iA = afegVarC2.a();
            k(iA != 0 ? getResources().getText(iA) : null);
            EditText editText = this.j;
            if (editText != null) {
                afegVarC2.g(editText);
                q(afegVarC2);
            }
            aewp.e(textInputLayout, checkableImageButton, this.f, this.g);
            h(true);
        }
    }

    public final void o(boolean z) {
        EditText editText;
        if (u() != z) {
            if (!z && this.d.hasFocus() && (editText = this.j) != null) {
                editText.requestFocus();
            }
            this.d.setVisibility(true != z ? 8 : 0);
            x();
            s();
            this.a.K();
        }
    }

    final void p(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        r();
        aewp.e(this.a, checkableImageButton, this.c, this.m);
    }

    public final void q(afeg afegVar) {
        EditText editText = this.j;
        if (editText != null) {
            if (afegVar.d() != null) {
                editText.setOnFocusChangeListener(afegVar.d());
            }
            if (afegVar.e() != null) {
                this.d.setOnFocusChangeListener(afegVar.e());
            }
        }
    }

    public final void r() {
        CheckableImageButton checkableImageButton = this.b;
        int i = 8;
        if (checkableImageButton.getDrawable() != null) {
            TextInputLayout textInputLayout = this.a;
            if (textInputLayout.d.g && textInputLayout.J()) {
                i = 0;
            }
        }
        checkableImageButton.setVisibility(i);
        x();
        s();
        if (t()) {
            return;
        }
        this.a.K();
    }

    public final void s() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c != null) {
            int paddingEnd = 0;
            if (!u() && !v()) {
                paddingEnd = textInputLayout.c.getPaddingEnd();
            }
            this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
        }
    }

    public final boolean t() {
        return this.e != 0;
    }

    public final boolean u() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean v() {
        return this.b.getVisibility() == 0;
    }
}
