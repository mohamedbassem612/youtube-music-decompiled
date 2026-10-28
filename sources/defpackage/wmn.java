package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmn {
    public final Iterable a;
    public final apkt b;
    public final Iterable c;
    public volatile albe d;
    private final awqg e;
    private final Function0 f;

    public wmn(Iterable iterable, apkt apktVar, albe albeVar, Iterable iterable2, awqg awqgVar, Function0 function0) {
        this.a = iterable;
        this.b = apktVar;
        this.c = iterable2;
        this.e = awqgVar;
        this.f = function0;
        this.d = albeVar;
    }

    public final albe a() {
        awqg awqgVar;
        albe albeVar = this.d;
        if (albeVar != null) {
            return albeVar;
        }
        Iterable iterable = this.c;
        if (iterable == null || (awqgVar = this.e) == null) {
            return null;
        }
        albe albeVar2 = (albe) awqgVar.invoke(iterable);
        this.d = albeVar2;
        return albeVar2;
    }

    public final void b() {
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
