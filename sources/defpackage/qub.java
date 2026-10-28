package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import j$.util.Optional;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qub {
    public final UUID a;
    public final Rect b;
    public final Rect c;
    public final Matrix d;

    public qub(UUID uuid, Rect rect, Rect rect2, Matrix matrix) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.a = uuid;
        this.b = rect;
        this.c = rect2;
        this.d = matrix;
    }

    public static Optional a(Map.Entry entry, Size size) {
        Matrix matrix = (Matrix) entry.getValue();
        float width = size.getWidth();
        float height = size.getHeight();
        RectF rectF = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        float width2 = size.getWidth() / size.getHeight();
        Rect rect = new Rect(Math.round(((rectF2.left + width2) * size.getHeight()) / 2.0f), Math.round(((rectF2.top + 1.0f) * size.getHeight()) / 2.0f), Math.round(((rectF2.right + width2) * size.getHeight()) / 2.0f), Math.round(((rectF2.bottom + 1.0f) * size.getHeight()) / 2.0f));
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        matrix2.postScale(1.0f, -1.0f);
        Matrix matrix3 = new Matrix();
        matrix3.postScale(2.0f / size.getHeight(), 2.0f / size.getHeight());
        matrix3.postTranslate(-(width / height), -1.0f);
        matrix3.postConcat(matrix2);
        matrix3.postTranslate(1.0f, 1.0f);
        matrix3.postScale(0.5f, 0.5f);
        return Optional.of(new qub((UUID) entry.getKey(), rect, new Rect(0, 0, 1, 1), matrix3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qub) {
            qub qubVar = (qub) obj;
            if (this.a.equals(qubVar.a) && this.b.equals(qubVar.b) && this.c.equals(qubVar.c) && this.d.equals(qubVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Matrix matrix = this.d;
        Rect rect = this.c;
        Rect rect2 = this.b;
        return "FocusedSegment{uuid=" + this.a.toString() + ", boundingBox=" + rect2.toString() + ", localBoundingBox=" + rect.toString() + ", inverseTransformMatrix=" + matrix.toString() + '}';
    }

    public qub() {
        throw null;
    }
}
