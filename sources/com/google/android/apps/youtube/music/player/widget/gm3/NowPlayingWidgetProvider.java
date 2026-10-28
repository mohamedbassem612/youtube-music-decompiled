package com.google.android.apps.youtube.music.player.widget.gm3;

import android.content.Context;
import android.os.Bundle;
import defpackage.gzo;
import defpackage.iif;
import defpackage.iim;
import defpackage.maq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NowPlayingWidgetProvider extends iif {
    public iim g;

    @Override // defpackage.mam
    public maq b() {
        return maq.YTM_NOW_PLAYING;
    }

    @Override // defpackage.ihe
    public String c() {
        return gzo.NOW_PLAYING.e;
    }

    @Override // defpackage.ihe
    public void d(Context context, int i, Bundle bundle, int i2) {
        this.g.g(context, i, bundle, i2);
    }
}
