package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwp extends YogaNodeJNIBase {
    public fwp(fwk fwkVar) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(fwkVar.a));
    }

    protected final void finalize() throws Throwable {
        try {
            long j = this.c;
            if (j != 0) {
                this.c = 0L;
                YogaNative.jni_YGNodeDeallocateJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
