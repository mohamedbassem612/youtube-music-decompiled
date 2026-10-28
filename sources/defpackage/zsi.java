package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zsi implements zsl {
    protected static final void h(tgo tgoVar) throws tgp {
        int i = tgoVar.a;
        if (i >= 300) {
            tgp tgpVar = new tgp(i, tgoVar.b);
            try {
                tgn tgnVar = tgoVar.d;
                if (tgnVar == null) {
                    throw tgpVar;
                }
                tgnVar.g();
                throw tgpVar;
            } catch (IOException e) {
                tgpVar.addSuppressed(e);
                throw tgpVar;
            }
        }
    }

    @Override // defpackage.zsl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object d(tgo tgoVar) throws tgp {
        h(tgoVar);
        return f(tgoVar.d);
    }

    protected Object f(tgn tgnVar) throws IOException {
        if (tgnVar != null) {
            return g(tgnVar.c());
        }
        throw new IOException("Empty response body");
    }

    protected Object g(InputStream inputStream) {
        try {
            inputStream.close();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
