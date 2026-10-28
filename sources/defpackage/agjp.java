package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agjp extends aghk {
    private static final long serialVersionUID = 0;
    transient int c;

    public agjp(int i, int i2) {
        super(new agif(i));
        this.c = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int i = objectInputStream.readInt();
        s(new agif(12));
        agvp.h(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        agvp.i(this, objectOutputStream);
    }

    @Override // defpackage.aghk, defpackage.aggz
    public final /* bridge */ /* synthetic */ Collection a() {
        return new agih(this.c);
    }

    private agjp() {
        throw null;
    }
}
