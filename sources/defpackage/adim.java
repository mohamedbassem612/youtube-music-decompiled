package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adim implements feb {
    private final aerv a;

    public adim(aerv aervVar) {
        this.a = aervVar;
    }

    @Override // defpackage.feb
    public final boolean c(ewb ewbVar, fem femVar) {
        this.a.j("UNKNOWN", true);
        return false;
    }

    @Override // defpackage.feb
    public final /* bridge */ /* synthetic */ boolean gJ(Object obj, fem femVar, int i) {
        String str;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            str = "NOT_CACHED";
        } else if (i2 != 2) {
            str = i2 != 4 ? "UNKNOWN" : "MEMORY";
        } else {
            str = "DISK";
        }
        this.a.j(str, false);
        return false;
    }
}
