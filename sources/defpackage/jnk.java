package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jnk implements awqk {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jnk(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [awuj, java.lang.Object] */
    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        Object awopVar;
        switch (this.$cid) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                bool.getClass();
                bool2.getClass();
                return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
            case 1:
                axfd axfdVar = (axfd) obj;
                Throwable cancellationException = (Throwable) obj2;
                axfdVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                axfdVar.e.b(cancellationException);
                return awmy.a;
            case 2:
                return Boolean.TRUE;
            case 3:
                awou awouVar = (awou) obj;
                awos awosVar = (awos) obj2;
                awouVar.getClass();
                awosVar.getClass();
                awou awouVarMinusKey = awouVar.minusKey(awosVar.getKey());
                awov awovVar = awov.a;
                if (awouVarMinusKey == awovVar) {
                    return awosVar;
                }
                ahx ahxVar = awor.j;
                awor aworVar = (awor) awouVarMinusKey.get(ahxVar);
                if (aworVar != null) {
                    awou awouVarMinusKey2 = awouVarMinusKey.minusKey(ahxVar);
                    if (awouVarMinusKey2 == awovVar) {
                        return new awop(awosVar, aworVar);
                    }
                    awopVar = new awop(new awop(awouVarMinusKey2, awosVar), aworVar);
                } else {
                    awopVar = new awop(awouVarMinusKey, awosVar);
                }
                break;
                break;
            case 4:
                awou awouVar2 = (awou) obj;
                awos awosVar2 = (awos) obj2;
                if (!(awosVar2 instanceof afwr)) {
                    return awouVar2.plus(awosVar2);
                }
                awos awosVar3 = awouVar2.get(awosVar2.getKey());
                return awosVar3 == null ? awouVar2.plus(((afwr) awosVar2).d()) : awouVar2.plus(((afwr) awosVar3).b(awosVar2));
            case 5:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((awos) obj2) instanceof afwr));
            case 6:
                awou awouVar3 = (awou) obj;
                awos awosVar4 = (awos) obj2;
                return awosVar4 instanceof afwr ? awouVar3.plus(((afwr) awosVar4).d()) : awouVar3;
            case 7:
                return Boolean.valueOf(awrc.c(obj, obj2));
            case 8:
                awopVar = (awos) obj2;
                if (!(awopVar instanceof awxg)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                if (iIntValue != 0) {
                    return Integer.valueOf(iIntValue + 1);
                }
                break;
            case 9:
                awxg awxgVar = (awxg) obj;
                awos awosVar5 = (awos) obj2;
                if (awxgVar != null) {
                    return awxgVar;
                }
                if (awosVar5 instanceof awxg) {
                    return (awxg) awosVar5;
                }
                return null;
            default:
                axef axefVar = (axef) obj;
                awos awosVar6 = (awos) obj2;
                if (!(awosVar6 instanceof awxg)) {
                    return axefVar;
                }
                awxg awxgVar2 = (awxg) awosVar6;
                Object objA = awxgVar2.a(axefVar.a);
                Object[] objArr = axefVar.b;
                int i = axefVar.d;
                objArr[i] = objA;
                awxg[] awxgVarArr = axefVar.c;
                axefVar.d = i + 1;
                awxgVar2.getClass();
                awxgVarArr[i] = awxgVar2;
                return axefVar;
        }
        return awopVar;
    }
}
