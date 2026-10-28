package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nra {
    public static Drawable a(nuw nuwVar, Object obj, Drawable drawable, ImageView.ScaleType scaleType, nsl nslVar) {
        return drawable instanceof BitmapDrawable ? nuwVar.a(obj, ((BitmapDrawable) drawable).getBitmap(), scaleType, nslVar) : drawable;
    }

    public static final pzr b(List list, Bundle bundle) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Must provide at least one activity intent.");
        }
        return new pzr(1, list, bundle);
    }

    public static final /* synthetic */ pzo c(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (pzo) aihnVarBuild;
    }

    public static final void d(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.b |= 4;
        pzoVar.f = str;
    }

    public static final void e(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.b |= 32;
        pzoVar.i = j;
    }

    public static final void f(aiff aiffVar, aihf aihfVar) {
        aiffVar.getClass();
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.d = aiffVar;
        pzoVar.b |= 1;
    }

    public static final /* synthetic */ void g(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((pzo) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final void h(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.k = i - 1;
        pzoVar.b |= SemanticState.Hidden;
    }

    public static final void i(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.e = i - 1;
        pzoVar.b |= 2;
    }

    public static final void j(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.h = i == 1 ? aiif.a() : i - 2;
        pzoVar.b |= 16;
    }

    public static final void k(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pzo pzoVar = (pzo) aihfVar.instance;
        pzo pzoVar2 = pzo.a;
        pzoVar.g = i - 1;
        pzoVar.b |= 8;
    }

    public static /* synthetic */ long l(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) == 0 || (((j ^ j2) >> 63) | 1) >= 0) ? j3 : j3 - 1;
    }

    public static Matrix m(RectF rectF) {
        float f = rectF.right - rectF.left;
        float f2 = rectF.bottom - rectF.top;
        float f3 = rectF.right + rectF.left;
        float f4 = rectF.bottom + rectF.top;
        Matrix matrix = new Matrix();
        matrix.postScale(f / 2.0f, f2 / 2.0f);
        matrix.postTranslate(f3 / 2.0f, -(f4 / 2.0f));
        return matrix;
    }

    public static awme n(quu quuVar, Size size, Size size2) {
        return o(quuVar, size, size2, Duration.ZERO);
    }

    public static awme o(quu quuVar, Size size, Size size2, Duration duration) {
        Matrix matrix = new Matrix();
        matrix.postScale(size2.getWidth() / size2.getHeight(), -1.0f);
        matrix.postScale(size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight());
        float fJ = (float) nrc.j(quuVar);
        PointF pointFL = nrc.l(quuVar);
        matrix.postRotate(fJ, 0.0f, 0.0f);
        matrix.postTranslate(pointFL.x, pointFL.y);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new awme(fArr);
    }

    public static awme p(Matrix matrix, Size size) {
        float width = size.getWidth();
        float height = size.getHeight();
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postScale(width / height, -1.0f);
        float[] fArr = new float[9];
        matrix2.getValues(fArr);
        return new awme(fArr);
    }

    public static float[] q(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], fArr[6], 0.0f, fArr[1], fArr[4], fArr[7], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fArr[2], fArr[5], fArr[8], 1.0f};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public static Matrix r(RectF rectF, SizeF sizeF, double d, PointF pointF, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        Matrix matrix = new Matrix();
        float f7 = f / f2;
        float f8 = f3 / f4;
        float f9 = 1.0f;
        if (f7 <= f8) {
            if (f7 < f8) {
                if (i != 0) {
                    throw null;
                }
                if (i == 2) {
                    f6 = f8;
                    f5 = 1.0f;
                    f9 = 1.0f / f7;
                    f7 = 1.0f;
                }
            }
            f5 = 1.0f / f8;
            f6 = 1.0f;
        } else {
            if (i == 0) {
                throw null;
            }
            if (i != 1) {
                i = 2;
                if (f7 < f8) {
                    if (i != 0) {
                        throw null;
                    }
                    if (i == 2) {
                        f6 = f8;
                        f5 = 1.0f;
                        f9 = 1.0f / f7;
                        f7 = 1.0f;
                    }
                }
                f5 = 1.0f / f8;
                f6 = 1.0f;
            } else {
                f6 = f8;
                f5 = 1.0f;
                f9 = 1.0f / f7;
                f7 = 1.0f;
            }
        }
        matrix.postConcat(m(rectF));
        matrix.postScale(f7, f9);
        matrix.postScale(sizeF.getWidth(), sizeF.getHeight());
        matrix.postRotate((float) (-d));
        matrix.postScale(f5, f6);
        matrix.postTranslate(pointF.x / f8, -pointF.y);
        return matrix;
    }

    public static agke s(List list, Function function, Function function2) {
        agjz agjzVar = new agjz(4);
        Iterator it = ((Map) Collection.EL.stream(list).collect(Collectors.groupingBy(function))).values().iterator();
        while (true) {
            int i = 11;
            if (!it.hasNext()) {
                return agke.B(Comparator$CC.comparing(new qzp(i)), agjzVar.g());
            }
            List list2 = (List) it.next();
            Comparator comparatorNaturalOrder = Comparator$CC.naturalOrder();
            Comparator comparatorThenComparing = Comparator$EL.thenComparing(Comparator$CC.comparing(new qzp(i)), new qzp(12));
            comparatorNaturalOrder.getClass();
            comparatorThenComparing.getClass();
            agqq agqqVar = new agqq(comparatorNaturalOrder, comparatorThenComparing);
            Iterable$EL.forEach(list2, new kjk(agqqVar, 17));
            while (!agqqVar.w()) {
                agjz agjzVar2 = new agjz(4);
                qvu qvuVar = (qvu) agqqVar.c((Duration) agqqVar.q().first()).first();
                agjzVar2.h(qvuVar);
                agqqVar.x(qvuVar.p, qvuVar);
                Optional optionalU = u(agqqVar, qvuVar);
                while (optionalU.isPresent()) {
                    qvu qvuVar2 = (qvu) optionalU.get();
                    agjzVar2.h(qvuVar2);
                    agqqVar.x(qvuVar2.p, qvuVar2);
                    optionalU = u(agqqVar, qvuVar2);
                }
                agjzVar.j((Iterable) function2.apply(agjzVar2.g()));
            }
        }
    }

    public static UUID t(List list) {
        Iterator it = list.iterator();
        long leastSignificantBits = 1;
        long mostSignificantBits = 1;
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            leastSignificantBits += uuid.getLeastSignificantBits();
            mostSignificantBits += uuid.getMostSignificantBits();
        }
        return new UUID(leastSignificantBits, mostSignificantBits);
    }

    private static Optional u(agqq agqqVar, qvu qvuVar) {
        Duration durationPlus = qvuVar.p.plus(qvuVar.iu());
        return Collection.EL.stream(agqqVar.c(durationPlus)).findFirst().or(new uqq(agqqVar, durationPlus, 1));
    }
}
