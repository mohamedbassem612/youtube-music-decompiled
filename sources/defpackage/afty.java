package defpackage;

import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afty {
    public static boolean a;
    public static final AtomicReference b;
    public static final WeakHashMap c;
    public static final aftx d;
    public static final Deque e;
    public static final Deque f;
    public static final Object g;
    public static final Runnable h;
    public static int i;
    public static int j;
    public static afvl k;
    static final omj l;
    private static final agkz m;
    private static agkz n;

    static {
        agkz agkzVarU = agkz.u("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new String[0]);
        m = agkzVarU;
        n = agkzVarU;
        a = true;
        b = new AtomicReference(agpr.a);
        l = new omj("tiktok_systrace", (byte[]) null);
        c = new WeakHashMap();
        d = new aftx();
        e = new ArrayDeque();
        f = new ArrayDeque();
        g = new Object();
        h = new gkz(12);
        j = 0;
    }

    public static afvh a() {
        return (afvh) d.get();
    }

    public static afvl b() {
        return ((afvh) d.get()).c;
    }

    public static afvl c(boolean z) {
        afvh afvhVar = (afvh) d.get();
        afvl afvlVar = afvhVar.c;
        return (afvlVar == null || (afvlVar == afur.a && !z)) ? afuf.m(afvhVar) : afvlVar;
    }

    public static afvl d(afvl afvlVar) {
        return e((afvh) d.get(), afvlVar);
    }

    public static afvl e(afvh afvhVar, afvl afvlVar) {
        return afvhVar.e != null ? q(afvhVar, afvlVar, 2) : q(afvhVar, afvlVar, 4);
    }

    public static afvl f(afvh afvhVar, afvl afvlVar) {
        afvl afvlVar2 = afvhVar.d;
        afvhVar.d = afvlVar;
        return afvlVar2;
    }

    public static afvn g() {
        t();
        return new aftu(1);
    }

    public static afvn h() {
        afvh afvhVar = (afvh) d.get();
        if (!afvhVar.a) {
            return new plg(2);
        }
        afvn afvnVarM = afvhVar.c;
        if (afvnVarM == null) {
            afvnVarM = afuf.m(afvhVar);
        }
        e.add(afvnVarM);
        qpj.a().post(h);
        return new aftu(0);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f1  */
    public static String i(afvl afvlVar) {
        int i2;
        int i3;
        aamu aamuVar;
        afvc afvcVar;
        afvb afvbVar;
        int i4;
        afvc afvcVar2;
        int i5 = 0;
        int length = 0;
        afvl afvlVarB = afvlVar;
        while (afvlVarB != null) {
            i5++;
            length += afvlVarB.d().length();
            afvlVarB = afvlVarB.b();
            if (afvlVarB != null) {
                length += 4;
            }
        }
        if (i5 > 250) {
            String[] strArr = new String[i5];
            afvl afvlVarB2 = afvlVar;
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                strArr[i6] = afvlVarB2.d();
                afvlVarB2 = afvlVarB2.b();
            }
            agkh agkhVar = new agkh(4);
            agqr it = agkz.o(strArr).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                agkhVar.e(it.next(), Integer.valueOf(i7));
                i7++;
            }
            int i8 = 1;
            agkj agkjVarD = agkhVar.d(true);
            int i9 = ((agpn) agkjVarD).d;
            int i10 = i5 >> 2;
            if (i9 > i10) {
                aamuVar = null;
            } else {
                int i11 = i5 + 1;
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i5; i12++) {
                    iArr[i12] = ((Integer) agkjVarD.get(strArr[i12])).intValue();
                }
                iArr[i5] = i9;
                afvd afvdVar = new afvd(iArr);
                int i13 = 0;
                while (true) {
                    int i14 = -1;
                    if (i13 >= i11) {
                        break;
                    }
                    afvdVar.f += i8;
                    int[] iArr2 = afvdVar.a;
                    int i15 = iArr2[i13];
                    while (true) {
                        afvc afvcVar3 = null;
                        while (true) {
                            if (afvdVar.f <= 0) {
                                i4 = i8;
                                break;
                            }
                            int i16 = afvdVar.e;
                            afvcVar2 = afvdVar.c;
                            i4 = i8;
                            if (i16 == 0) {
                                break;
                            }
                            int i17 = ((afvc) afvcVar2.d.get(Integer.valueOf(iArr2[afvdVar.d]))).a;
                            int i18 = afvdVar.e;
                            if (iArr2[i17 + i18] == i15) {
                                if (afvcVar3 != null) {
                                    afvcVar3.c = afvdVar.c;
                                }
                                afvdVar.e = i18 + 1;
                                afvdVar.b();
                                break;
                            }
                            afvc afvcVar4 = (afvc) afvdVar.c.d.get(Integer.valueOf(iArr2[afvdVar.d]));
                            int i19 = afvcVar4.a;
                            int i20 = i14;
                            afvc afvcVar5 = new afvc(i19, (afvdVar.e + i19) - 1);
                            afvdVar.c.d.put(Integer.valueOf(iArr2[afvdVar.d]), afvcVar5);
                            Map map = afvcVar5.d;
                            int i21 = afvcVar5.b + 1;
                            map.put(Integer.valueOf(iArr2[i21]), afvcVar4);
                            afvcVar4.a = i21;
                            if (afvcVar3 != null) {
                                afvcVar3.c = afvcVar5;
                            }
                            map.put(Integer.valueOf(i15), new afvc(i13, 1073741824));
                            afvdVar.f--;
                            afvdVar.a();
                            afvcVar3 = afvcVar5;
                            i8 = i4;
                            i14 = i20;
                        }
                        Map map2 = afvcVar2.d;
                        Integer numValueOf = Integer.valueOf(i15);
                        if (map2.containsKey(numValueOf)) {
                            if (afvcVar3 != null) {
                                afvcVar3.c = afvdVar.c;
                            }
                            afvdVar.d = i13;
                            afvdVar.e++;
                            afvdVar.b();
                            break;
                        }
                        afvdVar.c.d.put(numValueOf, new afvc(i13, 1073741824));
                        if (afvcVar3 != null) {
                            afvcVar3.c = afvdVar.c;
                        }
                        afvdVar.f += i14;
                        afvdVar.a();
                        i8 = i4;
                    }
                    i13++;
                    i8 = i4;
                }
                int i22 = i8;
                ArrayDeque arrayDeque = new ArrayDeque();
                afvc afvcVar6 = afvdVar.b;
                afvb afvbVar2 = new afvb(afvcVar6, 0, -1, -1);
                arrayDeque.push(afvbVar2);
                while (!arrayDeque.isEmpty()) {
                    afvb afvbVar3 = (afvb) arrayDeque.pop();
                    for (afvc afvcVar7 : ((afvc) afvbVar3.d).d.values()) {
                        int i23 = afvbVar3.b;
                        int i24 = afvbVar3.c;
                        int i25 = afvcVar7.a;
                        int i26 = afvcVar7.b;
                        if (afvdVar.c(i23, i24, i25, i26)) {
                            afvcVar = afvcVar6;
                        } else {
                            if (afvcVar7.d.isEmpty()) {
                                int i27 = afvcVar7.a;
                                afvcVar = afvcVar6;
                                if (afvdVar.c(i23, i24, i27, (i27 + i24) - i23)) {
                                }
                                if (afvbVar2.a < afvbVar.a) {
                                    afvbVar2 = afvbVar;
                                }
                                arrayDeque.push(afvbVar);
                                afvcVar6 = afvcVar;
                                i22 = 1;
                            } else {
                                afvcVar = afvcVar6;
                            }
                            afvbVar = new afvb(afvcVar7, i22, afvcVar7.a, i26);
                            if (afvbVar2.a < afvbVar.a) {
                                afvbVar2 = afvbVar;
                            }
                            arrayDeque.push(afvbVar);
                            afvcVar6 = afvcVar;
                            i22 = 1;
                        }
                        afvbVar = new afvb(afvcVar7, afvbVar3.a + i22, i23, i24);
                        if (afvbVar2.a < afvbVar.a) {
                            afvbVar2 = afvbVar;
                        }
                        arrayDeque.push(afvbVar);
                        afvcVar6 = afvcVar;
                        i22 = 1;
                    }
                    i22 = 1;
                }
                int[] iArr3 = afvdVar.a;
                int iMin = Math.min(iArr3.length, afvbVar2.c + 1);
                afvc afvcVar8 = afvcVar6;
                int i28 = 0;
                loop9: while (true) {
                    i2 = afvbVar2.b;
                    i3 = iMin - i2;
                    afvcVar8 = (afvc) afvcVar8.d.get(Integer.valueOf(iArr3[(i28 % i3) + i2]));
                    if (afvcVar8 == null) {
                        break;
                    }
                    for (int i29 = afvcVar8.a; i29 < afvcVar8.b + 1 && i29 < iArr3.length; i29++) {
                        if (iArr3[(i28 % i3) + i2] != iArr3[i29]) {
                            break loop9;
                        }
                        i28++;
                    }
                }
                aamu aamuVar2 = new aamu(i2, iMin, i28 / i3, (byte[]) null);
                aamuVar = aamuVar2.c * (aamuVar2.a - aamuVar2.b) < i10 ? null : aamuVar2;
            }
            String str = "";
            if (aamuVar != null) {
                int i30 = aamuVar.b;
                String strConcat = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = aamuVar.a;
                int i32 = aamuVar.c;
                int i33 = ((i31 - i30) * i32) + i30;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31)), Integer.valueOf(i32), i33 < i5 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i5)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        afvl afvlVarB3 = afvlVar;
        while (afvlVarB3 != null) {
            String strD = afvlVarB3.d();
            length -= strD.length();
            strD.getChars(0, strD.length(), cArr, length);
            afvlVarB3 = afvlVarB3.b();
            if (afvlVarB3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    static void j(afvl afvlVar) {
        afvh afvhVar = (afvh) d.get();
        afvl afvlVar2 = afvhVar.c;
        if (afvlVar2 == null) {
            throw new aftv("Tried to end [" + afvlVar.d() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (afvlVar == afvlVar2) {
            e(afvhVar, afvlVar2.b());
            return;
        }
        throw new aftw("Tried to end span " + afvlVar.d() + ", but that span is not the current span. The current span is " + afvlVar2.d() + '.');
    }

    public static void k() {
        int i2 = i;
        int i3 = i2 - 1;
        i = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (j == i2) {
            ahno.P(!f.isEmpty(), "current async trace should not be null");
            e((afvh) d.get(), null);
            j = 0;
        }
    }

    public static void l() {
        afvl afvlVar;
        i++;
        if (j == 0) {
            afvh afvhVar = (afvh) d.get();
            if (afvhVar.c != null || (afvlVar = (afvl) f.peek()) == null) {
                return;
            }
            e(afvhVar, afvlVar);
            j = i;
        }
    }

    public static void m(agkz agkzVar) {
        agkx agkxVar = new agkx();
        agkxVar.j(agkzVar);
        agkxVar.j(m);
        n = agkxVar.g();
    }

    static boolean n(Throwable th) {
        if (n.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String string = stackTraceElement.toString();
            agqr it = n.iterator();
            while (it.hasNext()) {
                if (string.startsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o() {
        afvl afvlVar = ((afvh) d.get()).c;
        return (afvlVar == null || afvlVar == afur.a) ? false : true;
    }

    public static boolean p() {
        afvl afvlVar = (afvl) f.peek();
        if (afvlVar == null || ((afvlVar instanceof afto) && !((afto) afvlVar).i())) {
            return false;
        }
        l();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    static afvl q(afvh afvhVar, afvl afvlVar, int i2) {
        afvl afvlVar2;
        afvl afvlVar3;
        afvl afvlVar4;
        boolean zA;
        afvl afvlVar5 = afvhVar.c;
        if (afvlVar5 == afvlVar && (i2 == 2 || i2 == 4 || afvlVar5 == null)) {
            return afvlVar;
        }
        if (afvlVar5 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                zA = Trace.isEnabled();
            } else {
                zA = qow.a.a(l);
            }
            afvhVar.b = zA;
        }
        aftj aftjVar = afvhVar.e;
        if (afvhVar.b) {
            if (aftjVar != null) {
                int i3 = i2 - 1;
                if (i3 == 0) {
                    afvlVar3 = afvlVar;
                    afvlVar4 = null;
                } else if (i3 != 2) {
                    afvlVar3 = afvlVar;
                    afvlVar4 = afvlVar5;
                } else {
                    afvlVar4 = afvlVar5;
                    afvlVar3 = null;
                }
                if (afvlVar4 != null) {
                    if (afvlVar3 != null) {
                        if (afvlVar4.b() != afvlVar3 || aftjVar.d(afvlVar4)) {
                            if (afvlVar4 == afvlVar3.b() && !aftjVar.d(afvlVar3)) {
                                aftj.a(afvlVar3);
                            }
                        }
                    }
                    aftjVar.c(afvlVar4);
                    if (afvlVar3 != null) {
                        aftjVar.b(afvlVar3);
                    }
                } else if (afvlVar3 != null) {
                    aftjVar.b(afvlVar3);
                }
            } else {
                if (afvlVar5 != null) {
                    if (afvlVar == null) {
                        afvlVar2 = null;
                    } else if (afvlVar5.b() != afvlVar || aguu.ap(afvlVar5)) {
                        if (afvlVar5 != afvlVar.b() || aguu.ap(afvlVar)) {
                            afvlVar2 = afvlVar;
                        } else {
                            aguu.am(afvlVar);
                        }
                    }
                    aguu.ao(afvlVar5);
                } else {
                    afvlVar2 = afvlVar;
                }
                if (afvlVar2 != null) {
                    aguu.an(afvlVar2);
                }
            }
        }
        if (afvlVar5 == afvlVar) {
            return afvlVar;
        }
        if (afvlVar != null) {
            afvlVar.r();
        } else {
            afvlVar = null;
        }
        if (afvlVar5 != null) {
            afvlVar5.r();
        }
        afvhVar.c = afvlVar;
        if (i2 == 2) {
            aftjVar.getClass();
            aftjVar.a = afvlVar;
        }
        return afvlVar5;
    }

    public static void r(boolean z) {
        IllegalStateException illegalStateException;
        if (afvm.a != 1) {
            afvl afvlVar = ((afvh) d.get()).c;
            if (afvlVar == null || (afvlVar instanceof afur)) {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            } else {
                illegalStateException = afvlVar instanceof afto ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((afto) afvlVar).h()) : null;
            }
            if (illegalStateException != null) {
                if (afvlVar instanceof afto ? ((afto) afvlVar).i() : n(illegalStateException)) {
                    return;
                }
                if (!z) {
                    throw illegalStateException;
                }
                Log.e("Tracer", "Missing trace", illegalStateException);
            }
        }
    }

    public static void s(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
    }

    public static void t() {
        afvl afvlVar;
        i++;
        if (j == 0) {
            afvh afvhVar = (afvh) d.get();
            if (afvhVar.c != null || (afvlVar = (afvl) f.peek()) == null) {
                return;
            }
            e(afvhVar, afvlVar);
            j = i;
        }
    }
}
