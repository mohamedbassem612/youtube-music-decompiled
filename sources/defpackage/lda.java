package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lda {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public lda(String str, String str2, Bundle bundle, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static lda b(lcd lcdVar) {
        return new lda(lcdVar.a, lcdVar.c, lcdVar.b.a(), lcdVar.d, lcdVar.e);
    }

    public final lcd a() {
        return new lcd(this.a, new lcc(new Bundle(this.e)), this.b, this.c, this.d);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.e.toString();
    }
}
