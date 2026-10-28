package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dlj;
import defpackage.dlk;
import defpackage.dlm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final dlm e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new dlm(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.m, i, i2);
        o(aun.h(typedArrayObtainStyledAttributes, 7, 0));
        l(aun.h(typedArrayObtainStyledAttributes, 6, 1));
        this.c = aun.h(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = aun.h(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = aun.i(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.e(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.d(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public void a(dlj dljVar) {
        super.a(dljVar);
        ae(dljVar.C(R.id.switchWidget));
        ad(dljVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        H();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(R.id.switchWidget));
            p(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
