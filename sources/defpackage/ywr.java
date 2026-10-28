package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ywr implements zgg {
    private final long a;
    private final String b;

    public ywr(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.zgg
    public final String a(long j) {
        return ((this.a - j) / 1000.0d) + ';' + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ywr)) {
            return false;
        }
        ywr ywrVar = (ywr) obj;
        return this.b.equals(ywrVar.b) && this.a == ywrVar.a;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Long.valueOf(this.a));
    }
}
