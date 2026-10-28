package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kom {
    public final knu a;
    public final klq b;

    public kom(knu knuVar, klq klqVar) {
        this.a = knuVar;
        this.b = klqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kom)) {
            return false;
        }
        kom komVar = (kom) obj;
        return Objects.equals(this.a, komVar.a) && Objects.equals(this.b, komVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("key", this.a, arrayList);
        kro.p("feature", this.b, arrayList);
        return kro.o(arrayList, this);
    }
}
