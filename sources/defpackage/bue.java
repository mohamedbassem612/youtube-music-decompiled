package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bue {
    public final int a = 1;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final brq d;
    public final boolean e;
    private final Object f;

    public bue(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, brq brqVar, boolean z) {
        this.c = handler;
        this.d = brqVar;
        this.e = z;
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(1).setAudioAttributes(brqVar.a()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(true).build();
    }

    final AudioFocusRequest a() {
        Object obj = this.f;
        obj.getClass();
        return bd$$ExternalSyntheticApiModelOutline1.m626m(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bue) {
            bue bueVar = (bue) obj;
            int i = bueVar.a;
            if (this.e == bueVar.e && Objects.equals(this.b, bueVar.b) && Objects.equals(this.c, bueVar.c) && Objects.equals(this.d, bueVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(1, this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
