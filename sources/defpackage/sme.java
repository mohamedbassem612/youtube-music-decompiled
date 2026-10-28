package defpackage;

import j$.util.Optional;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sme implements Comparable, Serializable {
    public final long a;
    public final ajwo b;

    private sme(ajwo ajwoVar, long j) {
        this.b = ajwoVar;
        this.a = j;
    }

    public static Optional a(aiwc aiwcVar, long j) {
        long jRound;
        if (aiwcVar == null) {
            return Optional.empty();
        }
        aiwe aiweVar = aiwcVar.b;
        if (aiweVar == null) {
            aiweVar = aiwe.a;
        }
        int iAS = a.aS(aiweVar.b);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i == 1) {
            jRound = Math.round(aiweVar.c * j);
        } else {
            if (i != 2) {
                return Optional.empty();
            }
            jRound = aiweVar.d;
        }
        if (jRound < 0) {
            return Optional.empty();
        }
        ajwo ajwoVar = aiwcVar.c;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Optional.of(new sme(ajwoVar, jRound));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((sme) obj).a));
    }
}
