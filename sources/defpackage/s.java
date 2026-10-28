package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class s {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private s(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    static s a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : x.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z2 = true;
                z = false;
            } else {
                if (z2) {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
                String[] strArrSplit = x.f.split(str2);
                int length = strArrSplit.length;
                if (length == 1) {
                    q qVar = new q(strArrSplit[0]);
                    b(i, qVar);
                    linkedHashSet.add(new r(qVar, qVar));
                } else {
                    if (length != 2) {
                        throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                    }
                    q qVar2 = new q(strArrSplit[0]);
                    q qVar3 = new q(strArrSplit[1]);
                    b(i, qVar2);
                    b(i, qVar3);
                    linkedHashSet.add(new r(qVar2, qVar3));
                }
            }
        }
        return new s(i, DesugarCollections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, q qVar) {
        if ((i == 1) != (qVar.b == 0)) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(qVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (r rVar : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(rVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
