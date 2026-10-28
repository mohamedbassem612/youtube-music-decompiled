package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awmp implements Serializable, awmi {
    private Function0 a;
    private volatile Object b = awmv.a;
    private final Object c = this;

    public awmp(Function0 function0) {
        this.a = function0;
    }

    private final Object writeReplace() {
        return new awmg(a());
    }

    @Override // defpackage.awmi
    public final Object a() {
        Object objInvoke;
        Object obj = this.b;
        awmv awmvVar = awmv.a;
        if (obj != awmvVar) {
            return obj;
        }
        synchronized (this.c) {
            Object obj2 = this.b;
            if (obj2 != awmvVar) {
                objInvoke = obj2;
            } else {
                Function0 function0 = this.a;
                function0.getClass();
                objInvoke = function0.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.awmi
    public final boolean b() {
        return this.b != awmv.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
