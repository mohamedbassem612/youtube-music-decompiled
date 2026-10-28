package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgc {
    public final long a;
    public final String b;
    public final long c;
    public final aidu d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;

    public pgc(long j, String str, long j2, int i, aidu aiduVar, int i2, int i3, long j3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.h = i;
        this.d = aiduVar;
        this.f = i2;
        this.g = i3;
        this.e = j3;
    }

    public static /* synthetic */ pgc a(pgc pgcVar, long j, long j2, int i) {
        long j3 = (i & 1) != 0 ? pgcVar.a : j;
        String str = (i & 2) != 0 ? pgcVar.b : null;
        long j4 = (i & 4) != 0 ? pgcVar.c : 0L;
        int i2 = (i & 8) != 0 ? pgcVar.h : 0;
        aidu aiduVar = (i & 16) != 0 ? pgcVar.d : null;
        int i3 = (i & 32) != 0 ? pgcVar.f : 0;
        int i4 = (i & 64) != 0 ? pgcVar.g : 0;
        long j5 = (i & SemanticState.Focused) != 0 ? pgcVar.e : j2;
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        aiduVar.getClass();
        if (i3 == 0 || i4 == 0) {
            throw null;
        }
        return new pgc(j3, str, j4, i2, aiduVar, i3, i4, j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pgc) {
            pgc pgcVar = (pgc) obj;
            if (this.a == pgcVar.a && awrc.c(this.b, pgcVar.b) && this.c == pgcVar.c && this.h == pgcVar.h && this.d == pgcVar.d && this.f == pgcVar.f && this.g == pgcVar.g && this.e == pgcVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((a.ak(this.a) * 31) + this.b.hashCode()) * 31) + a.ak(this.c)) * 31) + aiep.a(this.h)) * 31) + this.d.hashCode()) * 31) + this.f) * 31) + this.g) * 31) + a.ak(this.e);
    }

    public final String toString() {
        return "ChimeThreadState(id=" + this.a + ", threadId=" + this.b + ", lastUpdatedVersion=" + this.c + ", readState=" + ((Object) aiep.toString$ar$edu(this.h)) + ", deletionStatus=" + this.d + ", countBehavior=" + ((Object) Integer.toString(this.f - 1)) + ", systemTrayBehavior=" + ((Object) Integer.toString(this.g - 1)) + ", modifiedTimestamp=" + this.e + ')';
    }
}
