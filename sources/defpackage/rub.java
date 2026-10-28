package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rub implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rub(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [auht, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                return TextUtils.equals(this.a, ((sgi) obj).e);
            case 1:
                return TextUtils.equals(this.a, ((sgi) obj).e);
            case 2:
                return TextUtils.equals(this.a, ((sgi) obj).e);
            case 3:
                return TextUtils.equals(this.a, ((sgi) obj).e);
            case 4:
                return ((sgi) obj).i((sko) this.a).booleanValue();
            case 5:
                long j = ((augy) obj).e;
                ?? r5 = this.a;
                Stream stream = Collection.EL.stream(((aufx) yno.gx(r5, aufx.b)).c);
                Optional optionalN = usj.n((auhs) r5, j);
                if (true == optionalN.isPresent()) {
                    optionalN = Optional.ofNullable(Boolean.valueOf(!yno.gb((augy) optionalN.get(), augf.NOT_SHOW_IN_TIMELINE)));
                }
                if (!((Boolean) optionalN.orElse(Boolean.TRUE)).booleanValue() || !stream.noneMatch(new uqr(j, i))) {
                    return false;
                }
                break;
            case 6:
                acfd acfdVar = acfg.a;
                return ((acfs) obj).E().equals(this.a);
            default:
                if (((Long) obj).longValue() > ((aciw) this.a).b) {
                    return false;
                }
                break;
        }
        return true;
    }
}
