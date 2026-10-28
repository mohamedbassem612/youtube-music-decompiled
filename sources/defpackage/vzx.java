package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vzx extends wab {
    public final ahex a;
    public final awmd b;
    private final awmd f;

    public vzx(ohp ohpVar, ahex ahexVar, awmd awmdVar, awmd awmdVar2) {
        super(ohpVar, awmdVar2);
        this.a = ahexVar;
        this.f = awmdVar;
        this.b = awmdVar2;
    }

    @Override // defpackage.waa
    public final byte[] a(String str) {
        return (byte[]) b(str);
    }

    public final Object b(String str) throws IOException {
        if (!g().containsKey(str)) {
            ((zs) this.b.io()).C(4, d(), str);
            throw new IOException("File not found: ".concat(String.valueOf(str)));
        }
        try {
            return ((ayq) this.f.io()).X(Uri.parse((String) g().get(str)), new qqp(4));
        } catch (Exception e) {
            ((zs) this.b.io()).C(5, d(), str);
            throw new IOException(e);
        }
    }
}
