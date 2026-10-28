package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tgx implements avlt {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tgx(String str, ByteStore byteStore, int i) {
        this.$cid = i;
        this.b = str;
        this.a = byteStore;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tgg] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, tgg] */
    @Override // defpackage.avlt
    public final void a(avls avlsVar) {
        int i = this.$cid;
        if (i == 0) {
            tgy tgyVar = new tgy(avlsVar, 1);
            avlsVar.d(new mqy(this.a.a(this.b, tgyVar), 2));
            return;
        }
        if (i != 1) {
            tgy tgyVar2 = new tgy(avlsVar, 0);
            avlsVar.d(new mqy(this.a.a(this.b, tgyVar2), 2));
            return;
        }
        String str = (String) this.b;
        mqz mqzVar = new mqz(avlsVar, str);
        ByteStore byteStore = (ByteStore) this.a;
        Subscription subscriptionSubscribe = byteStore.subscribe(str, mqzVar);
        if (subscriptionSubscribe != null) {
            avlsVar.d(new mqy(subscriptionSubscribe, 0));
        }
        Snapshot snapshot = byteStore.snapshot();
        if (snapshot != null) {
            avlsVar.c(agev.h(snapshot.find(str)));
        }
    }

    public /* synthetic */ tgx(tgg tggVar, tns tnsVar, int i) {
        this.$cid = i;
        this.a = tggVar;
        this.b = tnsVar;
    }
}
