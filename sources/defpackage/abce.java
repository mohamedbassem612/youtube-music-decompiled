package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abce {
    public final float a;
    public final float b;
    private final abcd c;

    public abce(abcd abcdVar, float f, float f2) {
        this.c = abcdVar;
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        abcd abcdVar = this.c;
        return abcdVar == abcd.a || abcdVar == abcd.b;
    }

    public final boolean b() {
        return this.c == abcd.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abce)) {
            return false;
        }
        abce abceVar = (abce) obj;
        return this.c == abceVar.c && this.a == abceVar.a && this.b == abceVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("state", this.c);
        ageuVarAc.d("scale", this.a);
        ageuVarAc.d("offset", this.b);
        return ageuVarAc.toString();
    }

    public abce() {
        this(abcd.c, 0.0f, 0.0f);
    }
}
