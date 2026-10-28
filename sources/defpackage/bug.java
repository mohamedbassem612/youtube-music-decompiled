package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bug {
    public static final bug a = new bug(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public bug(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bwp.ab(i3) ? bwp.j(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bug) {
            bug bugVar = (bug) obj;
            if (this.b == bugVar.b && this.c == bugVar.c && this.d == bugVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + ']';
    }
}
