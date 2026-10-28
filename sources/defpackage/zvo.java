package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zvo {
    public final zvn a;
    public final zvm b;
    public final String c;
    public final Throwable d;
    final Optional e;
    final Function f;
    public final boolean g;

    public zvo(zvn zvnVar, zvm zvmVar, String str) {
        this.a = zvnVar;
        this.b = zvmVar;
        this.c = str;
        this.d = null;
        this.e = Optional.empty();
        this.f = new yom(17);
        this.g = false;
    }

    public zvo(zvn zvnVar, zvm zvmVar, String str, Throwable th, Optional optional, Function function, boolean z) {
        this.a = zvnVar;
        this.b = zvmVar;
        this.c = str;
        this.d = th;
        this.e = optional;
        this.f = function;
        this.g = z;
    }
}
