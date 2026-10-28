package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jjq extends adks {
    public final List a = new ArrayList();

    @Override // defpackage.adkz
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}
