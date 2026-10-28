package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.uhx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ShortsEditTooltipButtonView extends LinearLayout {
    public final ImageView a;
    private final TextView b;

    public ShortsEditTooltipButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.shorts_edit_tooltip_button, this);
        TextView textView = (TextView) findViewById(R.id.shorts_edit_tooltip_text);
        this.b = textView;
        ImageView imageView = (ImageView) findViewById(R.id.shorts_edit_tooltip_icon);
        this.a = imageView;
        setVerticalGravity(16);
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uhx.e, 0, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, -1);
                if (resourceId != -1) {
                    imageView.setImageDrawable(getContext().getResources().getDrawable(resourceId));
                }
                String string = typedArrayObtainStyledAttributes.getString(1);
                if (string != null) {
                    textView.setText(string);
                }
                String string2 = typedArrayObtainStyledAttributes.getString(0);
                if (string2 != null) {
                    setContentDescription(string2);
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public ShortsEditTooltipButtonView(Context context) {
        this(context, null);
    }
}
