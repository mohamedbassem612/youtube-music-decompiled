package com.google.android.apps.youtube.music.player.widget.gm3;

import android.content.Context;
import android.os.Bundle;
import defpackage.gzo;
import defpackage.ihy;
import defpackage.iid;
import defpackage.maq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FlipWidgetProvider extends iid {
    public ihy a;

    @Override // com.google.android.apps.youtube.music.player.widget.gm3.NowPlayingWidgetProvider, defpackage.mam
    public final maq b() {
        return maq.YTM_FLIP;
    }

    @Override // com.google.android.apps.youtube.music.player.widget.gm3.NowPlayingWidgetProvider, defpackage.ihe
    public final String c() {
        return gzo.FLIP.e;
    }

    @Override // com.google.android.apps.youtube.music.player.widget.gm3.NowPlayingWidgetProvider, defpackage.ihe
    public final void d(Context context, int i, Bundle bundle, int i2) {
        this.a.e(context, i, bundle, i2);
    }
}
