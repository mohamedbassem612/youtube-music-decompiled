package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jtd extends jsp {
    public static final /* synthetic */ int g = 0;
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static jtd d(File file, long j2, axfd axfdVar, xeu xeuVar) {
        File file2;
        long length;
        String strGroup;
        File fileI;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                strGroup = bwp.T(matcher.group(1));
                if (strGroup != null) {
                    fileI = rpi.I(file.getParentFile(), axfdVar.Z(strGroup).a, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
                    if (!file.renameTo(fileI)) {
                    }
                }
                if (fileI == null) {
                    return null;
                }
                file2 = fileI;
                name = fileI.getName();
            } else {
                matcher = h.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    fileI = rpi.I(file.getParentFile(), axfdVar.Z(strGroup).a, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
                    if (!file.renameTo(fileI)) {
                    }
                }
                if (fileI == null) {
                    return null;
                }
                file2 = fileI;
                name = fileI.getName();
            }
            fileI = null;
            if (fileI == null) {
                return null;
            }
            file2 = fileI;
            name = fileI.getName();
        }
        Matcher matcher2 = j.matcher(name);
        if (!matcher2.matches()) {
            hna.ad(xeuVar, "createCacheEntry Invalid cache file name: ".concat(String.valueOf(name)), null);
            return null;
        }
        String str = (String) ((SparseArray) axfdVar.e).get(Integer.parseInt(matcher2.group(1)));
        if (str == null) {
            hna.ad(xeuVar, "createCacheEntry key generated for id is null for file ".concat(String.valueOf(name)), null);
            return null;
        }
        if (j2 == -1) {
            try {
                length = file2.length();
            } catch (Exception e) {
                hna.ad(xeuVar, "Exception error in creating cache entry unable to read file length for file ".concat(String.valueOf(file2.getAbsolutePath())), e);
                return null;
            }
        } else {
            length = j2;
        }
        if (length != 0) {
            return new jtd(str, Long.parseLong(matcher2.group(2)), length, Long.parseLong(matcher2.group(3)), file2);
        }
        hna.ad(xeuVar, "createCacheEntry: file length = 0", null);
        return null;
    }
}
