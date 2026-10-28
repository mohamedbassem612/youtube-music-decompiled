package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agkl extends agkz {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract agkj a();

    @Override // defpackage.agkz
    public final boolean c() {
        return false;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = a().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return a().u();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return new agkk(a());
    }
}
