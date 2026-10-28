package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awym extends awya {
    private final int f;
    private final int g;

    public awym(int i, int i2) {
        super(i);
        this.f = i;
        this.g = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bP(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = awrn.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new awqv(awya.class).c() + " instead");
    }

    private final Object B(Object obj) {
        awyj awyjVarQ;
        axdy axdyVar = awyc.d;
        awyj awyjVar = (awyj) this.c.a;
        while (true) {
            long jB = this.a.b();
            long j = 1152921504606846975L & jB;
            boolean zW = super.w(jB, false);
            long j2 = awyc.b;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (awyjVar.b != j3) {
                awyjVarQ = super.q(j3, awyjVar);
                if (awyjVarQ == null) {
                    if (zW) {
                        return new awyg(this.n());
                    }
                }
            } else {
                awyjVarQ = awyjVar;
            }
            Object obj2 = obj;
            int iA = super.a(awyjVarQ, i, obj2, j, axdyVar, zW);
            awym awymVar = this;
            awyjVar = awyjVarQ;
            if (iA == 0) {
                awyjVar.o();
                return awmy.a;
            }
            if (iA != 1) {
                if (iA != 2) {
                    if (iA == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iA == 4) {
                        if (j < awymVar.b()) {
                            awyjVar.o();
                        }
                        return new awyg(awymVar.n());
                    }
                    awyjVar.o();
                    this = awymVar;
                    obj = obj2;
                } else {
                    if (zW) {
                        awyjVar.r();
                        return new awyg(awymVar.n());
                    }
                    awymVar.r((awyjVar.b * j2) + ((long) i));
                }
            }
            return awmy.a;
        }
    }

    @Override // defpackage.awya, defpackage.awys
    public final Object h(Object obj, awoq awoqVar) throws Throwable {
        Object objB = B(obj);
        if (!(objB instanceof awyg)) {
            return awmy.a;
        }
        awyi.a(objB);
        throw n();
    }

    @Override // defpackage.awya, defpackage.awys
    public final Object j(Object obj) {
        return B(obj);
    }

    @Override // defpackage.awya
    protected final boolean z() {
        return this.g == 2;
    }
}
