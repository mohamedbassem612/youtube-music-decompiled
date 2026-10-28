package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agxc extends agwz {
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // defpackage.agwz
    public final agxk d(int i) {
        ahno.F((i ^ (-1)) >>> 31);
        return new agxb(this, i);
    }

    @Override // defpackage.agxj
    public final agxk f() {
        return d(32);
    }
}
