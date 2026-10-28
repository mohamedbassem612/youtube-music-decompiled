package com.google.android.libraries.youtube.creation.videoeffects.fragment;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class StickerCatalogRecyclerView extends RecyclerView {
    public final GridLayoutManager ae;

    public StickerCatalogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.ae = gridLayoutManager;
        ah(gridLayoutManager);
        af(null);
    }
}
