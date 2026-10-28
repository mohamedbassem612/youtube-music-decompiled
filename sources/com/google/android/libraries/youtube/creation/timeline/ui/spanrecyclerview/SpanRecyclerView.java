package com.google.android.libraries.youtube.creation.timeline.ui.spanrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.np;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SpanRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanRecyclerView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ah(np npVar) {
        if (npVar != null && !(npVar instanceof SpanLayoutManager)) {
            throw new IllegalArgumentException("SpanRecyclerViews only support SpanLayoutManager");
        }
        super.ah(npVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
