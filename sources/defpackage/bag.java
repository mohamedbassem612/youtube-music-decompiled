package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bag implements awsx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public bag(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.awsx
    public final Iterator a() {
        Iterator azhVar;
        int i = this.$cid;
        if (i != 0) {
            ?? r3 = this.a;
            if (i == 1) {
                azhVar = new baf((ViewGroup) r3);
            } else {
                if (i != 2) {
                    return r3.iterator();
                }
                azhVar = new awsn((Object[]) r3, 1);
            }
        } else {
            azhVar = new azh(new bag(this.a, 1).a(), aop.a);
        }
        return azhVar;
    }
}
