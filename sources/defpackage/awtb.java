package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awtb implements Iterable, awrp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public awtb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$cid;
        Object obj = this.a;
        return i != 0 ? new awsn((Object[]) obj, 1) : new awte((awsu) obj);
    }
}
