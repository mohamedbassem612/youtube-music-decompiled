package androidx.media;

import android.media.AudioAttributes;
import defpackage.dtq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(dtq dtqVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) dtqVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = dtqVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, dtq dtqVar) {
        dtqVar.i(audioAttributesImplApi26.a, 1);
        dtqVar.h(audioAttributesImplApi26.b, 2);
    }
}
