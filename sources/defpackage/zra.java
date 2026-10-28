package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zra implements zrb, zqy {
    public final zqg a;
    public final List b;

    public zra(zqg zqgVar, List list) {
        this.a = zqgVar;
        this.b = list;
    }

    @Override // defpackage.zqy
    public final /* bridge */ /* synthetic */ zqv a() {
        return new zqx(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zra) {
            zra zraVar = (zra) obj;
            if (awrc.c(this.a, zraVar.a) && awrc.c(this.b, zraVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NavigatingForward(from=" + this.a + ", removing=" + this.b + ')';
    }
}
