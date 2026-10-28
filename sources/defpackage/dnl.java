package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnl {
    public static final /* synthetic */ int h = 0;
    private static final String[] i = {"INSERT", "UPDATE", "DELETE"};
    public final dmq a;
    public final Map b;
    public final boolean c;
    public final dmj e;
    public final ci g;
    private final Map j;
    private final awqg k;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public Function0 f = new aho(6);
    public final Map d = new LinkedHashMap();

    public dnl(dmq dmqVar, Map map, Map map2, String[] strArr, boolean z, awqg awqgVar) {
        String lowerCase;
        this.a = dmqVar;
        this.j = map;
        this.b = map2;
        this.c = z;
        this.k = awqgVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase2 = strArr[i2].toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.d.put(lowerCase2, Integer.valueOf(i2));
            String str = (String) this.j.get(strArr[i2]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.j.entrySet()) {
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Map map3 = this.d;
                map3.put(lowerCase4, atqq.t(map3, lowerCase3));
            }
        }
        this.e = new dmj(this.l.length);
        this.g = new ci(this.l.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(dml dmlVar, awoq awoqVar) {
        dna dnaVar;
        if (awoqVar instanceof dna) {
            dnaVar = (dna) awoqVar;
            int i2 = dnaVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dnaVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dnaVar = new dna(this, awoqVar);
            }
        } else {
            dnaVar = new dna(this, awoqVar);
        }
        Object objA = dnaVar.b;
        awox awoxVar = awox.a;
        int i3 = dnaVar.d;
        if (i3 == 0) {
            atqp.j(objA);
            bfu bfuVar = new bfu(4);
            dnaVar.a = dmlVar;
            dnaVar.d = 1;
            objA = dmlVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", bfuVar, dnaVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Set set = (Set) dnaVar.a;
                atqp.j(objA);
                return set;
            }
            dmlVar = (dml) dnaVar.a;
            atqp.j(objA);
        }
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            dnaVar.a = set2;
            dnaVar.d = 2;
            if (dms.d(dmlVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", dnaVar) == awoxVar) {
                return awoxVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [axaf, java.lang.Object] */
    public final Object b(awoq awoqVar) {
        dne dneVar;
        pj pjVar;
        Object objC;
        int[] iArr;
        if (awoqVar instanceof dne) {
            dneVar = (dne) awoqVar;
            int i2 = dneVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dneVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dneVar = new dne(this, awoqVar);
            }
        } else {
            dneVar = new dne(this, awoqVar);
        }
        Object objV = dneVar.a;
        awox awoxVar = awox.a;
        int i3 = dneVar.c;
        if (i3 == 0) {
            atqp.j(objV);
            dmq dmqVar = this.a;
            pj pjVar2 = dmqVar.k;
            if (!pjVar2.B()) {
                return awnq.a;
            }
            try {
                if (!this.m.compareAndSet(true, false) || !((Boolean) this.f.invoke()).booleanValue()) {
                    awnq awnqVar = awnq.a;
                    pjVar2.A();
                    return awnqVar;
                }
                dnf dnfVar = new dnf(this, null, 2, null);
                dneVar.d = pjVar2;
                dneVar.c = 1;
                objV = dmqVar.v(dnfVar, dneVar);
                if (objV == awoxVar) {
                    return awoxVar;
                }
                pjVar = pjVar2;
            } catch (Throwable th) {
                th = th;
                pjVar = pjVar2;
                pjVar.A();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pjVar = dneVar.d;
            try {
                atqp.j(objV);
            } catch (Throwable th2) {
                th = th2;
                pjVar.A();
                throw th;
            }
        }
        Set set = (Set) objV;
        if (!set.isEmpty()) {
            ci ciVar = this.g;
            set.getClass();
            if (!set.isEmpty()) {
                ?? r11 = ciVar.a;
                do {
                    objC = r11.c();
                    int[] iArr2 = (int[]) objC;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!r11.e(objC, iArr));
            }
            this.k.invoke(set);
        }
        pjVar.A();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c8 -> B:26:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.dml r13, int r14, defpackage.awoq r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnl.c(dml, int, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:18:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.dml r9, int r10, defpackage.awoq r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dnh
            if (r0 == 0) goto L13
            r0 = r11
            dnh r0 = (defpackage.dnh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dnh r0 = new dnh
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            awox r1 = defpackage.awox.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.b
            int r9 = r0.a
            java.lang.String[] r10 = r0.g
            java.lang.String r2 = r0.f
            dnv r4 = r0.h
            defpackage.atqp.j(r11)
            r11 = r10
            r10 = r4
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.atqp.j(r11)
            java.lang.String[] r8 = r8.l
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.dnl.i
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4c:
            if (r9 >= r8) goto L7e
            r4 = r11[r9]
            java.lang.String r4 = defpackage.dms.f(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = r10
            dnv r5 = (defpackage.dnv) r5
            r0.h = r5
            r0.f = r2
            r0.g = r11
            r0.a = r9
            r0.b = r8
            r0.e = r3
            java.lang.Object r4 = defpackage.dms.d(r10, r4, r0)
            if (r4 == r1) goto L80
        L7c:
            int r9 = r9 + r3
            goto L4c
        L7e:
            awmy r1 = defpackage.awmy.a
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnl.d(dml, int, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(awoq awoqVar) {
        dni dniVar;
        Throwable th;
        pj pjVar;
        if (awoqVar instanceof dni) {
            dniVar = (dni) awoqVar;
            int i2 = dniVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dniVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dniVar = new dni(this, awoqVar);
            }
        } else {
            dniVar = new dni(this, awoqVar);
        }
        Object obj = dniVar.a;
        awox awoxVar = awox.a;
        int i3 = dniVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            dmq dmqVar = this.a;
            pj pjVar2 = dmqVar.k;
            if (pjVar2.B()) {
                try {
                    dnk dnkVar = new dnk(this, (awoq) null, 0);
                    dniVar.d = pjVar2;
                    dniVar.c = 1;
                    if (dmqVar.v(dnkVar, dniVar) == awoxVar) {
                        return awoxVar;
                    }
                    pjVar = pjVar2;
                    pjVar.A();
                } catch (Throwable th2) {
                    th = th2;
                    pjVar = pjVar2;
                    pjVar.A();
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pjVar = dniVar.d;
            try {
                atqp.j(obj);
                pjVar.A();
            } catch (Throwable th3) {
                th = th3;
                pjVar.A();
                throw th;
            }
        }
        return awmy.a;
    }

    public final void f(Function0 function0, Function0 function1) {
        function0.getClass();
        function1.getClass();
        if (this.m.compareAndSet(false, true)) {
            awut awutVar = this.a.a;
            if (awutVar == null) {
                awrc.b("coroutineScope");
                awutVar = null;
            }
            awro.t(awutVar, new awus("Room Invalidation Tracker Refresh"), 0, new bev(this, function1, (awoq) null, 3), 2);
        }
    }
}
