package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btu {
    public static final btu a = new btu(agpi.a);
    public final agke b;

    static {
        int i = bwp.a;
    }

    public btu(List list) {
        this.b = agke.n(list);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            agke agkeVar = this.b;
            if (i2 >= agkeVar.size()) {
                return false;
            }
            btt bttVar = (btt) agkeVar.get(i2);
            if (bttVar.c() && bttVar.a() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aguu.v(this.b, ((btu) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
