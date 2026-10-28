package defpackage;

import internal.org.jni_zero.JniZero;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahv implements CoroutineExceptionHandler {
    private final awou a;

    public ahv(awou awouVar) {
        this.a = awouVar;
        awrc.K(awouVar.plus(this));
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return CoroutineExceptionHandler.c;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(awou awouVar, Throwable th) throws Throwable {
        if (((akh) awouVar.get(akh.a)) != null) {
            throw null;
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(awouVar, th);
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        awouVar.getClass();
        return atqq.e(this, awouVar);
    }
}
