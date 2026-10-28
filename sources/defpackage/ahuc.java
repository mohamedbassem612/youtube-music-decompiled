package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahuc implements ahuh {
    private final String a;
    private final ahud b;

    public ahuc(Set set, ahud ahudVar) {
        this.a = b(set);
        this.b = ahudVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ahue ahueVar = (ahue) it.next();
            sb.append(ahueVar.a);
            sb.append('/');
            sb.append(ahueVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.ahuh
    public final String a() {
        ahud ahudVar = this.b;
        boolean zIsEmpty = ahudVar.a().isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(ahudVar.a());
    }
}
