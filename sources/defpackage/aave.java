package defpackage;

import android.media.AudioManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aave implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ aavg b;
    private boolean e = false;
    public boolean a = false;
    private boolean f = false;
    public int c = 1;

    public aave(aavg aavgVar) {
        this.b = aavgVar;
    }

    public final void a(boolean z) {
        abmx.a(abmw.AUDIOMANAGER, "lostAudioFocusFromTransientCanDuck=" + z);
        this.f = z;
    }

    public final void b(boolean z) {
        abmx.a(abmw.AUDIOMANAGER, "shouldResumeOnAudioFocusGain=" + z);
        this.e = z;
    }

    public final void c(boolean z) {
        abmx.a(abmw.AUDIOMANAGER, "shouldResumeOnWindowFocusGain=" + z);
        this.a = z;
    }

    public final boolean d() {
        return this.c != 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        boolean z;
        aavg aavgVar = this.b;
        abnc abncVar = aavgVar.c;
        if (abncVar.k) {
            abmx.b(abmw.AUDIOMANAGER, "onAudioFocusChange: %d, since we are casting, abandon audio focus anyways.", Integer.valueOf(i));
            aavgVar.a();
            return;
        }
        abvk abvkVar = aavgVar.o;
        boolean z2 = abvkVar != null && (!aavgVar.i.g.m(113, 45631730L) ? !abvkVar.X() : !abvkVar.ac());
        abmw abmwVar = abmw.AUDIOMANAGER;
        abmx.b(abmwVar, "isVideoLoadingPlayingOrBuffering=%s, isPlaying=%s", abvkVar == null ? "null" : String.valueOf(abvkVar.ac()), abvkVar != null ? String.valueOf(abvkVar.X()) : "null");
        if (i == -3) {
            abmx.a(abmwVar, "AudioFocus DUCK");
            if (abvkVar != null) {
                if (aavgVar.n != 3) {
                    a(false);
                    abvkVar.E(true);
                    aavgVar.m = 3;
                    ((agrc) ((agrc) aavg.a.b()).k("com/google/android/libraries/youtube/player/audiofocus/PlaybackAudioManager$AudioFocusChangeListener", "onAudioFocusChange", 489, "PlaybackAudioManager.java")).t("AudioFocus loss; Will lower volume");
                    return;
                }
                b(z2);
                abvkVar.au();
                aavgVar.m = 1;
                agrf agrfVar = aavg.a;
                ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/youtube/player/audiofocus/PlaybackAudioManager$AudioFocusChangeListener", "onAudioFocusChange", 482, "PlaybackAudioManager.java")).t("AUDIO_FOCUS_LOSS_TRANSIENT_CAN_DUCK; pausing instead.");
                a(true);
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/player/audiofocus/PlaybackAudioManager$AudioFocusChangeListener", "onAudioFocusChange", 484, "PlaybackAudioManager.java")).t("AudioFocus loss; Will pause");
                return;
            }
            return;
        }
        if (i == -2 || i == -1) {
            a(false);
            abmx.a(abmwVar, i == -2 ? "AudioFocus LOSS_TRANSIENT" : "AudioFocus LOSS");
            if (abvkVar != null) {
                if (z2 && i == -2) {
                    z = true;
                    i = -2;
                } else {
                    z = false;
                }
                b(z);
                if (txz.g(aavgVar.b)) {
                    abvkVar.aq(false, 4);
                } else if (i == -2) {
                    abvkVar.au();
                } else {
                    abvkVar.ap(false, 4);
                }
                ((agrc) ((agrc) aavg.a.b()).k("com/google/android/libraries/youtube/player/audiofocus/PlaybackAudioManager$AudioFocusChangeListener", "onAudioFocusChange", 467, "PlaybackAudioManager.java")).C("AudioFocus loss; Will %s; shouldResumeOnAudioFocusGain=%b", "pause", this.e);
            }
            aavgVar.m = 1;
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            abmx.b(abmwVar, "AudioFocus GAIN; shouldResume=%b", Boolean.valueOf(this.e));
            aavgVar.m = 2;
            if (abvkVar != null) {
                abvkVar.E(false);
            }
            if (this.e) {
                if (abncVar.i || !abncVar.h || ((aavgVar.i.f.l(26, 45667556L, false) && this.f) || d())) {
                    b(false);
                    c(false);
                    if (abvkVar != null) {
                        abmx.a(abmwVar, "AudioFocus GAIN; transient resume");
                        abvkVar.Q();
                    }
                } else {
                    c(true);
                }
            }
            a(false);
        }
    }
}
