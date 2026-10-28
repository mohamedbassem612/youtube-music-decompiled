package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/CacheDirModule");

    public static File a(String str, File file) {
        if (file == null || file.isDirectory()) {
            return file;
        }
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/common/CacheDirModule", "validateDir", 93, "CacheDirModule.java")).B("%s: %s is not a directory or does not exist.", str, file.getPath());
        return null;
    }
}
