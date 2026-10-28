package defpackage;

import java.io.IOException;
import org.chromium.base.Callback2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axpg implements axqv {
    protected int memoizedHashCode = 0;

    private final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int b(axre axreVar) {
        throw null;
    }

    @Override // defpackage.axqv
    public final axpo c() {
        try {
            int iH = h();
            axpo axpoVar = axpo.d;
            byte[] bArr = new byte[iH];
            axpk axpkVar = new axpk(bArr, iH);
            s(axpkVar);
            return Callback2.JniHelper.a(bArr, axpkVar);
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public final byte[] d() {
        try {
            int iH = h();
            byte[] bArr = new byte[iH];
            axpk axpkVar = new axpk(bArr, iH);
            s(axpkVar);
            axpkVar.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }
}
