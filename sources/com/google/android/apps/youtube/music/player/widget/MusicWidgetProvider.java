package com.google.android.apps.youtube.music.player.widget;

import android.content.Context;
import android.os.Bundle;
import defpackage.gzo;
import defpackage.iha;
import defpackage.ihd;
import defpackage.maq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicWidgetProvider extends iha {
    public ihd a;

    @Override // defpackage.mam
    public final maq b() {
        return maq.YTM_NOW_PLAYING_LEGACY;
    }

    @Override // defpackage.ihe
    public final String c() {
        return gzo.LEGACY.e;
    }

    @Override // defpackage.ihe
    public final void d(Context context, int i, Bundle bundle, int i2) {
        this.a.a(context, i, i2, bundle);
    }
}
