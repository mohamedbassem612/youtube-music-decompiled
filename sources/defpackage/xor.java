package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xor implements avme {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xor(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.avme
    public final void a(awgm awgmVar) {
        int i = this.$cid;
        Object obj = this.b;
        if (i == 0) {
            Object obj2 = this.a;
            ((xot) obj2).h.execute(afwl.i(new yag(obj2, obj, (Object) awgmVar, 1, (byte[]) null)));
            return;
        }
        Object obj3 = this.a;
        try {
            InputStream inputStreamB = qol.b((Context) obj3, (Uri) obj);
            try {
                if (inputStreamB == null) {
                    if (awgmVar.f()) {
                        return;
                    }
                    awgmVar.a(new IOException(a.co(obj, "Failed to open input stream for content URI: ")));
                    return;
                }
                File fileCreateTempFile = File.createTempFile("rich_content_", null, ((Context) obj3).getCacheDir());
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            byte[] bArr = new byte[SemanticState.Multiline];
                            while (true) {
                                int i2 = inputStreamB.read(bArr);
                                if (i2 == -1) {
                                    if (!awgmVar.f()) {
                                        awgmVar.b(Uri.fromFile(fileCreateTempFile));
                                        break;
                                    } else {
                                        fileCreateTempFile.delete();
                                        break;
                                    }
                                }
                                if (awgmVar.f()) {
                                    fileCreateTempFile.delete();
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                            fileOutputStream.close();
                            inputStreamB.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException e) {
                        fileCreateTempFile.delete();
                        throw e;
                    }
                } catch (SecurityException e2) {
                    fileCreateTempFile.delete();
                    throw e2;
                }
            } catch (Throwable th3) {
                if (inputStreamB == null) {
                    throw th3;
                }
                try {
                    inputStreamB.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException e3) {
            if (awgmVar.f()) {
            }
            awgmVar.a(e3);
        }
        if (awgmVar.f()) {
            awgmVar.a(e3);
        }
    }
}
