package androidx.car.app.hardware.common;

import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarValue {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    public static final int STATUS_UNIMPLEMENTED = 2;
    public static final int STATUS_UNKNOWN = 0;
    private final List mCarZones;
    private final int mStatus;
    private final long mTimestampMillis;
    private final Object mValue;
    public static final CarValue UNIMPLEMENTED_INTEGER = unimplemented();
    public static final CarValue UNKNOWN_INTEGER = unknown();
    public static final CarValue UNKNOWN_BOOLEAN = unknown();
    public static final CarValue UNKNOWN_FLOAT = unknown();
    public static final CarValue UNKNOWN_STRING = unknown();
    public static final CarValue UNIMPLEMENTED_FLOAT_LIST = unimplemented();
    public static final CarValue UNKNOWN_FLOAT_LIST = unknown();
    public static final CarValue UNKNOWN_INTEGER_LIST = unknown();
    public static final CarValue UNKNOWN_INTEGER_ARRAY = unknown();

    private CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0L;
        this.mStatus = 0;
        this.mCarZones = Collections.EMPTY_LIST;
    }

    private static CarValue unimplemented() {
        return new CarValue(null, 0L, 2);
    }

    private static CarValue unknown() {
        return new CarValue(null, 0L, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarValue) {
            CarValue carValue = (CarValue) obj;
            if (Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && Objects.equals(this.mCarZones, carValue.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List getCarZones() {
        return this.mStatus == 2 ? Collections.EMPTY_LIST : this.mCarZones;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTimestampMillis() {
        return this.mTimestampMillis;
    }

    public Object getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return Objects.hash(this.mValue, Long.valueOf(this.mTimestampMillis), Integer.valueOf(this.mStatus), this.mCarZones);
    }

    public String toString() {
        return "[value: " + this.mValue + ", timestamp: " + this.mTimestampMillis + ", Status: " + this.mStatus + ", CarZones: " + this.mCarZones + ']';
    }

    public CarValue(Object obj, long j, int i, List list) {
        this.mValue = obj;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = list;
    }

    public CarValue(Object obj, long j, int i) {
        this.mValue = obj;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = Collections.singletonList(CarZone.CAR_ZONE_GLOBAL);
    }
}
