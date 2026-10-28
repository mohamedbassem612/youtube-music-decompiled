package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axak extends axbe implements axae, awzc, axbx {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public axak(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    private final int c() {
        return (int) ((d() + ((long) this.h)) - this.b);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x012b, TryCatch #2 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:83:0x0085, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: all -> 0x012b, TryCatch #2 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:83:0x0085, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae A[Catch: all -> 0x012b, TryCatch #2 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:83:0x0085, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:40:0x00c3, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d1, B:47:0x00d4, B:49:0x00d8, B:50:0x00ee, B:55:0x0102, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:63:0x0113, B:64:0x0114, B:66:0x0117, B:67:0x011a, B:71:0x012c, B:72:0x012d, B:51:0x00ef, B:53:0x00fa, B:54:0x00fd, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:85:0x003f, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:40:0x00c3, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d1, B:47:0x00d4, B:49:0x00d8, B:50:0x00ee, B:55:0x0102, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:63:0x0113, B:64:0x0114, B:66:0x0117, B:67:0x011a, B:71:0x012c, B:72:0x012d, B:51:0x00ef, B:53:0x00fa, B:54:0x00fd, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:85:0x003f, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa A[Catch: all -> 0x0112, TryCatch #1 {, blocks: (B:51:0x00ef, B:53:0x00fa, B:54:0x00fd), top: B:81:0x00ef, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #1 {, blocks: (B:51:0x00ef, B:53:0x00fa, B:54:0x00fd), top: B:81:0x00ef, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:40:0x00c3, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d1, B:47:0x00d4, B:49:0x00d8, B:50:0x00ee, B:55:0x0102, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:63:0x0113, B:64:0x0114, B:66:0x0117, B:67:0x011a, B:71:0x012c, B:72:0x012d, B:51:0x00ef, B:53:0x00fa, B:54:0x00fd, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:85:0x003f, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:40:0x00c3, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d1, B:47:0x00d4, B:49:0x00d8, B:50:0x00ee, B:55:0x0102, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:63:0x0113, B:64:0x0114, B:66:0x0117, B:67:0x011a, B:71:0x012c, B:72:0x012d, B:51:0x00ef, B:53:0x00fa, B:54:0x00fd, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:85:0x003f, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0117 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:40:0x00c3, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d1, B:47:0x00d4, B:49:0x00d8, B:50:0x00ee, B:55:0x0102, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:63:0x0113, B:64:0x0114, B:66:0x0117, B:67:0x011a, B:71:0x012c, B:72:0x012d, B:51:0x00ef, B:53:0x00fa, B:54:0x00fd, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00ae, B:38:0x00b2), top: B:85:0x003f, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x012a A[EDGE_INSN: B:90:0x012a->B:69:0x012a BREAK  A[LOOP:0: B:30:0x0082->B:92:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (((defpackage.axaz) r0).a(r3) != r4) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [axak, axbe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(defpackage.axak r17, defpackage.awzd r18, defpackage.awoq r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axak.e(axak, awzd, awoq):java.lang.Object");
    }

    private final int m() {
        return this.h + this.i;
    }

    private final long n() {
        return d() + ((long) this.h);
    }

    private final long o(axam axamVar) {
        long j = axamVar.a;
        if (j < n()) {
            return j;
        }
        if (this.g > 0 || j > d() || this.i == 0) {
            return -1L;
        }
        return j;
    }

    private final void p() {
        axbg[] axbgVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        axal.b(objArr, d(), null);
        this.h--;
        long jD = d() + 1;
        if (this.b < jD) {
            this.b = jD;
        }
        if (this.c < jD) {
            if (this.e != 0 && (axbgVarArr = this.d) != null) {
                for (axbg axbgVar : axbgVarArr) {
                    if (axbgVar != null) {
                        axam axamVar = (axam) axbgVar;
                        long j = axamVar.a;
                        if (j >= 0 && j < jD) {
                            axamVar.a = jD;
                        }
                    }
                }
            }
            this.c = jD;
        }
        boolean z = awuv.a;
    }

    private final void q(Object obj) {
        int iM = m();
        Object[] objArrT = this.a;
        if (objArrT == null) {
            objArrT = t(null, 0, 2);
        } else {
            int length = objArrT.length;
            if (iM >= length) {
                objArrT = t(objArrT, iM, length << 1);
            }
        }
        objArrT[((int) (d() + ((long) iM))) & (objArrT.length - 1)] = obj;
    }

    private final void r(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = awuv.a;
        for (long jD = d(); jD < jMin; jD++) {
            Object[] objArr = this.a;
            objArr.getClass();
            objArr[((int) jD) & (objArr.length - 1)] = null;
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    private final boolean s(Object obj) {
        if (this.e == 0) {
            boolean z = awuv.a;
            if (this.f == 0) {
                return true;
            }
            q(obj);
            int i = this.h + 1;
            this.h = i;
            if (i > 1) {
                p();
            }
            this.c = d() + ((long) this.h);
            return true;
        }
        int i2 = this.h;
        int i3 = this.g;
        if (i2 >= i3 && this.c <= this.b) {
            int i4 = this.j;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            if (i5 == 0) {
                return false;
            }
            if (i5 != 1) {
                throw new awmj();
            }
        }
        q(obj);
        int i6 = this.h + 1;
        this.h = i6;
        if (i6 > i3) {
            p();
        }
        if (c() <= this.f) {
            return true;
        }
        r(this.b + 1, this.c, n(), d() + ((long) this.h) + ((long) this.i));
        return true;
    }

    private final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jD = d();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (((long) i3) + jD);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [awoq[]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    private final awoq[] u(awoq[] awoqVarArr) {
        axbg[] axbgVarArr;
        axam axamVar;
        awoq awoqVar;
        if (this.e != 0 && (axbgVarArr = this.d) != null) {
            int length = awoqVarArr.length;
            int i = 0;
            awoqVarArr = awoqVarArr;
            while (i < axbgVarArr.length) {
                axbg axbgVar = axbgVarArr[i];
                if (axbgVar != null && (awoqVar = (axamVar = (axam) axbgVar).b) != null && o(axamVar) >= 0) {
                    int length2 = awoqVarArr.length;
                    if (length >= length2) {
                        awoqVarArr = awoqVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) awoqVarArr, Math.max(2, length2 << 1));
                        objArrCopyOf.getClass();
                        awoqVarArr = objArrCopyOf;
                    }
                    awoqVarArr = awoqVarArr;
                    ((awoq[]) awoqVarArr)[length] = awoqVar;
                    axamVar.b = null;
                    length++;
                }
                i++;
                awoqVarArr = awoqVarArr;
            }
        }
        return (awoq[]) awoqVarArr;
    }

    @Override // defpackage.axae
    public final boolean b(Object obj) {
        int i;
        boolean z;
        awoq[] awoqVarArrU = axbf.a;
        synchronized (this) {
            if (s(obj)) {
                awoqVarArrU = u(awoqVarArrU);
                z = true;
            } else {
                z = false;
            }
        }
        for (awoq awoqVar : awoqVarArrU) {
            if (awoqVar != null) {
                awoqVar.resumeWith(awmy.a);
            }
        }
        return z;
    }

    @Override // defpackage.axah, defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) {
        return e(this, awzdVar, awoqVar);
    }

    public final long d() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        axak axakVar;
        Throwable th;
        awoq[] awoqVarArrU;
        axai axaiVar;
        if (b(obj)) {
            return awmy.a;
        }
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        awoq[] awoqVarArrU2 = axbf.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        awudVar.resumeWith(awmy.a);
                        awoqVarArrU = u(awoqVarArrU2);
                        axaiVar = null;
                        axakVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        axakVar = this;
                        throw th;
                    }
                } else {
                    axakVar = this;
                    try {
                        axaiVar = new axai(axakVar, d() + ((long) m()), obj, awudVar);
                        axakVar.q(axaiVar);
                        axakVar.i++;
                        if (axakVar.g == 0) {
                            awoqVarArrU2 = axakVar.u(awoqVarArrU2);
                        }
                        awoqVarArrU = awoqVarArrU2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (axaiVar != null) {
                    awudVar.x(new awvl(axaiVar, 0));
                }
                for (awoq awoqVar2 : awoqVarArrU) {
                    if (awoqVar2 != null) {
                        awoqVar2.resumeWith(awmy.a);
                    }
                }
                Object objJ = awudVar.j();
                awox awoxVar = awox.a;
                if (objJ == awoxVar) {
                    awoqVar.getClass();
                } else {
                    objJ = awmy.a;
                }
                return objJ != awoxVar ? awmy.a : objJ;
            } catch (Throwable th4) {
                th = th4;
                axakVar = this;
            }
        }
    }

    protected final Object f() {
        Object[] objArr = this.a;
        objArr.getClass();
        return axal.a(objArr, (this.b + ((long) c())) - 1);
    }

    @Override // defpackage.axbe
    public final /* synthetic */ axbg g() {
        return new axam();
    }

    public final void h() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0) {
                long jD = d() + ((long) m());
                int length = objArr.length - 1;
                if (objArr[((int) (jD - 1)) & length] != axal.a) {
                    return;
                }
                this.i--;
                objArr[((int) (d() + ((long) m()))) & length] = null;
            }
        }
    }

    public final awoq[] i(long j) {
        long j2;
        int i;
        long j3;
        axbg[] axbgVarArr;
        boolean z = awuv.a;
        if (j <= this.c) {
            long jD = d();
            long j4 = ((long) this.h) + jD;
            int i2 = this.g;
            if (i2 == 0 && this.i > 0) {
                j4++;
            }
            int i3 = 0;
            if (this.e != 0 && (axbgVarArr = this.d) != null) {
                for (axbg axbgVar : axbgVarArr) {
                    if (axbgVar != null) {
                        long j5 = ((axam) axbgVar).a;
                        if (j5 >= 0 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.c) {
                long jN = n();
                int i4 = this.e;
                int iMin = this.i;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jN - j4)));
                }
                awoq[] awoqVarArr = axbf.a;
                long j6 = ((long) this.i) + jN;
                if (iMin > 0) {
                    awoqVarArr = new awoq[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j3 = 1;
                    long j7 = jN;
                    while (true) {
                        if (jN >= j6) {
                            j2 = j4;
                            i = i2;
                            jN = j7;
                            break;
                        }
                        j2 = j4;
                        int length = objArr.length - 1;
                        int i5 = ((int) jN) & length;
                        Object obj = objArr[i5];
                        axdy axdyVar = axal.a;
                        if (obj != axdyVar) {
                            obj.getClass();
                            int i6 = i3 + 1;
                            axai axaiVar = (axai) obj;
                            i = i2;
                            awoqVarArr[i3] = axaiVar.d;
                            objArr[i5] = axdyVar;
                            objArr[((int) j7) & length] = axaiVar.c;
                            long j8 = j7 + 1;
                            if (i6 >= iMin) {
                                jN = j8;
                                break;
                            }
                            i3 = i6;
                            j7 = j8;
                        } else {
                            i = i2;
                        }
                        jN++;
                        j4 = j2;
                        i2 = i;
                    }
                } else {
                    j2 = j4;
                    i = i2;
                    j3 = 1;
                }
                awoq[] awoqVarArr2 = awoqVarArr;
                long jMax = Math.max(this.b, Math.max(jD, jN - ((long) this.f)));
                if (i == 0 && jMax < j6) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (awrc.c(objArr2[((int) jMax) & (objArr2.length - 1)], axal.a)) {
                        jN += j3;
                        jMax += j3;
                    }
                }
                long j9 = jN;
                r(jMax, this.e == 0 ? j9 : j2, j9, j6);
                h();
                return awoqVarArr2.length == 0 ? awoqVarArr2 : u(awoqVarArr2);
            }
        }
        return axbf.a;
    }

    @Override // defpackage.axbe
    public final /* bridge */ /* synthetic */ axbg[] j() {
        return new axam[2];
    }

    @Override // defpackage.axbx
    public final awzc kK(awou awouVar, int i, int i2) {
        return axal.c(this, awouVar, i, i2);
    }
}
