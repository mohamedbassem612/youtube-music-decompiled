package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lek implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ Bundle e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ String i;
    final /* synthetic */ ler j;

    public lek(ler lerVar, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str3;
        this.j = lerVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.P(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
