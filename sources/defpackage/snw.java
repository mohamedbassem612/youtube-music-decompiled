package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snw implements abrr {
    private final awmd b;

    public snw(awmd awmdVar) {
        this.b = awmdVar;
    }

    @Override // defpackage.abrr
    public final int a() {
        return !TextUtils.isEmpty(((snv) this.b.io()).b.u()) ? R.layout.ad_notification : R.layout.ad_notification_no_title;
    }

    @Override // defpackage.abrr
    public final int b() {
        return R.id.byline;
    }

    @Override // defpackage.abrr
    public final int c() {
        return R.id.title;
    }

    @Override // defpackage.abrr
    public final boolean d() {
        return true;
    }
}
