package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agwk implements Iterable {
    public final Object a;
    public final Object b;

    public agwk(Object obj, Object obj2) {
        this.a = obj;
        obj2.getClass();
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwk) {
            agwk agwkVar = (agwk) obj;
            if (this.a.equals(agwkVar.a) && this.b.equals(agwkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new aglu(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        return "<" + this.a.toString() + " -> " + obj.toString() + '>';
    }
}
