package defpackage;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dgn {
    public final fg a;
    public brj b;
    public final /* synthetic */ dgr c;

    public dgn(dgr dgrVar, fg fgVar) {
        this.c = dgrVar;
        this.a = fgVar;
    }

    final void a() {
        int i = this.c.m.d;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((fb) this.a.c).a.setPlaybackToLocal(builder.build());
        this.b = null;
    }
}
