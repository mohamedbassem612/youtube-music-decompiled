package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import defpackage.dlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SpinnerSwitchPreference extends SwitchCompatPreference {
    private View d;
    private View e;

    public SpinnerSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = R.layout.progress_spinner_switch;
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference, androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(dlj dljVar) {
        super.a(dljVar);
        this.d = dljVar.C(android.R.id.checkbox);
        View viewC = dljVar.C(R.id.progress_spinner);
        this.e = viewC;
        if (viewC != null) {
            viewC.setVisibility(8);
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void c() {
        U(Boolean.valueOf(!((TwoStatePreference) this).a));
    }
}
