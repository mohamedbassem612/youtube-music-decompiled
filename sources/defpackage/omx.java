package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omx implements qpn {
    private final Uri a;

    public omx(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.qpn
    public final /* bridge */ /* synthetic */ Object a(rrq rrqVar) throws IOException {
        Object obj = rrqVar.e;
        try {
            qqs qqsVar = new qqs();
            qqsVar.b();
            ZipInputStream zipInputStream = new ZipInputStream(qqsVar.a(rrqVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    String name = nextEntry.getName();
                    if (name.contains("..")) {
                        for (File file = new File(name); file != null; file = file.getParentFile()) {
                            if (file.getName().equals("..")) {
                                throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                            }
                        }
                    }
                    Uri uriBuild = this.a.buildUpon().appendPath(name).build();
                    if (nextEntry.isDirectory()) {
                        ((ayq) obj).Y(uriBuild);
                    } else {
                        OutputStream outputStream = (OutputStream) ((ayq) obj).X(uriBuild, new qqu());
                        try {
                            agyi.a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
                ((ayq) obj).ae(this.a);
                throw e;
            }
        } catch (IOException e) {
            ((ayq) obj).ae(this.a);
            throw e;
        }
    }
}
