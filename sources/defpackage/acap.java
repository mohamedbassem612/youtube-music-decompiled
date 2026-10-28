package defpackage;

import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acap {
    public final acca a;
    private final boolean b;

    public acap(acca accaVar) {
        this.a = accaVar;
        new WeakReference(null);
        tqj tqjVar = tqi.a;
        boolean z = false;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073840115)) {
                z = true;
            }
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this.b) {
            if (this != obj) {
                if (obj instanceof acap) {
                    return Objects.equals(this.a, ((acap) obj).a);
                }
                return false;
            }
        } else if (this != obj) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.b ? System.identityHashCode(this) : Objects.hashCode(this.a);
    }
}
