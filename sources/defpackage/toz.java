package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class toz {
    final String a;
    long b;
    boolean c;
    toy d;
    final /* synthetic */ tpb e;

    public toz(tpb tpbVar, String str) {
        this.e = tpbVar;
        this.a = str;
    }

    final File a() {
        return new File(this.e.a, String.valueOf(this.a).concat(".0"));
    }

    final File b() {
        return new File(this.e.a, String.valueOf(this.a).concat(".0.tmp"));
    }
}
