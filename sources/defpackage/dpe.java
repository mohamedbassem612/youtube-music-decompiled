package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpe {
    public final int a;
    public final /* synthetic */ dlv b;

    public dpe(int i) {
        this.a = i;
    }

    public static final void a(String str) {
        if (awrc.z(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(true != z ? i : length);
            if (z) {
                if (cCharAt > ' ') {
                    break;
                } else {
                    length--;
                }
            } else if (cCharAt > ' ') {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:4: B:9:0x001c->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    public final void b(dpd dpdVar, int i, int i2) throws Exception {
        Iterable iterable;
        dov dovVar;
        TreeMap treeMap;
        awml awmlVar;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        dpt dptVar = new dpt(dpdVar);
        dlv dlvVar = this.b;
        dlx dlxVar = dlvVar.a;
        if (i == i2) {
            iterable = awno.a;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        dovVar = dlxVar.r;
                        if (z2) {
                            treeMap2 = (TreeMap) dovVar.a.get(Integer.valueOf(i3));
                            if (treeMap2 != null) {
                                awmlVar = new awml(treeMap2, treeMap2.descendingKeySet());
                            } else {
                                awmlVar = null;
                            }
                        } else {
                            treeMap = (TreeMap) dovVar.a.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                awmlVar = null;
                            } else {
                                awmlVar = new awml(treeMap, treeMap.keySet());
                            }
                        }
                        if (awmlVar != null) {
                            Object obj = awmlVar.b;
                            Map map = (Map) awmlVar.a;
                            it = ((Iterable) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (z2) {
                                    if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                                        obj2.getClass();
                                        arrayList.add(obj2);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                    }
                                } else {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj3 = map.get(Integer.valueOf(iIntValue));
                                        obj3.getClass();
                                        arrayList.add(obj3);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 <= i2) {
                    iterable = arrayList;
                } else {
                    dovVar = dlxVar.r;
                    if (z2) {
                        treeMap2 = (TreeMap) dovVar.a.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            awmlVar = new awml(treeMap2, treeMap2.descendingKeySet());
                        } else {
                            awmlVar = null;
                        }
                    } else {
                        treeMap = (TreeMap) dovVar.a.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            awmlVar = null;
                        } else {
                            awmlVar = new awml(treeMap, treeMap.keySet());
                        }
                    }
                    if (awmlVar != null) {
                        Object obj4 = awmlVar.b;
                        Map map2 = (Map) awmlVar.a;
                        it = ((Iterable) obj4).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                }
            }
        }
        if (iterable != null) {
            dmt dmtVar = dlvVar.b;
            dmtVar.d(dptVar);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((doc) it2.next()).b(dptVar);
            }
            ahek ahekVarG = dmtVar.g(dptVar);
            if (!ahekVarG.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(ahekVarG.b)));
            }
            dmtVar.f();
            dlvVar.a(dptVar);
            return;
        }
        if (i <= i2 || !dlxVar.i) {
            Set set = dlxVar.j;
            if (dlxVar.h && !set.contains(Integer.valueOf(i))) {
                throw new IllegalStateException(a.cj(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."));
            }
        }
        if (dlxVar.m) {
            dpb dpbVarA = dptVar.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                awoa awoaVar = new awoa(10);
                while (dpbVarA.l()) {
                    String strD = dpbVarA.d(0);
                    if (!strD.startsWith("sqlite_") && !awrc.c(strD, "android_metadata")) {
                        awoaVar.add(new awml(strD, Boolean.valueOf(awrc.c(dpbVarA.d(1), "view"))));
                    }
                }
                List listF = awoaVar.f();
                dpbVarA.close();
                ListIterator listIterator = ((awoa) listF).listIterator(0);
                while (listIterator.hasNext()) {
                    awml awmlVar2 = (awml) listIterator.next();
                    String str = (String) awmlVar2.a;
                    if (((Boolean) awmlVar2.b).booleanValue()) {
                        azu.i(dptVar, a.bU((byte) 96, str, "DROP VIEW IF EXISTS `"));
                    } else {
                        azu.i(dptVar, a.bU((byte) 96, str, "DROP TABLE IF EXISTS `"));
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        dpbVarA.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        } else {
            dlvVar.b.b(dptVar);
        }
        for (azt aztVar : dlvVar.c) {
        }
        dlvVar.b.a(dptVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dpe(dlv dlvVar, int i) {
        this(i);
        this.b = dlvVar;
    }
}
