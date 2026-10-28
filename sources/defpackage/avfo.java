package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avfo implements avba {
    private final /* synthetic */ int $cid;

    public avfo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avba
    public final /* synthetic */ Object a(String str) {
        if (this.$cid != 0) {
            return str;
        }
        ahno.G(str.length() > 0, "empty timeout");
        ahno.G(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // defpackage.avba
    public final /* synthetic */ String b(Object obj) {
        if (this.$cid != 0) {
            return (String) obj;
        }
        long jMax = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            StringBuilder sb = new StringBuilder();
            sb.append(jMax);
            sb.append('n');
            return sb.toString();
        }
        if (jMax < 100000000000L) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jMax / 1000);
            sb2.append('u');
            return sb2.toString();
        }
        if (jMax < 100000000000000L) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(jMax / 1000000);
            sb3.append('m');
            return sb3.toString();
        }
        if (jMax < 100000000000000000L) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(jMax / 1000000000);
            sb4.append('S');
            return sb4.toString();
        }
        if (jMax < 6000000000000000000L) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(jMax / 60000000000L);
            sb5.append('M');
            return sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(jMax / 3600000000000L);
        sb6.append('H');
        return sb6.toString();
    }
}
