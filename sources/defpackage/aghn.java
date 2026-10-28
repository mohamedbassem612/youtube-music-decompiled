package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aghn extends agge {
    private static final long serialVersionUID = 0;
    transient int c;

    public aghn(byte[] bArr) {
        super(new agif(12));
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        s(new agif());
        agvp.h(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        agvp.i(this, objectOutputStream);
    }

    @Override // defpackage.agge, defpackage.aggz
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }

    private aghn() {
        throw null;
    }
}
