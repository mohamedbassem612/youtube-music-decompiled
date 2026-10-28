package androidx.media;

import defpackage.dtq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(dtq dtqVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = dtqVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = dtqVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = dtqVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = dtqVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, dtq dtqVar) {
        dtqVar.h(audioAttributesImplBase.a, 1);
        dtqVar.h(audioAttributesImplBase.b, 2);
        dtqVar.h(audioAttributesImplBase.c, 3);
        dtqVar.h(audioAttributesImplBase.d, 4);
    }
}
