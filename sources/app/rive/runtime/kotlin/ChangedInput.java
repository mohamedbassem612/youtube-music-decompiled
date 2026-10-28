package app.rive.runtime.kotlin;

import defpackage.awqx;
import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ChangedInput {
    public static final int $stable = 8;
    private final String name;
    private final String nestedArtboardPath;
    private final String stateMachineName;
    private final Object value;

    public ChangedInput(String str, String str2, Object obj, String str3) {
        str.getClass();
        str2.getClass();
        this.stateMachineName = str;
        this.name = str2;
        this.value = obj;
        this.nestedArtboardPath = str3;
    }

    public static /* synthetic */ ChangedInput copy$default(ChangedInput changedInput, String str, String str2, Object obj, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = changedInput.stateMachineName;
        }
        if ((i & 2) != 0) {
            str2 = changedInput.name;
        }
        if ((i & 4) != 0) {
            obj = changedInput.value;
        }
        if ((i & 8) != 0) {
            str3 = changedInput.nestedArtboardPath;
        }
        return changedInput.copy(str, str2, obj, str3);
    }

    public final String component1() {
        return this.stateMachineName;
    }

    public final String component2() {
        return this.name;
    }

    public final Object component3() {
        return this.value;
    }

    public final String component4() {
        return this.nestedArtboardPath;
    }

    public final ChangedInput copy(String str, String str2, Object obj, String str3) {
        str.getClass();
        str2.getClass();
        return new ChangedInput(str, str2, obj, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangedInput) {
            ChangedInput changedInput = (ChangedInput) obj;
            if (awrc.c(this.stateMachineName, changedInput.stateMachineName) && awrc.c(this.name, changedInput.name) && awrc.c(this.value, changedInput.value) && awrc.c(this.nestedArtboardPath, changedInput.nestedArtboardPath)) {
                return true;
            }
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNestedArtboardPath() {
        return this.nestedArtboardPath;
    }

    public final String getStateMachineName() {
        return this.stateMachineName;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.stateMachineName.hashCode() * 31) + this.name.hashCode();
        Object obj = this.value;
        int iHashCode2 = ((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.nestedArtboardPath;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ChangedInput(stateMachineName=" + this.stateMachineName + ", name=" + this.name + ", value=" + this.value + ", nestedArtboardPath=" + this.nestedArtboardPath + ')';
    }

    public /* synthetic */ ChangedInput(String str, String str2, Object obj, String str3, int i, awqx awqxVar) {
        this(str, str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : str3);
    }
}
