package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sla implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sla(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r8v123, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, qyy] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional optionalF;
        Optional optionalOf;
        Object wjiVar;
        int i = 9;
        quo quoVarE = null;
        boolean z = false;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                int i2 = slb.f;
                return aavv.s((apji) obj, (aigw) obj2);
            case 1:
                return this.a.b((qvc) obj);
            case 2:
                return (alvt) ((wjr) ((tld) this.a).a).D((byte[]) obj, alvt.a);
            case 3:
                wjiVar = new wji((alvt) obj, 0L, (wjb) ((tld) this.a).b);
                break;
            case 4:
                jsk jskVar = (jsk) ((awmd) obj).io();
                if (jskVar != null) {
                    Object obj3 = this.a;
                    sry sryVarA = quo.a();
                    sryVarA.a = jskVar;
                    sryVarA.b = obj3;
                    quoVarE = sryVarA.e();
                }
                return Optional.ofNullable(quoVarE);
            case 5:
                agrf agrfVar = uld.a;
                long jIntValue = ((Integer) obj).intValue();
                Object obj4 = this.a;
                if (jIntValue == 0) {
                    return obj4;
                }
                Size size = (Size) obj4;
                if (size.getWidth() <= jIntValue && size.getHeight() <= jIntValue) {
                    return obj4;
                }
                float f = jIntValue;
                float fMin = Math.min(f / size.getWidth(), f / size.getHeight());
                wjiVar = new Size((int) (size.getWidth() * fMin), (int) (size.getHeight() * fMin));
                break;
                break;
            case 6:
                Object obj5 = this.a;
                agrf agrfVar2 = uld.a;
                return qub.a((Map.Entry) obj, (Size) obj5);
            case 7:
                Object obj6 = this.a;
                agrf agrfVar3 = uld.a;
                return qub.a((Map.Entry) obj, (Size) obj6);
            case 8:
                uql uqlVar = (uql) obj;
                if (!uqlVar.n.H()) {
                    return Optional.empty();
                }
                PointF pointF = (PointF) this.a;
                Optional optionalO = uqlVar.d.o(new PointF(pointF.x, pointF.y), uqlVar.k);
                sla slaVar = new sla(uqlVar, 12);
                if (true != optionalO.isPresent()) {
                    return optionalO;
                }
                Object obj7 = optionalO.get();
                Object obj8 = slaVar.a;
                optionalF = ((uql) obj8).f.f(((qub) obj7).a);
                hqb hqbVar = new hqb(obj8, obj7, i, z ? 1 : 0);
                if (true == optionalF.isPresent()) {
                    wjiVar = optionalF;
                    Object obj9 = optionalF.get();
                    augy augyVar = (augy) obj9;
                    return Optional.ofNullable(new uvv(augyVar.e, ((qub) hqbVar.a).b, ((uql) hqbVar.b).o.O(augyVar), zf.P(augyVar)));
                }
                break;
            case 9:
                return (uom) ((ArrayList) ((aami) obj).b).get(((uon) this.a).c);
            case 10:
                uql uqlVar2 = (uql) this.a;
                return uqlVar2.d.n((UUID) obj, uqlVar2.k);
            case 11:
                Optional optionalF2 = ujt.f((aimy) obj);
                if (optionalF2.isEmpty()) {
                    optionalOf = Optional.empty();
                } else {
                    Object obj10 = this.a;
                    Matrix matrix = (Matrix) optionalF2.get();
                    SizeF sizeFE = ujt.e(matrix);
                    float fB = ujt.b(matrix);
                    Size size2 = ((uql) obj10).k;
                    if (matrix.postScale(size2.getWidth(), size2.getHeight())) {
                        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                        matrix.mapRect(rectF);
                        double dC = ujt.c(size2, Math.round(rectF.centerX()));
                        double d = ujt.d(size2, Math.round(rectF.centerY()));
                        aihf aihfVarCreateBuilder = auhp.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        auhp auhpVar = (auhp) aihfVarCreateBuilder.instance;
                        auhpVar.b |= 1;
                        auhpVar.c = (float) dC;
                        aihfVarCreateBuilder.copyOnWrite();
                        auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
                        auhpVar2.b |= 2;
                        auhpVar2.d = (float) d;
                        auhp auhpVar3 = (auhp) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = auho.a.createBuilder();
                        float width = sizeFE.getWidth();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auho auhoVar = (auho) aihfVarCreateBuilder2.instance;
                        auhoVar.b |= 1;
                        auhoVar.c = width;
                        float height = sizeFE.getHeight();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auho auhoVar2 = (auho) aihfVarCreateBuilder2.instance;
                        auhoVar2.b |= 2;
                        auhoVar2.d = height;
                        optionalOf = Optional.of(new ujs(auhpVar3, (auho) aihfVarCreateBuilder2.build(), fB));
                    } else {
                        optionalOf = Optional.empty();
                    }
                }
                return true == optionalOf.isPresent() ? Optional.ofNullable(((ujs) optionalOf.get()).a) : optionalOf;
            case 12:
                qub qubVar = (qub) obj;
                UUID uuid = qubVar.a;
                Object obj11 = this.a;
                Optional optionalF3 = ((uql) obj11).f.f(uuid);
                hqb hqbVar2 = new hqb(obj11, qubVar, i, z2 ? 1 : 0);
                boolean zIsPresent = optionalF3.isPresent();
                wjiVar = optionalF3;
                if (true == zIsPresent) {
                    Object obj12 = optionalF3.get();
                    augy augyVar2 = (augy) obj12;
                    return Optional.ofNullable(new uvv(augyVar2.e, ((qub) hqbVar2.a).b, ((uql) hqbVar2.b).o.O(augyVar2), zf.P(augyVar2)));
                }
                break;
            case 13:
                return ((uql) this.a).e((augy) obj);
            case 14:
                uqv uqvVar = (uqv) obj;
                uqu uquVar = new uqu(uqvVar);
                uqv uqvVar2 = (uqv) this.a;
                uquVar.f(uqvVar2.e);
                uquVar.d(uqvVar2.f);
                jrr jrrVar = (jrr) uqvVar.c.toBuilder();
                augy augyVar3 = uqvVar2.c;
                aigu aiguVar = augyVar3.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                jrrVar.copyOnWrite();
                augy augyVar4 = (augy) jrrVar.instance;
                aiguVar.getClass();
                augyVar4.i = aiguVar;
                augyVar4.b |= 16;
                aigu aiguVar2 = augyVar3.j;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                jrrVar.copyOnWrite();
                augy augyVar5 = (augy) jrrVar.instance;
                aiguVar2.getClass();
                augyVar5.j = aiguVar2;
                augyVar5.b |= 32;
                uquVar.e((augy) jrrVar.build());
                return uquVar.a();
            case 15:
                return Double.valueOf(((augy) this.a).o + ((Double) obj).doubleValue());
            case 16:
                qub qubVar2 = (qub) obj;
                Rect rect = qubVar2.c;
                Matrix matrix2 = qubVar2.d;
                RectF rectF2 = new RectF(rect);
                Matrix matrix3 = new Matrix();
                if (!matrix2.invert(matrix3)) {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 261, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to invert matrix");
                    return Optional.empty();
                }
                if (!matrix3.preTranslate(rectF2.left, rectF2.top)) {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 266, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to translate matrix to local top left");
                    return Optional.empty();
                }
                if (!matrix3.preScale(rectF2.width(), rectF2.height())) {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 272, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale up matrix from unit rect to local bounds");
                    return Optional.empty();
                }
                Size size3 = (Size) this.a;
                if (matrix3.postScale(1.0f / size3.getWidth(), 1.0f / size3.getHeight())) {
                    return Optional.of(matrix3);
                }
                ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 278, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale down matrix to normalized video frame");
                return Optional.empty();
            case 17:
                return uqo.a((uqp) obj, (Size) this.a);
            case 18:
                return this.a.invoke(obj);
            case 19:
                return Integer.valueOf(((Resources) this.a).getColor(((Integer) obj).intValue()));
            default:
                return Integer.valueOf((int) (((vkl) this.a).q.getTextSize() * ((Float) obj).floatValue()));
        }
        wjiVar = optionalF;
        return wjiVar;
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
        return Function$CC.$default$compose(this, function);
    }
}
