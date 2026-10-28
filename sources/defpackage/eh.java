package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class eh extends MediaBrowser.ConnectionCallback {
    final /* synthetic */ ei a;

    public eh(ei eiVar) {
        this.a = eiVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        eq eoVar;
        ei eiVar = this.a;
        ej ejVar = eiVar.b;
        if (ejVar != null) {
            try {
                Bundle extras = ejVar.b.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        ejVar.h = new eol(binder, ejVar.c);
                        eg egVar = ejVar.d;
                        ejVar.f = new Messenger(egVar);
                        egVar.a(ejVar.f);
                        try {
                            eol eolVar = ejVar.h;
                            Context context = ejVar.a;
                            Messenger messenger = ejVar.f;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) eolVar.b);
                            eolVar.D(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    if (binder2 == null) {
                        eoVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        eoVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eq)) ? new eo(binder2) : (eq) iInterfaceQueryLocalInterface;
                    }
                    if (eoVar != null) {
                        ejVar.g = MediaSessionCompat$Token.b(ejVar.b.getSessionToken(), eoVar);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        eiVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.a.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        ei eiVar = this.a;
        ej ejVar = eiVar.b;
        if (ejVar != null) {
            ejVar.h = null;
            ejVar.f = null;
            ejVar.g = null;
            ejVar.d.a(null);
        }
        eiVar.c();
    }
}
