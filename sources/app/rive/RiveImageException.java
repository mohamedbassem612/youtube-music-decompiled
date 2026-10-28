package app.rive;

import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveImageException extends RuntimeException {
    public static final int $stable = 8;

    public /* synthetic */ RiveImageException(String str, Throwable th, int i, awqx awqxVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveImageException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
