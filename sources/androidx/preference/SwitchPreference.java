package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import defpackage.aun;
import defpackage.dlj;
import defpackage.dlk;
import defpackage.dlm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreference extends TwoStatePreference {
    private final dlm c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new dlm(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.l, i, i2);
        o(aun.h(typedArrayObtainStyledAttributes, 7, 0));
        l(aun.h(typedArrayObtainStyledAttributes, 6, 1));
        this.d = aun.h(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = aun.h(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = aun.i(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(dlj dljVar) {
        super.a(dljVar);
        ae(dljVar.C(R.id.switch_widget));
        ad(dljVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        H();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(R.id.switch_widget));
            p(view.findViewById(R.id.summary));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aun.c(context, com.google.android.apps.youtube.music.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context) {
        this(context, null);
    }
}
