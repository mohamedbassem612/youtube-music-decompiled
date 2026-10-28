package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awtt extends awwk implements awwd, awoq, awut {
    public final awou a;

    public awtt(awou awouVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            F((awwd) awouVar.get(awwd.d));
        }
        this.a = awouVar.plus(this);
    }

    @Override // defpackage.awut
    public final awou b() {
        return this.a;
    }

    @Override // defpackage.awwk
    public final void g(Throwable th) {
        awrc.Q(this.a, th);
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.a;
    }

    protected void kA(Object obj) {
        kH(obj);
    }

    @Override // defpackage.awwk
    public String kB() {
        String str = null;
        if (awuv.a) {
            awou awouVar = this.a;
            awur awurVar = (awur) awouVar.get(awur.b);
            if (awurVar != null) {
                awus awusVar = (awus) awouVar.get(awus.b);
                str = (awusVar != null ? awusVar.a : "coroutine") + '#' + awurVar.a;
            }
        }
        if (str == null) {
            return awuw.a(this);
        }
        return "\"" + str + "\":" + awuw.a(this);
    }

    @Override // defpackage.awwk
    protected final void kE(Object obj) {
        if (!(obj instanceof awum)) {
            kD(obj);
        } else {
            awum awumVar = (awum) obj;
            kC(awumVar.b, awumVar.c.a());
        }
    }

    @Override // defpackage.awwk
    protected final String ky() {
        return String.valueOf(getClass().getSimpleName()).concat(" was cancelled");
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws Throwable {
        Object objKG = kG(awrc.S(obj));
        if (objKG != awwl.c) {
            kA(objKG);
        }
    }

    protected void kD(Object obj) {
    }

    protected void kC(Throwable th, boolean z) {
    }
}
