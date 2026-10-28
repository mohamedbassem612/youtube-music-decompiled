package com.google.cardboard.sdk.utils;

import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MathUtils {
    private static final String TAG = "MathUtils";

    private MathUtils() {
    }

    public static float[] getMatrixFromPose(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, fArr[0], fArr[1], fArr[2]);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, getRotationMatrixFromQuaternion(fArr2), 0);
        return fArr4;
    }

    private static float[] getRotationMatrixFromQuaternion(float[] fArr) {
        float f = fArr[0];
        float f2 = f + f;
        float f3 = f * f2;
        float f4 = fArr[1];
        float f5 = f4 + f4;
        float f6 = f5 * f4;
        float f7 = fArr[2];
        float f8 = f7 + f7;
        float f9 = f8 * f7;
        float f10 = f4 * f2;
        float f11 = f2 * f7;
        float f12 = f7 * f5;
        float f13 = fArr[3];
        float f14 = f2 * f13;
        float f15 = f5 * f13;
        float f16 = f8 * f13;
        float f17 = 1.0f - f3;
        return new float[]{(1.0f - f6) - f9, f10 + f16, f11 - f15, 0.0f, f10 - f16, f17 - f9, f12 + f14, 0.0f, f11 + f15, f12 - f14, f17 - f6, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
