package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xal extends wzw {
    @Override // defpackage.wzw
    protected final boolean d() {
        return true;
    }

    @Override // defpackage.wzw
    protected final int e() {
        return R.layout.live_chat_overlay_membership_item;
    }

    @Override // defpackage.wzw
    protected final Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_full_background);
    }

    @Override // defpackage.wzw
    protected final Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_top_background);
    }
}
