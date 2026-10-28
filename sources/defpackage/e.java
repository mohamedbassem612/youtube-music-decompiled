package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class e implements PrivilegedAction {
    final /* synthetic */ Class a;
    final /* synthetic */ String b = "/android/icumessageformat/ICUConfig.properties";

    public e(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}
