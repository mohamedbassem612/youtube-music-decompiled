package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axav extends axbe implements axaf, awzc, axbx {
    private final awtr a;
    private int b;

    public axav(Object obj) {
        this.a = new awtr(obj, awts.a);
    }

    private final boolean f(Object obj, Object obj2) {
        int i;
        axbg[] axbgVarArr;
        axdy axdyVar;
        synchronized (this) {
            awtr awtrVar = this.a;
            Object obj3 = awtrVar.a;
            if (obj != null && !awrc.c(obj3, obj)) {
                return false;
            }
            if (!awrc.c(obj3, obj2)) {
                awtrVar.c(obj2);
                int i2 = this.b;
                if ((i2 & 1) == 0) {
                    int i3 = i2 + 1;
                    this.b = i3;
                    axbg[] axbgVarArr2 = this.d;
                    while (true) {
                        axax[] axaxVarArr = (axax[]) axbgVarArr2;
                        if (axaxVarArr != null) {
                            for (axax axaxVar : axaxVarArr) {
                                if (axaxVar != null) {
                                    while (true) {
                                        AtomicReference atomicReference = axaxVar.a;
                                        Object obj4 = atomicReference.get();
                                        if (obj4 == null || obj4 == (axdyVar = axaw.b)) {
                                            break;
                                        }
                                        axdy axdyVar2 = axaw.a;
                                        if (obj4 != axdyVar2) {
                                            if (a.av(atomicReference, obj4, axdyVar2)) {
                                                ((awud) obj4).resumeWith(awmy.a);
                                                break;
                                            }
                                        } else {
                                            if (a.av(atomicReference, obj4, axdyVar)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i = this.b;
                            if (i == i3) {
                                break;
                            }
                            axbgVarArr = this.d;
                        }
                        axbgVarArr2 = axbgVarArr;
                        i3 = i;
                    }
                    this.b = i3 + 1;
                } else {
                    this.b = i2 + 2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.axae
    public final boolean b(Object obj) {
        d(obj);
        return true;
    }

    @Override // defpackage.axaf, defpackage.axat
    public final Object c() {
        axdy axdyVar = axca.a;
        Object obj = this.a.a;
        if (obj == axdyVar) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00df A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b8, B:47:0x00d4, B:48:0x00d9, B:50:0x00df, B:51:0x00e3, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [axav, axbe] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [awwd] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b6 -> B:30:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.axah, defpackage.awzc
    public final java.lang.Object collect(defpackage.awzd r13, defpackage.awoq r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axav.collect(awzd, awoq):java.lang.Object");
    }

    @Override // defpackage.axaf
    public final void d(Object obj) {
        if (obj == null) {
            obj = axca.a;
        }
        f(null, obj);
    }

    @Override // defpackage.axaf
    public final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            obj = axca.a;
        }
        if (obj2 == null) {
            obj2 = axca.a;
        }
        return f(obj, obj2);
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) {
        d(obj);
        return awmy.a;
    }

    @Override // defpackage.axbe
    public final /* synthetic */ axbg g() {
        return new axax();
    }

    @Override // defpackage.axbe
    public final /* bridge */ /* synthetic */ axbg[] j() {
        return new axax[2];
    }

    @Override // defpackage.axbx
    public final awzc kK(awou awouVar, int i, int i2) {
        return axaw.b(this, awouVar, i, i2);
    }
}
