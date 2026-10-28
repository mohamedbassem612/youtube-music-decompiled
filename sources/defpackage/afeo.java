package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afeo extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public afeo(TextInputLayout textInputLayout, ahto ahtoVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (afba.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        i();
        j();
        int[] iArr = afen.a;
        if (ahtoVar.H(70)) {
            this.e = afba.Y(getContext(), ahtoVar, 70);
        }
        if (ahtoVar.H(71)) {
            this.f = a.l(ahtoVar.w(71, -1), null);
        }
        if (ahtoVar.H(67)) {
            Drawable drawableB = ahtoVar.B(67);
            checkableImageButton.setImageDrawable(drawableB);
            if (drawableB != null) {
                aewp.e(textInputLayout, checkableImageButton, this.e, this.f);
                f(true);
                d();
            } else {
                f(false);
                i();
                j();
                e(null);
            }
            if (ahtoVar.H(66)) {
                e(ahtoVar.D(66));
            }
            checkableImageButton.a(ahtoVar.G(65, true));
        }
        int iV = ahtoVar.v(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iV < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iV != this.g) {
            this.g = iV;
            aewp.g(checkableImageButton, iV);
        }
        if (ahtoVar.H(69)) {
            checkableImageButton.setScaleType(aewp.d(ahtoVar.w(69, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ahtoVar.z(61, 0));
        if (ahtoVar.H(62)) {
            appCompatTextView.setTextColor(ahtoVar.A(62));
        }
        CharSequence charSequenceD = ahtoVar.D(60);
        this.b = true != TextUtils.isEmpty(charSequenceD) ? charSequenceD : null;
        appCompatTextView.setText(charSequenceD);
        k();
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.d = new afec(this, 2);
    }

    private final void k() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.K();
    }

    public final int a() {
        int measuredWidth;
        if (h()) {
            CheckableImageButton checkableImageButton = this.c;
            measuredWidth = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + measuredWidth;
    }

    final CharSequence b() {
        return this.c.getContentDescription();
    }

    public final void c(boolean z) {
        this.h = z;
        k();
    }

    public final void d() {
        aewp.f(this.d, this.c, this.e);
    }

    final void e(CharSequence charSequence) {
        if (b() != charSequence) {
            CheckableImageButton checkableImageButton = this.c;
            checkableImageButton.setContentDescription(charSequence);
            aewp.j(checkableImageButton, charSequence);
        }
    }

    final void f(boolean z) {
        EditText editText;
        if (h() != z) {
            if (!z && this.c.hasFocus() && (editText = this.d.c) != null) {
                editText.requestFocus();
            }
            this.c.setVisibility(true != z ? 8 : 0);
            g();
            k();
        }
    }

    final void g() {
        EditText editText = this.d.c;
        if (editText != null) {
            this.a.setPaddingRelative(h() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    final boolean h() {
        return this.c.getVisibility() == 0;
    }

    final void i() {
        aewp.h(this.c, null);
    }

    final void j() {
        aewp.i(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }
}
