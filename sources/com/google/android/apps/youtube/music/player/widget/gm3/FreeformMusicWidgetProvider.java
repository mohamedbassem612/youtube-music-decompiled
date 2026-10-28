package com.google.android.apps.youtube.music.player.widget.gm3;

import android.content.Context;
import android.os.Bundle;
import defpackage.gzo;
import defpackage.iic;
import defpackage.iie;
import defpackage.maq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FreeformMusicWidgetProvider extends iie {
    public iic a;

    @Override // defpackage.mam
    public final maq b() {
        return maq.YTM_FREEFORM;
    }

    @Override // defpackage.ihe
    public final String c() {
        return gzo.FREE_FORM.e;
    }

    @Override // defpackage.ihe
    public final void d(Context context, int i, Bundle bundle, int i2) {
        this.a.c(context, i, bundle, i2);
    }
}
