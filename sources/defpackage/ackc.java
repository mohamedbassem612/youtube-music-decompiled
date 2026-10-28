package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ackc implements acjx {
    public final boolean a;
    private final String b;
    private final byte[] c;
    private final acjw d;
    private final alap e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public ackc(String str, byte[] bArr, acjw acjwVar, alap alapVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = str;
        this.c = bArr;
        this.d = acjwVar;
        this.e = alapVar;
        this.f = z;
        this.a = z2;
        this.g = z3;
        this.h = z4;
    }

    @Override // defpackage.acjx
    public final acjw a() {
        return this.d;
    }

    @Override // defpackage.acjx
    public final /* synthetic */ akek b() {
        return null;
    }

    @Override // defpackage.acjx
    public final String c() {
        return this.b;
    }

    @Override // defpackage.acjx
    public final boolean d() {
        return this.g;
    }

    @Override // defpackage.acjx
    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        alap alapVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ackc) {
            ackc ackcVar = (ackc) obj;
            if (this.b.equals(ackcVar.b)) {
                if (Arrays.equals(this.c, ackcVar instanceof ackc ? ackcVar.c : ackcVar.c) && this.d.equals(ackcVar.d) && ((alapVar = this.e) != null ? alapVar.equals(ackcVar.e) : ackcVar.e == null) && this.f == ackcVar.f && this.a == ackcVar.a && this.g == ackcVar.g && this.h == ackcVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.acjx
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.acjx
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.acjx
    public final byte[] h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((this.b.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode();
        alap alapVar = this.e;
        return ((((((((((iHashCode * 1000003) ^ (alapVar == null ? 0 : alapVar.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003;
    }

    public final String toString() {
        alap alapVar = this.e;
        acjw acjwVar = this.d;
        return "ContinuationWrapper{continuationToken=" + this.b + ", requestTrackingParams=" + Arrays.toString(this.c) + ", type=" + String.valueOf(acjwVar) + ", formData=" + String.valueOf(alapVar) + ", showSpinnerOnReload=" + this.f + ", keepHeaderOnReload=" + this.a + ", disableLogClickGestureOnContinuation=" + this.g + ", disableScrollToRevealActionBar=" + this.h + ", clientAttachmentRequestData=null}";
    }

    public ackc() {
        throw null;
    }

    @Override // defpackage.acjx
    public final void i() {
    }
}
