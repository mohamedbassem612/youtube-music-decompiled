package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmo {
    public Executor b;
    public dpf c;
    public boolean d;
    public boolean f;
    public boolean g;
    public awou h;
    private final awsd i;
    private final Context j;
    private final String k;
    private Executor m;
    public final List a = new ArrayList();
    private final List l = new ArrayList();
    private final dov q = new dov();
    private final Set n = new LinkedHashSet();
    private final Set o = new LinkedHashSet();
    private final List p = new ArrayList();
    public boolean e = true;

    public dmo(Context context, Class cls, String str) {
        int i = awrn.a;
        this.i = new awqv(cls);
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
    public final dmq a() {
        dmu dmuVarC;
        LinkedHashMap linkedHashMap;
        List list;
        int size;
        boolean[] zArr;
        Iterator it;
        dpg dpgVarA;
        dpg dpgVarA2;
        awou awouVarPlus;
        boolean zContainsKey;
        Executor executor = this.b;
        Executor executor2 = this.m;
        if (executor == null) {
            if (executor2 == null) {
                Executor executor3 = vq.a;
                this.m = executor3;
                this.b = executor3;
            } else {
                this.b = executor2;
            }
        } else if (executor2 == null) {
            this.m = executor;
        }
        Set set = this.o;
        Set set2 = this.n;
        if (!set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (set2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(a.bR(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                }
            }
        }
        dpf dpqVar = this.c;
        if (dpqVar == null) {
            dpqVar = new dpq();
        }
        dpf dpfVar = dpqVar;
        Context context = this.j;
        String str = this.k;
        dov dovVar = this.q;
        List list2 = this.a;
        boolean z = this.d;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        int i = 2;
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            i = 3;
        }
        Executor executor4 = this.b;
        if (executor4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor5 = this.m;
        if (executor5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dlx dlxVar = new dlx(context, str, dpfVar, dovVar, list2, z, i, executor4, executor5, this.e, this.f, set2, this.l, this.p, this.g, this.h);
        dlxVar.o = true;
        dmq dmqVar = (dmq) apb.d(((awqv) this.i).b);
        dmqVar.i = dlxVar.o;
        try {
            dmuVarC = dmqVar.c();
            while (true) {
                int i2 = -1;
                if (!it.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                    for (doc docVar : dmqVar.f(linkedHashMap)) {
                        dov dovVar2 = dlxVar.r;
                        int i4 = docVar.a;
                        int i5 = docVar.b;
                        Integer numValueOf = Integer.valueOf(i4);
                        ?? r9 = dovVar2.a;
                        if (r9.containsKey(numValueOf)) {
                            Map map = (Map) r9.get(numValueOf);
                            if (map == null) {
                                map = awnp.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i5));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            dovVar2.e(docVar);
                        }
                    }
                    Map mapG = dmqVar.g();
                    List list3 = dlxVar.k;
                    boolean[] zArr2 = new boolean[list3.size()];
                    for (Map.Entry entry : mapG.entrySet()) {
                        awsd awsdVar = (awsd) entry.getKey();
                        for (awsd awsdVar2 : (List) entry.getValue()) {
                            int size3 = list3.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i6 = size3 - 1;
                                if (awsdVar2.d(list3.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i6 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i6;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException("A required type converter (" + awsdVar2.b() + ") for " + awsdVar.b() + " is missing in the database configuration.");
                            }
                            Object obj = list3.get(size3);
                            awsdVar2.getClass();
                            obj.getClass();
                            dmqVar.h.put(awsdVar2, obj);
                        }
                    }
                    int size4 = list3.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i7 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list3.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size4 = i7;
                        }
                    }
                    awou awouVar = dlxVar.n;
                    if (awouVar != null) {
                        awos awosVar = awouVar.get(awor.j);
                        awosVar.getClass();
                        awuq awuqVar = (awuq) awosVar;
                        dmqVar.c = awuw.e(awuqVar);
                        Executor executor6 = dmqVar.c;
                        if (executor6 == null) {
                            awrc.b("internalQueryExecutor");
                            executor6 = null;
                        }
                        dmqVar.d = new dmy(executor6);
                        dmqVar.a = awrc.K(awouVar.plus(new awxf((awwd) awouVar.get(awwd.d))));
                        if (dmqVar.q()) {
                            awut awutVar = dmqVar.a;
                            if (awutVar == null) {
                                awrc.b("coroutineScope");
                                awutVar = null;
                            }
                            awouVarPlus = ((axcw) awutVar).a.plus(awuqVar.e(1));
                        } else {
                            awut awutVar2 = dmqVar.a;
                            if (awutVar2 == null) {
                                awrc.b("coroutineScope");
                                awutVar2 = null;
                            }
                            awouVarPlus = ((axcw) awutVar2).a;
                        }
                        dmqVar.b = awouVarPlus;
                    } else {
                        dmqVar.c = dlxVar.f;
                        dmqVar.d = new dmy(dlxVar.g);
                        Executor executor7 = dmqVar.c;
                        if (executor7 == null) {
                            awrc.b("internalQueryExecutor");
                            executor7 = null;
                        }
                        dmqVar.a = awrc.K(awuw.f(executor7).plus(new awxf(null)));
                        awut awutVar3 = dmqVar.a;
                        if (awutVar3 == null) {
                            awrc.b("coroutineScope");
                            awutVar3 = null;
                        }
                        Executor executor8 = dmqVar.d;
                        if (executor8 == null) {
                            awrc.b("internalTransactionExecutor");
                            executor8 = null;
                        }
                        dmqVar.b = ((axcw) awutVar3).a.plus(awuw.f(executor8));
                    }
                    dmqVar.f = dlxVar.e;
                    dlv dlvVar = dmqVar.j;
                    if (dlvVar == null) {
                        awrc.b("connectionManager");
                        dlvVar = null;
                    }
                    dpg dpgVar = dlvVar.d;
                    if (dpgVar == null) {
                        dpgVarA = null;
                        break;
                    }
                    dpgVarA = dpgVar;
                    while (!(dpgVarA instanceof doe)) {
                        if (!(dpgVarA instanceof dly)) {
                            dpgVarA = null;
                            break;
                        }
                        dpgVarA = ((dly) dpgVarA).a();
                    }
                    if (((doe) dpgVarA) != null) {
                        throw null;
                    }
                    dlv dlvVar2 = dmqVar.j;
                    if (dlvVar2 == null) {
                        awrc.b("connectionManager");
                        dlvVar2 = null;
                    }
                    dpg dpgVar2 = dlvVar2.d;
                    if (dpgVar2 == null) {
                        dpgVarA2 = null;
                        break;
                    }
                    dpgVarA2 = dpgVar2;
                    while (!(dpgVarA2 instanceof dod)) {
                        if (!(dpgVarA2 instanceof dly)) {
                            dpgVarA2 = null;
                            break;
                        }
                        dpgVarA2 = ((dly) dpgVarA2).a();
                    }
                    if (((dod) dpgVarA2) == null) {
                        return dmqVar;
                    }
                    throw null;
                }
                awsd awsdVar3 = (awsd) it.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i8 = size5 - 1;
                        if (awsdVar3.d(list.get(size5))) {
                            zArr[size5] = true;
                            i2 = size5;
                            break;
                        }
                        if (i8 < 0) {
                            break;
                        }
                        size5 = i8;
                    }
                }
                if (i2 < 0) {
                    throw new IllegalArgumentException("A required auto migration spec (" + awsdVar3.b() + ") is missing in the database configuration.");
                }
                linkedHashMap.put(awsdVar3, list.get(i2));
            }
        } catch (awmk unused) {
            dmuVarC = null;
        }
        dmqVar.j = dmuVarC == null ? new dlv(dlxVar, new akl(11), new acsi(dmqVar, 1, null)) : new dlv(dlxVar, (dmt) dmuVarC, new dmp(dmqVar));
        dmqVar.e = dmqVar.a();
        linkedHashMap = new LinkedHashMap();
        Set setI = dmqVar.i();
        list = dlxVar.l;
        size = list.size();
        zArr = new boolean[size];
        it = setI.iterator();
    }

    public final void b(doc... docVarArr) {
        int length;
        docVarArr.getClass();
        int i = 0;
        while (true) {
            length = docVarArr.length;
            if (i >= length) {
                break;
            }
            doc docVar = docVarArr[i];
            Set set = this.o;
            set.add(Integer.valueOf(docVar.a));
            set.add(Integer.valueOf(docVar.b));
            i++;
        }
        dov dovVar = this.q;
        doc[] docVarArr2 = (doc[]) Arrays.copyOf(docVarArr, length);
        docVarArr2.getClass();
        for (doc docVar2 : docVarArr2) {
            dovVar.e(docVar2);
        }
    }

    public final void c() {
        this.e = true;
        this.f = true;
        this.g = false;
    }

    public final void d(awou awouVar) {
        if (this.b != null || this.m != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (awouVar.get(awor.j) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.h = awouVar;
    }
}
