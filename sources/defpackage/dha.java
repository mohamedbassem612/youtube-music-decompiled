package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dha extends vy {
    final /* synthetic */ Messenger a;
    final /* synthetic */ int b;

    public dha(Messenger messenger, int i) {
        this.a = messenger;
        this.b = i;
    }

    static final void o(Messenger messenger, int i, int i2, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = 0;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("AxMR2ProvdrSrvcAdapter", "Could not send message to the client.", e);
        }
    }

    @Override // defpackage.vy
    public final void l(String str, Bundle bundle) {
        int i = dhe.e;
        if (str == null) {
            o(this.a, 4, this.b, bundle, null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("error", str);
        o(this.a, 4, this.b, bundle, bundle2);
    }

    @Override // defpackage.vy
    public final void m(Bundle bundle) {
        int i = dhe.e;
        o(this.a, 3, this.b, bundle, null);
    }
}
