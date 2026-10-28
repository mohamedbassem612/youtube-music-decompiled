package com.google.android.apps.youtube.music.settings.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import defpackage.dlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SelectablePreference extends Preference {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectablePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        dljVar.getClass();
        super.a(dljVar);
        if (this.a) {
            View view = dljVar.a;
            view.setBackgroundColor(view.getContext().getColor(R.color.ytm_color_grey_11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectablePreference(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectablePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectablePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        attributeSet.getClass();
    }
}
