package androidx.media;

import android.util.SparseIntArray;
import defpackage.dtr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AudioAttributesCompat implements dtr {
    public static final /* synthetic */ int b = 0;
    private static final SparseIntArray c;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.a = audioAttributesImpl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public AudioAttributesCompat() {
    }
}
