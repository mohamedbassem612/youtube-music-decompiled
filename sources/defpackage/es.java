package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class es extends Handler {
    boolean a;
    final /* synthetic */ et b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(et etVar, Looper looper) {
        super(looper);
        this.b = etVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            switch (message.what) {
                case 1:
                    fg.d(message.getData());
                    break;
                case 2:
                    this.b.b((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    this.b.a((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    fg.d((Bundle) message.obj);
                    break;
                case 8:
                    this.b.c();
                    break;
                case 9:
                    ((Integer) message.obj).intValue();
                    break;
                case 11:
                    ((Boolean) message.obj).booleanValue();
                    break;
                case 12:
                    ((Integer) message.obj).intValue();
                    break;
            }
        }
    }
}
