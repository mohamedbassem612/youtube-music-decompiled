package com.google.android.apps.youtube.music.ui.common;

import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class NonPredictiveLinearLayoutManager extends LinearLayoutManager {
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
