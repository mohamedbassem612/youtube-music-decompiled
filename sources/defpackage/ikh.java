package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ikh implements ikj {
    PUBLIC(R.string.playlist_privacy_public, aliz.PRIVACY_PUBLIC, R.string.playlist_privacy_public_detail, 2),
    UNLISTED(R.string.playlist_privacy_unlisted, aliz.PRIVACY_UNLISTED, R.string.playlist_privacy_unlisted_detail, 3),
    PRIVATE(R.string.playlist_privacy_private, aliz.PRIVACY_PRIVATE, R.string.playlist_privacy_private_detail, 1);

    public final aliz d;
    private final int f;
    private final int g;
    private final int h;

    ikh(int i, aliz alizVar, int i2, int i3) {
        this.f = i;
        this.d = alizVar;
        this.g = i2;
        this.h = i3;
    }

    public static ikh d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? UNLISTED : PUBLIC;
        }
        return PRIVATE;
    }

    @Override // defpackage.ikj
    public final aliz a() {
        return this.d;
    }

    @Override // defpackage.ikj
    public final CharSequence b(Context context) {
        return context.getResources().getString(this.g);
    }

    @Override // defpackage.ikj
    public final CharSequence c(Context context) {
        return context.getResources().getString(this.f);
    }

    @Override // defpackage.ikj
    public final int e() {
        return this.h;
    }
}
