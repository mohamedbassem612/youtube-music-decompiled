package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqi implements zrb, zqy {
    public final zqg a;
    public final List b;

    public zqi(zqg zqgVar, List list) {
        this.a = zqgVar;
        this.b = list;
    }

    @Override // defpackage.zqy
    public final /* bridge */ /* synthetic */ zqv a() {
        List list = this.b;
        zqg zqgVar = this.a;
        return new zqh(zqgVar, list.contains(zqgVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqi) {
            zqi zqiVar = (zqi) obj;
            if (awrc.c(this.a, zqiVar.a) && awrc.c(this.b, zqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Clearing(from=" + this.a + ", removing=" + this.b + ')';
    }
}
