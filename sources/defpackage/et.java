package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class et implements IBinder.DeathRecipient {
    public final MediaController.Callback a = new er(this);
    es b;
    public en c;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        d(8, null, null);
    }

    public final void d(int i, Object obj, Bundle bundle) {
        es esVar = this.b;
        if (esVar != null) {
            Message messageObtainMessage = esVar.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void e(Handler handler) {
        if (handler != null) {
            es esVar = new es(this, handler.getLooper());
            this.b = esVar;
            esVar.a = true;
        } else {
            es esVar2 = this.b;
            if (esVar2 != null) {
                esVar2.a = false;
                esVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public void c() {
    }

    public void a(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
    }
}
