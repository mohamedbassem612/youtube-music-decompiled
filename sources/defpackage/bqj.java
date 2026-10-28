package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class bqj {
    public static final /* synthetic */ int b = 0;
    public final Object a;
    private final int c = 1;
    private final AudioManager.OnAudioFocusChangeListener d;
    private final Handler e;
    private final AudioAttributesCompat f;
    private final boolean g;

    static {
        int i = AudioAttributesCompat.b;
        zf zfVar = new zf((byte[]) null);
        fdr.f(zfVar);
        fdr.d(zfVar);
    }

    public bqj(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.e = handler;
        this.f = audioAttributesCompat;
        this.g = z;
        this.d = onAudioFocusChangeListener;
        this.a = new AudioFocusRequest.Builder(1).setAudioAttributes((AudioAttributes) audioAttributesCompat.a.a()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqj) {
            bqj bqjVar = (bqj) obj;
            int i = bqjVar.c;
            if (this.g == bqjVar.g && Objects.equals(this.d, bqjVar.d) && Objects.equals(this.e, bqjVar.e) && Objects.equals(this.f, bqjVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(1, this.d, this.e, this.f, Boolean.valueOf(this.g));
    }
}
