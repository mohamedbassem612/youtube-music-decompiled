package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzy extends wab {
    private final Context a;
    private final awmd b;
    private final agfr f;

    public vzy(ohp ohpVar, Context context, awmd awmdVar, Optional optional) {
        super(ohpVar, awmdVar);
        this.a = context;
        this.b = awmdVar;
        this.f = aguu.al(new rqw(optional, context, awmdVar, ohpVar, 2));
    }

    @Override // defpackage.waa
    public final byte[] a(String str) throws IOException {
        if (g().containsKey(str)) {
            return agyi.b(this.a.getAssets().open((String) g().get(str)));
        }
        ((zs) this.b.io()).C(4, d(), str);
        throw new IOException("File not found: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.wab, defpackage.waa
    public final long h() {
        return ((Long) this.f.io()).longValue();
    }
}
