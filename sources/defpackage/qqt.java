package defpackage;

import android.net.Uri;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqt implements qpn {
    public boolean a;

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: IOException -> 0x004f, TRY_ENTER, TryCatch #1 {IOException -> 0x004f, blocks: (B:3:0x0008, B:5:0x000e, B:18:0x0047, B:14:0x002f, B:15:0x0037, B:17:0x003d, B:19:0x004b), top: B:27:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: IOException -> 0x004f, LOOP:0: B:15:0x0037->B:17:0x003d, LOOP_END, TryCatch #1 {IOException -> 0x004f, blocks: (B:3:0x0008, B:5:0x000e, B:18:0x0047, B:14:0x002f, B:15:0x0037, B:17:0x003d, B:19:0x004b), top: B:27:0x0008 }] */
    private final void b(ayq ayqVar, Uri uri, List list) {
        Iterator it;
        qqr qqrVar = new qqr();
        qqrVar.b();
        try {
            if (!ayqVar.ad(uri)) {
                ayqVar.aa(uri);
                return;
            }
            if (this.a) {
                try {
                    File file = (File) ayqVar.X(uri, qqrVar);
                    if (file == null || !file.exists() || (Os.lstat(file.getAbsolutePath()).st_mode & OsConstants.S_IFLNK) == 0) {
                        it = ayqVar.W(uri).iterator();
                        while (it.hasNext()) {
                            b(ayqVar, (Uri) it.next(), list);
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                it = ayqVar.W(uri).iterator();
                while (it.hasNext()) {
                    b(ayqVar, (Uri) it.next(), list);
                }
            }
            ayqVar.Z(uri);
        } catch (IOException e) {
            list.add(e);
        }
    }

    @Override // defpackage.qpn
    public final /* bridge */ /* synthetic */ Object a(rrq rrqVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        b((ayq) rrqVar.e, (Uri) rrqVar.d, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        IOException iOException = new IOException("Failed to delete one or more files");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iOException.addSuppressed((IOException) it.next());
        }
        throw iOException;
    }
}
