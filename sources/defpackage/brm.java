package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class brm extends ei {
    public ek c;
    private final Context d;
    private final Intent e;
    private final BroadcastReceiver.PendingResult f;

    public brm(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.d = context;
        this.e = intent;
        this.f = pendingResult;
    }

    private final void d() {
        Messenger messenger;
        ej ejVar = (ej) this.c.a;
        eol eolVar = ejVar.h;
        if (eolVar != null && (messenger = ejVar.f) != null) {
            try {
                eolVar.D(7, null, messenger);
            } catch (RemoteException unused) {
            }
        }
        ejVar.b.disconnect();
        this.f.finish();
    }

    @Override // defpackage.ei
    public final void a() {
        ej ejVar = (ej) this.c.a;
        if (ejVar.g == null) {
            ejVar.g = MediaSessionCompat$Token.b(ejVar.b.getSessionToken(), null);
        }
        new fg(this.d, ejVar.g).q((KeyEvent) this.e.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        d();
    }

    @Override // defpackage.ei
    public final void b() {
        d();
    }

    @Override // defpackage.ei
    public final void c() {
        d();
    }
}
