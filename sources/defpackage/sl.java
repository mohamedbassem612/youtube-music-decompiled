package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sl extends vm {
    public final String a;
    final List b;
    public final String c;
    private final List d;

    public sl(String str, List list, List list2, String str2) {
        super((byte[]) null);
        this.a = str;
        azs.l(list);
        this.b = list;
        this.d = list2;
        azs.l(str2);
        this.c = str2;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    public final List b() {
        si skVar;
        List list = this.b;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            vg vgVar = (vg) list.get(i);
            azs.l(vgVar);
            switch (vgVar.b) {
                case 1:
                    skVar = new sk(vgVar);
                    break;
                case 2:
                    skVar = new sh(vgVar);
                    break;
                case 3:
                    skVar = new se(vgVar);
                    break;
                case 4:
                    skVar = new sa(vgVar);
                    break;
                case 5:
                    skVar = new si(vgVar);
                    break;
                case 6:
                    skVar = new sd(vgVar);
                    break;
                case 7:
                    skVar = new sf(vgVar);
                    break;
                default:
                    skVar = new si(vgVar);
                    break;
            }
            arrayList.add(skVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sl) {
            sl slVar = (sl) obj;
            if (this.a.equals(slVar.a) && this.c.equals(slVar.c) && a().equals(slVar.a())) {
                return b().equals(slVar.b());
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        vn vnVar = new vn();
        vnVar.a("{\n");
        vnVar.d();
        vnVar.a("schemaType: \"");
        vnVar.a(this.a);
        vnVar.a("\",\n");
        vnVar.a("description: \"");
        vnVar.a(this.c);
        vnVar.a("\",\n");
        vnVar.a("properties: [\n");
        int i = 0;
        si[] siVarArr = (si[]) b().toArray(new si[0]);
        Arrays.sort(siVarArr, new awv(1));
        while (true) {
            int length = siVarArr.length;
            if (i >= length) {
                vnVar.a("\n");
                vnVar.a("]\n");
                vnVar.c();
                vnVar.a("}");
                return vnVar.toString();
            }
            si siVar = siVarArr[i];
            vnVar.d();
            siVar.h(vnVar);
            if (i != length - 1) {
                vnVar.a(",\n");
            }
            vnVar.c();
            i++;
        }
    }
}
