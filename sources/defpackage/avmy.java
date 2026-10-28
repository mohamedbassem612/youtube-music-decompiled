package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avmy extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public avmy(Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(String.valueOf(th))), th == null ? new NullPointerException() : th);
    }
}
