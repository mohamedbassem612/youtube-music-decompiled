package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidAccessibilityBounds {
    public static final int $stable = 0;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public AndroidAccessibilityBounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ AndroidAccessibilityBounds copy$default(AndroidAccessibilityBounds androidAccessibilityBounds, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = androidAccessibilityBounds.left;
        }
        if ((i5 & 2) != 0) {
            i2 = androidAccessibilityBounds.top;
        }
        if ((i5 & 4) != 0) {
            i3 = androidAccessibilityBounds.right;
        }
        if ((i5 & 8) != 0) {
            i4 = androidAccessibilityBounds.bottom;
        }
        return androidAccessibilityBounds.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final AndroidAccessibilityBounds copy(int i, int i2, int i3, int i4) {
        return new AndroidAccessibilityBounds(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidAccessibilityBounds) {
            AndroidAccessibilityBounds androidAccessibilityBounds = (AndroidAccessibilityBounds) obj;
            if (this.left == androidAccessibilityBounds.left && this.top == androidAccessibilityBounds.top && this.right == androidAccessibilityBounds.right && this.bottom == androidAccessibilityBounds.bottom) {
                return true;
            }
        }
        return false;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "AndroidAccessibilityBounds(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
