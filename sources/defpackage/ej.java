package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ej {
    final Context a;
    public final MediaBrowser b;
    protected final Bundle c;
    protected final eg d = new eg(this);
    public final afv e = new afv();
    public Messenger f;
    public MediaSessionCompat$Token g;
    public eol h;

    public ej(Context context, ComponentName componentName, ei eiVar) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        eiVar.b = this;
        this.b = new MediaBrowser(context, componentName, eiVar.a, bundle);
    }
}
