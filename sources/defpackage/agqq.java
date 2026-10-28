package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agqq extends aghl {
    private static final long serialVersionUID = 0;
    private transient Comparator c;
    private transient Comparator d;

    public agqq(Comparator comparator, Comparator comparator2) {
        super(new TreeMap(comparator));
        this.c = comparator;
        this.d = comparator2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.c = comparator;
        Comparator comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.d = comparator2;
        s(new TreeMap(this.c));
        agvp.h(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.d);
        agvp.i(this, objectOutputStream);
    }

    @Override // defpackage.aggz, defpackage.agom
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final NavigableSet q() {
        return (NavigableSet) ((SortedSet) p());
    }

    @Override // defpackage.aghk, defpackage.aggz
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final SortedSet a() {
        return new TreeSet(this.d);
    }

    @Override // defpackage.aggz
    public final Collection i(Object obj) {
        if (obj == null) {
            this.c.compare(null, null);
        }
        return a();
    }

    @Override // defpackage.aghm, defpackage.aggz, defpackage.agom
    public final /* bridge */ /* synthetic */ Map n() {
        return (NavigableMap) ((SortedMap) o());
    }

    @Override // defpackage.aghm, defpackage.aghk, defpackage.agpv
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final NavigableSet c(Object obj) {
        return (NavigableSet) super.g(obj);
    }
}
