package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xob extends Handler {
    private static final twp c = new twp(-1, (xwc) null, (yaa) null);
    private final xwh a;
    private final agke b;

    public xob(Looper looper, xwh xwhVar, agke agkeVar) {
        super(looper);
        this.a = xwhVar;
        this.b = agkeVar;
    }

    private static final void b(yaa yaaVar, xve xveVar, int i) {
        if (xveVar == null) {
            yaaVar.c(-1, 3, i);
            return;
        }
        agrx agrxVar = agso.a;
        yay yayVar = (yay) yaaVar.a;
        xvn xvnVar = yayVar.k;
        yayVar.p = i + 1;
        yayVar.aE(false);
        yayVar.E.l(11);
        yayVar.aF(xveVar);
    }

    final void a(twp twpVar) {
        twp twpVar2;
        agke agkeVar = this.b;
        twp twpVar3 = c;
        int i = twpVar.a;
        if (i < agkeVar.size() - 1) {
            twpVar2 = new twp(i + 1, (xwc) twpVar.b, (yaa) twpVar.c);
        } else {
            twpVar2 = twpVar3;
        }
        if (twpVar2 == twpVar3) {
            b((yaa) twpVar.c, null, i);
        } else {
            sendMessageDelayed(Message.obtain(this, 1, twpVar2), ((Integer) agkeVar.get(twpVar2.a)).intValue());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            twp twpVar = (twp) message.obj;
            Object obj = twpVar.b;
            Object obj2 = twpVar.c;
            xve xveVar = (xve) this.a.a(obj);
            if (xveVar == null) {
                a(twpVar);
                return;
            }
            agrf agrfVar = xoc.a;
            agrx agrxVar = agso.a;
            xvb xvbVar = new xvb(xveVar);
            xvbVar.e(new xvv(3, false));
            xvbVar.c = (xwc) obj;
            xvbVar.a = (byte) (xvbVar.a | 64);
            b((yaa) obj2, xvbVar.a(), twpVar.a);
        }
    }
}
