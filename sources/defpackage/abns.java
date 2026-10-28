package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abns {
    public final int a;
    public final int b;

    public abns(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static aclr b() {
        aclr aclrVar = new aclr();
        aclrVar.d(0);
        aclrVar.b = 1;
        return aclrVar;
    }

    public final aooj a() {
        aihf aihfVarCreateBuilder = aooj.a.createBuilder();
        int i = this.a;
        if (i > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aooj aoojVar = (aooj) aihfVarCreateBuilder.instance;
            aoojVar.b |= 1;
            aoojVar.c = i;
        }
        int i2 = this.b;
        if (i2 != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            aooj aoojVar2 = (aooj) aihfVarCreateBuilder.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            aoojVar2.d = i3;
            aoojVar2.b |= 2;
        }
        return (aooj) aihfVarCreateBuilder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abns) {
            abns abnsVar = (abns) obj;
            int i = this.b;
            int i2 = abnsVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == abnsVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.by(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        int i = this.b;
        return "PrefetchPlaybackContextWrapper{prefetchReason=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", playbackBeginsInSeconds=" + this.a + '}';
    }

    public abns() {
        throw null;
    }
}
