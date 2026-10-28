package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbp implements zap {
    private static final Pattern c = Pattern.compile("(\\d+)(?:\\(r=(\\d+)\\))?,");
    public final long a;
    public final long[] b;
    private final TreeMap d = new TreeMap();

    public zbp(int[] iArr) {
        this.b = new long[iArr.length];
        long micros = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < 0) {
                throw new IllegalArgumentException(a.bQ(i2, i, "chunk.", ";durationMs."));
            }
            this.b[i] = micros;
            this.d.put(Long.valueOf(micros), Integer.valueOf(i));
            micros += TimeUnit.MILLISECONDS.toMicros(iArr[i]);
        }
        this.a = micros;
    }

    static zbp c(ywx ywxVar) throws bsz {
        int i;
        Integer numB = ywxVar.b("Segment-Count");
        if (numB == null) {
            throw new bsz("Key Segment-Count is missing from OTF EmbeddedMetadata", null, true, 1);
        }
        if (numB.intValue() <= 0) {
            throw new bsz(a.bV(numB, "Segment-Count equals ", " is invalid."), null, true, 1);
        }
        int iIntValue = numB.intValue() + 1;
        int[] iArr = new int[iIntValue];
        String strD = ywxVar.d("Segment-Durations-Ms");
        if (strD == null) {
            throw new bsz("Key Segment-Durations-Ms is missing from OTF EmbeddedMetadata", null, true, 1);
        }
        Matcher matcher = c.matcher(strD);
        int i2 = 1;
        while (matcher.find()) {
            try {
                int i3 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                int i4 = 0;
                if (strGroup != null) {
                    i = Integer.parseInt(strGroup);
                    if (i <= 0) {
                        throw new bsz("Invalid repeated segment " + matcher.group(0), null, true, 1);
                    }
                } else {
                    i = 0;
                }
                while (i4 <= i) {
                    if (i2 >= iIntValue) {
                        throw new bsz(a.bV(numB, "Expected ", " segments, but found more in the list"), null, true, 1);
                    }
                    iArr[i2] = i3;
                    i4++;
                    i2++;
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                throw new bsz(null, e, true, 4);
            }
        }
        int i5 = i2 - 1;
        if (i5 >= numB.intValue()) {
            try {
                return new zbp(iArr);
            } catch (IllegalArgumentException e2) {
                throw new bsz(null, e2, true, 4);
            }
        }
        throw new bsz("Expected " + numB + " segments, but only found " + i5 + " segments in list", null, true, 1);
    }

    final long a(long j) {
        if (j >= 0) {
            long[] jArr = this.b;
            if (j < jArr.length) {
                return jArr[(int) j];
            }
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbp) {
            return Arrays.equals(this.b, ((zbp) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // defpackage.zap
    public final long jE(long j) {
        Map.Entry entryFloorEntry;
        if (j < 0 || j > this.a || (entryFloorEntry = this.d.floorEntry(Long.valueOf(j))) == null) {
            return -1L;
        }
        return ((Integer) entryFloorEntry.getValue()).intValue();
    }

    public final String toString() {
        return String.format(Locale.US, "OtfManifest (numChunks = %d, duration = %.1f sec)", Integer.valueOf(this.b.length), Double.valueOf(this.a / 1000000.0d));
    }
}
