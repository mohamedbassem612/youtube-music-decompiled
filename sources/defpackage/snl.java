package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snl implements Comparable {
    public final int a;
    public final aizs b;
    public final smr c;
    public final sko d;

    public snl(int i, aizs aizsVar, smr smrVar, sko skoVar) {
        this.a = i;
        this.b = aizsVar;
        this.c = smrVar;
        this.d = skoVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        snl snlVar = (snl) obj;
        int i = snlVar.a;
        int i2 = this.a;
        return i2 == i ? this.b.d.compareTo(snlVar.b.d) : i2 - i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof snl)) {
            return false;
        }
        snl snlVar = (snl) obj;
        return this.a == snlVar.a && Objects.equals(this.b, snlVar.b) && Objects.equals(this.c, snlVar.c) && Objects.equals(this.d, snlVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d);
    }
}
