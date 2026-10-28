package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpv extends bpt {
    public bpv(bpt bptVar) {
        bptVar.getClass();
        this.b.putAll(bptVar.b);
    }

    @Override // defpackage.bpt
    public final Object a(bps bpsVar) {
        bpsVar.getClass();
        return this.b.get(bpsVar);
    }

    public final void b(bps bpsVar, Object obj) {
        this.b.put(bpsVar, obj);
    }

    public bpv() {
        throw null;
    }

    public /* synthetic */ bpv(byte[] bArr) {
        this(bpr.a);
    }
}
