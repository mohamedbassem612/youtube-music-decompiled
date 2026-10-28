package com.google.cardboard.sdk;

import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class HeadTransform {
    private static final float GIMBAL_LOCK_EPSILON = 0.01f;
    private final float[] headView;

    public HeadTransform() {
        float[] fArr = new float[16];
        this.headView = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void getEulerAngles(float[] fArr, int i) {
        float fAtan2;
        float fAtan3;
        if (i + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float fAsin = (float) Math.asin(this.headView[6]);
        float f = this.headView[6];
        double dSqrt = Math.sqrt(1.0f - (f * f));
        float[] fArr2 = this.headView;
        if (dSqrt >= 0.009999999776482582d) {
            fAtan3 = (float) Math.atan2(-fArr2[2], fArr2[10]);
            float[] fArr3 = this.headView;
            fAtan2 = (float) Math.atan2(-fArr3[4], fArr3[5]);
        } else {
            fAtan2 = (float) Math.atan2(fArr2[1], fArr2[0]);
            fAtan3 = 0.0f;
        }
        fArr[i] = -fAsin;
        fArr[i + 1] = -fAtan3;
        fArr[i + 2] = -fAtan2;
    }

    public void getForwardVector(float[] fArr, int i) {
        if (i + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2 + i] = -this.headView[(i2 << 2) + 2];
        }
    }

    public void getHeadView(float[] fArr, int i) {
        if (i + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        System.arraycopy(this.headView, 0, fArr, i, 16);
    }

    public void getQuaternion(float[] fArr, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (i + 4 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float[] fArr2 = this.headView;
        float f8 = fArr2[0];
        float f9 = fArr2[5];
        float f10 = fArr2[10];
        float f11 = f8 + f9 + f10;
        if (f11 >= 0.0f) {
            float fSqrt = (float) Math.sqrt(f11 + 1.0f);
            f7 = fSqrt * 0.5f;
            float f12 = 0.5f / fSqrt;
            float f13 = fArr2[9] - fArr2[6];
            float f14 = fArr2[2] - fArr2[8];
            f = (fArr2[4] - fArr2[1]) * f12;
            f5 = f14 * f12;
            f6 = f13 * f12;
        } else {
            if (f8 <= f9 || f8 <= f10) {
                if (f9 > f10) {
                    float fSqrt2 = (float) Math.sqrt(((f9 + 1.0f) - f8) - f10);
                    f5 = fSqrt2 * 0.5f;
                    f2 = 0.5f / fSqrt2;
                    f3 = fArr2[4] + fArr2[1];
                    float f15 = fArr2[9] + fArr2[6];
                    f4 = (fArr2[2] - fArr2[8]) * f2;
                    f = f15 * f2;
                } else {
                    float fSqrt3 = (float) Math.sqrt(((f10 + 1.0f) - f8) - f9);
                    f = fSqrt3 * 0.5f;
                    f2 = 0.5f / fSqrt3;
                    f3 = fArr2[2] + fArr2[8];
                    float f16 = fArr2[9] + fArr2[6];
                    f4 = (fArr2[4] - fArr2[1]) * f2;
                    f5 = f16 * f2;
                }
                f6 = f3 * f2;
            } else {
                float fSqrt4 = (float) Math.sqrt(((f8 + 1.0f) - f9) - f10);
                float f17 = fSqrt4 * 0.5f;
                float f18 = 0.5f / fSqrt4;
                float f19 = fArr2[4] + fArr2[1];
                float f20 = fArr2[2] + fArr2[8];
                f4 = (fArr2[9] - fArr2[6]) * f18;
                f = f20 * f18;
                f5 = f19 * f18;
                f6 = f17;
            }
            f7 = f4;
        }
        fArr[i] = f6;
        fArr[i + 1] = f5;
        fArr[i + 2] = f;
        fArr[i + 3] = f7;
    }

    public void getRightVector(float[] fArr, int i) {
        if (i + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2 + i] = this.headView[i2 << 2];
        }
    }

    public void getTranslation(float[] fArr, int i) {
        if (i + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2 + i] = this.headView[i2 + 12];
        }
    }

    public void getUpVector(float[] fArr, int i) {
        if (i + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2 + i] = this.headView[(i2 << 2) + 1];
        }
    }

    public float[] getHeadView() {
        return this.headView;
    }
}
