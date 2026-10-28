package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class itf {
    public final String a;
    private final aha b = new aha(0);
    private final aha c = new aha(0);
    private final aha d = new aha(0);
    private final aha e = new aha(0);
    private final aha f = new aha(0);
    private final String g;

    public itf(String str, String str2) {
        this.a = str;
        this.g = str2;
    }

    public static itf a(aulf aulfVar) {
        itf itfVar = new itf(aulfVar.c, aulfVar.b);
        for (aule auleVar : aulfVar.d) {
            if (!auleVar.d.isEmpty()) {
                itfVar.b.put(auleVar.c, auleVar.d);
            } else if (!auleVar.e.isEmpty()) {
                itfVar.c.put(auleVar.c, auleVar.e);
            } else if (!auleVar.f.isEmpty()) {
                itfVar.d.put(auleVar.c, auleVar.f);
            } else if (!auleVar.g.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = auleVar.g.iterator();
                while (it.hasNext()) {
                    arrayList.add(a((aulf) it.next()));
                }
                itfVar.e.put(auleVar.c, arrayList);
            } else if ((auleVar.b & 2) != 0) {
                itfVar.f.put(auleVar.c, auleVar.h.G());
            }
        }
        return itfVar;
    }

    public final String toString() {
        aha ahaVar = this.f;
        aha ahaVar2 = this.e;
        aha ahaVar3 = this.d;
        aha ahaVar4 = this.c;
        return "url:" + this.a + " type:" + this.g + " boolProps:" + this.b.toString() + " intProps:" + ahaVar4.toString() + " stringProps:" + ahaVar3.toString() + " thingProps:" + ahaVar2.toString() + " byteArrayProps:" + ahaVar.toString();
    }
}
