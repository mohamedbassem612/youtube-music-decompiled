package com.google.android.apps.youtube.music.ui.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceCategory;
import defpackage.dlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategoryCompat extends PreferenceCategory {
    public PreferenceCategoryCompat(Context context) {
        super(context);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(dlj dljVar) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.a(dljVar);
        if (TextUtils.isEmpty(this.q) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) dljVar.a.getLayoutParams()) != null) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        View viewC = dljVar.C(R.id.title);
        if (viewC == null || (view = (View) viewC.getParent()) == null || this.A) {
            return;
        }
        view.setPaddingRelative(0, 0, 0, 0);
    }

    public PreferenceCategoryCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreferenceCategoryCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PreferenceCategoryCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
