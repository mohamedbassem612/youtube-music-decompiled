package j$.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u {
    public static FileAttribute a(java.nio.file.attribute.FileAttribute fileAttribute) {
        FileAttribute qVar;
        if (fileAttribute == null) {
            return null;
        }
        if (d(fileAttribute.value())) {
            qVar = new s(fileAttribute);
        } else {
            if (fileAttribute instanceof r) {
                return ((r) fileAttribute).a;
            }
            qVar = new q(fileAttribute);
        }
        return qVar;
    }

    public static f0 b(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new f0(fileTime.toMillis());
    }

    public static FileTime c(f0 f0Var) {
        long j;
        if (f0Var == null) {
            return null;
        }
        if (TimeUnit.MILLISECONDS != null) {
            j = f0Var.a;
        } else {
            long epochSecond = f0Var.b.getEpochSecond();
            int nano = f0Var.b.getNano();
            long j2 = epochSecond * 1000;
            if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j2 / 1000 == epochSecond) {
                j = ((long) (nano / 1000000)) + j2;
            } else {
                j = epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        return FileTime.fromMillis(j);
    }

    public static boolean d(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (!set.isEmpty()) {
                Object next = set.iterator().next();
                if ((next instanceof p0) || (next instanceof PosixFilePermission)) {
                    return true;
                }
            }
        }
        return false;
    }
}
