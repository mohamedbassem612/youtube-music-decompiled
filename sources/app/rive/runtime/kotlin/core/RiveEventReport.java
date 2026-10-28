package app.rive.runtime.kotlin.core;

import defpackage.awmj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveEventReport extends NativeObject {
    public static final int $stable = NativeObject.$stable;
    private final RiveEvent event;
    private final long unsafeCppPointer;

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OpenURLEvent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.GeneralEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiveEventReport(long j, float f) {
        super(j);
        this.unsafeCppPointer = j;
        this.event = convertEvent(new RiveEvent(j, f));
    }

    private final RiveEvent convertEvent(RiveEvent riveEvent) {
        EventType type = riveEvent.getType();
        EventType.Companion companion = EventType.Companion;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return new RiveOpenURLEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        if (iOrdinal == 1) {
            return new RiveGeneralEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        throw new awmj();
    }

    public final RiveEvent getEvent() {
        return this.event;
    }

    public final long getUnsafeCppPointer() {
        return this.unsafeCppPointer;
    }
}
