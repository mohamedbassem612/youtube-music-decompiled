package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zei {
    public final Context a;
    public final zjr b;
    public final Intent c;
    public int d = -1;
    private final Intent e;

    public zei(Context context, zjr zjrVar) {
        this.a = context;
        this.b = zjrVar;
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        this.c = intent;
        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
        Intent intent2 = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        this.e = intent2;
        intent2.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
    }

    public final void a(int i) {
        int iAV;
        zjr zjrVar = this.b;
        if ((zjrVar.bl() || ((iAV = a.aV(zjrVar.R().d)) != 0 && iAV == 3)) && this.d == i && i != -1) {
            Intent intent = this.e;
            intent.putExtra("android.media.extra.AUDIO_SESSION", i);
            this.a.sendBroadcast(intent);
            this.d = -1;
        }
    }
}
