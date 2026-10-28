package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavh extends BroadcastReceiver implements aavc {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/player/audiofocus/PlaybackServiceScopedAudioBecomingNoisyReceiverImpl");
    boolean a;
    private final Context c;
    private igp d;

    public aavh(Context context) {
        this.c = context;
    }

    @Override // defpackage.aavc
    public final void a(igp igpVar) {
        this.d = igpVar;
        if (this.a) {
            return;
        }
        this.c.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        this.a = true;
    }

    @Override // defpackage.aavc
    public final void b(igp igpVar) {
        if (this.a) {
            try {
                this.c.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/player/audiofocus/PlaybackServiceScopedAudioBecomingNoisyReceiverImpl", "unregister", ';', "PlaybackServiceScopedAudioBecomingNoisyReceiverImpl.java")).t("Trying to unregister AudioBecomingNoisy Receiver, but was already unregistered");
            }
            this.a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        igp igpVar = this.d;
        if (igpVar != null) {
            igpVar.c();
        }
    }
}
