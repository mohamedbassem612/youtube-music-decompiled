package defpackage;

import android.content.Context;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahrg {
    public static final bhi a = azv.f("fire-global");
    public static final bhi b = azv.f("fire-count");
    public static final bhi c = azv.g("last-used-date");
    private final ahpr d;

    public ahrg(Context context, String str) {
        this.d = new ahpr(context, "FirebaseHeartBeat".concat(str));
    }

    public static final String h(long j) {
        return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static final bhi i(bhj bhjVar, String str) {
        for (Map.Entry entry : bhjVar.c().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new bhi(((bhi) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public static final void j(bhj bhjVar, String str) {
        bhi bhiVarI = i(bhjVar, str);
        if (bhiVarI != null) {
            Object hashSet = new HashSet();
            bhjVar.getClass();
            Object objB = bhjVar.b(bhiVarI);
            if (objB != null) {
                hashSet = objB;
            }
            HashSet hashSet2 = new HashSet((Collection) hashSet);
            hashSet2.remove(str);
            if (hashSet2.isEmpty()) {
                bhjVar.g(bhiVarI);
            } else {
                bhjVar.e(bhiVarI, hashSet2);
            }
        }
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String strH = h(System.currentTimeMillis());
        for (Map.Entry entry : ((Map) awqx.l(awov.a, new adqv(this.d, (awoq) null, 7))).entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(strH);
                if (!hashSet.isEmpty()) {
                    arrayList.add(new ahrh(((bhi) entry.getKey()).a, new ArrayList(hashSet)));
                }
            }
        }
        e(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized void b() {
        this.d.a(new actf(11));
    }

    final synchronized void c() {
        this.d.a(new acjo(this, h(System.currentTimeMillis()), 11, null));
    }

    public final synchronized void d(long j, final String str) {
        final String strH = h(j);
        final bhi bhiVar = new bhi(str);
        this.d.a(new awqg() { // from class: ahre
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                Object obj2;
                bhj bhjVar = (bhj) obj;
                bhi bhiVar2 = ahrg.c;
                bhjVar.getClass();
                Object objB = bhjVar.b(bhiVar2);
                String str2 = "";
                if (objB == null) {
                    objB = "";
                }
                bhi bhiVar3 = bhiVar;
                String str3 = strH;
                if (((String) objB).equals(str3)) {
                    bhi bhiVarI = ahrg.i(bhjVar, str3);
                    if (bhiVarI == null) {
                        return null;
                    }
                    if (bhiVarI.a.equals(str)) {
                        return null;
                    }
                    ahrg.j(bhjVar, str3);
                    Object hashSet = new HashSet();
                    bhjVar.getClass();
                    Object objB2 = bhjVar.b(bhiVar3);
                    if (objB2 != null) {
                        hashSet = objB2;
                    }
                    HashSet hashSet2 = new HashSet((Collection) hashSet);
                    hashSet2.add(str3);
                    bhjVar.e(bhiVar3, hashSet2);
                    return null;
                }
                bhi bhiVar4 = ahrg.b;
                Object obj3 = 0L;
                bhjVar.getClass();
                Object objB3 = bhjVar.b(bhiVar4);
                if (objB3 == null) {
                    objB3 = obj3;
                }
                long jLongValue = ((Long) objB3).longValue();
                if (jLongValue + 1 == 30) {
                    bhjVar.getClass();
                    Object objB4 = bhjVar.b(bhiVar4);
                    long jLongValue2 = ((Long) (objB4 != null ? objB4 : 0L)).longValue();
                    Set hashSet3 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : bhjVar.c().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str2 = ((bhi) entry.getKey()).a;
                                    str4 = str5;
                                    hashSet3 = set;
                                }
                            }
                        }
                    }
                    obj2 = null;
                    HashSet hashSet4 = new HashSet(hashSet3);
                    hashSet4.remove(str4);
                    bhjVar.e(new bhi(str2), hashSet4);
                    jLongValue = jLongValue2 - 1;
                    bhjVar.e(bhiVar4, Long.valueOf(jLongValue));
                } else {
                    obj2 = null;
                }
                Object hashSet5 = new HashSet();
                bhjVar.getClass();
                Object objB5 = bhjVar.b(bhiVar3);
                if (objB5 != null) {
                    hashSet5 = objB5;
                }
                HashSet hashSet6 = new HashSet((Collection) hashSet5);
                hashSet6.add(str3);
                bhjVar.e(bhiVar3, hashSet6);
                bhjVar.e(bhiVar4, Long.valueOf(jLongValue + 1));
                bhjVar.e(bhiVar2, str3);
                return obj2;
            }
        });
    }

    final synchronized void e(long j) {
        this.d.a(new ahrf(j, 0));
    }

    final synchronized boolean f(long j) {
        return g(a, j);
    }

    final synchronized boolean g(bhi bhiVar, long j) {
        ahpr ahprVar = this.d;
        beh behVar = new beh(ahprVar, bhiVar, (Object) (-1L), (awoq) null, 8);
        awov awovVar = awov.a;
        if (h(((Long) awqx.l(awovVar, behVar)).longValue()).equals(h(j))) {
            return false;
        }
        return true;
    }
}
