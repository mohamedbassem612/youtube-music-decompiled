package defpackage;

import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqr implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ uqr(long j, int i) {
        this.$cid = i;
        this.a = j;
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
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int iAV;
        switch (this.$cid) {
            case 0:
                if (((aufw) obj).c == this.a) {
                    return true;
                }
                break;
            case 1:
                if (((Long) ((Map.Entry) obj).getValue()).longValue() <= this.a) {
                    return true;
                }
                break;
            case 2:
                if (((augi) obj).c == this.a) {
                    return true;
                }
                break;
            case 3:
                augi augiVar = (augi) obj;
                agrf agrfVar = usj.a;
                if (augiVar.c == this.a && (augiVar.b & 64) != 0 && (iAV = a.aV(augiVar.i)) != 0 && iAV == 3) {
                    return true;
                }
                break;
            case 4:
                agrf agrfVar2 = usj.a;
                if (this.a == ((augy) obj).e) {
                    return true;
                }
                break;
            case 5:
                agrf agrfVar3 = usj.a;
                if (this.a == ((aufa) obj).e) {
                    return true;
                }
                break;
            case 6:
                agrf agrfVar4 = usj.a;
                if (((aufw) obj).c == this.a) {
                    return true;
                }
                break;
            case 7:
                able ableVar = (able) obj;
                long micros = TimeUnit.MILLISECONDS.toMicros(ableVar.l());
                long j = this.a;
                if (j >= micros && j <= TimeUnit.MILLISECONDS.toMicros(ableVar.k())) {
                    return true;
                }
                break;
            default:
                abli abliVar = (abli) obj;
                long micros2 = TimeUnit.MILLISECONDS.toMicros(abliVar.a);
                long j2 = this.a;
                if (j2 >= micros2 && j2 <= TimeUnit.MILLISECONDS.toMicros(abliVar.k())) {
                    return true;
                }
                break;
        }
        return false;
    }
}
