package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iki implements ikj {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/playlist/privacy/PlaylistPrivacyDropdownItem");
    private final CharSequence b;
    private final aliz c;
    private final CharSequence d;
    private final int e;

    public iki(CharSequence charSequence, aliz alizVar, CharSequence charSequence2, int i) {
        this.b = charSequence;
        this.c = alizVar;
        this.d = charSequence2;
        this.e = i;
    }

    @Override // defpackage.ikj
    public final aliz a() {
        return this.c;
    }

    @Override // defpackage.ikj
    public final CharSequence b(Context context) {
        return this.d;
    }

    @Override // defpackage.ikj
    public final CharSequence c(Context context) {
        return this.b;
    }

    @Override // defpackage.ikj
    public final int e() {
        return this.e;
    }
}
