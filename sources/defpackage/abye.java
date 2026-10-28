package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abye implements abyf {
    private final /* synthetic */ int $cid;
    private final abwy a;

    public abye(abwy abwyVar, int i, byte[] bArr) {
        this.$cid = i;
        abwyVar.getClass();
        this.a = abwyVar;
    }

    @Override // defpackage.abyf
    public final abyc a(abxz abxzVar) {
        abyc abycVar;
        int i = this.$cid;
        if (i == 0) {
            abycVar = abxzVar.d;
            if (abycVar == null) {
                abxp abxpVarB = this.a.b();
                if (true == awrc.c((abxj) abxpVarB, abxj.a)) {
                    abxpVarB = null;
                }
                abxj abxjVar = (abxj) abxpVarB;
                if (abxjVar != null) {
                    return new abya(abxjVar);
                }
                return null;
            }
        } else {
            if (i == 1) {
                abxp abxpVarB2 = this.a.b();
                if (true == awrc.c((abxi) abxpVarB2, abxi.a)) {
                    abxpVarB2 = null;
                }
                abxi abxiVar = (abxi) abxpVarB2;
                if (abxiVar != null) {
                    return new abya(abxiVar);
                }
                return null;
            }
            if (i != 2) {
                abycVar = abxzVar.c;
                if (abycVar == null) {
                    abxp abxpVarB3 = this.a.b();
                    if (true == awrc.c((abxo) abxpVarB3, abxo.e)) {
                        abxpVarB3 = null;
                    }
                    abxo abxoVar = (abxo) abxpVarB3;
                    if (abxoVar != null) {
                        return new abya(abxoVar);
                    }
                    return null;
                }
            } else {
                abycVar = abxzVar.b;
                if (abycVar == null) {
                    abxp abxpVarB4 = this.a.b();
                    if (true == awrc.c((abxk) abxpVarB4, abxk.a)) {
                        abxpVarB4 = null;
                    }
                    abxk abxkVar = (abxk) abxpVarB4;
                    if (abxkVar != null) {
                        return new abya(abxkVar);
                    }
                    return null;
                }
            }
        }
        return abycVar;
    }

    public abye(abwy abwyVar, int i) {
        this.$cid = i;
        abwyVar.getClass();
        this.a = abwyVar;
    }

    public abye(abwy abwyVar, int i, char[] cArr) {
        this.$cid = i;
        abwyVar.getClass();
        this.a = abwyVar;
    }

    public abye(abwy abwyVar, int i, short[] sArr) {
        this.$cid = i;
        abwyVar.getClass();
        this.a = abwyVar;
    }
}
