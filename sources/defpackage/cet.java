package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cet {
    public final String a;
    public int b;
    public long c;
    public cnm d;
    public boolean e;
    public boolean f;
    final /* synthetic */ ceu g;

    public cet(ceu ceuVar, String str, int i, cnm cnmVar) {
        this.g = ceuVar;
        this.a = str;
        this.b = i;
        this.c = cnmVar == null ? -1L : cnmVar.d;
        if (cnmVar == null || !cnmVar.c()) {
            return;
        }
        this.d = cnmVar;
    }

    public final boolean a(cdy cdyVar) {
        cnm cnmVar = cdyVar.d;
        if (cnmVar != null) {
            long j = this.c;
            if (j != -1) {
                long j2 = cnmVar.d;
                if (j2 > j) {
                    return true;
                }
                if (this.d != null) {
                    btn btnVar = cdyVar.b;
                    int iA = btnVar.a(cnmVar.a);
                    int iA2 = btnVar.a(this.d.a);
                    cnm cnmVar2 = this.d;
                    if (j2 >= cnmVar2.d && iA >= iA2) {
                        if (iA > iA2) {
                            return true;
                        }
                        if (cnmVar.c()) {
                            int i = cnmVar.b;
                            int i2 = cnmVar.c;
                            int i3 = cnmVar2.b;
                            if (i > i3) {
                                return true;
                            }
                            if (i == i3 && i2 > cnmVar2.c) {
                                return true;
                            }
                        } else {
                            int i4 = cnmVar.e;
                            if (i4 == -1 || i4 > cnmVar2.b) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (this.b != cdyVar.c) {
            return true;
        }
        return false;
    }
}
