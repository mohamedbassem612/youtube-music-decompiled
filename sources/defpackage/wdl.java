package defpackage;

import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wdl {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/innertube/entities/persistence/impl/QueryTableManager");
    public final agkz a;
    public final agkp b;
    boolean c = false;
    public final omj d;
    private wjr f;

    public wdl(omj omjVar, Set set, wjr wjrVar) {
        this.d = omjVar;
        this.a = agkz.n(set);
        this.f = wjrVar;
        agkf agkfVar = new agkf();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abxv abxvVar = (abxv) it.next();
            agkfVar.b(abxvVar.d, abxvVar);
        }
        this.b = agkfVar.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static omr b(abxv abxvVar, weh wehVar, wej wejVar) {
        ?? r3;
        int i;
        omr omrVar = new omr();
        omrVar.i("REPLACE INTO ");
        abxvVar.s(omrVar);
        omrVar.i(" VALUES(?");
        int i2 = 0;
        while (true) {
            r3 = abxvVar.b;
            i = ((agpi) r3).d;
            if (i2 >= i) {
                break;
            }
            omrVar.i(", ?");
            i2++;
        }
        omrVar.i(")");
        omrVar.k(wehVar.b());
        for (int i3 = 0; i3 < i; i3++) {
            wcu wcuVar = (wcu) r3.get(i3);
            wcuVar.c(omrVar, wcuVar.a(wehVar, wejVar));
        }
        return omrVar.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object, java.util.List] */
    public final synchronized void a(omr omrVar) {
        wej wejVar;
        agkz agkzVarG;
        ?? r8;
        if (this.c) {
            return;
        }
        agkz agkzVar = this.a;
        agkh agkhVar = new agkh(4);
        agqr it = agkzVar.iterator();
        while (it.hasNext()) {
            abxv abxvVar = (abxv) it.next();
            agkhVar.e(abxvVar.a, abxvVar);
        }
        agkj agkjVarD = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        agqr it2 = agkzVar.iterator();
        do {
            Throwable th = null;
            int i = 0;
            if (!it2.hasNext()) {
                agkj agkjVarD2 = agkhVar2.d(true);
                agkh agkhVar3 = new agkh(4);
                agqr it3 = agkzVar.iterator();
                while (it3.hasNext()) {
                    abxv abxvVar2 = (abxv) it3.next();
                    Object obj = abxvVar2.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("CREATE TABLE ");
                    sb.append((String) obj);
                    sb.append(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
                    ?? r14 = abxvVar2.b;
                    int i2 = ((agpi) r14).d;
                    Throwable th2 = th;
                    for (int i3 = i; i3 < i2; i3++) {
                        wcu wcuVar = (wcu) r14.get(i3);
                        sb.append(", ");
                        sb.append(wcuVar.a);
                        sb.append(' ');
                        int i4 = wcuVar.b;
                        sb.append((Object) (i4 != 1 ? i4 != 2 ? "TEXT" : "REAL" : "INT"));
                    }
                    sb.append(')');
                    String string = sb.toString();
                    ?? r9 = abxvVar2.c;
                    if (((agke) r9).isEmpty()) {
                        agkzVarG = agpr.a;
                    } else {
                        agkx agkxVar = new agkx();
                        if (((agpi) r9).d > 0) {
                            throw th2;
                        }
                        agkzVarG = agkxVar.g();
                    }
                    agkhVar3.e(obj, new wdk((String) obj, string, agkzVarG));
                    th = th2;
                    i = 0;
                }
                byte[] bArr = th;
                agkj agkjVarD3 = agkhVar3.d(true);
                HashMap map = new HashMap();
                agjz agjzVar = new agjz(4);
                int i5 = 0;
                Cursor cursorE = omrVar.e("SELECT name, type, sql, tbl_name FROM sqlite_master WHERE sql NOT NULL", new String[0]);
                while (cursorE.moveToNext()) {
                    try {
                        agjzVar.h(new wdj(cursorE.getString(i5), cursorE.getString(1), cursorE.getString(2), cursorE.getString(3)));
                        i5 = 0;
                    } catch (Throwable th3) {
                        if (cursorE == null) {
                            throw th3;
                        }
                        try {
                            cursorE.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (cursorE != null) {
                    cursorE.close();
                }
                agke agkeVarG = agjzVar.g();
                aghn aghnVar = new aghn(bArr);
                int i6 = ((agpi) agkeVarG).d;
                for (int i7 = 0; i7 < i6; i7++) {
                    wdj wdjVar = (wdj) agkeVarG.get(i7);
                    if (wdjVar.b.equals("index")) {
                        String str = wdjVar.a;
                        if (str.startsWith("IDXQT_")) {
                            aghnVar.u(wdjVar.d, new wdi(str, wdjVar.c));
                        }
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    wdj wdjVar2 = (wdj) agkeVarG.get(i8);
                    if (wdjVar2.b.equals("table")) {
                        String str2 = wdjVar2.a;
                        if (str2.startsWith("QT_")) {
                            Collection collection = ((aggj) aghnVar.n()).get(str2);
                            if (map.put(str2, new wdk(str2, wdjVar2.c, collection != null ? agkz.n(collection) : agpr.a)) != null) {
                                throw new IllegalStateException("duplicate query table in db? ".concat(wdjVar2.c));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                agkx agkxVar2 = new agkx();
                agkxVar2.j(((agpn) agkjVarD3).keySet());
                agkxVar2.j(map.keySet());
                agkz agkzVarG2 = agkxVar2.g();
                HashSet<String> hashSet = new HashSet();
                ArrayList<abxv> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                agqr it4 = agkzVarG2.iterator();
                while (it4.hasNext()) {
                    String str3 = (String) it4.next();
                    wdk wdkVar = (wdk) agkjVarD3.get(str3);
                    wdk wdkVar2 = (wdk) map.get(str3);
                    if (wdkVar == null) {
                        hashSet.add(str3);
                    } else if (wdkVar2 == null) {
                        abxv abxvVar3 = (abxv) agkjVarD.get(str3);
                        abxvVar3.getClass();
                        arrayList.add(abxvVar3);
                    } else if (wdkVar2.a.equals(wdkVar.a)) {
                        agkz agkzVar2 = wdkVar2.b;
                        agkz agkzVar3 = wdkVar.b;
                        agjz agjzVar2 = new agjz(4);
                        agqr it5 = new agqb(agkzVar2, agkzVar3).iterator();
                        while (it5.hasNext()) {
                            agjzVar2.h(((wdi) it5.next()).a);
                        }
                        arrayList2.addAll(agjzVar2.g());
                        agkx agkxVar3 = new agkx();
                        agqr it6 = new agqb(agkzVar3, agkzVar2).iterator();
                        while (it6.hasNext()) {
                            yno ynoVar = (yno) agkjVarD2.get(((wdi) it6.next()).a);
                            ynoVar.getClass();
                            agkxVar3.c(ynoVar);
                        }
                        arrayList3.addAll(agkxVar3.g());
                    } else {
                        hashSet.add(str3);
                        abxv abxvVar4 = (abxv) agkjVarD.get(str3);
                        abxvVar4.getClass();
                        arrayList.add(abxvVar4);
                    }
                }
                for (String str4 : hashSet) {
                    omr omrVar2 = new omr();
                    omrVar2.i("DROP TABLE ");
                    yno.eF(omrVar2, str4);
                    omrVar.o(omrVar2.p());
                }
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    String str5 = (String) arrayList2.get(i9);
                    omr omrVar3 = new omr();
                    omrVar3.i("DROP INDEX ");
                    yno.eF(omrVar3, str5);
                    omrVar.o(omrVar3.p());
                }
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    abxv abxvVar5 = (abxv) arrayList.get(i10);
                    omr omrVar4 = new omr();
                    omrVar4.i("CREATE TABLE ");
                    abxvVar5.s(omrVar4);
                    omrVar4.i(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
                    ?? r6 = abxvVar5.b;
                    int i11 = ((agpi) r6).d;
                    for (int i12 = 0; i12 < i11; i12++) {
                        wcu wcuVar2 = (wcu) r6.get(i12);
                        omrVar4.i(", ");
                        wcuVar2.b(omrVar4);
                        omrVar4.i(" ");
                        int i13 = wcuVar2.b - 1;
                        if (i13 == 0) {
                            omrVar4.i("INT");
                        } else if (i13 != 1) {
                            omrVar4.i("TEXT");
                        } else {
                            omrVar4.i("REAL");
                        }
                    }
                    omrVar4.i(")");
                    omrVar.o(omrVar4.p());
                    arrayList3.addAll(abxvVar5.c);
                }
                agkf agkfVar = new agkf();
                for (abxv abxvVar6 : arrayList) {
                    agkfVar.b(abxvVar6.d, abxvVar6);
                }
                agqr it7 = agkfVar.a().map.entrySet().iterator();
                while (it7.hasNext()) {
                    Map.Entry entry = (Map.Entry) it7.next();
                    long jLongValue = ((Long) ((agkj) ((hed) this.f.a.io()).a).getOrDefault((Class) entry.getKey(), -2147483648L)).longValue();
                    Collection collection2 = (Collection) entry.getValue();
                    Cursor cursorE2 = omrVar.e("SELECT key, entity, metadata FROM entity_table WHERE data_type=?", Long.toString(jLongValue));
                    while (cursorE2.moveToNext()) {
                        try {
                            weh wehVarA = this.f.a(cursorE2.getString(0), cursorE2.getBlob(1));
                            byte[] blob = cursorE2.getBlob(2);
                            String strB = wehVarA.b();
                            try {
                                wejVar = new wej((akvf) aihn.parseFrom(akvf.a, blob, ExtensionRegistryLite.getGeneratedRegistry()));
                            } catch (aiik unused) {
                                ((agrc) ((agrc) e.b()).k("com/google/android/libraries/youtube/innertube/entities/persistence/impl/QueryTableManager", "parseMetadata", 247, "QueryTableManager.java")).w("QueryTableManager metadata read failure for %s", strB);
                                wejVar = wej.a;
                            }
                            Iterator it8 = collection2.iterator();
                            while (it8.hasNext()) {
                                omrVar.o(b((abxv) it8.next(), wehVarA, wejVar));
                            }
                        } catch (Throwable th5) {
                            if (cursorE2 == null) {
                                throw th5;
                            }
                            try {
                                cursorE2.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    if (cursorE2 != null) {
                        cursorE2.close();
                    }
                }
                if (arrayList3.size() <= 0) {
                    this.c = true;
                    return;
                } else {
                    new omr().i("CREATE INDEX ");
                    throw null;
                }
            }
            r8 = ((abxv) it2.next()).c;
        } while (((agpi) r8).d <= 0);
        throw null;
    }
}
