package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxm {
    public final Set a;
    public final String b;

    public pxm(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pxm) {
            pxm pxmVar = (pxm) obj;
            if (awrc.c(this.a, pxmVar.a) && awrc.c(this.b, pxmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DelegatedGaiaInfo(notificationChannels=" + this.a + ", actualAccountName=" + this.b + ')';
    }
}
