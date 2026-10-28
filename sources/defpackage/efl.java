package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efl {
    public static final /* synthetic */ int a = 0;
    private static final String b = dzf.a("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:111:0x025e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Set] */
    public static final void a(eax eaxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        HashSet hashSet = new HashSet();
        List list = eaxVar.d;
        hashSet.addAll(list);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSet2.contains((String) it.next())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eaxVar + ')');
            }
        }
        hashSet.removeAll(list);
        ebm ebmVar = eaxVar.a;
        WorkDatabase workDatabase = ebmVar.d;
        workDatabase.getClass();
        workDatabase.m();
        try {
            ebmVar.c.getClass();
            int i9 = 1;
            ArrayList arrayList = new ArrayList(new awnl(new eax[]{eaxVar}, true));
            int i10 = 0;
            while (!arrayList.isEmpty()) {
                List list2 = ((eax) atqq.Q(arrayList)).c;
                list2.getClass();
                if (list2.isEmpty()) {
                    i8 = 0;
                } else {
                    Iterator it2 = list2.iterator();
                    i8 = 0;
                    while (it2.hasNext()) {
                        if (((ees) ((ayq) it2.next()).c).l.b() && (i8 = i8 + 1) < 0) {
                            atqq.L();
                        }
                    }
                }
                i10 += i8;
            }
            if (i10 != 0) {
                int iA = workDatabase.C().a();
                if (iA + i10 > 8) {
                    throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: " + iA + ";\ncurrent enqueue operation count: " + i10 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
                }
            }
            HashSet hashSet3 = new HashSet();
            List<ayq> list3 = eaxVar.c;
            list3.getClass();
            String[] strArr = (String[]) hashSet3.toArray(new String[0]);
            int i11 = eaxVar.f;
            ebmVar.k.getClass();
            bnz bnzVar = ebmVar.c.k;
            long jCurrentTimeMillis = System.currentTimeMillis();
            WorkDatabase workDatabase2 = ebmVar.d;
            workDatabase2.getClass();
            int length = strArr.length;
            int i12 = length == 0 ? 0 : 1;
            if (length != 0) {
                i2 = 1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i13 < length) {
                        i = i9;
                        String str = strArr[i13];
                        ees eesVarC = workDatabase2.C().c(str);
                        if (eesVarC == null) {
                            dzf.b();
                            Log.e(b, a.bT(str, "Prerequisite ", " doesn't exist; not enqueuing"));
                        } else {
                            dzr dzrVar = eesVarC.d;
                            i2 &= dzrVar == dzr.c ? i : 0;
                            if (dzrVar == dzr.d) {
                                i15 = i;
                            } else if (dzrVar == dzr.f) {
                                i14 = i;
                            }
                            i13++;
                            i9 = i;
                        }
                    } else {
                        i = i9;
                        i3 = i14;
                        i4 = i15;
                    }
                    z = i;
                    i7 = 0;
                    eaxVar.e = z;
                    workDatabase.p();
                    workDatabase.n();
                    if (i7 != 0) {
                        eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
                    }
                }
            }
            i = 1;
            i2 = 1;
            i3 = 0;
            i4 = 0;
            String str2 = eaxVar.b;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            if (zIsEmpty || i12 != 0) {
                i5 = 0;
                i6 = i5;
            } else {
                eet eetVarC = workDatabase2.C();
                str2.getClass();
                List<eeq> listJ = eetVarC.j(str2);
                if (listJ.isEmpty()) {
                    i5 = 0;
                } else {
                    int i16 = 4;
                    if (i11 == 3 || i11 == 4) {
                        edw edwVarW = workDatabase2.w();
                        ArrayList arrayList2 = new ArrayList();
                        for (eeq eeqVar : listJ) {
                            String str3 = eeqVar.a;
                            if (!edwVarW.c(str3)) {
                                dzr dzrVar2 = eeqVar.b;
                                edw edwVar = edwVarW;
                                i2 &= dzrVar2 == dzr.c ? i : 0;
                                if (dzrVar2 == dzr.d) {
                                    i4 = i;
                                } else if (dzrVar2 == dzr.f) {
                                    i3 = i;
                                }
                                arrayList2.add(str3);
                                edwVarW = edwVar;
                            }
                            i16 = 4;
                        }
                        if (i11 == i16) {
                            if (i3 != 0 || i4 != 0) {
                                eet eetVarC2 = workDatabase2.C();
                                List listJ2 = eetVarC2.j(str2);
                                ArrayList arrayList3 = new ArrayList(atqq.N(listJ2, 10));
                                Iterator it3 = listJ2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(((eeq) it3.next()).a);
                                }
                                Iterator it4 = listJ2.iterator();
                                while (it4.hasNext()) {
                                    eetVarC2.l(((eeq) it4.next()).a);
                                }
                                arrayList2 = new ArrayList();
                            }
                            i5 = 0;
                            i3 = 0;
                            i4 = 0;
                        } else {
                            i5 = 0;
                        }
                        strArr = (String[]) arrayList2.toArray(new String[i5]);
                        i12 = strArr.length > 0 ? i : i5;
                    } else {
                        if (i11 == 2) {
                            Iterator it5 = listJ.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    eeq eeqVar2 = (eeq) it5.next();
                                    dzr dzrVar3 = eeqVar2.b;
                                    if (dzrVar3 == dzr.a || dzrVar3 == dzr.b) {
                                        dzf.b();
                                        String str4 = eeqVar2.a;
                                        atqq.aD(list3, null, "[", "]", new bfu(7), 25);
                                        Objects.toString(dzrVar3);
                                        z = i;
                                        i7 = 0;
                                        eaxVar.e = z;
                                        workDatabase.p();
                                        workDatabase.n();
                                        if (i7 != 0) {
                                            eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
                                        }
                                    }
                                }
                            }
                        }
                        WorkDatabase workDatabase3 = ebmVar.d;
                        workDatabase3.getClass();
                        workDatabase3.o(new dzn(workDatabase3, str2, ebmVar, 4, (char[]) null));
                        eet eetVarC3 = workDatabase2.C();
                        Iterator it6 = listJ.iterator();
                        while (it6.hasNext()) {
                            eetVarC3.l(((eeq) it6.next()).a);
                        }
                        i6 = i;
                    }
                }
                i6 = i5;
            }
            for (ayq ayqVar : list3) {
                Object obj = ayqVar.c;
                if (i12 == 0 || i2 != 0) {
                    ((ees) obj).o = jCurrentTimeMillis;
                } else if (i4 != 0) {
                    ((ees) obj).d = dzr.d;
                } else {
                    ((ees) obj).d = i3 != 0 ? dzr.f : dzr.e;
                }
                int i17 = ((((ees) obj).d == dzr.a ? 0 : i) ^ 1) | i6;
                eet eetVarC4 = workDatabase2.C();
                ebmVar.e.getClass();
                eetVarC4.n(dms.h((ees) obj));
                if (i12 != 0) {
                    int i18 = 0;
                    for (int length2 = strArr.length; i18 < length2; length2 = length2) {
                        workDatabase2.w().d(new eol(ayqVar.k(), strArr[i18]));
                        i18++;
                    }
                }
                workDatabase2.D().c(ayqVar.k(), ayqVar.a);
                if (!zIsEmpty) {
                    eel eelVarA = workDatabase2.A();
                    str2.getClass();
                    eelVarA.b(new qv(str2, ayqVar.k(), null));
                }
                i6 = i17;
            }
            z = i;
            i7 = i6;
            eaxVar.e = z;
            workDatabase.p();
            workDatabase.n();
            if (i7 != 0) {
                eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
            }
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
