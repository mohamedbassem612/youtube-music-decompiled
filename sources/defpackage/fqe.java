package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqe extends fpw {
    private final fgy a;
    private final String b;
    private final omj c;

    public fqe(fqc fqcVar) {
        super(fqcVar);
        fgy fgyVar = fqcVar.b;
        if (fgyVar == null) {
            throw new IllegalStateException("Component must be provided.");
        }
        this.a = fgyVar;
        this.c = fqcVar.d;
        this.b = fqcVar.c;
    }

    public static ftg r() {
        fqc fqcVar = new fqc();
        fqcVar.b = new fqd();
        return new fqe(fqcVar);
    }

    @Override // defpackage.fpw, defpackage.ftg
    public final fgy c() {
        return this.a;
    }

    @Override // defpackage.fpw, defpackage.ftg
    public final String g() {
        return this.b;
    }

    @Override // defpackage.fpw, defpackage.ftg
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fpw, defpackage.ftg
    public final omj q() {
        return this.c;
    }

    @Override // defpackage.ftg
    public final String s() {
        return this.a.c();
    }

    @Override // defpackage.fpw, defpackage.ftg
    public final void o() {
    }
}
