package androidx.media;

import defpackage.dtq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(dtq dtqVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) dtqVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, dtq dtqVar) {
        dtqVar.u(audioAttributesCompat.a);
    }
}
