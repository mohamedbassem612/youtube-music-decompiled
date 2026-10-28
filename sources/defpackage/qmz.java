package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmz {
    public final boolean a;
    public final List b;
    public final aigj c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final qld k;

    public qmz(boolean z, List list, aigj aigjVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4, qld qldVar) {
        list.getClass();
        aigjVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        qldVar.getClass();
        this.a = z;
        this.b = list;
        this.c = aigjVar;
        this.d = str;
        this.e = str2;
        this.f = list2;
        this.g = list3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = qldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qmz) {
            qmz qmzVar = (qmz) obj;
            if (this.a == qmzVar.a && awrc.c(this.b, qmzVar.b) && awrc.c(this.c, qmzVar.c) && awrc.c(this.d, qmzVar.d) && awrc.c(this.e, qmzVar.e) && awrc.c(this.f, qmzVar.f) && awrc.c(this.g, qmzVar.g) && this.h == qmzVar.h && this.i == qmzVar.i && this.j == qmzVar.j && awrc.c(this.k, qmzVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.a + ", enabledBackings=" + this.b + ", secret=" + this.c + ", dirPath=" + this.d + ", gmsCoreDirPath=" + this.e + ", includeStaticConfigPackages=" + this.f + ", excludeStaticConfigPackages=" + this.g + ", hasStorageInfoFromGms=" + this.h + ", allowEmptySnapshotToken=" + this.i + ", enableCommitV2Api=" + this.j + ", clientFlags=" + this.k + ')';
    }
}
