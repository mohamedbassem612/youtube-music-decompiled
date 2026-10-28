package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sfx implements zzi {
    private final spr a;

    public sfx(spr sprVar) {
        this.a = sprVar;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) sfz.a.get(str);
        if (num == null || num.intValue() != 61) {
            return null;
        }
        return this.a.g(uri.getQueryParameter("ai"));
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sfx";
    }
}
