package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqs implements Function {
    public final /* synthetic */ uqx a;
    public final /* synthetic */ uro b;

    public /* synthetic */ uqs(uqx uqxVar, uro uroVar) {
        this.a = uqxVar;
        this.b = uroVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        uro uroVar = this.b;
        uqv uqvVar = (uqv) obj;
        if (uroVar.c.isPresent()) {
            return Boolean.TRUE;
        }
        uqx uqxVar = this.a;
        if (uqvVar.e) {
            ujl ujlVar = uqxVar.j;
            long j = uqvVar.c.e;
            UUID uuid = uqvVar.a;
            Size size = uqvVar.k;
            Optional optionalN = uqxVar.h.n(uuid, size);
            sla slaVar = new sla(size, 16);
            if (true == optionalN.isPresent()) {
                Object obj2 = optionalN.get();
                Object obj3 = slaVar.a;
                qub qubVar = (qub) obj2;
                Rect rect = qubVar.c;
                Matrix matrix = qubVar.d;
                RectF rectF = new RectF(rect);
                Matrix matrix2 = new Matrix();
                if (!matrix.invert(matrix2)) {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 261, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to invert matrix");
                    optionalN = Optional.empty();
                } else if (!matrix2.preTranslate(rectF.left, rectF.top)) {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 266, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to translate matrix to local top left");
                    optionalN = Optional.empty();
                } else if (matrix2.preScale(rectF.width(), rectF.height())) {
                    Size size2 = (Size) obj3;
                    if (matrix2.postScale(1.0f / size2.getWidth(), 1.0f / size2.getHeight())) {
                        optionalN = Optional.of(matrix2);
                    } else {
                        ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 278, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale down matrix to normalized video frame");
                        optionalN = Optional.empty();
                    }
                } else {
                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 272, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale up matrix from unit rect to local bounds");
                    optionalN = Optional.empty();
                }
            }
            if (true == optionalN.isPresent()) {
                float[] fArr = new float[9];
                ((Matrix) optionalN.get()).getValues(fArr);
                aihf aihfVarCreateBuilder = aimy.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aimy aimyVar = (aimy) aihfVarCreateBuilder.instance;
                aimyVar.b |= 2;
                aimyVar.d = 3;
                aihfVarCreateBuilder.copyOnWrite();
                aimy aimyVar2 = (aimy) aihfVarCreateBuilder.instance;
                aimyVar2.b |= 1;
                aimyVar2.c = 3;
                aihfVarCreateBuilder.copyOnWrite();
                aimy aimyVar3 = (aimy) aihfVarCreateBuilder.instance;
                aimyVar3.f = 1;
                aimyVar3.b |= 4;
                aihfVarCreateBuilder.az(new ahbm(fArr, 0, 9));
                optionalN = Optional.ofNullable((aimy) aihfVarCreateBuilder.build());
            }
            ujlVar.n(j, optionalN);
            ujlVar.s(1);
        } else {
            augy augyVar = uqvVar.c;
            aigu aiguVar = augyVar.i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            ujl ujlVar2 = uqxVar.j;
            Duration durationAw = ahng.aw(aiguVar);
            long j2 = augyVar.e;
            aigu aiguVar2 = augyVar.j;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            ujlVar2.o(j2, durationAw, durationAw.plus(ahng.aw(aiguVar2)));
            ujlVar2.m(augyVar.e, false, uroVar.e);
            ujlVar2.s(2);
        }
        if (!uqvVar.g.isEmpty()) {
            uqxVar.j.l(auan.a);
        }
        if (uqvVar.h.isPresent()) {
            uqxVar.j.k(auaj.a);
        }
        uqxVar.b = Optional.empty();
        return Boolean.TRUE;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
