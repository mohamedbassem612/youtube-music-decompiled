package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aou {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof aou) && this.a == ((aou) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        return i == 6 ? "DropdownList" : "Picker";
    }
}
