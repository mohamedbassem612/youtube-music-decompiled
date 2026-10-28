package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqn implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gqn(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        aobx aobxVar;
        switch (this.$cid) {
            case 0:
                return Objects.nonNull(zs$$ExternalSyntheticApiModelOutline0.m(obj));
            case 1:
                acjx acjxVar = (acjx) obj;
                if (acjxVar.a() == acjw.b && (aobxVar = (aobx) aawb.ag(acjxVar, aobx.class)) != null && aobxVar.g && aobxVar.c == 8 && ((Boolean) aobxVar.d).booleanValue()) {
                    return true;
                }
                break;
            case 2:
                if (((alrd) obj).b == 123267149) {
                    return true;
                }
                break;
            case 3:
                return ((Optional) obj).isPresent();
            case 4:
                aamj aamjVar = (aamj) obj;
                if (aamjVar != null && hlz.m(aamjVar.a)) {
                    return true;
                }
                break;
            case 5:
                return ((Optional) obj).isPresent();
            case 6:
                agrf agrfVar = idr.a;
                abnl abnlVarN = ((hyz) obj).n();
                if (abnlVarN != null && abnlVarN.J()) {
                    return true;
                }
                break;
            case 7:
                if (((ajtb) obj).b == 91394224) {
                    return true;
                }
                break;
            case 8:
                return rmp.c((zwa) obj).equals("youtube-incognito");
            case 9:
                return rmp.c((zwa) obj).equals("youtube-direct");
            case 10:
                return Objects.nonNull((zwa) obj);
            case 11:
                return rmp.c((zwa) obj).equals("youtube-delegated");
            case 12:
                return ((File) obj).getName().matches("cpu[0-9]+");
            case 13:
                return Objects.nonNull((long[]) obj);
            case 14:
                if (((almg) obj).b == 58174010) {
                    return true;
                }
                break;
            case 15:
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                break;
            case 16:
                return ((xpe) ((Map.Entry) obj).getValue()).a;
            case 17:
                if ((((akks) obj).b & 32) != 0) {
                    return true;
                }
                break;
            case 18:
                if ((((akks) obj).b & 64) != 0) {
                    return true;
                }
                break;
            case 19:
                if ((((akks) obj).b & 8) != 0) {
                    return true;
                }
                break;
            default:
                if ((((akks) obj).b & 4) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
