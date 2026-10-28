package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class aghd extends aghi implements Serializable {
    private static final long serialVersionUID = 0;
    transient agpc a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = g();
        for (int i2 = 0; i2 < i; i2++) {
            f(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (agox agoxVar : j()) {
            objectOutputStream.writeObject(agoxVar.a);
            objectOutputStream.writeInt(agoxVar.a());
        }
    }

    @Override // defpackage.agow
    public final int a(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.aghi
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.aghi, defpackage.agow
    public final int c(Object obj, int i) {
        ahno.I(true, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        if (iD == -1) {
            return 0;
        }
        int iC = this.a.c(iD);
        agpc agpcVar = this.a;
        if (iC > i) {
            agpcVar.j(iD, iC - i);
        } else {
            agpcVar.f(iD);
            i = iC;
        }
        this.b -= (long) i;
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        agpc agpcVar = this.a;
        agpcVar.d++;
        Arrays.fill(agpcVar.a, 0, agpcVar.c, (Object) null);
        Arrays.fill(agpcVar.b, 0, agpcVar.c, 0);
        Arrays.fill(agpcVar.e, -1);
        Arrays.fill(agpcVar.f, -1L);
        agpcVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.aghi
    public final Iterator d() {
        return new agha(this);
    }

    @Override // defpackage.aghi
    public final Iterator e() {
        return new aghb(this);
    }

    @Override // defpackage.aghi, defpackage.agow
    public final void f(Object obj, int i) {
        if (i == 0) {
            a(obj);
            return;
        }
        ahno.I(i > 0, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        long j = i;
        agpc agpcVar = this.a;
        if (iD == -1) {
            agpcVar.l(obj, i);
            this.b += j;
        } else {
            long jC = ((long) agpcVar.c(iD)) + j;
            ahno.J(jC <= 2147483647L, "too many occurrences: %s", jC);
            this.a.j(iD, (int) jC);
            this.b += j;
        }
    }

    public abstract agpc g();

    @Override // defpackage.aghi, defpackage.agow
    public final boolean h(Object obj, int i) {
        aguu.ag(i, "oldCount");
        int iD = this.a.d(obj);
        if (iD == -1) {
            if (i != 0) {
                return false;
            }
        } else {
            if (this.a.c(iD) != i) {
                return false;
            }
            this.a.f(iD);
            this.b -= (long) i;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, defpackage.agow
    public final Iterator iterator() {
        return new agpa(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.agow
    public final int size() {
        return ahng.P(this.b);
    }
}
