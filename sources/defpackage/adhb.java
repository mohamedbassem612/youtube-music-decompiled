package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adhb implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adhb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return a.w((weo) obj);
        }
        if (i == 1) {
            return ((Boolean) obj).booleanValue();
        }
        if (i == 2) {
            rkp rkpVar = (rkp) obj;
            if (rkpVar.a() || rkpVar.a == rko.d) {
                return true;
            }
        } else {
            if (i == 3) {
                return ((Optional) obj).isPresent();
            }
            if (((weo) obj) != null) {
                return true;
            }
        }
        return false;
    }
}
