package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agks extends aglm {
    private static final long serialVersionUID = 0;
    final /* synthetic */ agku a;

    public agks(agku agkuVar) {
        this.a = agkuVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.aglm
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof agox)) {
            return false;
        }
        agox agoxVar = (agox) obj;
        return agoxVar.a() > 0 && this.a.a(agoxVar.a) == agoxVar.a();
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.n().size();
    }

    @Override // defpackage.aglm, defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return new agkt(this.a);
    }
}
