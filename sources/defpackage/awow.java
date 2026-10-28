package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awow implements awoq, awph {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(awow.class, Object.class, "result");
    private final awoq b;
    private volatile Object result;

    public awow(awoq awoqVar, Object obj) {
        this.b = awoqVar;
        this.result = obj;
    }

    @Override // defpackage.awph
    public final awph getCallerFrame() {
        awoq awoqVar = this.b;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            awox awoxVar = awox.b;
            if (obj2 != awoxVar) {
                awox awoxVar2 = awox.a;
                if (obj2 != awoxVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (a.aA(a, this, awoxVar2, awox.c)) {
                    this.b.resumeWith(obj);
                    return;
                }
            } else if (a.aA(a, this, awoxVar, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        awoq awoqVar = this.b;
        Objects.toString(awoqVar);
        return "SafeContinuation for ".concat(awoqVar.toString());
    }
}
