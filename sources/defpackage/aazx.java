package defpackage;

import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aazx implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aazx(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [adtb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [acip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [acip, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object aazzVar;
        switch (this.$cid) {
            case 0:
                aazzVar = new aazz(this.a, this.b.g());
                break;
            case 1:
                String str = (String) obj;
                tzk tzkVar = (tzk) ((agkj) this.b).get(str);
                if (tzkVar == null) {
                    tzkVar = (tzk) ((agkj) this.a).get(str);
                }
                return Optional.ofNullable(tzkVar);
            case 2:
                ?? r8 = this.a;
                aazzVar = new aamo(r8.t(), this.b.g());
                r8.ar().D(new zgd(aazzVar, 20), new abae(aazzVar, 1));
                break;
            case 3:
                int i = abaa.a;
                aazzVar = new abab((may) this.b, this.a);
                break;
            case 4:
                return new aazy((may) obj, ((aazq) this.b).b, ((abab) this.a).b);
            case 5:
                Object obj2 = this.b;
                return afwl.b(new ovf(this.a, (abpw) obj, obj2, 11, (short[]) null));
            case 6:
                Object obj3 = this.b;
                return afwl.b(new ovf(this.a, (abpw) obj, obj3, 10, (short[]) null));
            case 7:
                abqh abqhVar = (abqh) obj;
                boolean z = abqhVar instanceof abpg;
                Object obj4 = this.a;
                if (z) {
                    return abqhVar.i((avlr) obj4);
                }
                return abqhVar.i(((avlr) obj4).O((avmb) ((abqq) this.b).g));
            case 8:
                abqh abqhVar2 = (abqh) obj;
                boolean z2 = abqhVar2 instanceof abpg;
                Object obj5 = this.a;
                if (z2) {
                    return abqhVar2.j((avlr) obj5);
                }
                return abqhVar2.j(((avlr) obj5).O((avmb) ((abqq) this.b).g));
            case 9:
                ?? r3 = this.a;
                adsr adsrVar = (adsr) r3;
                boolean zL = adsrVar.Z.l(293, 45691342L, false);
                adsrVar.J = new adxr((Container) this.b, (adtv) r3, r3, adsrVar.F, zL);
                return adsrVar.J;
            default:
                Object obj6 = this.a;
                obj6.getClass();
                adxr adxrVar = (adxr) this.b;
                adxrVar.f = adxrVar.i((adxz) obj6);
                return adxrVar.f;
        }
        return aazzVar;
    }

    public final /* synthetic */ Function compose(Function function) {
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ aazx(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
