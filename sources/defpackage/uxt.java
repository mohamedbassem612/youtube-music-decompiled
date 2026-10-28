package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import app.rive.semantics.SemanticState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager");
    public File b;
    public final Context c;
    public final tgg d;
    public final Set e;
    public final Object f = new Object();
    public final List g = new ArrayList();
    public final uyv h;
    public final vxz i;
    private volatile boolean j;

    public uxt(Context context, tgg tggVar, uyv uyvVar, vxz vxzVar) {
        context.getClass();
        this.c = context;
        tggVar.getClass();
        this.d = tggVar;
        this.h = uyvVar;
        this.i = vxzVar;
        this.e = new HashSet();
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[SemanticState.ReadOnly];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public final void b() {
        taq.c();
        if (this.j) {
            return;
        }
        Context context = this.c;
        taq.c();
        File file = new File(context.getFilesDir(), vcb.a);
        if (!file.exists()) {
            file.mkdirs();
        }
        AssetManager assets = context.getAssets();
        try {
            String[] list = assets.list("kazoo");
            if (list != null && (list.length) != 0) {
                for (String str : list) {
                    String path = new File("kazoo", str).getPath();
                    File file2 = new File(file, str);
                    if (!file2.exists()) {
                        try {
                            file2.createNewFile();
                            InputStream inputStreamOpen = assets.open(path);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            a(inputStreamOpen, fileOutputStream);
                            inputStreamOpen.close();
                            fileOutputStream.close();
                        } catch (IOException | SecurityException e) {
                            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "loadAppAssets", (char) 262, "VideoEffectsFileManager.java")).w("Error saving asset: %s", str);
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
        this.b = file;
        synchronized (this.f) {
            try {
                File file3 = this.b;
                file3.getClass();
                File[] fileArrListFiles = file3.listFiles();
                if (fileArrListFiles != null) {
                    for (File file4 : fileArrListFiles) {
                        if (file4.isFile()) {
                            this.g.add(file4.getName());
                        }
                    }
                }
            } catch (SecurityException e2) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "initIfNeeded", 225, "VideoEffectsFileManager.java")).t("Error finding built-in assets: ");
            }
        }
        this.d.d();
        this.j = true;
    }
}
