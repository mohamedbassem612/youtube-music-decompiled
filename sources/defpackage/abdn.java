package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abdn implements abdp {
    public final xhy a;
    public final ajwo b;
    private final wjf c;
    private final String d;

    public abdn(xhy xhyVar, wjf wjfVar, ajwo ajwoVar, String str) {
        this.a = xhyVar;
        this.c = wjfVar;
        this.b = ajwoVar;
        this.d = str;
    }

    @Override // defpackage.abdp
    public final /* bridge */ /* synthetic */ abdq a(abdi abdiVar) {
        String str = this.d;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        xhy xhyVar = this.a;
        return new abdo(this, zIsEmpty ? abdiVar.c(xhyVar, this.c, abdiVar.e) : abdiVar.c(xhyVar, this.c, str), this.b);
    }

    @Override // defpackage.abdp
    public final abdy b() {
        return abdy.c;
    }
}
