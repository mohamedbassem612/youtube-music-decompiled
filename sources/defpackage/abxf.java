package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxf {
    public final acip a;
    public final Set b;

    public abxf(acip acipVar, Set set) {
        this.a = acipVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxf) {
            abxf abxfVar = (abxf) obj;
            if (awrc.c(this.a, abxfVar.a) && awrc.c(this.b, abxfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DynamicSettingChangedEvent(component=" + this.a + ", changedSettings=" + this.b + ')';
    }
}
