package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acls {
    private final int a;
    private final int b;

    public acls(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acls) {
            acls aclsVar = (acls) obj;
            if (this.a == aclsVar.a && this.b == aclsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a ^ 583896283) * 1000003) ^ this.b) * (-429739981);
    }

    public final String toString() {
        return "ReelTimeBarConfig{landscapeTimeBarPaddingPivotBarVisibleRes=0, portraitTimeBarPaddingPivotBarVisibleRes=0, landscapeTimeBarPaddingPivotBarHiddenRes=" + this.a + ", portraitTimeBarPaddingPivotBarHiddenRes=" + this.b + ", landscapeTimeBarPaddingPivotBarVisible=null, portraitTimeBarPaddingPivotBarVisible=null, landscapeTimeBarPaddingPivotBarHidden=null, portraitTimeBarPaddingPivotBarHidden=null, customTimeBarDurationMillis=0}";
    }

    public acls() {
        throw null;
    }
}
