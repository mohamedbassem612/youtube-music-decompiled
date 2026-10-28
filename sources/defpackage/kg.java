package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kg extends Button {
    public final kf a;
    private final le b;
    private ld c;
    private pj d;

    public kg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ox.d(this, getContext());
        kf kfVar = new kf(this);
        this.a = kfVar;
        kfVar.b(attributeSet, i);
        le leVar = new le(this);
        this.b = leVar;
        leVar.h(attributeSet, i);
        leVar.e();
        c().i(attributeSet, i);
    }

    private final pj c() {
        pj pjVar = this.d;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.d = pjVar2;
        return pjVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.a();
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (pl.c) {
            return super.getAutoSizeMaxTextSize();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (pl.c) {
            return super.getAutoSizeMinTextSize();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (pl.c) {
            return super.getAutoSizeStepGranularity();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (pl.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        le leVar = this.b;
        return leVar != null ? leVar.p() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (pl.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return azw.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return kd().b;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return kd().a;
    }

    final ld kd() {
        ld ldVar = this.c;
        if (ldVar != null) {
            return ldVar;
        }
        ld ldVar2 = new ld(this, new cd(this, 6));
        this.c = ldVar2;
        return ldVar2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.q();
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        le leVar = this.b;
        if (leVar == null || pl.c || !leVar.o()) {
            return;
        }
        leVar.g();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        bme bmeVar = bme.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (pl.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (pl.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (pl.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.m(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        bme bmeVar = bme.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return kd().b(str);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        le leVar = this.b;
        if (leVar != null) {
            leVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (pl.c) {
            super.setTextSize(i, f);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        kd().a(typeface);
    }

    public kg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public kg(Context context) {
        this(context, null);
    }
}
