package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ackb implements acjx {
    public final Object a;
    private final String b;
    private final byte[] c;
    private final acjw d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final ajtt i;
    private final akek j;

    public ackb(String str, byte[] bArr, acjw acjwVar, Object obj, boolean z, boolean z2, boolean z3, boolean z4, ajtt ajttVar, akek akekVar) {
        this.b = str;
        this.c = bArr;
        this.d = acjwVar;
        this.a = obj;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = ajttVar;
        this.j = akekVar;
    }

    @Override // defpackage.acjx
    public final acjw a() {
        return this.d;
    }

    @Override // defpackage.acjx
    public final akek b() {
        return this.j;
    }

    @Override // defpackage.acjx
    public final String c() {
        return this.b;
    }

    @Override // defpackage.acjx
    public final boolean d() {
        return this.h;
    }

    @Override // defpackage.acjx
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ackb) {
            ackb ackbVar = (ackb) obj;
            if (TextUtils.equals(this.b, ackbVar.b) && Arrays.equals(this.c, ackbVar.c) && this.d.equals(ackbVar.d) && this.a.equals(ackbVar.a) && Objects.equals(this.j, ackbVar.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acjx
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.acjx
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.acjx
    public final byte[] h() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (((((((str != null ? str.hashCode() ^ 1000003 : 1000003) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003;
        akek akekVar = this.j;
        return iHashCode ^ (akekVar == null ? 0 : akekVar.hashCode());
    }

    public final String toString() {
        ajtt ajttVar = this.i;
        Object obj = this.a;
        acjw acjwVar = this.d;
        String string = Arrays.toString(this.c);
        String strValueOf = String.valueOf(acjwVar);
        String strValueOf2 = String.valueOf(obj);
        String strConcat = ajttVar != null ? ", with clientAttachmentRequestData=".concat(ajttVar.toString()) : ", without clientAttachmentRequestData";
        boolean z = this.h;
        boolean z2 = this.g;
        boolean z3 = this.f;
        boolean z4 = this.e;
        String str = this.b;
        akek akekVar = this.j;
        StringBuilder sb = new StringBuilder("ContinuationDataWrapper{continuationToken=");
        sb.append(str);
        sb.append(", requestTrackingParams=");
        sb.append(string);
        sb.append(", type=");
        sb.append(strValueOf);
        sb.append(", continuation=");
        sb.append(strValueOf2);
        sb.append(", showSpinnerOnReload=");
        sb.append(z4);
        sb.append(", keepHeaderOnReload=");
        sb.append(z3);
        sb.append(", disableScrollToRevealActionBar=");
        sb.append(z2);
        sb.append(", disableLogClickGestureOnContinuation=");
        sb.append(z);
        sb.append(strConcat);
        sb.append(akekVar != null ? ", with continuationRequestData" : ", without continuationRequestData");
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.acjx
    public final void i() {
    }
}
