package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgx implements abgv {
    protected boolean a;
    private final abvk b;
    private final abvc c;
    private final Integer d;
    private final abgw e;
    private abvn f;
    private final boolean g;
    private boolean h;

    public abgx(abvk abvkVar, abvc abvcVar, abgw abgwVar, Integer num, boolean z) {
        abvkVar.getClass();
        this.b = abvkVar;
        abvcVar.getClass();
        this.c = abvcVar;
        abgwVar.getClass();
        this.e = abgwVar;
        this.d = num;
        this.g = z;
        abgwVar.t(this);
    }

    public final avmn[] a(abvn abvnVar) {
        this.f = abvnVar;
        return new avmn[]{abvnVar.O().i(aawb.y(abvnVar.X(), 262144L)).i(new abwr(1)).al(new abgd(this, 13), new abeq(7))};
    }

    @Override // defpackage.abgv
    public final void g() {
        this.c.i(abtu.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5.c.n(defpackage.abtu.b) == false) goto L18;
     */
    @Override // defpackage.abgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            boolean r0 = r5.g
            if (r0 == 0) goto L1a
            abvn r0 = r5.f
            if (r0 == 0) goto L1a
            acdq r0 = r0.x()
            if (r0 == 0) goto L1a
            abvn r0 = r5.f
            acdq r0 = r0.x()
            boolean r0 = r0.A()
            if (r0 == 0) goto L49
        L1a:
            java.lang.Integer r0 = r5.d
            int r1 = r0.intValue()
            if (r1 <= 0) goto L37
            abvk r1 = r5.b
            boolean r2 = r1.Z()
            if (r2 == 0) goto L37
            long r1 = r1.c()
            int r0 = r0.intValue()
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L41
        L37:
            abvc r0 = r5.c
            abtu r1 = defpackage.abtu.b
            boolean r0 = r0.n(r1)
            if (r0 != 0) goto L49
        L41:
            abvk r5 = r5.b
            r0 = 0
            r5.af(r0)
            goto L50
        L49:
            abvc r5 = r5.c
            abtu r0 = defpackage.abtu.b
            r5.i(r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgx.h():void");
    }

    @tcc
    public void handleSequencerHasPreviousNextEvent(aayv aayvVar) {
        abvc abvcVar = this.c;
        boolean zN = abvcVar.n(abtu.b);
        if (this.h != zN) {
            this.h = zN;
            this.e.r(zN);
        }
        boolean zN2 = abvcVar.n(abtu.a);
        if (this.a != zN2) {
            this.a = zN2;
            this.e.q(zN2);
        }
    }
}
