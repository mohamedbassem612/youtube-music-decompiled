package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehs {
    public final Object a;
    public final Throwable b;

    public ehs(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ehs) {
            ehs ehsVar = (ehs) obj;
            Object obj2 = this.a;
            if (obj2 != null && obj2.equals(ehsVar.a)) {
                return true;
            }
            Throwable th = this.b;
            if (th != null && ehsVar.b != null) {
                return th.toString().equals(th.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public ehs(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
