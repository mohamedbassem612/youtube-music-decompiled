package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbl extends Handler {
    final /* synthetic */ auor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adbl(auor auorVar, Looper looper) {
        super(looper);
        this.a = auorVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        auor auorVar;
        Object obj;
        if (message.what != 153535 || (obj = (auorVar = this.a).a) == null) {
            return;
        }
        adbm adbmVar = (adbm) obj;
        Object obj2 = adbmVar.a;
        adbr adbrVar = (adbr) obj2;
        ArrayList arrayList = adbrVar.c;
        Object obj3 = adbmVar.c;
        if (arrayList.contains(obj3)) {
            adbrVar.c((auor) obj3);
            if (!adbrVar.b()) {
                taf.k(adbrVar.e, ahno.aq(new wan(obj2, adbmVar.b, 8), adbrVar.b), new adsl(1), taf.c);
            }
        }
        auorVar.a = null;
    }
}
