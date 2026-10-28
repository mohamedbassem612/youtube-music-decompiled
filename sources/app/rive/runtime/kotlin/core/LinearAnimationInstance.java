package app.rive.runtime.kotlin.core;

import defpackage.awmj;
import defpackage.awqx;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LinearAnimationInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private float mix;

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAnimationInstance(long j, ReentrantLock reentrantLock, float f) {
        super(j);
        reentrantLock.getClass();
        this.lock = reentrantLock;
        this.mix = f;
    }

    private final native Loop cppAdvance(long j, float f);

    private final native AdvanceResult cppAdvanceAndGetResult(long j, float f);

    private final native void cppApply(long j, float f);

    private final native int cppDuration(long j);

    private final native int cppFps(long j);

    private final native int cppGetDirection(long j);

    private final native int cppGetLoop(long j);

    private final native float cppGetTime(long j);

    private final native String cppName(long j);

    private final native void cppSetDirection(long j, int i);

    private final native void cppSetLoop(long j, int i);

    private final native void cppSetTime(long j, float f);

    private final native int cppWorkEnd(long j);

    private final native int cppWorkStart(long j);

    public final Loop advance(float f) {
        Loop loopCppAdvance;
        synchronized (this.lock) {
            loopCppAdvance = cppAdvance(getCppPointer(), f);
        }
        return loopCppAdvance;
    }

    public final AdvanceResult advanceAndGetResult(float f) {
        AdvanceResult advanceResultCppAdvanceAndGetResult;
        synchronized (this.lock) {
            advanceResultCppAdvanceAndGetResult = cppAdvanceAndGetResult(getCppPointer(), f);
        }
        return advanceResultCppAdvanceAndGetResult;
    }

    public final boolean apply(float f) {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
        }
        AdvanceResult advanceResultAdvanceAndGetResult = advanceAndGetResult(f);
        AdvanceResult advanceResult = AdvanceResult.ADVANCED;
        int iOrdinal = advanceResultAdvanceAndGetResult.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                return true;
            }
            if (iOrdinal != 4) {
                throw new awmj();
            }
        }
        return false;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    public final Direction getDirection() {
        Direction directionFromInt = Direction.Companion.fromInt(cppGetDirection(getCppPointer()));
        if (directionFromInt != null) {
            return directionFromInt;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getDuration() {
        return cppDuration(getCppPointer());
    }

    public final int getEffectiveDuration() {
        return getWorkStart() == -1 ? getDuration() : getWorkEnd() - getWorkStart();
    }

    public final float getEffectiveDurationInSeconds() {
        return getEffectiveDuration() / getFps();
    }

    public final float getEndTime() {
        float workEnd;
        int fps;
        if (getWorkEnd() == -1) {
            workEnd = getDuration();
            fps = getFps();
        } else {
            workEnd = getWorkEnd();
            fps = getFps();
        }
        return workEnd / fps;
    }

    public final int getFps() {
        return cppFps(getCppPointer());
    }

    public final Loop getLoop() {
        return Loop.Companion.fromIndex(cppGetLoop(getCppPointer()));
    }

    public final float getMix() {
        return this.mix;
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final float getStartTime() {
        if (getWorkStart() == -1) {
            return 0.0f;
        }
        return getWorkStart() / getFps();
    }

    public final float getTime() {
        return cppGetTime(getCppPointer());
    }

    public final int getWorkEnd() {
        return cppWorkEnd(getCppPointer());
    }

    public final int getWorkStart() {
        return cppWorkStart(getCppPointer());
    }

    public final void setDirection(Direction direction) {
        direction.getClass();
        synchronized (this.lock) {
            cppSetDirection(getCppPointer(), direction.getValue());
        }
    }

    public final void setLoop(Loop loop) {
        loop.getClass();
        synchronized (this.lock) {
            cppSetLoop(getCppPointer(), loop.ordinal());
        }
    }

    public final void setMix(float f) {
        this.mix = f;
    }

    public final void time(float f) {
        synchronized (this.lock) {
            cppSetTime(getCppPointer(), f);
        }
    }

    public /* synthetic */ LinearAnimationInstance(long j, ReentrantLock reentrantLock, float f, int i, awqx awqxVar) {
        this(j, reentrantLock, (i & 4) != 0 ? 1.0f : f);
    }

    public final void apply() {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
        }
    }
}
