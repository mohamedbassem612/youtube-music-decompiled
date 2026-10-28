package defpackage;

import android.os.Bundle;
import android.os.Messenger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhv extends vy {
    final /* synthetic */ Messenger a;
    final /* synthetic */ int b;
    final /* synthetic */ dhz c;

    public dhv(dhz dhzVar, Messenger messenger, int i) {
        this.c = dhzVar;
        this.a = messenger;
        this.b = i;
    }

    @Override // defpackage.vy
    public final void l(String str, Bundle bundle) {
        dhz dhzVar = this.c;
        Messenger messenger = this.a;
        if (dhzVar.f(messenger) >= 0) {
            if (str == null) {
                dic.f(messenger, 4, this.b, 0, bundle, null);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("error", str);
            dic.f(messenger, 4, this.b, 0, bundle, bundle2);
        }
    }

    @Override // defpackage.vy
    public final void m(Bundle bundle) {
        dhz dhzVar = this.c;
        Messenger messenger = this.a;
        if (dhzVar.f(messenger) >= 0) {
            dic.f(messenger, 3, this.b, 0, bundle, null);
        }
    }
}
