package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awra extends awqt implements awqz, awsf {
    private final int arity;

    public awra(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == (i2 & 1));
        this.arity = i;
    }

    @Override // defpackage.awqt
    protected awsc computeReflected() {
        int i = awrn.a;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awra) {
            awra awraVar = (awra) obj;
            if (getName().equals(awraVar.getName()) && getSignature().equals(awraVar.getSignature()) && awrc.c(getBoundReceiver(), awraVar.getBoundReceiver()) && awrc.c(getOwner(), awraVar.getOwner())) {
                return true;
            }
        } else if (obj instanceof awsf) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.awqz
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awqt
    public awsf getReflected() {
        return (awsf) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.awsf
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.awsf
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.awsf
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.awsf
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.awqt, defpackage.awsc
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        awsc awscVarCompute = compute();
        if (awscVarCompute != this) {
            return awscVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public awra(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public awra(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }
}
