package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjf implements kje {
    private final awmd a;

    public kjf(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.kje
    public final kii a(Context context, String str) {
        agev agevVar = (agev) ((aupo) this.a).b;
        if (!agevVar.g()) {
            return new kii(context, "CLIENT_LOGGING_PROD", str);
        }
        List list = kii.m;
        kif kifVar = new kif(context, "CLIENT_LOGGING_PROD");
        kij kijVar = (kij) agevVar.f();
        if (kijVar != null) {
            kifVar.c = kijVar;
        }
        if (str != null) {
            kifVar.e = str;
        }
        return kifVar.b();
    }
}
