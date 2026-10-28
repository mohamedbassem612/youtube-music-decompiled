package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhj {
    public static final Pattern a = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern b = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern c = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static void a(File file) {
        if (new File(file, "cached_content_index.exi").exists()) {
            return;
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.getFreeSpace();
                return;
            }
            return;
        }
        File[] fileArrE = e(file.listFiles(new zhh()));
        HashMap map = new HashMap();
        for (File file2 : fileArrE) {
            String strC = c(b(file2.getName()));
            if (strC != null) {
                map.put(strC, Long.valueOf(map.containsKey(strC) ? ((Long) map.get(strC)).longValue() + file2.length() : file2.length()));
            }
        }
        long jMax = Math.max(65536L, (((long) (map.size() * 48)) + 32) << 2);
        long freeSpace = file.getFreeSpace();
        if (freeSpace < jMax) {
            File[] fileArrE2 = e(file.listFiles(new zhi(0)));
            long j = jMax - freeSpace;
            int i = 0;
            while (true) {
                long j2 = 0;
                if (i >= fileArrE2.length || j <= 0) {
                    break;
                }
                long length = fileArrE2[i].length();
                if (true == fileArrE2[i].delete()) {
                    j2 = length;
                }
                j -= j2;
                i++;
            }
            for (String strD = d(map); strD != null && j > 0; strD = d(map)) {
                long j3 = 0;
                for (File file3 : fileArrE) {
                    if (strD.equals(c(b(file3.getName())))) {
                        long length2 = file3.length();
                        if (true != file3.delete()) {
                            length2 = 0;
                        }
                        j3 += length2;
                    }
                }
                j -= j3;
                map.remove(strD);
            }
        }
    }

    private static String b(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        Matcher matcher2 = b.matcher(str);
        if (matcher2.matches()) {
            return bwp.T(matcher2.group(1));
        }
        return null;
    }

    private static String c(String str) {
        if (str != null) {
            return str.split("\\.")[0];
        }
        return null;
    }

    private static String d(Map map) {
        long jLongValue = Long.MAX_VALUE;
        String str = null;
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() < jLongValue) {
                str = (String) entry.getKey();
                jLongValue = ((Long) entry.getValue()).longValue();
            }
        }
        return str;
    }

    private static File[] e(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }
}
