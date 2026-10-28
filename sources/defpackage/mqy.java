package defpackage;

import com.google.android.libraries.elements.interfaces.Subscription;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mqy implements avnh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mqy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tgz] */
    @Override // defpackage.avnh
    public final void a() {
        int i = this.$cid;
        ?? r2 = this.a;
        if (i == 0) {
            ((Subscription) r2).cancel();
        } else if (i != 1) {
            r2.a();
        } else {
            ((mhj) r2).a = null;
        }
    }
}
