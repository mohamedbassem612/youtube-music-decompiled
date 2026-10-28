package defpackage;

import android.content.Context;
import android.media.session.MediaSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fe extends fd {
    @Override // defpackage.fb
    public final MediaSession g(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
