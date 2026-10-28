package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import defpackage.aaqg;
import defpackage.agke;
import defpackage.agrf;
import defpackage.atpr;
import defpackage.cf;
import defpackage.ioy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DownloadNetworkSelectionDialogPreference extends Preference {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/ui/DownloadNetworkSelectionDialogPreference");
    public static final agke b = agke.s(atpr.UNMETERED_WIFI, atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE, atpr.ANY);
    public final Context c;
    public final cf d;
    public final boolean e;
    public final aaqg f;
    private final int g;
    private final String h;

    public DownloadNetworkSelectionDialogPreference(Context context, cf cfVar, aaqg aaqgVar, int i) {
        super(context);
        this.c = context;
        this.d = cfVar;
        this.f = aaqgVar;
        this.g = i;
        this.e = true;
        this.h = "https://support.google.com/youtubemusic/answer/6313535";
        M("offline_network_preference");
        if (this.A) {
            this.A = false;
            d();
        }
        P(R.string.download_network_preference_title);
        this.o = new ioy(this, 3);
        N(i);
        n(context.getResources().getStringArray(R.array.download_network_preference_summaries)[b.indexOf(aaqgVar.s())]);
    }

    public final void k() {
        cf cfVar = this.d;
        if (cfVar.isDestroyed()) {
            return;
        }
        cfVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.h)));
    }
}
