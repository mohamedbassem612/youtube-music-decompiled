package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awmo implements Serializable, awmi {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(awmo.class, Object.class, "c");
    private volatile Function0 b;
    private volatile Object c = awmv.a;

    public awmo(Function0 function0) {
        this.b = function0;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new awmg(a());
    }

    @Override // defpackage.awmi
    public final Object a() {
        Object obj = this.c;
        awmv awmvVar = awmv.a;
        if (obj != awmvVar) {
            return obj;
        }
        Function0 function0 = this.b;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            if (a.aA(a, this, awmvVar, objInvoke)) {
                this.b = null;
                return objInvoke;
            }
        }
        return this.c;
    }

    @Override // defpackage.awmi
    public final boolean b() {
        return this.c != awmv.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
