package androidx.car.app.model;

import defpackage.yf;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import j$.util.Objects;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        MAX_ZONE_OFFSET_SECONDS = 64800L;
    }

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j, int i, String str) {
        if (j < 0) {
            throw new IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            throw new IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        str.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new DateTimeWithZone(j, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateTimeWithZone) {
            DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
            if (this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName)) {
                return true;
            }
        }
        return false;
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        return "[time since epoch (ms): " + this.mTimeSinceEpochMillis + "( " + new Date(this.mTimeSinceEpochMillis) + ")  zone offset (s): " + this.mZoneOffsetSeconds + ", zone: " + this.mZoneShortName + ']';
    }

    private DateTimeWithZone(long j, int i, String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j, TimeZone timeZone) {
        if (j >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeZone.getClass();
            return create(j, (int) (((long) timeZone.getOffset(j)) / 1000), timeZone.getDisplayName(false, 0));
        }
        throw new IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
