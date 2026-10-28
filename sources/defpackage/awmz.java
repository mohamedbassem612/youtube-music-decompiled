package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awmz implements Serializable, awmi {
    private Function0 a;
    private Object b = awmv.a;

    public awmz(Function0 function0) {
        this.a = function0;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new awmg(a());
    }

    @Override // defpackage.awmi
    public final Object a() {
        if (this.b == awmv.a) {
            Function0 function0 = this.a;
            function0.getClass();
            this.b = function0.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.awmi
    public final boolean b() {
        return this.b != awmv.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
