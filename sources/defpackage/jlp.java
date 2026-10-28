package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.music.voice.views.BitmapSoundLevelsView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlp extends Handler {
    public volatile boolean a;
    private final BitmapSoundLevelsView b;

    public jlp(BitmapSoundLevelsView bitmapSoundLevelsView) {
        this.b = bitmapSoundLevelsView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            this.b.invalidate();
            sendMessageDelayed(obtainMessage(0), 10L);
        }
    }
}
