package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahoi implements ahom {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ahoi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahom
    public final Object a(ahol aholVar) {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return new ahqz((Context) aholVar.e(Context.class), ((ahnr) aholVar.e(ahnr.class)).h(), aholVar.f(new ahpd(ahpc.class, ahra.class)), aholVar.b(ahuh.class), (Executor) aholVar.d((ahpd) this.a));
        }
        Object obj = this.a;
        return i != 3 ? ((ahok) obj).f.a(aholVar) : FirebaseMessagingRegistrar.lambda$getComponents$0((ahpd) obj, aholVar);
    }
}
