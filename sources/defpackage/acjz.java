package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acjz implements acjx {
    public final ajlb a;
    private final byte[] b;
    private final acjw c;

    public acjz(ajlb ajlbVar, byte[] bArr, acjw acjwVar) {
        this.a = ajlbVar;
        this.b = bArr;
        this.c = acjwVar;
    }

    @Override // defpackage.acjx
    public final acjw a() {
        return this.c;
    }

    @Override // defpackage.acjx
    public final /* synthetic */ akek b() {
        return null;
    }

    @Override // defpackage.acjx
    public final String c() {
        return "";
    }

    @Override // defpackage.acjx
    public final boolean d() {
        return false;
    }

    @Override // defpackage.acjx
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acjz) {
            acjz acjzVar = (acjz) obj;
            if (this.a.equals(acjzVar.a)) {
                if (Arrays.equals(this.b, acjzVar instanceof acjz ? acjzVar.b : acjzVar.b) && this.c.equals(acjzVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.acjx
    public final boolean f() {
        return false;
    }

    @Override // defpackage.acjx
    public final boolean g() {
        return false;
    }

    @Override // defpackage.acjx
    public final byte[] h() {
        return this.b;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003;
    }

    public final String toString() {
        acjw acjwVar = this.c;
        byte[] bArr = this.b;
        return "BatchItemContinuationDataWrapper{batchItemContinuationData=" + String.valueOf(this.a) + ", requestTrackingParams=" + Arrays.toString(bArr) + ", type=" + String.valueOf(acjwVar) + ", showSpinnerOnReload=false, keepHeaderOnReload=false, disableScrollToRevealActionBar=false, disableLogClickGestureOnContinuation=false, clientAttachmentRequestData=null}";
    }

    public acjz() {
        throw null;
    }

    @Override // defpackage.acjx
    public final void i() {
    }
}
