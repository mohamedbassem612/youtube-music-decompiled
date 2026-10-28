package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class c implements PrivilegedAction {
    final /* synthetic */ String a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}
