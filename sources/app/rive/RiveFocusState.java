package app.rive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface RiveFocusState {

    /* JADX INFO: compiled from: PG */
    public final class Focused implements RiveFocusState {
        public static final int $stable = 0;
        private final boolean expectsKeyboardInput;

        public Focused(boolean z) {
            this.expectsKeyboardInput = z;
        }

        public static /* synthetic */ Focused copy$default(Focused focused, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = focused.expectsKeyboardInput;
            }
            return focused.copy(z);
        }

        public final boolean component1() {
            return this.expectsKeyboardInput;
        }

        public final Focused copy(boolean z) {
            return new Focused(z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Focused) && this.expectsKeyboardInput == ((Focused) obj).expectsKeyboardInput;
            }
            return true;
        }

        public final boolean getExpectsKeyboardInput() {
            return this.expectsKeyboardInput;
        }

        public int hashCode() {
            return RiveFocusState$Focused$$ExternalSyntheticBackport0.m(this.expectsKeyboardInput);
        }

        public String toString() {
            return "Focused(expectsKeyboardInput=" + this.expectsKeyboardInput + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Unfocused implements RiveFocusState {
        public static final int $stable = 0;
        public static final Unfocused INSTANCE = new Unfocused();

        private Unfocused() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unfocused)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 601396394;
        }

        public String toString() {
            return "Unfocused";
        }
    }
}
