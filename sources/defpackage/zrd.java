package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zrd {
    public final String a;
    public final List b;

    public zrd(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zrd) {
            zrd zrdVar = (zrd) obj;
            if (awrc.c(this.a, zrdVar.a) && awrc.c(this.b, zrdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PopResult(backstackName=" + this.a + ", routes=" + this.b + ')';
    }
}
