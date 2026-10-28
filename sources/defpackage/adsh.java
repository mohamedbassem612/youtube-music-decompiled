package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class adsh extends ato {
    final /* synthetic */ bll a;

    public adsh(bll bllVar) {
        this.a = bllVar;
    }

    @Override // defpackage.ato
    public final void h() {
        this.a.i(this);
    }

    @Override // defpackage.ato
    public final void i() {
        Log.w("UnicodeEmojiUtils", "FontRequest for emoji failed.");
    }
}
