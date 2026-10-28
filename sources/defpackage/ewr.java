package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ewr {
    private final ewq a = new ewq(null);
    private final Map b = new HashMap();

    public final Object a(ewy ewyVar) {
        Map map = this.b;
        ewq ewqVar = (ewq) map.get(ewyVar);
        if (ewqVar == null) {
            ewqVar = new ewq(ewyVar);
            map.put(ewyVar, ewqVar);
        } else {
            ewyVar.a();
        }
        ewq ewqVar2 = ewqVar.d;
        ewqVar2.c = ewqVar.c;
        ewqVar.c.d = ewqVar2;
        ewq ewqVar3 = this.a;
        ewqVar.d = ewqVar3;
        ewqVar.c = ewqVar3.c;
        ewqVar.c.d = ewqVar;
        ewqVar.d.c = ewqVar;
        return ewqVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ewy, java.lang.Object] */
    public final Object b() {
        ewq ewqVar = this.a;
        for (ewq ewqVar2 = ewqVar.d; !ewqVar2.equals(ewqVar); ewqVar2 = ewqVar2.d) {
            Object objB = ewqVar2.b();
            if (objB != null) {
                return objB;
            }
            ewq ewqVar3 = ewqVar2.d;
            ewqVar3.c = ewqVar2.c;
            ewqVar2.c.d = ewqVar3;
            Map map = this.b;
            ?? r3 = ewqVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(ewy ewyVar, Object obj) {
        Map map = this.b;
        ewq ewqVar = (ewq) map.get(ewyVar);
        if (ewqVar == null) {
            ewqVar = new ewq(ewyVar);
            ewq ewqVar2 = ewqVar.d;
            ewqVar2.c = ewqVar.c;
            ewqVar.c.d = ewqVar2;
            ewq ewqVar3 = this.a;
            ewqVar.d = ewqVar3.d;
            ewqVar.c = ewqVar3;
            ewqVar.c.d = ewqVar;
            ewqVar.d.c = ewqVar;
            map.put(ewyVar, ewqVar);
        } else {
            ewyVar.a();
        }
        if (ewqVar.b == null) {
            ewqVar.b = new ArrayList();
        }
        ewqVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        ewq ewqVar = this.a;
        ewq ewqVar2 = ewqVar.c;
        boolean z = false;
        while (!ewqVar2.equals(ewqVar)) {
            sb.append('{');
            sb.append(ewqVar2.a);
            sb.append(':');
            sb.append(ewqVar2.a());
            sb.append("}, ");
            ewqVar2 = ewqVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
