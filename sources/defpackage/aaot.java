package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aaot implements aheh {
    private final aalv a;
    private final String b;
    private final int c;

    public aaot(aalv aalvVar, String str, int i) {
        this.b = str;
        this.a = aalvVar;
        this.c = i;
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        String str = this.b;
        this.a.f(TextUtils.isEmpty(str) ? agdf.a : agev.i(str), this.c, 2);
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
    }
}
