package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dlj;
import defpackage.dlk;
import defpackage.dlm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final dlm c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iC = aun.c(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iC, 0);
        this.c = new dlm(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.b, iC, 0);
        o(aun.h(typedArrayObtainStyledAttributes, 5, 0));
        l(aun.h(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = aun.i(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        super.a(dljVar);
        ae(dljVar.C(android.R.id.checkbox));
        ad(dljVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        H();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(android.R.id.checkbox));
            p(view.findViewById(android.R.id.summary));
        }
    }
}
