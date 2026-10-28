package defpackage;

import android.net.Uri;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mob implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ mob(int i, int i2) {
        this.$cid = i2;
        this.a = i;
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

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                mog mogVar = (mog) obj;
                if (mogVar.a < this.a) {
                    return false;
                }
                if (FlowLayoutManager.t) {
                    mogVar.e();
                }
                break;
                break;
            case 1:
                agrf agrfVar = hnl.a;
                Uri uriB = tyu.b((String) obj);
                if (uriB == null) {
                    return false;
                }
                if (aaka.a.match(uriB) != this.a) {
                    return false;
                }
                break;
            case 2:
                mog mogVar2 = (mog) obj;
                if (mogVar2.a < this.a) {
                    return false;
                }
                if (FlowLayoutManager.t) {
                    mogVar2.e();
                }
                break;
                break;
            case 3:
                if (((sme) obj).a <= this.a) {
                    return false;
                }
                break;
            case 4:
                if (this.a < usj.a((augy) obj)) {
                    return false;
                }
                break;
            case 5:
                if (((augy) obj).g != this.a) {
                    return false;
                }
                break;
            case 6:
                if (((augy) obj).g < this.a) {
                    return false;
                }
                break;
            default:
                if (((asgy) obj).d != this.a) {
                    return false;
                }
                break;
        }
        return true;
    }
}
