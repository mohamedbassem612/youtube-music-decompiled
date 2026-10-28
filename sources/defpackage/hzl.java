package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzl {
    public static final ajwo a = vxh.a("SPunlimited");
    public final Context b;
    private final heg c;

    public hzl(Context context, heg hegVar) {
        this.b = context;
        this.c = hegVar;
    }

    public final void a() {
        Context context = this.b;
        b(fhz.Q(context.getString(R.string.audio_only_castability_missing_queue_non_video_toast), context.getString(R.string.audio_only_castability_upgrade_button), a));
    }

    public final void b(ajwo ajwoVar) {
        Optional optionalB = this.c.b();
        hun hunVar = new hun(ajwoVar, 5);
        if (true == optionalB.isPresent()) {
            ((vxe) optionalB.get()).a((ajwo) hunVar.a);
        }
    }
}
