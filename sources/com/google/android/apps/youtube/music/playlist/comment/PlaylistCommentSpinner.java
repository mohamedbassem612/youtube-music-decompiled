package com.google.android.apps.youtube.music.playlist.comment;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PlaylistCommentSpinner extends AppCompatSpinner {
    public PlaylistCommentSpinner(Context context) {
        super(context);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public PlaylistCommentSpinner(Context context, int i) {
        super(context, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistCommentSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistCommentSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistCommentSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }

    public PlaylistCommentSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        setBackgroundResource(R.drawable.spinner_background_modern);
    }
}
