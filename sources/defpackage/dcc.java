package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dcc implements dbd {
    private final List a;

    public dcc(List list) {
        this.a = list;
    }

    @Override // defpackage.dbd
    public final int a() {
        return 1;
    }

    @Override // defpackage.dbd
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.dbd
    public final long c(int i) {
        ahno.F(i == 0);
        return 0L;
    }

    @Override // defpackage.dbd
    public final List e(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }
}
