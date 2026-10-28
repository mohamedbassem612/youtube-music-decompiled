package app.rive.runtime.kotlin.core;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RiveEvent extends NativeObject {
    public static final int $stable = NativeObject.$stable;
    private final float delay;

    public RiveEvent(long j, float f) {
        super(j);
        this.delay = f;
    }

    private final native HashMap cppData(long j);

    private final native String cppName(long j);

    private final native HashMap cppProperties(long j);

    private final native short cppType(long j);

    private final short getTypeCode() {
        return cppType(getCppPointer());
    }

    public final HashMap getData() {
        return cppData(getCppPointer());
    }

    public final float getDelay() {
        return this.delay;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final HashMap getProperties() {
        return cppProperties(getCppPointer());
    }

    public final EventType getType() {
        EventType eventTypeFromInt = EventType.Companion.fromInt(getTypeCode());
        return eventTypeFromInt == null ? EventType.GeneralEvent : eventTypeFromInt;
    }

    public String toString() {
        HashMap data = getData();
        Objects.toString(data);
        return "RiveEvent ".concat(String.valueOf(data));
    }
}
