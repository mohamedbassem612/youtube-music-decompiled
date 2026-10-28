package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class bns {
    final int a;
    final Method b;

    public bns(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bns) {
            bns bnsVar = (bns) obj;
            if (this.a == bnsVar.a && this.b.getName().equals(bnsVar.b.getName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
