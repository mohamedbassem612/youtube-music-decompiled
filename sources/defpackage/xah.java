package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xah extends wzu {
    @Override // defpackage.wzu
    protected final int d() {
        return R.layout.live_chat_donation_announcement;
    }

    @Override // defpackage.wzu
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.avatar);
    }

    @Override // defpackage.wzu
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.subtext);
    }

    @Override // defpackage.wzu
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.text);
    }
}
