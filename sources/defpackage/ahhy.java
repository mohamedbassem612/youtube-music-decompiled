package defpackage;

import java.security.SecureRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahhy extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandomA = ahhz.a();
        secureRandomA.nextLong();
        return secureRandomA;
    }
}
