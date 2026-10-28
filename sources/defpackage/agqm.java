package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class agqm implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b = this;

    public agqm(Object obj) {
        this.a = obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }
}
