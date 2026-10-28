package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accg implements zwz {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.zwz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acch a() {
        List list = this.a;
        if (list.isEmpty() || ((Long) list.get(0)).longValue() != 0) {
            list.add(0, 0L);
            this.b.add(0, accf.a);
        }
        return new acch(list, this.b);
    }
}
