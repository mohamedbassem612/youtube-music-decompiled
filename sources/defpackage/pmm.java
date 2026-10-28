package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pmm implements pml {
    private final pls a;

    static {
        agsn.h("GnpSdk");
    }

    public pmm(pls plsVar) {
        plsVar.getClass();
        this.a = plsVar;
    }

    @Override // defpackage.pml
    public final boolean a(pmi pmiVar) {
        String str;
        String str2 = pmiVar.a;
        if ((str2 == null || str2.length() == 0) && (pmiVar.b == null || (str = pmiVar.c) == null || str.length() == 0)) {
            return false;
        }
        String str3 = pmiVar.e;
        if (str3 == null || str3.length() == 0) {
            return true;
        }
        awrc.c(str3, this.a.a);
        return true;
    }
}
