package com.google.android.apps.youtube.music.playlist.privacy;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.music.R;
import defpackage.aduv;
import defpackage.ikh;
import defpackage.ikj;
import defpackage.ikk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PlaylistPrivacySpinner extends AppCompatSpinner {
    public PlaylistPrivacySpinner(Context context) {
        super(context);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public final void c(aduv aduvVar) {
        setAdapter((SpinnerAdapter) new ikk(getContext(), this.a, ikh.values(), aduvVar));
        setSelection(ikh.d(2).ordinal());
    }

    public final int d() {
        return ((ikj) getSelectedItem()).e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public PlaylistPrivacySpinner(Context context, int i) {
        super(context, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistPrivacySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistPrivacySpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistPrivacySpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistPrivacySpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }
}
