package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.ssn;
import defpackage.sso;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ImageGridRecyclerView extends RecyclerView {
    private final int ae;
    private final GridLayoutManager af;

    public ImageGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ae = context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width);
        ssn ssnVar = new ssn(getContext());
        this.af = ssnVar;
        ah(ssnVar);
        aJ(new sso(context));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.af.b(Math.max(1, getMeasuredWidth() / this.ae));
    }
}
