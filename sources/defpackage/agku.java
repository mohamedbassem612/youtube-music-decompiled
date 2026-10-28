package defpackage;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agku extends agjw implements Collection, agow {
    private static final long serialVersionUID = 912559;
    private transient agke a;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        agqr it = j().iterator();
        while (it.hasNext()) {
            agox agoxVar = (agox) it.next();
            Arrays.fill(objArr, i, agoxVar.a() + i, agoxVar.a);
            i += agoxVar.a();
        }
        return i;
    }

    @Override // defpackage.agow
    @Deprecated
    public final int c(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return agvp.j(this, obj);
    }

    @Override // defpackage.agow
    @Deprecated
    public final void f(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.agjw
    public final agke g() {
        agke agkeVar = this.a;
        if (agkeVar != null) {
            return agkeVar;
        }
        agke agkeVarG = super.g();
        this.a = agkeVarG;
        return agkeVarG;
    }

    @Override // defpackage.agow
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return ahng.ab(j());
    }

    @Override // defpackage.agow
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return new agkq(j().iterator());
    }

    public abstract agkz n();

    @Override // defpackage.agow
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final agkz j() {
        return isEmpty() ? agpr.a : new agks(this);
    }

    public abstract agox p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.agjw
    public abstract Object writeReplace();
}
