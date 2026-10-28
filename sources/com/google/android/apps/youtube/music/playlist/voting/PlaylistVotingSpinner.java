package com.google.android.apps.youtube.music.playlist.voting;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.music.R;
import defpackage.aduv;
import defpackage.ikr;
import defpackage.ikt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PlaylistVotingSpinner extends AppCompatSpinner {
    public PlaylistVotingSpinner(Context context) {
        super(context);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public final void c(ikr[] ikrVarArr, int i, aduv aduvVar) {
        setAdapter((SpinnerAdapter) new ikt(getContext(), this.a, ikrVarArr, aduvVar));
        setSelection(i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public PlaylistVotingSpinner(Context context, int i) {
        super(context, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistVotingSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistVotingSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistVotingSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistVotingSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }
}
