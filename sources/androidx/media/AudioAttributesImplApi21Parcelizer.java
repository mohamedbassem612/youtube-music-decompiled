package androidx.media;

import android.media.AudioAttributes;
import defpackage.dtq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(dtq dtqVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) dtqVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = dtqVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, dtq dtqVar) {
        dtqVar.i(audioAttributesImplApi21.a, 1);
        dtqVar.h(audioAttributesImplApi21.b, 2);
    }
}
