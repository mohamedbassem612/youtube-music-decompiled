package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xib implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xib(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                return (((amuh) obj).b & 1) != 0;
            case 1:
                return ((agev) obj).g();
            case 2:
                return ((Optional) obj).isPresent();
            case 3:
                return !((aayw) obj).equals(aayw.a);
            case 4:
                return !((aazq) obj).equals(aazq.a);
            case 5:
                return !((aazq) obj).equals(aazq.a);
            case 6:
                return !((aazq) obj).equals(aazq.a);
            case 7:
                aepw aepwVar = (aepw) obj;
                return aepwVar == aepw.a || aepwVar == aepw.c;
            default:
                return true;
        }
    }
}
