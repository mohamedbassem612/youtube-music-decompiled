package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class irv implements zrg {
    public final ajwo a;
    public final Map b;

    public irv(ajwo ajwoVar, Map map) {
        this.a = ajwoVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof irv) {
            irv irvVar = (irv) obj;
            if (awrc.c(this.a, irvVar.a) && awrc.c(this.b, irvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SearchInputRoute(command=" + this.a + ", args=" + this.b + ')';
    }
}
