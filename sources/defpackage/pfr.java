package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pfr extends awpk implements awqg {
    Object a;
    int b;
    final /* synthetic */ pfu c;
    final /* synthetic */ pgc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfr(pfu pfuVar, pgc pgcVar, awoq awoqVar) {
        super(1, awoqVar);
        this.c = pfuVar;
        this.d = pgcVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pfr(this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pfr) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 != 2) goto L20;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            awox r0 = defpackage.awox.a
            int r1 = r12.b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L12
            defpackage.atqp.j(r13)
            if (r1 == r2) goto L74
            goto La9
        L12:
            java.lang.Object r1 = r12.a
            defpackage.atqp.j(r13)
            goto L4e
        L18:
            defpackage.atqp.j(r13)
            pfu r13 = r12.c
            pgc r5 = r12.d
            mbc r1 = r13.c
            j$.time.Instant r1 = r1.f()
            long r8 = r1.toEpochMilli()
            r10 = 127(0x7f, float:1.78E-43)
            r6 = 0
            pgc r1 = defpackage.pgc.a(r5, r6, r8, r10)
            java.lang.String r5 = r1.b
            com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase r13 = r13.b
            pgd r13 = r13.w()
            r12.a = r1
            r12.b = r4
            pgh r13 = (defpackage.pgh) r13
            dmq r13 = r13.a
            hol r6 = new hol
            r7 = 18
            r6.<init>(r5, r7)
            java.lang.Object r13 = defpackage.apb.g(r13, r4, r3, r6, r12)
            if (r13 == r0) goto Lae
        L4e:
            pgc r13 = (defpackage.pgc) r13
            r5 = 0
            if (r13 != 0) goto L77
            pfu r13 = r12.c
            com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase r13 = r13.b
            pgd r13 = r13.w()
            r12.a = r5
            r12.b = r2
            r1.getClass()
            r2 = r13
            pgh r2 = (defpackage.pgh) r2
            dmq r2 = r2.a
            apm r5 = new apm
            r6 = 20
            r5.<init>(r13, r1, r6)
            java.lang.Object r12 = defpackage.apb.g(r2, r3, r4, r5, r12)
            if (r12 == r0) goto Lae
        L74:
            pfm r0 = defpackage.pfm.a
            goto Lae
        L77:
            r6 = r1
            pgc r6 = (defpackage.pgc) r6
            long r1 = r6.c
            long r7 = r13.c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lac
            pfu r1 = r12.c
            long r7 = r13.a
            com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase r13 = r1.b
            pgd r13 = r13.w()
            r9 = 0
            r11 = 254(0xfe, float:3.56E-43)
            pgc r1 = defpackage.pgc.a(r6, r7, r9, r11)
            r12.a = r5
            r2 = 3
            r12.b = r2
            r2 = r13
            pgh r2 = (defpackage.pgh) r2
            dmq r2 = r2.a
            pge r5 = new pge
            r5.<init>(r13, r1, r3)
            java.lang.Object r12 = defpackage.apb.g(r2, r3, r4, r5, r12)
            if (r12 == r0) goto Lae
        La9:
            pfm r0 = defpackage.pfm.b
            goto Lae
        Lac:
            pfm r0 = defpackage.pfm.c
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
