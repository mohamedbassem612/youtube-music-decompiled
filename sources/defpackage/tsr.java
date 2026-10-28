package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tsr extends UtteranceProgressListener implements TextToSpeech.OnInitListener, AudioManager.OnAudioFocusChangeListener {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/tts/TextToSpeechController");
    public volatile TextToSpeech b;
    public volatile String c;
    public volatile int d;
    public final AudioManager e;
    public final Executor f;
    public final List h;
    private final Context k;
    public int i = 2;
    public final awlk g = new awlk();
    private final List l = new CopyOnWriteArrayList();
    final dov j = dov.az();

    public tsr(Context context, aeiv aeivVar, Executor executor) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.h = copyOnWriteArrayList;
        this.k = context;
        this.b = new TextToSpeech(context, this, "com.google.android.tts");
        this.e = (AudioManager) context.getSystemService("audio");
        this.f = new ahfg(executor);
        copyOnWriteArrayList.add(aeivVar);
    }

    private final void k(String str) {
        List list = this.l;
        list.remove(str);
        if (list.isEmpty()) {
            this.e.abandonAudioFocus(this);
        }
    }

    public final void a(String str) {
        awlk awlkVar = this.g;
        if (((awlj[]) awlkVar.c.get()).length != 0) {
            awlkVar.b(new Throwable(str));
        }
    }

    public final synchronized void g(final String str, final int i, int i2, final String str2) {
        if (this.b == null) {
            this.c = str;
            this.d = i2;
            this.b = new TextToSpeech(this.k, this, "com.google.android.tts");
        } else {
            final TextToSpeech textToSpeech = this.b;
            if (textToSpeech == null) {
                return;
            }
            this.l.add(str2);
            this.e.requestAudioFocus(this, 3, i2);
            taf.j(ahno.ap(new Callable() { // from class: tsm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    agrf agrfVar = tsr.a;
                    if (textToSpeech.speak(str, i, null, str2) == -1) {
                        ((agrc) ((agrc) tsr.a.c()).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "speakTextUseTts", 292, "TextToSpeechController.java")).t("TTS failed during speaking");
                    }
                    return null;
                }
            }, this.f), new iul(18));
        }
    }

    public final void h(boolean z) {
        TextToSpeech textToSpeech = this.b;
        if (textToSpeech == null) {
            return;
        }
        this.e.abandonAudioFocus(this);
        this.j.ab(new hgi(19));
        Iterator it = this.h.iterator();
        while (true) {
            int i = 1;
            int i2 = 0;
            if (!it.hasNext()) {
                taf.j(ahno.ap(new tsp(textToSpeech, i2), this.f), new tsq(i));
                return;
            }
            aeiv aeivVar = (aeiv) it.next();
            int i3 = this.i;
            if (z) {
                aeivVar.n(i3);
            } else {
                aeivVar.l(true, false, i3);
            }
        }
    }

    public final void i(mgr mgrVar) {
        this.j.ac(mgrVar);
    }

    public final void j(mgr mgrVar) {
        this.j.ad(mgrVar);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2 || i == -1) {
            h(false);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.j.ab(new tsd(str, 5));
        k(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.j.ab(new tsd(str, 4));
        k(str);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        TextToSpeech textToSpeech = this.b;
        if (textToSpeech == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "onInit", 306, "TextToSpeechController.java")).u("TTS destroyed before initialization completed %d", i);
        } else if (i == 0) {
            taf.j(ahno.ap(new tsn(this, textToSpeech, 0), this.f), new iul(20));
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "onInit", 338, "TextToSpeechController.java")).u("TTS failed during initialization with code: %d", i);
            a(a.bR(i, "TTS failed during initialization with code: "));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        this.j.ab(new hgi(20));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        this.j.ab(new tso(str, i, 0));
        k(str);
    }
}
