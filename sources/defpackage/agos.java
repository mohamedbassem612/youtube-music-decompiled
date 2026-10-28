package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agos extends agge {
    private static final long serialVersionUID = 0;
    transient agfr c;

    public agos(Map map, agfr agfrVar) {
        super(map);
        this.c = agfrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.c = (agfr) object;
        Object object2 = objectInputStream.readObject();
        object2.getClass();
        s((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.a);
    }

    @Override // defpackage.agge, defpackage.aggz
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.io();
    }

    @Override // defpackage.aggz, defpackage.agom
    public final Map n() {
        return o();
    }

    @Override // defpackage.aggz, defpackage.agom
    public final Set q() {
        return p();
    }
}
