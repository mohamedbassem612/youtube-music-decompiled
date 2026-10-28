package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfz {
    private static final String[] a = {"", "-journal", "-shm", "-wal"};
    private final awut b;
    private final pls c;
    private final pwf d;
    private final agsn e;
    private final Object f;

    public pfz(awut awutVar, pls plsVar, pwf pwfVar) {
        plsVar.getClass();
        pwfVar.getClass();
        this.b = awutVar;
        this.c = plsVar;
        this.d = pwfVar;
        this.e = new agsn(agtu.d("GnpSdk"));
        this.f = new Object();
    }

    public static final String d(Context context) {
        String absolutePath = new File(context.getNoBackupFilesDir(), "databases").getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0212, code lost:
    
        if (r9 == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfz.a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    public final void b(File file, boolean z) {
        String path = file.getPath();
        path.getClass();
        for (String str : z ? a : new String[]{""}) {
            c(new File(path.concat(String.valueOf(str))));
            c(new File(path + str + ".tmp"));
        }
    }

    public final void c(File file) {
        try {
            if (!file.exists() || file.delete()) {
                return;
            }
            ((agsj) this.e.c()).w("Failed to delete file: %s", file);
        } catch (SecurityException e) {
            ((agsj) ((agsj) this.e.c()).j(e)).w("Security exception while deleting file: %s", file);
        }
    }
}
