package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abai extends Handler {
    private final WeakReference a;

    public abai(abaj abajVar) {
        this.a = new WeakReference(abajVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        abaj abajVar = (abaj) this.a.get();
        if (abajVar != null) {
            if (message.what == 0) {
                abajVar.f = null;
                abajVar.e = (Surface) message.obj;
                zll zllVar = abajVar.c;
                if (zllVar != null) {
                    zllVar.c();
                    return;
                }
                return;
            }
            if (message.what == 1) {
                abajVar.e = null;
                abajVar.f = (ctl) message.obj;
                zll zllVar2 = abajVar.c;
                if (zllVar2 != null) {
                    zllVar2.b();
                }
                abajVar.t();
                return;
            }
            if (message.what == 3) {
                if (abajVar.g) {
                    abajVar.requestLayout();
                }
            } else {
                if (message.what == 4 && abajVar.c != null) {
                    abajVar.c.e(message.arg1 > 0, zhf.g((Throwable) message.obj));
                }
                super.handleMessage(message);
            }
        }
    }
}
