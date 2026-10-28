package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqz implements zrb, zqy {
    public final zqg a;
    public final List b;

    public zqz(zqg zqgVar, List list) {
        this.a = zqgVar;
        this.b = list;
    }

    @Override // defpackage.zqy
    public final /* bridge */ /* synthetic */ zqv a() {
        return new zqw(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqz) {
            zqz zqzVar = (zqz) obj;
            if (awrc.c(this.a, zqzVar.a) && awrc.c(this.b, zqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NavigatingBackward(from=" + this.a + ", removing=" + this.b + ')';
    }
}
