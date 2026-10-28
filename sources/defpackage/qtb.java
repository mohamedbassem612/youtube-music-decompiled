package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qtb implements qsz {
    long a;

    public qtb(byte[] bArr) {
        this.a = 0L;
    }

    @Override // defpackage.qsz
    public final ahwl a() {
        aihf aihfVarCreateBuilder = ahwl.a.createBuilder();
        long j = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        ahwl ahwlVar = (ahwl) aihfVarCreateBuilder.instance;
        ahwlVar.b = 1;
        ahwlVar.c = Long.valueOf(j);
        return (ahwl) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.qsz
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qtb) && this.a == ((qtb) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    qtb() {
        throw null;
    }
}
