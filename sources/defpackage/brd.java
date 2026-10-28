package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class brd extends Handler {
    public bre a;

    public brd(bre breVar) {
        this.a = breVar;
    }

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        bre breVar = this.a;
        if (breVar == null) {
            removeCallbacksAndMessages(null);
            return;
        }
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                fg.d(bundle);
                qcb qcbVar = breVar.h;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                zf zfVar = new zf(message.replyTo);
                if (string != null) {
                    bre breVar2 = (bre) qcbVar.a;
                    for (String str : breVar2.getPackageManager().getPackagesForUid(i2)) {
                        if (str.equals(string)) {
                            breVar2.e.a(new oxb(qcbVar, zfVar, string, i, i2, bundle, 1));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                qcb qcbVar2 = breVar.h;
                ((bre) qcbVar2.a).e.a(new blq(qcbVar2, new zf(message.replyTo), 6));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                fg.d(bundle2);
                qcb qcbVar3 = breVar.h;
                ((bre) qcbVar3.a).e.a(new brc(qcbVar3, new zf(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, 1));
                return;
            case 4:
                qcb qcbVar4 = breVar.h;
                ((bre) qcbVar4.a).e.a(new aew(qcbVar4, new zf(message.replyTo), data.getString("data_media_item_id"), (Object) data.getBinder("data_callback_token"), 3));
                return;
            case 5:
                qcb qcbVar5 = breVar.h;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                zf zfVar2 = new zf(message.replyTo);
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                ((bre) qcbVar5.a).e.a(new aew(qcbVar5, zfVar2, string2, (Object) resultReceiver, 4));
                return;
            case 6:
                fg.d(data.getBundle("data_root_hints"));
                qcb qcbVar6 = breVar.h;
                ((bre) qcbVar6.a).e.a(new brb(qcbVar6, new zf(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid")));
                return;
            case 7:
                qcb qcbVar7 = breVar.h;
                ((bre) qcbVar7.a).e.a(new blq(qcbVar7, new zf(message.replyTo), 7));
                return;
            case 8:
                Bundle bundle3 = data.getBundle("data_search_extras");
                fg.d(bundle3);
                qcb qcbVar8 = breVar.h;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                zf zfVar3 = new zf(message.replyTo);
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                ((bre) qcbVar8.a).e.a(new brc(qcbVar8, zfVar3, string3, bundle3, resultReceiver2, 0));
                return;
            case 9:
                Bundle bundle4 = data.getBundle("data_custom_action_extras");
                fg.d(bundle4);
                qcb qcbVar9 = breVar.h;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                zf zfVar4 = new zf(message.replyTo);
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                ((bre) qcbVar9.a).e.a(new brc(qcbVar9, zfVar4, string4, bundle4, resultReceiver3, 2));
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(ek.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }
}
