package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jtg extends Handler {
    final /* synthetic */ jth a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtg(jth jthVar, Looper looper) {
        super(looper);
        this.a = jthVar;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        Object obj2;
        if (message.obj instanceof Pair) {
            Pair pair = (Pair) message.obj;
            obj2 = pair.first;
            obj = pair.second;
        } else {
            obj = message.obj;
            obj2 = null;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                jth jthVar = this.a;
                if (jthVar.r()) {
                    if (obj instanceof Exception) {
                        jthVar.j((Exception) obj, false);
                        return;
                    }
                    zjd zjdVar = jthVar.k;
                    zjdVar.o();
                    zjdVar.t();
                    try {
                        byte[] bArrN = jthVar.a.n(jthVar.i, (byte[]) ((eol) obj).a);
                        if (jthVar.j != null && bArrN != null && bArrN.length != 0) {
                            jthVar.j = bArrN;
                        }
                        jthVar.g = 4;
                        jthVar.g(new cjj(6));
                        zjdVar.s();
                        return;
                    } catch (Exception e) {
                        jthVar.j(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        jth jthVar2 = this.a;
        if (obj2 == jthVar2.o) {
            if (jthVar2.g == 2 || jthVar2.r()) {
                jthVar2.o = null;
                if (obj instanceof Exception) {
                    jthVar2.n.c((Exception) obj, false);
                    return;
                }
                try {
                    jthVar2.a.f((byte[]) ((eol) obj).a);
                    mgk mgkVar = jthVar2.n;
                    mgkVar.b = null;
                    ?? r5 = mgkVar.a;
                    agke agkeVarN = agke.n(r5);
                    r5.clear();
                    int size = agkeVarN.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        jth jthVar3 = (jth) agkeVarN.get(i2);
                        if (jthVar3.t(false)) {
                            jthVar3.h(true);
                        }
                    }
                } catch (Exception e2) {
                    jthVar2.n.c(e2, true);
                }
            }
        }
    }
}
