package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pwj extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ List g;
    final /* synthetic */ plv h;
    final /* synthetic */ Map i;
    final /* synthetic */ isi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwj(isi isiVar, List list, plv plvVar, Map map, awoq awoqVar) {
        super(2, awoqVar);
        this.j = isiVar;
        this.g = list;
        this.h = plvVar;
        this.i = map;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pwj(this.j, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pwj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2 A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:6:0x000f, B:32:0x00d8, B:35:0x00e2, B:36:0x00e5, B:37:0x00ea, B:38:0x00eb, B:39:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0110, B:45:0x012d), top: B:55:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5 A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:6:0x000f, B:32:0x00d8, B:35:0x00e2, B:36:0x00e5, B:37:0x00ea, B:38:0x00eb, B:39:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0110, B:45:0x012d), top: B:55:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:6:0x000f, B:32:0x00d8, B:35:0x00e2, B:36:0x00e5, B:37:0x00ea, B:38:0x00eb, B:39:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0110, B:45:0x012d), top: B:55:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0105 A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:6:0x000f, B:32:0x00d8, B:35:0x00e2, B:36:0x00e5, B:37:0x00ea, B:38:0x00eb, B:39:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0110, B:45:0x012d), top: B:55:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x010d A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:6:0x000f, B:32:0x00d8, B:35:0x00e2, B:36:0x00e5, B:37:0x00ea, B:38:0x00eb, B:39:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0110, B:45:0x012d), top: B:55:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [axff] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1, types: [axff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v6, types: [axff] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        isi isiVar;
        List list;
        Object obj2;
        Map map;
        ?? r13;
        ?? r14;
        ?? r6;
        Object obj3;
        ?? r1;
        Throwable th;
        ?? r12;
        ?? r15;
        ?? r0;
        ?? r16;
        pky pkyVar;
        int iAu;
        List list2;
        ArrayList arrayList;
        int i;
        Object plaVar;
        Object plaVar2 = awox.a;
        int i2 = this.f;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                isiVar = this.j;
                list = this.g;
                obj2 = this.h;
                map = this.i;
                r13 = isiVar.b;
                this.a = r13;
                this.b = list;
                this.c = isiVar;
                this.d = obj2;
                this.e = map;
                this.f = 1;
                if (r13.a(this) != plaVar2) {
                }
                r1 = map;
                obj3 = isiVar;
                r6 = list;
                r14 = r13;
                return plaVar2;
            }
            if (i2 != 1) {
                Object obj4 = this.b;
                r12 = this.a;
                try {
                    atqp.j(obj);
                    r0 = obj4;
                    r15 = r12;
                    pkyVar = (pky) obj;
                    iAu = a.au(pkyVar);
                    if (iAu != 0) {
                        list2 = (List) ((pla) pkyVar).a;
                        arrayList = new ArrayList(atqq.N(r0, 10));
                        i = 0;
                        for (Object obj5 : r0) {
                            int i3 = i + 1;
                            if (i < 0) {
                                atqq.M();
                            }
                            plw plwVar = new plw((plx) obj5);
                            plwVar.f(((Number) list2.get(i)).longValue());
                            arrayList.add(plwVar.a());
                            i = i3;
                        }
                        plaVar = new pla(arrayList);
                    } else {
                        if (iAu == 1) {
                            throw new awmj();
                        }
                        plaVar = (pku) pkyVar;
                    }
                    plaVar2 = plaVar;
                    r16 = r15;
                    r16.c();
                    r1 = map;
                    obj3 = isiVar;
                    r6 = list;
                    r14 = r13;
                    return plaVar2;
                } catch (Throwable th2) {
                    th = th2;
                    r12.c();
                    throw th;
                }
            }
            Object obj6 = this.e;
            obj2 = this.d;
            Object obj7 = this.c;
            Object obj8 = this.b;
            Object obj9 = this.a;
            atqp.j(obj);
            r14 = obj9;
            r1 = obj6;
            obj3 = obj7;
            r6 = obj8;
            r1 = map;
            obj3 = isiVar;
            r6 = list;
            r14 = r13;
            if (r6.isEmpty()) {
                plaVar2 = new pla(awno.a);
                r16 = r14;
                r16.c();
            } else {
                ArrayList<pxk> arrayList2 = new ArrayList();
                for (Object obj10 : r6) {
                    if (r1.get((pxk) obj10) != null) {
                        arrayList2.add(obj10);
                    }
                }
                ArrayList arrayList3 = new ArrayList(atqq.N(arrayList2, 10));
                for (pxk pxkVar : arrayList2) {
                    pxj pxjVar = (pxj) atqq.x(r1, pxkVar);
                    plw plwVarA = plx.a();
                    plwVarA.b(pxkVar);
                    plwVarA.e = aguu.V(pxjVar.a);
                    String str = pxjVar.b;
                    if (str != null && str.length() != 0) {
                        plwVarA.b = str;
                    }
                    arrayList3.add(plwVarA.a());
                }
                pve pveVarF = ((oml) ((isi) obj3).c).f((plv) obj2);
                this.a = r14;
                this.b = arrayList3;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 2;
                Object objD = pveVarF.d(arrayList3, this);
                if (objD != plaVar2) {
                    ?? r2 = r14;
                    obj = objD;
                    r15 = r2;
                    r0 = arrayList3;
                    pkyVar = (pky) obj;
                    iAu = a.au(pkyVar);
                    if (iAu != 0) {
                        list2 = (List) ((pla) pkyVar).a;
                        arrayList = new ArrayList(atqq.N(r0, 10));
                        i = 0;
                        while (r0.hasNext()) {
                            int i4 = i + 1;
                            if (i < 0) {
                                atqq.M();
                            }
                            plw plwVar2 = new plw((plx) obj5);
                            plwVar2.f(((Number) list2.get(i)).longValue());
                            arrayList.add(plwVar2.a());
                            i = i4;
                        }
                        plaVar = new pla(arrayList);
                    } else {
                        if (iAu == 1) {
                            throw new awmj();
                        }
                        plaVar = (pku) pkyVar;
                    }
                    plaVar2 = plaVar;
                    r16 = r15;
                    r16.c();
                }
            }
            r1 = map;
            obj3 = isiVar;
            r6 = list;
            r14 = r13;
            return plaVar2;
        } catch (Throwable th3) {
            ?? r11 = r14;
            th = th3;
            r12 = r11;
            r12.c();
            throw th;
        }
    }
}
