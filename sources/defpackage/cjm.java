package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cjm extends Handler {
    final /* synthetic */ cjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjm(cjo cjoVar, Looper looper) {
        super(looper);
        this.a = cjoVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.a.h(obj, obj2);
                return;
            }
            return;
        }
        cjo cjoVar = this.a;
        if (obj == cjoVar.l) {
            if (cjoVar.h == 2 || cjoVar.k()) {
                cjoVar.l = null;
                if (obj2 instanceof Exception) {
                    cjoVar.j.b((Exception) obj2, false);
                    return;
                }
                try {
                    cjoVar.b.f((byte[]) ((eol) obj2).a);
                    aaf aafVar = cjoVar.j;
                    aafVar.a = null;
                    ?? r4 = aafVar.b;
                    agke agkeVarN = agke.n(r4);
                    r4.clear();
                    int size = agkeVarN.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        cjo cjoVar2 = (cjo) agkeVarN.get(i2);
                        if (cjoVar2.l()) {
                            cjoVar2.f(true);
                        }
                    }
                } catch (Exception e) {
                    cjoVar.j.b(e, true);
                }
            }
        }
    }
}
