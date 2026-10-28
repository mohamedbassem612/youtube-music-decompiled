package androidx.media3.decoder.av1;

import defpackage.can;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Dav1dDecoderException extends can {
    public final int a;

    public Dav1dDecoderException(String str, Throwable th) {
        super(str, th);
        this.a = -1;
    }

    public Dav1dDecoderException(String str, int i) {
        super(str);
        this.a = i;
    }
}
