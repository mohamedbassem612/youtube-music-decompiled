package defpackage;

import app.rive.semantics.SemanticState;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaph implements zyh {
    private final tzs a;
    private final vwt b;

    public aaph(tzs tzsVar, abmt abmtVar) {
        tzsVar.getClass();
        this.a = tzsVar;
        boolean zBz = abmtVar.bz();
        dov dovVar = new dov((short[]) null, (byte[]) null);
        aawb.am(dovVar, zBz, abmtVar);
        aawb.an(dovVar, zBz, abmtVar);
        this.b = dovVar.ax();
    }

    private static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [sxu] */
    @Override // defpackage.zyh
    public final /* synthetic */ void a(Object obj, sxu sxuVar) throws Throwable {
        acap acapVar = (acap) obj;
        taq.c();
        acapVar.getClass();
        String str = acapVar.a.j;
        str.getClass();
        File file = new File(str);
        if (!file.exists()) {
            sxuVar.iT(acapVar, new IOException());
            return;
        }
        ?? r0 = 0;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file), SemanticState.Obscured);
                try {
                    tzs tzsVar = this.a;
                    sxuVar.b(acapVar, (acbn) ((zwz) tzsVar.a(bufferedInputStream2, this.b)).a());
                    b(bufferedInputStream2);
                    r0 = tzsVar;
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    sxuVar.iT(acapVar, e);
                    b(bufferedInputStream);
                    r0 = bufferedInputStream;
                } catch (Throwable th) {
                    th = th;
                    r0 = bufferedInputStream2;
                    b(r0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
