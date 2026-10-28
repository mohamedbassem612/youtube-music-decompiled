package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zdr extends ywd {
    public boolean a;
    private boolean b;

    public zdr(ywj ywjVar) {
        super(ywjVar);
        this.a = false;
        this.b = false;
    }

    public abstract void B(long j, long j2, ywk ywkVar, long j3);

    public abstract void C(long j, ywk ywkVar);

    public void D() {
        if (this.b) {
            return;
        }
        this.b = true;
        super.g();
    }

    final void E() {
        this.a = true;
    }
}
