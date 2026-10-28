package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bqr extends MediaBrowserService {
    final /* synthetic */ bqs a;

    public bqr(bqs bqsVar, Context context) {
        this.a = bqsVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        int i2;
        Bundle bundle2;
        bqo bqoVar;
        fg.d(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        bqs bqsVar = this.a;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            i2 = -1;
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            bre breVar = bqsVar.d;
            bqsVar.c = new Messenger(breVar.e);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", bqsVar.c.getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = breVar.f;
            if (mediaSessionCompat$Token != null) {
                eq eqVarA = mediaSessionCompat$Token.a();
                bundle4.putBinder("extra_session_binder", eqVarA == null ? null : eqVarA.asBinder());
            } else {
                bqsVar.a.add(bundle4);
            }
            int i3 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i2 = i3;
            bundle2 = bundle4;
        }
        bre breVar2 = bqsVar.d;
        bqp bqpVar = new bqp(breVar2, str, i2, i, null);
        breVar2.d = bqpVar;
        bqo bqoVarA = breVar2.a(str, i, bundle3);
        breVar2.d = null;
        if (bqoVarA == null) {
            bqoVar = null;
        } else {
            if (bqsVar.c != null) {
                breVar2.b.add(bqpVar);
            }
            if (bundle2 == null) {
                bundle2 = bqoVarA.b;
            } else {
                Bundle bundle5 = bqoVarA.b;
                if (bundle5 != null) {
                    bundle2.putAll(bundle5);
                }
            }
            bqoVar = new bqo(bqoVarA.a, bundle2);
        }
        if (bqoVar != null) {
            return new MediaBrowserService.BrowserRoot(bqoVar.a, bqoVar.b);
        }
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        bqq bqqVar = new bqq(str, new zf(result));
        bre breVar = this.a.d;
        breVar.d = breVar.a;
        breVar.b(str, bqqVar);
        breVar.d = null;
    }
}
