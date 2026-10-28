package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmk {
    private final agek c;
    private agkz d = agpr.a;
    public boolean a = false;
    public boolean b = false;

    public qmk(agek agekVar) {
        this.c = agekVar;
    }

    public final qmj a() {
        return new qmj(new qme(this.c, this.a, this.b, this.d));
    }

    public final void b(Set set) {
        this.d = agkz.n(set);
    }
}
