package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbg {
    public final List a = new ArrayList();
    public Long b;
    public ywx c;
    public ywx d;

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.a.addAll(list);
    }

    public final void b(long j) {
        if (this.b == null) {
            this.b = Long.valueOf(j);
        }
    }
}
