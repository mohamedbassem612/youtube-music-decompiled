package defpackage;

import android.app.Notification;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hpr implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hpr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        Optional optional;
        switch (this.$cid) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Optional optional2 = (Optional) objArr[0];
                optional = (Optional) objArr[1];
                if (optional2.isPresent()) {
                    return optional2;
                }
                break;
            case 1:
                Object[] objArr2 = (Object[]) obj;
                Optional optional3 = (Optional) objArr2[0];
                optional = (Optional) objArr2[1];
                if (optional3.isPresent()) {
                    return optional3;
                }
                break;
            case 2:
                return Optional.of((weh) obj);
            case 3:
                int i = hps.c;
                return Optional.ofNullable((weh) ((agev) obj).f());
            case 4:
                return ((avmc) obj).g();
            case 5:
                Optional optional4 = (Optional) obj;
                return true == optional4.isPresent() ? Optional.ofNullable(((ansx) optional4.get()).d()) : optional4;
            case 6:
                long j = htp.a;
                return typ.b(ato.d((Notification) obj));
            case 7:
                return fdl.d((akxs) obj);
            case 8:
                return Boolean.valueOf(((aazn) obj).c());
            case 9:
                acip acipVar = ((aazq) obj).b;
                agrf agrfVar = idr.a;
                return Optional.ofNullable(acipVar.n());
            case 10:
                return isi.d(((Boolean) obj).booleanValue());
            case 11:
                wgi wgiVar = ((aayw) obj).d;
                wgiVar.getClass();
                return wgiVar.e;
            case 12:
                amae amaeVar = ((icw) obj).a;
                return amaeVar == null ? amae.a : amaeVar;
            case 13:
                return (Object[]) obj;
            case 14:
                aazq aazqVar = (aazq) obj;
                acip acipVar2 = aazqVar.b;
                int i2 = ime.i;
                return acipVar2.U().H(new ibj(aazqVar, 8));
            case 15:
                aobh aobhVarA = aobh.a(((aobm) obj).c);
                if (aobhVarA == null) {
                    aobhVarA = aobh.UNRECOGNIZED;
                }
                return Boolean.valueOf(aobhVarA != aobh.NETWORK_QUALITY_BUCKET_OFFLINE);
            case 16:
                return (Object[]) obj;
            case 17:
                Object[] objArr3 = (Object[]) obj;
                int i3 = jdf.d;
                return objArr3;
            case 18:
                Object[] objArr4 = (Object[]) obj;
                int i4 = jdf.d;
                return objArr4;
            case 19:
                return Boolean.valueOf(((aazj) obj).a.h());
            default:
                return Boolean.valueOf(((ibt) obj) == ibt.FILL);
        }
        return optional;
    }
}
