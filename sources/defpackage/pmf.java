package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import internal.org.jni_zero.JniZero;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pmf extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    long e;
    int f;
    int g;
    final /* synthetic */ pmg h;
    final /* synthetic */ dyp i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmf(pmg pmgVar, dyp dypVar, int i, awoq awoqVar) {
        super(2, awoqVar);
        this.h = pmgVar;
        this.i = dypVar;
        this.j = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pmf(this.h, this.i, this.j, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pmf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0242  */
    /* JADX WARN: Code duplicated, block: B:85:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x02fd: INVOKE (r10 I:java.io.Closeable), (r1 I:java.lang.Throwable) STATIC call: internal.org.jni_zero.JniZero.l(java.io.Closeable, java.lang.Throwable):void A[MD:(java.io.Closeable, java.lang.Throwable):void (m)] (LINE:766), block:B:102:0x02fd */
    /* JADX WARN: Type inference failed for: r0v21, types: [agsj] */
    /* JADX WARN: Type inference failed for: r0v26, types: [agsj] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable, java.lang.Object, plg] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [agsj] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Closeable closeableL;
        ?? plgVar;
        ?? r15;
        Bundle bundle;
        boolean zHasSystemFeature;
        boolean z;
        String str;
        long j;
        ?? r6;
        long j2;
        Object obj2;
        Object obj3;
        Object objP;
        String strValueOf;
        dzb dzbVar;
        int length;
        boolean z2;
        Object dzbVar2;
        boolean z3;
        boolean z4;
        ?? r10;
        String str2 = "CHECK_FAILED";
        awox awoxVar = awox.a;
        try {
            if (this.g == 0) {
                atqp.j(obj);
                plgVar = new plg(0);
                pmg pmgVar = this.h;
                dyp dypVar = this.i;
                int i = this.j;
                long epochMilli = pmgVar.b.f().toEpochMilli();
                String strA = dypVar.a("com.google.android.libraries.notifications.platform.JOB_ID");
                if (strA == null) {
                    strA = "";
                }
                r15 = strA;
                String strA2 = dypVar.a("com.google.android.libraries.notifications.platform.JOB_KEY");
                dypVar.getClass();
                byte[] bArrC = dypVar.c("com.google.android.libraries.notifications.platform.WORKER_PARAMS");
                if (bArrC == null || (length = bArrC.length) == 0) {
                    bundle = new Bundle();
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrC, 0, length);
                    parcelObtain.setDataPosition(0);
                    parcelObtain.getClass();
                    bundle = new Bundle();
                    bundle.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                }
                Bundle bundle2 = bundle;
                try {
                    zHasSystemFeature = pmgVar.c.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
                } catch (Exception unused) {
                    zHasSystemFeature = false;
                }
                if (strA2 == null) {
                    ((agsj) pmg.a.b()).w("Job key is null. Job ID: %s.", r15);
                    dzbVar = new dzb();
                } else {
                    ppw ppwVar = (ppw) pmgVar.d.get(strA2);
                    if (ppwVar == null) {
                        ((agsj) pmg.a.b()).B("Failed to find job, is it injected?. Job ID: %s, Job key: %s.", r15, strA2);
                        dzbVar = new dzb();
                    } else {
                        bundle2.putInt("com.google.android.libraries.notifications.platform.JOB_RETRY_COUNT", i);
                        try {
                            Boolean bool = (Boolean) pmgVar.i.h().d();
                            if (bool != null && (strValueOf = String.valueOf(bool.booleanValue())) != null) {
                                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                str2 = upperCase;
                            }
                        } catch (Throwable unused2) {
                        }
                        z = false;
                        ((qtf) ((pwf) pmgVar.f.io()).f.io()).b(1L, pmgVar.c.getPackageName(), pmgVar.e.a, Integer.valueOf(Build.VERSION.SDK_INT), strA2, str2, "ANY");
                        try {
                            long jD = auum.a.io().d();
                            try {
                                pme pmeVar = new pme(ppwVar, bundle2, pmgVar, r15, strA2, epochMilli, zHasSystemFeature, null);
                                str = strA2;
                                j = epochMilli;
                                r6 = zHasSystemFeature;
                                try {
                                    this.a = plgVar;
                                    this.b = pmgVar;
                                    this.c = str;
                                    this.d = r15;
                                    this.e = j;
                                    this.f = r6 == true ? 1 : 0;
                                    this.g = 1;
                                    objP = avkz.p(jD, pmeVar, this);
                                    if (objP == awoxVar) {
                                        return awoxVar;
                                    }
                                    j2 = j;
                                    obj2 = pmgVar;
                                    obj3 = str;
                                    r6 = r6;
                                    plgVar = plgVar;
                                    r15 = r15;
                                    dzbVar2 = (bbl) objP;
                                    r10 = plgVar;
                                } catch (awxi e) {
                                    e = e;
                                    j2 = j;
                                    obj2 = pmgVar;
                                    obj3 = str;
                                    agsn agsnVar = pmg.a;
                                    pwf pwfVar = (pwf) ((pmg) obj2).f.io();
                                    String packageName = ((pmg) obj2).c.getPackageName();
                                    String str3 = ((pmg) obj2).e.a;
                                    int i2 = Build.VERSION.SDK_INT;
                                    String str4 = (String) obj3;
                                    if (1 != r6) {
                                        z4 = z;
                                    } else {
                                        z4 = true;
                                    }
                                    pwfVar.h(packageName, str3, i2, str4, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                                    pny pnyVar = (pny) ((pmg) obj2).g.io();
                                    pnz pnzVarA = ((pob) ((pmg) obj2).h.io()).a(e);
                                    pnzVarA.a((String) obj3);
                                    pnyVar.a(pnzVarA);
                                    ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.O));
                                    dzbVar2 = new dzb();
                                    r10 = plgVar;
                                    Object obj4 = dzbVar2;
                                    JniZero.l(r10, null);
                                    return obj4;
                                } catch (CancellationException e2) {
                                    e = e2;
                                    j2 = j;
                                    obj2 = pmgVar;
                                    obj3 = str;
                                    agsn agsnVar2 = pmg.a;
                                    pwf pwfVar2 = (pwf) ((pmg) obj2).f.io();
                                    String packageName2 = ((pmg) obj2).c.getPackageName();
                                    String str5 = ((pmg) obj2).e.a;
                                    int i3 = Build.VERSION.SDK_INT;
                                    String str6 = (String) obj3;
                                    if (1 != r6) {
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                    }
                                    pwfVar2.h(packageName2, str5, i3, str6, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                                    pny pnyVar2 = (pny) ((pmg) obj2).g.io();
                                    pnz pnzVarA2 = ((pob) ((pmg) obj2).h.io()).a(e);
                                    pnzVarA2.a((String) obj3);
                                    pnyVar2.a(pnzVarA2);
                                    ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.M));
                                    dzbVar2 = new dzb();
                                    r10 = plgVar;
                                    Object obj5 = dzbVar2;
                                    JniZero.l(r10, null);
                                    return obj5;
                                } catch (Throwable th) {
                                    th = th;
                                    j2 = j;
                                    obj2 = pmgVar;
                                    obj3 = str;
                                    ((agsj) ((agsj) pmg.a.c()).j(th)).B("Job failed with exception. Job ID: '%s', key: '%s'", r15, obj3);
                                    pwf pwfVar3 = (pwf) ((pmg) obj2).f.io();
                                    String packageName3 = ((pmg) obj2).c.getPackageName();
                                    String str7 = ((pmg) obj2).e.a;
                                    int i4 = Build.VERSION.SDK_INT;
                                    String str8 = (String) obj3;
                                    if (1 != r6) {
                                        z2 = z;
                                    } else {
                                        z2 = true;
                                    }
                                    pwfVar3.h(packageName3, str7, i4, str8, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                                    pny pnyVar3 = (pny) ((pmg) obj2).g.io();
                                    pnz pnzVarA3 = ((pob) ((pmg) obj2).h.io()).a(th);
                                    pnzVarA3.a((String) obj3);
                                    pnyVar3.a(pnzVarA3);
                                    ((pmg) obj2).b(j2, (String) obj3, new pkw(th, pkx.b));
                                    dzbVar2 = new dzb();
                                    r10 = plgVar;
                                    Object obj6 = dzbVar2;
                                    JniZero.l(r10, null);
                                    return obj6;
                                }
                            } catch (awxi e3) {
                                e = e3;
                                str = strA2;
                                j = epochMilli;
                                r6 = zHasSystemFeature;
                                j2 = j;
                                obj2 = pmgVar;
                                obj3 = str;
                                agsn agsnVar3 = pmg.a;
                                pwf pwfVar4 = (pwf) ((pmg) obj2).f.io();
                                String packageName4 = ((pmg) obj2).c.getPackageName();
                                String str9 = ((pmg) obj2).e.a;
                                int i5 = Build.VERSION.SDK_INT;
                                String str10 = (String) obj3;
                                if (1 != r6) {
                                    z4 = z;
                                } else {
                                    z4 = true;
                                }
                                pwfVar4.h(packageName4, str9, i5, str10, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                                pny pnyVar4 = (pny) ((pmg) obj2).g.io();
                                pnz pnzVarA4 = ((pob) ((pmg) obj2).h.io()).a(e);
                                pnzVarA4.a((String) obj3);
                                pnyVar4.a(pnzVarA4);
                                ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.O));
                                dzbVar2 = new dzb();
                                r10 = plgVar;
                                Object obj7 = dzbVar2;
                                JniZero.l(r10, null);
                                return obj7;
                            } catch (CancellationException e4) {
                                e = e4;
                                str = strA2;
                                j = epochMilli;
                                r6 = zHasSystemFeature;
                                j2 = j;
                                obj2 = pmgVar;
                                obj3 = str;
                                agsn agsnVar4 = pmg.a;
                                pwf pwfVar5 = (pwf) ((pmg) obj2).f.io();
                                String packageName5 = ((pmg) obj2).c.getPackageName();
                                String str11 = ((pmg) obj2).e.a;
                                int i6 = Build.VERSION.SDK_INT;
                                String str12 = (String) obj3;
                                if (1 != r6) {
                                    z3 = z;
                                } else {
                                    z3 = true;
                                }
                                pwfVar5.h(packageName5, str11, i6, str12, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                                pny pnyVar5 = (pny) ((pmg) obj2).g.io();
                                pnz pnzVarA5 = ((pob) ((pmg) obj2).h.io()).a(e);
                                pnzVarA5.a((String) obj3);
                                pnyVar5.a(pnzVarA5);
                                ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.M));
                                dzbVar2 = new dzb();
                                r10 = plgVar;
                                Object obj8 = dzbVar2;
                                JniZero.l(r10, null);
                                return obj8;
                            } catch (Throwable th2) {
                                th = th2;
                                str = strA2;
                                j = epochMilli;
                                r6 = zHasSystemFeature;
                                j2 = j;
                                obj2 = pmgVar;
                                obj3 = str;
                                ((agsj) ((agsj) pmg.a.c()).j(th)).B("Job failed with exception. Job ID: '%s', key: '%s'", r15, obj3);
                                pwf pwfVar6 = (pwf) ((pmg) obj2).f.io();
                                String packageName6 = ((pmg) obj2).c.getPackageName();
                                String str13 = ((pmg) obj2).e.a;
                                int i7 = Build.VERSION.SDK_INT;
                                String str14 = (String) obj3;
                                if (1 != r6) {
                                    z2 = z;
                                } else {
                                    z2 = true;
                                }
                                pwfVar6.h(packageName6, str13, i7, str14, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                                pny pnyVar6 = (pny) ((pmg) obj2).g.io();
                                pnz pnzVarA6 = ((pob) ((pmg) obj2).h.io()).a(th);
                                pnzVarA6.a((String) obj3);
                                pnyVar6.a(pnzVarA6);
                                ((pmg) obj2).b(j2, (String) obj3, new pkw(th, pkx.b));
                                dzbVar2 = new dzb();
                                r10 = plgVar;
                                Object obj9 = dzbVar2;
                                JniZero.l(r10, null);
                                return obj9;
                            }
                        } catch (awxi e5) {
                            e = e5;
                            str = strA2;
                        } catch (CancellationException e6) {
                            e = e6;
                            str = strA2;
                        } catch (Throwable th3) {
                            th = th3;
                            str = strA2;
                        }
                    }
                }
                dzb dzbVar3 = dzbVar;
                JniZero.l(plgVar, null);
                return dzbVar3;
            }
            int i8 = this.f;
            j2 = this.e;
            Object obj10 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            plgVar = this.a;
            try {
                atqp.j(obj);
                objP = obj;
                z = false;
                r15 = obj10;
                r6 = i8;
                plgVar = plgVar;
                try {
                    dzbVar2 = (bbl) objP;
                    r10 = plgVar;
                } catch (awxi e7) {
                    e = e7;
                    agsn agsnVar5 = pmg.a;
                    pwf pwfVar7 = (pwf) ((pmg) obj2).f.io();
                    String packageName7 = ((pmg) obj2).c.getPackageName();
                    String str15 = ((pmg) obj2).e.a;
                    int i9 = Build.VERSION.SDK_INT;
                    String str16 = (String) obj3;
                    if (1 != r6) {
                        z4 = z;
                    } else {
                        z4 = true;
                    }
                    pwfVar7.h(packageName7, str15, i9, str16, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                    pny pnyVar7 = (pny) ((pmg) obj2).g.io();
                    pnz pnzVarA7 = ((pob) ((pmg) obj2).h.io()).a(e);
                    pnzVarA7.a((String) obj3);
                    pnyVar7.a(pnzVarA7);
                    ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.O));
                    dzbVar2 = new dzb();
                    r10 = plgVar;
                } catch (CancellationException e8) {
                    e = e8;
                    agsn agsnVar6 = pmg.a;
                    pwf pwfVar8 = (pwf) ((pmg) obj2).f.io();
                    String packageName8 = ((pmg) obj2).c.getPackageName();
                    String str17 = ((pmg) obj2).e.a;
                    int i10 = Build.VERSION.SDK_INT;
                    String str18 = (String) obj3;
                    if (1 != r6) {
                        z3 = z;
                    } else {
                        z3 = true;
                    }
                    pwfVar8.h(packageName8, str17, i10, str18, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                    pny pnyVar8 = (pny) ((pmg) obj2).g.io();
                    pnz pnzVarA8 = ((pob) ((pmg) obj2).h.io()).a(e);
                    pnzVarA8.a((String) obj3);
                    pnyVar8.a(pnzVarA8);
                    ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.M));
                    dzbVar2 = new dzb();
                    r10 = plgVar;
                } catch (Throwable th4) {
                    th = th4;
                    ((agsj) ((agsj) pmg.a.c()).j(th)).B("Job failed with exception. Job ID: '%s', key: '%s'", r15, obj3);
                    pwf pwfVar9 = (pwf) ((pmg) obj2).f.io();
                    String packageName9 = ((pmg) obj2).c.getPackageName();
                    String str19 = ((pmg) obj2).e.a;
                    int i11 = Build.VERSION.SDK_INT;
                    String str110 = (String) obj3;
                    if (1 != r6) {
                        z2 = z;
                    } else {
                        z2 = true;
                    }
                    pwfVar9.h(packageName9, str19, i11, str110, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                    pny pnyVar9 = (pny) ((pmg) obj2).g.io();
                    pnz pnzVarA9 = ((pob) ((pmg) obj2).h.io()).a(th);
                    pnzVarA9.a((String) obj3);
                    pnyVar9.a(pnzVarA9);
                    ((pmg) obj2).b(j2, (String) obj3, new pkw(th, pkx.b));
                    dzbVar2 = new dzb();
                    r10 = plgVar;
                }
            } catch (awxi e9) {
                e = e9;
                z = false;
                r6 = i8;
                agsn agsnVar7 = pmg.a;
                pwf pwfVar10 = (pwf) ((pmg) obj2).f.io();
                String packageName10 = ((pmg) obj2).c.getPackageName();
                String str111 = ((pmg) obj2).e.a;
                int i12 = Build.VERSION.SDK_INT;
                String str112 = (String) obj3;
                if (1 != r6) {
                    z4 = z;
                } else {
                    z4 = true;
                }
                pwfVar10.h(packageName10, str111, i12, str112, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                pny pnyVar10 = (pny) ((pmg) obj2).g.io();
                pnz pnzVarA10 = ((pob) ((pmg) obj2).h.io()).a(e);
                pnzVarA10.a((String) obj3);
                pnyVar10.a(pnzVarA10);
                ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.O));
                dzbVar2 = new dzb();
                r10 = plgVar;
                Object obj11 = dzbVar2;
                JniZero.l(r10, null);
                return obj11;
            } catch (CancellationException e10) {
                e = e10;
                z = false;
                r6 = i8;
                agsn agsnVar8 = pmg.a;
                pwf pwfVar11 = (pwf) ((pmg) obj2).f.io();
                String packageName11 = ((pmg) obj2).c.getPackageName();
                String str113 = ((pmg) obj2).e.a;
                int i13 = Build.VERSION.SDK_INT;
                String str114 = (String) obj3;
                if (1 != r6) {
                    z3 = z;
                } else {
                    z3 = true;
                }
                pwfVar11.h(packageName11, str113, i13, str114, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                pny pnyVar11 = (pny) ((pmg) obj2).g.io();
                pnz pnzVarA11 = ((pob) ((pmg) obj2).h.io()).a(e);
                pnzVarA11.a((String) obj3);
                pnyVar11.a(pnzVarA11);
                ((pmg) obj2).b(j2, (String) obj3, new pkw(e, pkx.M));
                dzbVar2 = new dzb();
                r10 = plgVar;
                Object obj12 = dzbVar2;
                JniZero.l(r10, null);
                return obj12;
            } catch (Throwable th5) {
                th = th5;
                z = false;
                r15 = obj10;
                r6 = i8;
                ((agsj) ((agsj) pmg.a.c()).j(th)).B("Job failed with exception. Job ID: '%s', key: '%s'", r15, obj3);
                pwf pwfVar12 = (pwf) ((pmg) obj2).f.io();
                String packageName12 = ((pmg) obj2).c.getPackageName();
                String str115 = ((pmg) obj2).e.a;
                int i14 = Build.VERSION.SDK_INT;
                String str116 = (String) obj3;
                if (1 != r6) {
                    z2 = z;
                } else {
                    z2 = true;
                }
                pwfVar12.h(packageName12, str115, i14, str116, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                pny pnyVar12 = (pny) ((pmg) obj2).g.io();
                pnz pnzVarA12 = ((pob) ((pmg) obj2).h.io()).a(th);
                pnzVarA12.a((String) obj3);
                pnyVar12.a(pnzVarA12);
                ((pmg) obj2).b(j2, (String) obj3, new pkw(th, pkx.b));
                dzbVar2 = new dzb();
                r10 = plgVar;
                Object obj13 = dzbVar2;
                JniZero.l(r10, null);
                return obj13;
            }
            Object obj14 = dzbVar2;
            JniZero.l(r10, null);
            return obj14;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                JniZero.l(closeableL, th6);
                throw th7;
            }
        }
    }
}
