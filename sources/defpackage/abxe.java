package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxe {
    public final acip a;
    public final Set b;

    public abxe(acip acipVar, Set set) {
        acipVar.getClass();
        this.a = acipVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxe) {
            abxe abxeVar = (abxe) obj;
            if (awrc.c(this.a, abxeVar.a) && awrc.c(this.b, abxeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActiveSettingChangedEvent(component=" + this.a + ", changedSettings=" + this.b + ')';
    }
}
