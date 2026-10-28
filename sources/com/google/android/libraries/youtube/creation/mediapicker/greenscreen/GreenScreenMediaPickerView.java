package com.google.android.libraries.youtube.creation.mediapicker.greenscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class GreenScreenMediaPickerView extends LinearLayout {
    public final HorizontalScrollView a;
    public final LinearLayout b;

    public GreenScreenMediaPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.choose_asset_view, this);
        this.a = (HorizontalScrollView) findViewById(R.id.asset_list_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.asset_list);
        this.b = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.green_screen_media_list_vertical_margin);
        layoutParams2.topMargin = dimensionPixelSize;
        layoutParams2.bottomMargin = dimensionPixelSize;
        linearLayout.setLayoutParams(layoutParams2);
        setImportantForAccessibility(1);
    }
}
