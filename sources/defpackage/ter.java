package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ter {
    public static final tew[] a;

    static {
        tew[] tewVarArrValues = tew.values();
        ArrayList arrayList = new ArrayList();
        for (tew tewVar : tewVarArrValues) {
            if (tewVar != tew.a) {
                arrayList.add(tewVar);
            }
        }
        a = (tew[]) arrayList.toArray(new tew[0]);
    }
}
