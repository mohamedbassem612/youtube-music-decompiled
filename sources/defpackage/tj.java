package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tj extends vm {
    public final long a;
    private final List b;

    public tj() {
        super((byte[]) null);
        this.a = 0L;
        this.b = Collections.EMPTY_LIST;
    }

    public final List a() {
        List list = this.b;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public tj(long j, List list) {
        super((byte[]) null);
        this.a = j;
        this.b = list;
    }
}
