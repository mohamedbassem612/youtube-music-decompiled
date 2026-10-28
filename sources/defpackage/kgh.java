package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgh implements khs {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public kgh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.khs
    public final void a(String str, long j, int i, Object obj, long j2, long j3) {
        if (this.$cid == 0) {
            khn khnVar = kgj.a;
            kyr kyrVar = ((kgj) this.a).d;
            Object obj2 = kyrVar.b;
            Object obj3 = kyrVar.a;
            khn.e();
            return;
        }
        try {
            ((BasePendingResult) this.a).l(new kfl(new Status(i, null, null, null)));
        } catch (IllegalStateException e) {
            kfm.a.c(e, "Result already set when calling onRequestCompleted", new Object[0]);
        }
        Iterator it = ((kfj) this.a).d.e.iterator();
        while (it.hasNext()) {
            long j4 = j;
            String str2 = str;
            int i2 = i;
            ((ket) it.next()).a(str2, j4, i2, j2, j3);
            str = str2;
            j = j4;
            i = i2;
        }
    }

    @Override // defpackage.khs
    public final void b(String str, long j, long j2, long j3) {
        if (this.$cid == 0) {
            khn khnVar = kgj.a;
            kyr kyrVar = ((kgj) this.a).d;
            Object obj = kyrVar.b;
            Object obj2 = kyrVar.a;
            khn.e();
            return;
        }
        try {
            ((BasePendingResult) this.a).l(new kfi(new Status(2103, null, null, null), 0));
        } catch (IllegalStateException e) {
            kfm.a.c(e, "Result already set when calling onRequestReplaced", new Object[0]);
        }
        Iterator it = ((kfj) this.a).d.e.iterator();
        while (it.hasNext()) {
            ((ket) it.next()).a(str, j, 2103, j2, j3);
        }
    }
}
