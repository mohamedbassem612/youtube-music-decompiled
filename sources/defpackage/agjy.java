package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agjy extends agkz {
    private final transient EnumSet a;
    private transient int b;

    public agjy(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static agkz a(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            return size != 1 ? new agjy(enumSet) : new agqj((Enum) aguu.C(enumSet.iterator()));
        }
        return agpr.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.agkz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof agjy) {
            collection = ((agjy) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agjy) {
            obj = ((agjy) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return aguu.z(this.a.iterator());
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return new agjx(this.a);
    }
}
