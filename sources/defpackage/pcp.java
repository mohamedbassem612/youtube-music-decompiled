package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pcp {
    public pcu a;
    public plb b;
    public boolean c;
    public boolean d;
    public phb e;
    public short f;

    public final void a(phb phbVar) {
        if (phbVar == null) {
            throw new NullPointerException("Null refreshReason");
        }
        this.e = phbVar;
        this.f = (short) (this.f | 64);
    }
}
