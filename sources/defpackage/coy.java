package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coy {
    public static final coy a = new coy(new bto[0]);
    public final int b;
    public final agke c;
    private int d;

    static {
        int i = bwp.a;
    }

    public coy(bto... btoVarArr) {
        this.c = agke.p(btoVarArr);
        this.b = btoVarArr.length;
        int i = 0;
        while (i < ((agpi) this.c).d) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                agke agkeVar = this.c;
                if (i3 < ((agpi) agkeVar).d) {
                    if (((bto) agkeVar.get(i)).equals(this.c.get(i3))) {
                        bvx.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final int a(bto btoVar) {
        int iIndexOf = this.c.indexOf(btoVar);
        if (iIndexOf < 0) {
            return -1;
        }
        return iIndexOf;
    }

    public final bto b(int i) {
        return (bto) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            coy coyVar = (coy) obj;
            if (this.b == coyVar.b && aguu.v(this.c, coyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.c.toString();
    }
}
