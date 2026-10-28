package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aboe extends tas {
    public final boolean a;
    public String b;
    public String c;
    public final aoqp f;
    public final Throwable g;
    public final String h;
    public final String i;
    public final int j;
    private final int k;

    public aboe(int i, boolean z, int i2, String str, Throwable th, String str2, String str3, aoqp aoqpVar) {
        this.j = i;
        this.a = z;
        this.k = i2;
        this.c = str;
        this.g = th;
        this.h = str2;
        this.i = str3;
        this.f = aoqpVar;
    }

    public final void a(String str, String str2) {
        if (TextUtils.equals(str, this.b)) {
            return;
        }
        this.b = str;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.c = this.c + '\n' + String.format(str2, str);
    }

    public final boolean g() {
        int i = this.k - 1;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return aawb.C(this.j, 3, 2, 5, 6, 7, 13, 14, 11);
        }
        return false;
    }
}
