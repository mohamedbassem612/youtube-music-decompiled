package defpackage;

import android.content.res.Configuration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vqp implements avnj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vqp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnj
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            return new vqr((vtl) obj, (vun) obj2, ((Integer) obj3).intValue());
        }
        boolean zBooleanValue = true;
        if (i == 1) {
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
            agev agevVar = (agev) obj3;
            return (!agevVar.g() || zBooleanValue2 || zBooleanValue3) ? agdf.a : agevVar;
        }
        if (i == 2) {
            agev agevVar2 = (agev) obj;
            agev agevVar3 = (agev) obj2;
            return Boolean.valueOf(agevVar2.g() && vpo.e((vob) agevVar2.c()) && agevVar3.g() && ((vob) agevVar2.c()).equals(agevVar3.c()));
        }
        if (i == 3) {
            Boolean bool = (Boolean) obj2;
            Boolean bool2 = (Boolean) obj3;
            if ((!((Boolean) obj).booleanValue() || !bool.booleanValue()) && !bool2.booleanValue()) {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i != 4) {
            Boolean bool3 = (Boolean) obj2;
            Configuration configuration = (Configuration) obj3;
            if (!((Boolean) obj).booleanValue() && (!bool3.booleanValue() || configuration.orientation != 2)) {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        Boolean bool4 = (Boolean) obj2;
        Configuration configuration2 = (Configuration) obj3;
        if (((Boolean) obj).booleanValue()) {
            zBooleanValue = bool4.booleanValue();
        } else if (configuration2.orientation != 2) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
