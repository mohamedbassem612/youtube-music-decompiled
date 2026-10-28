package app.rive;

import defpackage.awrc;
import defpackage.awro;
import defpackage.awtl;
import defpackage.awtn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface RiveFrameRate {

    /* JADX INFO: compiled from: PG */
    public final class Capped implements RiveFrameRate {
        public static final int $stable = 0;
        private final float framesPerSecond;
        private final long period;

        public Capped(float f) {
            this.framesPerSecond = f;
            if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f) {
                throw new IllegalArgumentException("framesPerSecond must be finite and greater than zero.");
            }
            int i = awtl.b;
            double d = 1.0E9d / ((double) f);
            if (Double.isNaN(d)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            this.period = awrc.j(awro.i(Math.round(d), 1L), awtn.NANOSECONDS);
        }

        public static /* synthetic */ Capped copy$default(Capped capped, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = capped.framesPerSecond;
            }
            return capped.copy(f);
        }

        public final float component1() {
            return this.framesPerSecond;
        }

        public final Capped copy(float f) {
            return new Capped(f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Capped) && Float.compare(this.framesPerSecond, ((Capped) obj).framesPerSecond) == 0;
            }
            return true;
        }

        public final float getFramesPerSecond() {
            return this.framesPerSecond;
        }

        /* JADX INFO: renamed from: getPeriod-UwyO8pc$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
        public final long m298xdaaf0173() {
            return this.period;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.framesPerSecond);
        }

        public String toString() {
            return "Capped(framesPerSecond=" + this.framesPerSecond + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Unbounded implements RiveFrameRate {
        public static final int $stable = 0;
        public static final Unbounded INSTANCE = new Unbounded();

        private Unbounded() {
        }
    }
}
