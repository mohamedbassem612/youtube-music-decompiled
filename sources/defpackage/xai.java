package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xai extends wzv {
    private final adia c;

    public xai(Context context, adhv adhvVar) {
        super(context);
        this.c = new adia(adhvVar, this.b, false);
    }

    @Override // defpackage.wzv, defpackage.adma
    public final void b(admh admhVar) {
        this.c.a();
    }

    @Override // defpackage.wzv
    protected final int d() {
        return R.layout.live_chat_legacy_paid_message;
    }

    @Override // defpackage.wzv
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    @Override // defpackage.wzv
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    @Override // defpackage.wzv
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    @Override // defpackage.wzv
    protected final void h(aqmh aqmhVar) {
        this.c.f(aqmhVar, null);
    }
}
