package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aujv {
    GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER(1000, "com.google.vr.beta.daydream_6dof_controller"),
    GVR_BETA_FEATURE_SEE_THROUGH(1001, "com.google.vr.beta.cameraSeeThrough");

    public final int c;
    public final String d;

    aujv(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public static aujv[] a(int[] iArr) {
        aujv aujvVar;
        if (iArr == null) {
            return new aujv[0];
        }
        int length = iArr.length;
        aujv[] aujvVarArr = new aujv[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            aujv[] aujvVarArrValues = values();
            int length2 = aujvVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    aujvVar = null;
                    break;
                }
                aujvVar = aujvVarArrValues[i3];
                if (aujvVar.c == i2) {
                    break;
                }
                i3++;
            }
            aujvVarArr[i] = aujvVar;
        }
        return aujvVarArr;
    }
}
