package defpackage;

import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aame {
    public aohx a;
    public final Spanned b;
    public final Spanned c;

    static {
        agkz.s(18, 93, 134, 243);
        agkz.s(22, 95, 136, 247);
    }

    @Deprecated
    public aame(aohw aohwVar) {
        aohx aohxVar = aohx.UNKNOWN_FORMAT_TYPE;
        this.a = aohxVar;
        aohx aohxVarA = aohx.a(aohwVar.e);
        this.a = aohxVarA != null ? aohxVarA : aohxVar;
        alay alayVar = aohwVar.c;
        this.b = ackj.k(null, alayVar == null ? alay.a : alayVar, null, false);
        alay alayVar2 = aohwVar.d;
        this.c = ackj.k(null, alayVar2 == null ? alay.a : alayVar2, null, false);
    }
}
