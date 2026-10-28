package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgc implements avhl {
    public final avef a;
    public boolean b = false;
    public final /* synthetic */ avge c;

    public avgc(avge avgeVar, avef avefVar) {
        this.c = avgeVar;
        this.a = avefVar;
    }

    public static final String b(avcb avcbVar) {
        int iOrdinal;
        if (avcbVar == null || (iOrdinal = avcbVar.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new IllegalArgumentException("Unknown SecurityLevel: ".concat(avcbVar.toString()));
    }

    public static final String c(auyo auyoVar, auyn auynVar) {
        String str = (String) auyoVar.a(auynVar);
        return str == null ? "" : str;
    }

    public static final String d(auyo auyoVar) {
        String str = (String) auyoVar.a(auzy.b);
        if (str == null) {
            str = (String) auyoVar.a(avbt.a);
        }
        return str == null ? "" : str;
    }

    @Override // defpackage.avhl
    public final void a(boolean z) {
        throw null;
    }
}
