package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyf extends wzx {
    @Override // defpackage.wzx
    protected final int d() {
        return R.layout.live_chat_light_overlay_metadata_item;
    }

    @Override // defpackage.wzx
    protected final int e() {
        return R.dimen.live_chat_overlay_vertical_margin;
    }

    @Override // defpackage.wzx
    protected final int f() {
        return -2;
    }

    @Override // defpackage.wzx
    protected final ViewGroup g() {
        return null;
    }

    @Override // defpackage.wzx
    protected final ImageView h() {
        return (ImageView) this.c.findViewById(R.id.icon);
    }

    @Override // defpackage.wzx
    protected final TextView i() {
        return (TextView) this.c.findViewById(R.id.subtitle);
    }

    @Override // defpackage.wzx
    protected final TextView j() {
        return (TextView) this.c.findViewById(R.id.title);
    }
}
