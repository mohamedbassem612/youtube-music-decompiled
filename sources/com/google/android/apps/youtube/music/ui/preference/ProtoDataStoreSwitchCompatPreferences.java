package com.google.android.apps.youtube.music.ui.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import defpackage.bac;
import defpackage.dlj;
import defpackage.izz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ProtoDataStoreSwitchCompatPreferences extends ProtoDataStoreSwitchPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoDataStoreSwitchCompatPreferences(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(dlj dljVar) {
        dljVar.getClass();
        super.a(dljVar);
        View viewC = dljVar.C(R.id.title);
        TextView textView = viewC instanceof TextView ? (TextView) viewC : null;
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setMaxLines(3);
        }
        bac.p(dljVar.a, new izz(this));
    }
}
