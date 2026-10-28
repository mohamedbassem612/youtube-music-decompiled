package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agoo extends agoq {
    final /* synthetic */ Comparator a;

    public agoo(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.agoq
    public final Map a() {
        return new TreeMap(this.a);
    }
}
