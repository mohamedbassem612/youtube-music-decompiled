package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kps extends afkg {
    final /* synthetic */ kpz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kps(kpz kpzVar, Looper looper) {
        super(looper, (byte[]) null);
        this.a = kpzVar;
    }

    private static final void a(Message message) {
        kpt kptVar = (kpt) message.obj;
        if (kptVar != null) {
            kptVar.e();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        kpz kpzVar = this.a;
        if (kpzVar.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !kpzVar.x()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            kpzVar.A = new klo(1, message.arg2, null, null, null, null);
            int i = kpzVar.D;
            kpzVar.C.get();
            if (kpzVar.D != kpzVar.C.get()) {
                TextUtils.isEmpty(kpzVar.c());
            }
            kpz kpzVar2 = this.a;
            klo kloVar = kpzVar2.A;
            if (kloVar == null) {
                kloVar = new klo(1, 8, null, null, null, null);
            }
            kpzVar2.t.a(kloVar);
            kpzVar2.q();
            return;
        }
        if (message.what == 5) {
            kpz kpzVar3 = this.a;
            klo kloVar2 = kpzVar3.A;
            if (kloVar2 == null) {
                kloVar2 = new klo(1, 8, null, null, null, null);
            }
            kpzVar3.t.a(kloVar2);
            kpzVar3.q();
            return;
        }
        if (message.what == 3) {
            klo kloVar3 = new klo(1, message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null, null, null, null);
            kpz kpzVar4 = this.a;
            kpzVar4.t.a(kloVar3);
            kpzVar4.q();
            return;
        }
        if (message.what == 6) {
            kpz kpzVar5 = this.a;
            kpzVar5.N(5, null, message.arg1);
            kpq kpqVar = kpzVar5.v;
            if (kpqVar != null) {
                kpqVar.b(message.arg2);
            }
            int i2 = message.arg2;
            kpzVar5.Q();
            kpzVar5.K(5, 1, null, message.arg1);
            return;
        }
        if (message.what == 2 && !this.a.w()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        kpt kptVar = (kpt) message.obj;
        synchronized (kptVar) {
            obj = kptVar.e;
            if (kptVar.f) {
                Log.w("GmsClient", a.cs(kptVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            kptVar.c();
        }
        synchronized (kptVar) {
            kptVar.f = true;
        }
        kptVar.e();
    }
}
