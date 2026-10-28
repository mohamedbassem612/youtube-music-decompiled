package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwy extends gut {
    private final Activity a;

    public gwy(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Activity activity = this.a;
        if (txz.d(activity) || txz.g(activity)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(activity, "com.google.android.apps.youtube.music.activities.InternalMusicActivity");
        Bundle bundle = new Bundle();
        ahng.aG(bundle, "command_bundle_key", ajwoVar);
        intent.putExtra("intent_extra_command_bundle", bundle);
        afwl.m(activity, intent);
    }
}
