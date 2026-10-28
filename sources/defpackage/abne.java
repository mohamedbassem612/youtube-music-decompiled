package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abne extends abnf {
    public static /* synthetic */ ajwo h(Object obj) {
        ajwo ajwoVar = ((apxn) obj).c;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.abnf
    public final int a(Object obj) {
        return abnn.a(h(obj));
    }

    @Override // defpackage.abnf
    public final jrk b(Object obj) {
        return abnn.b(h(obj));
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return apxn.b;
    }

    @Override // defpackage.abnf
    public final String d(Object obj) {
        return abnn.e(h(obj));
    }

    @Override // defpackage.abnf
    public final String e(Object obj) {
        return abnn.g(h(obj));
    }

    @Override // defpackage.abnf
    public final boolean f(Object obj, Object obj2) {
        return Objects.equals(obj, obj2) || abnn.j(h(obj), h(obj2));
    }

    @Override // defpackage.abnf, defpackage.abnm
    public final ajwo g(ajwo ajwoVar) {
        return abnn.d(h(k(ajwoVar)));
    }
}
