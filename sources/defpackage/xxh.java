package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xxh implements acfw {
    public wjf a;
    private xxf b;
    private Function0 c;
    private final xxg d = new xxg();

    public xxh(xxf xxfVar, Function0 function0) {
        this.b = xxfVar;
        this.c = function0;
    }

    @Override // defpackage.acfw
    public final long a() {
        return this.b.f();
    }

    @Override // defpackage.acfw
    public final long b() {
        return this.b.h();
    }

    @Override // defpackage.acfw
    public final wjf c() {
        return this.a;
    }

    @Override // defpackage.acfw
    public final acjb d() {
        return null;
    }

    @Override // defpackage.acfw
    public final String e() {
        return this.b.p();
    }

    public final void f() {
        this.b = this.d;
        this.c = null;
    }

    @Override // defpackage.acfw
    public final acga g() {
        Function0 function0 = this.c;
        if (function0 != null) {
            return (acga) function0.invoke();
        }
        return null;
    }

    @Override // defpackage.acfw
    public final acig h() {
        return null;
    }
}
