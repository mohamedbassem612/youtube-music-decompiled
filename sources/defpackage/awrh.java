package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awrh extends awqt implements awsj {
    public awrh(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awqt
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final awsj getReflected() {
        return (awsj) super.getReflected();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awrh) {
            awrh awrhVar = (awrh) obj;
            if (getOwner().equals(awrhVar.getOwner()) && getName().equals(awrhVar.getName()) && getSignature().equals(awrhVar.getSignature()) && awrc.c(getBoundReceiver(), awrhVar.getBoundReceiver())) {
                return true;
            }
        } else if (obj instanceof awsj) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public final String toString() {
        awsc awscVarCompute = compute();
        if (awscVarCompute != this) {
            return awscVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public awrh() {
    }
}
