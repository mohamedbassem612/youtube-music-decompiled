package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mat implements mas {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public mat(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.mas
    public final boolean a(String str) {
        int i = this.$cid;
        if (i == 0) {
            return ((Pattern) this.a).matcher(str).find();
        }
        ?? r2 = this.a;
        if (i == 1) {
            return r2.contains(str);
        }
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            if (((mas) it.next()).a(str)) {
                return true;
            }
        }
        return false;
    }
}
