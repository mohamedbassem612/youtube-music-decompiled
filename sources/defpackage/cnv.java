package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cnv extends cqu {
    private final bto b;

    public cnv(cqs cqsVar, bto btoVar) {
        super(cqsVar);
        this.b = btoVar;
    }

    @Override // defpackage.cqu, defpackage.cqx
    public final int a(bse bseVar) {
        return this.a.p(this.b.a(bseVar));
    }

    @Override // defpackage.cqu, defpackage.cqx
    public final bse b(int i) {
        return this.b.b(this.a.n(i));
    }

    @Override // defpackage.cqu, defpackage.cqs
    public final bse c() {
        return this.b.b(this.a.o());
    }

    @Override // defpackage.cqu, defpackage.cqx
    public final bto d() {
        return this.b;
    }

    @Override // defpackage.cqu
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof cnv)) {
            return this.b.equals(((cnv) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqu
    public final int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }
}
