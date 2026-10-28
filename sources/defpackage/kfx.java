package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfx extends ez {
    final /* synthetic */ kfz e;

    public kfx(kfz kfzVar) {
        this.e = kfzVar;
    }

    private final void w(long j) {
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            x(Math.min(kfmVar.e(), Math.max(0L, kfmVar.d() + j)));
        }
    }

    private final void x(long j) {
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            kfmVar.A(new kaw(j));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ez
    public final void b(String str, Bundle bundle) {
        khn khnVar = kfz.a;
        khn.e();
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    w(-this.e.f.d);
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    kcr kcrVar = this.e.e;
                    if (kcrVar != null) {
                        kcrVar.d(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    kcr kcrVar2 = this.e.e;
                    if (kcrVar2 != null) {
                        kcrVar2.d(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    w(this.e.f.d);
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        kfz kfzVar = this.e;
        intent.setComponent(kfzVar.g);
        int i = Build.VERSION.SDK_INT;
        Context context = kfzVar.b;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    @Override // defpackage.ez
    public final void d() {
        khn khnVar = kfz.a;
        khn.e();
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            kfmVar.w();
        }
    }

    @Override // defpackage.ez
    public final void e() {
        khn khnVar = kfz.a;
        khn.e();
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            kfmVar.x();
        }
    }

    @Override // defpackage.ez
    public final void m(long j) {
        khn khnVar = kfz.a;
        khn.e();
        x(j);
    }

    @Override // defpackage.ez
    public final void q() {
        khn khnVar = kfz.a;
        khn.e();
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            kfmVar.y();
        }
    }

    @Override // defpackage.ez
    public final void r() {
        khn khnVar = kfz.a;
        khn.e();
        kfm kfmVar = this.e.j;
        if (kfmVar != null) {
            kfmVar.z();
        }
    }

    @Override // defpackage.ez
    public final boolean u(Intent intent) {
        kfm kfmVar;
        khn khnVar = kfz.a;
        khn.e();
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (kfmVar = this.e.j) == null) {
            return true;
        }
        kfmVar.l();
        return true;
    }
}
