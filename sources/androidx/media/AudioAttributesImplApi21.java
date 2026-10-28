package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        AudioAttributes audioAttributes = this.a;
        Objects.toString(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }

    public AudioAttributesImplApi21() {
    }
}
