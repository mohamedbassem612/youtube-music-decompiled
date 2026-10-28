package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acth extends BroadcastReceiver {
    final /* synthetic */ avli a;
    final /* synthetic */ AudioManager b;

    public acth(avli avliVar, AudioManager audioManager) {
        this.a = avliVar;
        this.b = audioManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (awrc.c(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
            this.a.c(Integer.valueOf(this.b.getStreamVolume(3)));
        }
    }
}
