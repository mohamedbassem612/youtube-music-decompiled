package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zug extends szg {
    private long e;
    private aigj f;
    private boolean g;
    public final zup j;
    public final zta k;
    public long l;
    public long m;
    public String n;
    public String o;
    public boolean p;
    public int q;

    public zug(zup zupVar, zta ztaVar) {
        super(zupVar.f);
        this.j = zupVar;
        this.k = ztaVar;
        this.q = zupVar.e;
    }

    public zug a(String str) {
        this.n = str;
        return this;
    }

    public zug b(String str) {
        this.o = str;
        return this;
    }

    protected abstract aigj c();

    public void e(boolean z) {
        this.p = z;
    }

    public final long i() {
        return this.l + this.e + this.m;
    }

    public final long j() {
        return this.l + this.e;
    }

    public final aigj k() {
        if (this.g) {
            return this.f;
        }
        aigj aigjVarC = c();
        this.f = aigjVarC;
        this.g = true;
        return aigjVarC;
    }

    public void l(long j, long j2) {
        this.e = j2 - j;
        long j3 = this.a / 2;
        long j4 = this.l;
        long j5 = j - j3;
        if (j5 <= j) {
            this.m = Math.min(j, Math.max(j4, j5)) - this.l;
            return;
        }
        throw new IllegalArgumentException(j5 + " > " + j);
    }
}
