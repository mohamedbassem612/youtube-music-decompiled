package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahsy implements loz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ahsy(FirebaseInstanceId firebaseInstanceId, String str, String str2, int i) {
        this.$cid = i;
        this.b = firebaseInstanceId;
        this.c = str;
        this.a = str2;
    }

    @Override // defpackage.loz
    public final lpa a(Object obj) {
        Object obj2;
        int i = this.$cid;
        Object obj3 = this.b;
        if (i != 0) {
            FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) obj3;
            afts aftsVar = firebaseInstanceId.e;
            String str = (String) obj;
            FirebaseInstanceId.g.A(firebaseInstanceId.c(), (String) this.c, this.a, str, aftsVar.k());
            return mda.m(new ahud(str, (byte[]) null));
        }
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj3;
        String str2 = (String) obj;
        FirebaseMessaging.o(firebaseMessaging.d).d(firebaseMessaging.c(), this.a, str2, firebaseMessaging.h.c());
        if (firebaseMessaging.i.g() || (obj2 = this.c) == null || !str2.equals(((ahtk) obj2).b)) {
            firebaseMessaging.n(str2);
        }
        lpf lpfVar = new lpf();
        lpfVar.t(str2);
        return lpfVar;
    }

    public /* synthetic */ ahsy(FirebaseMessaging firebaseMessaging, String str, ahtk ahtkVar, int i) {
        this.$cid = i;
        this.b = firebaseMessaging;
        this.a = str;
        this.c = ahtkVar;
    }
}
