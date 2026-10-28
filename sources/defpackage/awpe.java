package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awpe implements Serializable, awoq, awph {
    private final awoq completion;

    public awpe(awoq awoqVar) {
        this.completion = awoqVar;
    }

    public awoq create(Object obj, awoq awoqVar) {
        awoqVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.awph
    public awph getCallerFrame() {
        awoq awoqVar = this.completion;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    public final awoq getCompletion() {
        return this.completion;
    }

    @Override // defpackage.awph
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    protected abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.awoq
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            r2.getClass();
            awpe awpeVar = (awpe) r2;
            awoq awoqVar = awpeVar.completion;
            awoqVar.getClass();
            try {
                obj = awpeVar.invokeSuspend(obj);
                if (obj == awox.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new awmm(th);
            }
            awpeVar.releaseIntercepted();
            if (!(awoqVar instanceof awpe)) {
                awoqVar.resumeWith(obj);
                return;
            }
            r2 = awoqVar;
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        Objects.toString(stackTraceElement);
        return "Continuation at ".concat(String.valueOf(stackTraceElement));
    }

    public awoq create(awoq awoqVar) {
        awoqVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
