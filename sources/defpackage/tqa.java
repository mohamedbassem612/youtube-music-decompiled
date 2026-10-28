package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqa {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/sdcard/DefaultSdCardSlotsManager");
    protected final Context b;
    public final StorageManager c;
    public Map d;
    public final Object e = new Object();

    public tqa(Context context) {
        context.getClass();
        this.b = context;
        this.c = (StorageManager) context.getSystemService("storage");
        this.d = null;
    }

    public static final String i(String str, int i) {
        return a.cg(i, str, "id:", ";t:");
    }

    private static boolean j(File file) {
        return Environment.getStorageState(file).equals("mounted");
    }

    public final File a(String str) {
        for (File file : d()) {
            if (c(file).equals(str)) {
                return file;
            }
        }
        return null;
    }

    public final File b() {
        List listD = d();
        if (listD.isEmpty()) {
            return null;
        }
        return (File) listD.get(0);
    }

    public final String c(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public final List d() {
        if (!h()) {
            return agpi.a;
        }
        try {
            ArrayList arrayList = new ArrayList();
            File[] externalFilesDirs = this.b.getExternalFilesDirs(null);
            for (int i = 1; i < externalFilesDirs.length; i++) {
                File file = externalFilesDirs[i];
                if (file != null) {
                    arrayList.add(file);
                }
            }
            return agke.n(arrayList);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
            return agpi.a;
        }
    }

    public final Map e() {
        HashMap map = new HashMap();
        for (File file : d()) {
            if (file != null) {
                map.put(c(file), Boolean.valueOf(j(file)));
            }
        }
        return agkj.h(map);
    }

    public final boolean f() {
        File fileB = b();
        return fileB != null && j(fileB);
    }

    public final boolean g(String str) {
        Boolean bool = (Boolean) e().get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean h() {
        return this.b.getExternalFilesDirs(null).length > 1;
    }
}
