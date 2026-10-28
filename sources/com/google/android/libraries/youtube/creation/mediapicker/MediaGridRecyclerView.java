package com.google.android.libraries.youtube.creation.mediapicker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.nh;
import defpackage.vcu;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MediaGridRecyclerView extends RecyclerView {
    private final int ae;
    private final MediaGridLayoutManager af;

    public MediaGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Optional.empty();
        this.ae = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        vcu vcuVar = new vcu(getContext());
        this.af = vcuVar;
        ah(vcuVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ad(nh nhVar) {
        super.ad(nhVar);
        Optional.ofNullable(nhVar);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.af.b(Math.max(1, getMeasuredWidth() / this.ae));
    }
}
