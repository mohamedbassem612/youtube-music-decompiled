package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.tzk;
import defpackage.uhx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ShortsEditToolButtonView extends FrameLayout {
    public TextView a;
    public ImageView b;
    private final Context c;

    public ShortsEditToolButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        LayoutInflater.from(context).inflate(R.layout.shorts_edit_tool_button, this);
        ImageView imageView = (ImageView) findViewById(R.id.shorts_edit_tool_icon);
        imageView.getClass();
        this.b = imageView;
        TextView textView = (TextView) findViewById(R.id.shorts_edit_tool_text);
        textView.getClass();
        this.a = textView;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uhx.a, 0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                ImageView imageView2 = this.b;
                imageView2.getClass();
                imageView2.setImageTintList(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(5, -1)));
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, -1);
            if (resourceId != -1) {
                ImageView imageView3 = this.b;
                imageView3.getClass();
                imageView3.setImageDrawable(context.getDrawable(resourceId));
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            TextView textView2 = this.a;
            textView2.getClass();
            textView2.setText(string);
            setContentDescription(typedArrayObtainStyledAttributes.getString(0));
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.a;
        textView.getClass();
        textView.setEnabled(z);
        Context context = getContext();
        ImageView imageView = this.b;
        imageView.getClass();
        if (context != null) {
            if (z) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(new PorterDuffColorFilter(tzk.n(context, R.attr.ytOverlayButtonPrimary).orElse(context.getResources().getColor(R.color.yt_white1_opacity30)), PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public ShortsEditToolButtonView(Context context) {
        this(context, null);
    }
}
