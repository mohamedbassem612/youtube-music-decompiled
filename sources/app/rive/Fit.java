package app.rive;

import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Fit {
    public static final int $stable = 8;
    private final Alignment alignment;
    private final float scaleFactor;

    /* JADX INFO: compiled from: PG */
    public final class Fill extends Fit {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();
        private static final byte nativeMapping = 0;

        private Fill() {
            super(null);
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return nativeMapping;
        }
    }

    private Fit() {
        this.alignment = Alignment.Center;
        this.scaleFactor = 1.0f;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public abstract byte getNativeMapping$third_party_java_android_libs_rive_rive_android();

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    /* JADX INFO: compiled from: PG */
    public final class Layout extends Fit {
        public static final int $stable = 0;
        private final byte nativeMapping;
        private final float scaleFactor;

        public Layout(float f) {
            super(null);
            this.scaleFactor = f;
            this.nativeMapping = (byte) 7;
        }

        public static /* synthetic */ Layout copy$default(Layout layout, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = layout.scaleFactor;
            }
            return layout.copy(f);
        }

        public final float component1() {
            return this.scaleFactor;
        }

        public final Layout copy(float f) {
            return new Layout(f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Layout) && Float.compare(this.scaleFactor, ((Layout) obj).scaleFactor) == 0;
            }
            return true;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        @Override // app.rive.Fit
        public float getScaleFactor() {
            return this.scaleFactor;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.scaleFactor);
        }

        public String toString() {
            return "Layout(scaleFactor=" + this.scaleFactor + ')';
        }

        public Layout() {
            this(0.0f, 1, null);
        }

        public /* synthetic */ Layout(float f, int i, awqx awqxVar) {
            this(1 == (i & 1) ? 1.0f : f);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Contain extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Contain(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 1;
        }

        public static /* synthetic */ Contain copy$default(Contain contain, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = contain.alignment;
            }
            return contain.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final Contain copy(Alignment alignment) {
            alignment.getClass();
            return new Contain(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Contain) && this.alignment == ((Contain) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "Contain(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Contain() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Contain(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Cover extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cover(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 2;
        }

        public static /* synthetic */ Cover copy$default(Cover cover, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = cover.alignment;
            }
            return cover.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final Cover copy(Alignment alignment) {
            alignment.getClass();
            return new Cover(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Cover) && this.alignment == ((Cover) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "Cover(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Cover() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Cover(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class FitHeight extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitHeight(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 4;
        }

        public static /* synthetic */ FitHeight copy$default(FitHeight fitHeight, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = fitHeight.alignment;
            }
            return fitHeight.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final FitHeight copy(Alignment alignment) {
            alignment.getClass();
            return new FitHeight(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof FitHeight) && this.alignment == ((FitHeight) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "FitHeight(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FitHeight() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FitHeight(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class FitWidth extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitWidth(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 3;
        }

        public static /* synthetic */ FitWidth copy$default(FitWidth fitWidth, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = fitWidth.alignment;
            }
            return fitWidth.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final FitWidth copy(Alignment alignment) {
            alignment.getClass();
            return new FitWidth(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof FitWidth) && this.alignment == ((FitWidth) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "FitWidth(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FitWidth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FitWidth(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class None extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public None(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 5;
        }

        public static /* synthetic */ None copy$default(None none, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = none.alignment;
            }
            return none.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final None copy(Alignment alignment) {
            alignment.getClass();
            return new None(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof None) && this.alignment == ((None) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "None(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public None() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ None(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class ScaleDown extends Fit {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScaleDown(Alignment alignment) {
            super(null);
            alignment.getClass();
            this.alignment = alignment;
            this.nativeMapping = (byte) 6;
        }

        public static /* synthetic */ ScaleDown copy$default(ScaleDown scaleDown, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = scaleDown.alignment;
            }
            return scaleDown.copy(alignment);
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final ScaleDown copy(Alignment alignment) {
            alignment.getClass();
            return new ScaleDown(alignment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ScaleDown) && this.alignment == ((ScaleDown) obj).alignment;
            }
            return true;
        }

        @Override // app.rive.Fit
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        public byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "ScaleDown(alignment=" + this.alignment + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ScaleDown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ ScaleDown(Alignment alignment, int i, awqx awqxVar) {
            this((i & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    public /* synthetic */ Fit(awqx awqxVar) {
        this();
    }
}
