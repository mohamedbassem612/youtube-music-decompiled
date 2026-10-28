package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awry implements Iterable, awrp {
    public final int a;
    public final int b;
    public final int c = 1;

    public awry(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awns iterator() {
        return new awrz(this.a, this.b);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof awry)) {
            return false;
        }
        if (!b() || !((awry) obj).b()) {
            awry awryVar = (awry) obj;
            if (this.a != awryVar.a || this.b != awryVar.b) {
                return false;
            }
            int i = awryVar.c;
        }
        return true;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
