package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class eg extends Handler {
    private final WeakReference a;
    private WeakReference b;

    public eg(ej ejVar) {
        this.a = new WeakReference(ejVar);
    }

    final void a(Messenger messenger) {
        this.b = new WeakReference(messenger);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        eol eolVar;
        fdr fdrVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.a;
        if (weakReference2.get() != null) {
            Bundle data = message.getData();
            fg.d(data);
            ej ejVar = (ej) weakReference2.get();
            Messenger messenger = (Messenger) this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    fg.d(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    Bundle bundle = data.getBundle("data_options");
                    fg.d(bundle);
                    fg.d(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                    if (ejVar.f != messenger || (eolVar = (eol) ejVar.e.get(string)) == null) {
                        return;
                    }
                    int i2 = 0;
                    while (true) {
                        ?? r3 = eolVar.a;
                        if (i2 >= r3.size()) {
                            fdrVar = null;
                            break;
                        } else {
                            if (amw.d((Bundle) r3.get(i2), bundle)) {
                                fdrVar = (fdr) eolVar.b.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    if (fdrVar != null) {
                        if (bundle == null) {
                            if (parcelableArrayList != null) {
                                throw null;
                            }
                            throw null;
                        }
                        if (parcelableArrayList != null) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                int i3 = message.what;
            }
        }
    }
}
