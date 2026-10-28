package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfs implements Serializable, agfr {
    private static final long serialVersionUID = 0;
    final agfr a;
    volatile transient boolean b;
    transient Object c;
    private transient agga d = new agga();

    public agfs(agfr agfrVar) {
        agfrVar.getClass();
        this.a = agfrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new agga();
    }

    @Override // defpackage.agfr
    public final Object io() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objIo = this.a.io();
                    this.c = objIo;
                    this.b = true;
                    return objIo;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + '>';
        } else {
            obj = this.a;
        }
        return a.cn((byte) 41, obj, "Suppliers.memoize(");
    }
}
