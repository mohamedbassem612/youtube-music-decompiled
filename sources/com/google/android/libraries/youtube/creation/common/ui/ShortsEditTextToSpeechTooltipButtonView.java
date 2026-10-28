package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.uhx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ShortsEditTextToSpeechTooltipButtonView extends LinearLayout {
    private ImageView a;

    public ShortsEditTextToSpeechTooltipButtonView(Context context, AttributeSet attributeSet) {
        ImageView imageView;
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.shorts_edit_text_to_speech_tooltip_button, this);
        setVerticalGravity(16);
        setOrientation(0);
        this.a = (ImageView) findViewById(R.id.shorts_edit_text_to_speech_tooltip_icon);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, uhx.d, 0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, -1);
            if (resourceId != -1 && (imageView = this.a) != null) {
                imageView.setImageDrawable(getContext().getResources().getDrawable(resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ShortsEditTextToSpeechTooltipButtonView(Context context) {
        this(context, null);
    }
}
