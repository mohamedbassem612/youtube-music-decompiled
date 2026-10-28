package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oac implements etw {
    @Override // defpackage.etw
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        etx etxVar = oae.a;
        if (((Boolean) obj).booleanValue()) {
            messageDigest.update(bArr);
        }
    }
}
