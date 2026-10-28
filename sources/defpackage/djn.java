package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djn {
    private final djo a;
    private final List b;
    private final List c;
    private final int d;
    private List e;

    public djn(djo djoVar, List list, List list2, int i) {
        this.a = djoVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        List listF = this.e;
        if (listF == null) {
            awoa awoaVar = new awoa(10);
            awoaVar.addAll(this.b);
            djo djoVar = this.a;
            if (djoVar != null) {
                awoaVar.add(djoVar);
            }
            awoaVar.addAll(this.c);
            listF = awoaVar.f();
            this.e = listF;
        }
        listF.getClass();
        return listF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            djn djnVar = (djn) obj;
            if (this.d == djnVar.d && awrc.c(a(), djnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + a().hashCode();
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    public djn() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ djn(byte[] bArr) {
        awno awnoVar = awno.a;
        this(null, awnoVar, awnoVar, -1);
    }
}
