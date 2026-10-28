package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwq extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public afwq(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static RuntimeException a() {
        return new afwq(null, g(afty.b(), null));
    }

    public static String b(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void c(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new afwp(stackTraceElementArr));
        }
    }

    public static void d(agkj agkjVar) {
        afvl afvlVar;
        agev agevVarH;
        boolean z = afty.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = afty.c;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                afvl afvlVar2 = ((afvh) entry.getValue()).c;
                if (afvlVar2 != null) {
                    map.put((Thread) entry.getKey(), afvlVar2);
                }
            }
        }
        agkx agkxVar = new agkx();
        agpn agpnVar = (agpn) agkjVar;
        agqr it = ((agpl) agpnVar.keySet()).iterator();
        while (it.hasNext()) {
            agkxVar.c(((afvl) it.next()).g());
        }
        agkz agkzVarG = agkxVar.g();
        agqr it2 = ((agpl) agpnVar.keySet()).iterator();
        int iC = Alert.DURATION_SHOW_INDEFINITELY;
        while (it2.hasNext()) {
            afvl afvlVar3 = (afvl) it2.next();
            if (afvlVar3 instanceof afum) {
                afum afumVar = (afum) afvlVar3;
                if (afumVar.c() < iC) {
                    iC = afumVar.c();
                }
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            afvl afvlVar4 = (afvl) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (agkzVarG.contains(afvlVar4.g())) {
                    afvl afvlVarB = afvlVar4;
                    while (true) {
                        if (afvlVarB == null || ((afvlVarB instanceof afum) && ((afum) afvlVarB).c() < iC)) {
                            afvlVar = null;
                            break;
                        } else if (map2.containsKey(afvlVarB)) {
                            afvlVar = (afvl) map2.get(afvlVarB);
                            break;
                        } else {
                            if (agkjVar.containsKey(afvlVarB)) {
                                afvlVar = afvlVarB;
                                break;
                            }
                            afvlVarB = afvlVarB.b();
                        }
                    }
                    afvl afvlVarB2 = afvlVar4;
                    while (true) {
                        if (Objects.equals(afvlVarB2, afvlVar != null ? afvlVar : afvlVarB) || map2.containsKey(afvlVarB2)) {
                            break;
                        }
                        map2.put(afvlVarB2, afvlVar);
                        afvlVarB2 = afvlVarB2.b();
                    }
                    agevVarH = agev.h(afvlVar);
                } else {
                    agevVarH = agdf.a;
                }
                if (agevVarH.g()) {
                    Throwable th = (Throwable) agkjVar.get(agevVarH.c());
                    mcd mcdVar = new mcd(thread);
                    mcdVar.addSuppressed(new afwq(null, g(afvlVar4, ((afvl) agevVarH.c()).b())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", b(mcdVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, mcdVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(mcdVar);
                }
            }
        }
    }

    public static void e(agkj agkjVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agqr it = agkjVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            afvl afvlVar = (afvl) entry.getKey();
            if (afvlVar instanceof afum) {
                afwm afwmVar = (afwm) map.get(((afvl) entry.getKey()).g());
                if (afwmVar == null) {
                    afwmVar = ((afum) afvlVar).a.b().c;
                    map.put(afvlVar.g(), afwmVar);
                }
                Map map3 = (Map) map2.get(afwmVar);
                if (map3 == null) {
                    map3 = new HashMap();
                    map2.put(afwmVar, map3);
                }
                map3.put(Integer.valueOf(((afum) afvlVar).c()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            afwm afwmVar2 = (afwm) entry2.getKey();
            int iIntValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap map4 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = afwmVar2.e.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            } while ((((afus) it2.next()).b & 32) != 0);
            aftf aftfVar = afwmVar2.h;
            if (aftfVar == null) {
                aftfVar = aftf.a;
            }
            if ((aftfVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((afus) afwmVar2.e.get(0)).c;
                aftf aftfVar2 = afwmVar2.h;
                if (aftfVar2 == null) {
                    aftfVar2 = aftf.a;
                }
                afte afteVar = aftfVar2.c;
                if (afteVar == null) {
                    afteVar = afte.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", b(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(afteVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                f(afwmVar2, (Map) entry2.getValue(), iIntValue, map4);
            } else {
                c(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
    }

    public static void f(afwm afwmVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (afus afusVar : aguu.t(afwmVar.e)) {
            Integer numValueOf = null;
            if (i3 >= 10) {
                c(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((afusVar.b & 32) == 0 && !map2.containsKey(afusVar)) {
                aiie aiieVar = afwmVar.e;
                Set setKeySet = map.keySet();
                boolean z = false;
                afus afusVar2 = afusVar;
                while (!z) {
                    if (map2.containsKey(afusVar2)) {
                        numValueOf = (Integer) map2.get(afusVar2);
                    } else if (setKeySet.contains(Integer.valueOf(afusVar2.d))) {
                        numValueOf = Integer.valueOf(afusVar2.d);
                    } else {
                        int i4 = afusVar2.e;
                        if (i4 >= i) {
                            afusVar2 = (afus) aiieVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                afus afusVar3 = afusVar;
                while (!z2) {
                    if (!map2.containsKey(afusVar3)) {
                        map2.put(afusVar3, numValueOf);
                        if ((numValueOf == null || afusVar3.e != numValueOf.intValue()) && (i2 = afusVar3.e) >= 0) {
                            afusVar3 = (afus) aiieVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                agev agevVarH = agev.h(numValueOf);
                if (agevVarH.g()) {
                    i3++;
                    Throwable th = (Throwable) map.get(agevVarH.c());
                    aiie aiieVar2 = afwmVar.e;
                    int iIntValue = ((Integer) agevVarH.c()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(h(afusVar));
                    while (afusVar.d != iIntValue) {
                        afusVar = (afus) aiieVar2.get(afusVar.e);
                        arrayList.add(h(afusVar));
                    }
                    th.addSuppressed(new afwp((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static StackTraceElement[] g(afvl afvlVar, afvl afvlVar2) {
        ArrayList arrayList = new ArrayList();
        for (afvl afvlVarB = afvlVar; afvlVarB != afvlVar2; afvlVarB = afvlVarB.b()) {
            arrayList.add(new StackTraceElement("tk_trace", b(afvlVarB.d()), null, 0));
        }
        if (afvlVar instanceof afto) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement h(afus afusVar) {
        String str;
        if ((afusVar.b & 32) != 0) {
            str = " " + afusVar.g + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", b(String.valueOf(afusVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
