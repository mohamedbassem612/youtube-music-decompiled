package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aezb;
import defpackage.aezc;
import defpackage.aezq;
import defpackage.aezy;
import defpackage.aezz;
import defpackage.afac;
import defpackage.afag;
import defpackage.afah;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class LinearProgressIndicator extends aezb {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        aezz aezzVar = new aezz((afah) this.a);
        Context context2 = getContext();
        afah afahVar = (afah) this.a;
        setIndeterminateDrawable(new aezy(context2, afahVar, aezzVar, afahVar.q == 0 ? new afac(afahVar) : new afag(context2, afahVar)));
        setProgressDrawable(new aezq(getContext(), (afah) this.a, aezzVar));
        this.g = true;
    }

    @Override // defpackage.aezb
    public final /* synthetic */ aezc a(Context context, AttributeSet attributeSet) {
        return new afah(context, attributeSet);
    }

    @Override // defpackage.aezb
    public final void g(int i) {
        aezc aezcVar = this.a;
        if (aezcVar != null && ((afah) aezcVar).q == 0 && isIndeterminate()) {
            return;
        }
        super.g(i);
    }

    @Override // defpackage.aezb, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        afah afahVar = (afah) this.a;
        int i5 = afahVar.r;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        afahVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        aezy indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        aezq progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
