package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhw {
    private final Class a;
    private final Class b;

    public ahhw(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahhw)) {
            return false;
        }
        ahhw ahhwVar = (ahhw) obj;
        return ahhwVar.a.equals(this.a) && ahhwVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
