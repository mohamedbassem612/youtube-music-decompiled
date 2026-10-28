package defpackage;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cac extends bzr {
    public static final /* synthetic */ int g = 0;
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    public static cac c(File file, long j2, long j3, bzw bzwVar) {
        File file2;
        long j4;
        String strGroup;
        File fileI;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                strGroup = bwp.T(strGroup2);
            } else {
                matcher = h.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i2 = bzwVar.b(strGroup).a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j5 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileI = rpi.I(parentFile, i2, j5, Long.parseLong(strGroup4));
                if (!file.renameTo(fileI)) {
                    fileI = null;
                }
            } else {
                fileI = null;
            }
            if (fileI == null) {
                return null;
            }
            file2 = fileI;
            name = fileI.getName();
        }
        Matcher matcher2 = j.matcher(name);
        if (!matcher2.matches()) {
            return null;
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        String str = (String) bzwVar.b.get(Integer.parseInt(strGroup5));
        if (str == null) {
            return null;
        }
        long length = j2 == -1 ? file2.length() : j2;
        if (length == 0) {
            return null;
        }
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        long j6 = Long.parseLong(strGroup6);
        if (j3 == -9223372036854775807L) {
            String strGroup7 = matcher2.group(3);
            strGroup7.getClass();
            j4 = Long.parseLong(strGroup7);
        } else {
            j4 = j3;
        }
        return new cac(str, j6, length, j4, file2);
    }
}
