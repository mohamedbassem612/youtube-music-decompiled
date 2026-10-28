package com.google.cardboard.sdk;

import android.opengl.Matrix;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FieldOfView {
    private static final float CARDBOARD_V1_MAX_FOV_BOTTOM = 40.0f;
    private static final float CARDBOARD_V1_MAX_FOV_LEFT_RIGHT = 40.0f;
    private static final float CARDBOARD_V1_MAX_FOV_TOP = 40.0f;
    private static final float CARDBOARD_V2_2_MAX_FOV_BOTTOM = 60.0f;
    private static final float CARDBOARD_V2_2_MAX_FOV_LEFT_RIGHT = 60.0f;
    private static final float CARDBOARD_V2_2_MAX_FOV_TOP = 60.0f;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public FieldOfView() {
        this.left = 60.0f;
        this.right = 60.0f;
        this.bottom = 60.0f;
        this.top = 60.0f;
    }

    public static FieldOfView cardboardV1FieldOfView() {
        FieldOfView fieldOfView = new FieldOfView();
        fieldOfView.setAngles(40.0f, 40.0f, 40.0f, 40.0f);
        return fieldOfView;
    }

    public static FieldOfView parseFromProtobuf(List list) {
        if (list.size() != 4) {
            return null;
        }
        return new FieldOfView(((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue(), ((Float) list.get(2)).floatValue(), ((Float) list.get(3)).floatValue());
    }

    public void copy(FieldOfView fieldOfView) {
        this.left = fieldOfView.left;
        this.right = fieldOfView.right;
        this.bottom = fieldOfView.bottom;
        this.top = fieldOfView.top;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof FieldOfView)) {
                return false;
            }
            FieldOfView fieldOfView = (FieldOfView) obj;
            if (this.left != fieldOfView.left || this.right != fieldOfView.right || this.bottom != fieldOfView.bottom || this.top != fieldOfView.top) {
                return false;
            }
        }
        return true;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setAngles(float f, float f2, float f3, float f4) {
        this.left = f;
        this.right = f2;
        this.bottom = f3;
        this.top = f4;
    }

    public void setBottom(float f) {
        this.bottom = f;
    }

    public void setLeft(float f) {
        this.left = f;
    }

    public void setRight(float f) {
        this.right = f;
    }

    public void setTop(float f) {
        this.top = f;
    }

    public void toPerspectiveMatrix(float f, float f2, float[] fArr, int i) {
        if (i + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        double d = f;
        Matrix.frustumM(fArr, i, (float) ((-Math.tan(Math.toRadians(this.left))) * d), (float) (Math.tan(Math.toRadians(this.right)) * d), (float) ((-Math.tan(Math.toRadians(this.bottom))) * d), (float) (Math.tan(Math.toRadians(this.top)) * d), f, f2);
    }

    public float[] toProtobuf() {
        return new float[]{this.left, this.right, this.bottom, this.top};
    }

    public List toProtobufAsList() {
        return Arrays.asList(Float.valueOf(this.left), Float.valueOf(this.right), Float.valueOf(this.bottom), Float.valueOf(this.top));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        sb.append("  left: " + this.left + ",\n");
        sb.append("  right: " + this.right + ",\n");
        sb.append("  bottom: " + this.bottom + ",\n");
        sb.append("  top: " + this.top + ",\n");
        sb.append('}');
        return sb.toString();
    }

    public FieldOfView(float f, float f2, float f3, float f4) {
        setAngles(f, f2, f3, f4);
    }

    public FieldOfView(FieldOfView fieldOfView) {
        copy(fieldOfView);
    }

    public static FieldOfView parseFromProtobuf(float[] fArr) {
        if (fArr.length != 4) {
            return null;
        }
        return new FieldOfView(fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
