package com.google.android.apps.youtube.music.ui.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;
import defpackage.adhg;
import defpackage.bac;
import defpackage.dlj;
import defpackage.ijt;
import defpackage.jad;
import defpackage.jae;
import defpackage.jkp;
import defpackage.tym;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SwitchCompatPreference extends SwitchPreferenceCompat {
    public ijt c;
    private adhg d;

    public SwitchCompatPreference(Context context) {
        super(context);
        ae(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    private final void ae(Context context, AttributeSet attributeSet) {
        ((jae) tym.O(this.j, jae.class)).bx(this);
        jkp jkpVar = (jkp) this.c.a.io();
        jkpVar.getClass();
        context.getClass();
        adhg adhgVar = new adhg(jkpVar, context, attributeSet);
        this.d = adhgVar;
        M(adhgVar.b(this.t));
    }

    @Override // androidx.preference.Preference
    public final void M(String str) {
        adhg adhgVar = this.d;
        if (adhgVar != null) {
            super.M(adhgVar.b(str));
        } else {
            super.M(str);
        }
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void a(dlj dljVar) {
        super.a(dljVar);
        TextView textView = (TextView) dljVar.C(R.id.title);
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setMaxLines(3);
        }
        bac.p(dljVar.a, new jad(this));
    }

    public SwitchCompatPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ae(context, attributeSet);
    }

    public SwitchCompatPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ae(context, attributeSet);
    }

    public SwitchCompatPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ae(context, attributeSet);
    }
}
