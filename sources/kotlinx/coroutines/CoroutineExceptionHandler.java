package kotlinx.coroutines;

import defpackage.ahx;
import defpackage.awos;
import defpackage.awou;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends awos {
    public static final ahx c = ahx.d;

    void handleException(awou awouVar, Throwable th);
}
