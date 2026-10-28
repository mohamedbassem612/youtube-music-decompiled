package com.google.android.libraries.youtube.creation.effects.deprecated.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.uxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class FilterThumbnailContainer extends FrameLayout {
    public FilterThumbnailContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOutlineProvider(new uxy(getResources().getDimension(R.dimen.camera_filter_preview_item_corner_radius)));
        setClipToOutline(true);
    }
}
