package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgl {
    public final int a;
    public final Object b;
    public final Object c;

    public xgl(Context context, ahex ahexVar) {
        context.getClass();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.c = audioManager;
        this.a = audioManager.getStreamMaxVolume(3);
        this.b = ahexVar;
    }

    public static final String a(argn argnVar, String str) {
        return String.valueOf(argnVar.c) + ':' + argnVar.d + ':' + argnVar.f + ':' + str;
    }

    public static xgl g(String str, long j) {
        return new xgl(str, Long.valueOf(j), 2);
    }

    public static xgl h(String str, boolean z) {
        return new xgl(str, Boolean.valueOf(z), 1);
    }

    private final int j(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.b)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.b)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final int b() {
        if (this.a == 0) {
            return 0;
        }
        return c();
    }

    public final int c() {
        return (((AudioManager) this.c).getStreamVolume(3) * 100) / this.a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Object d() {
        jni jniVar = (jni) jwv.a.get();
        if (jniVar == null) {
            if (jwv.a() != null) {
                jwv.a().a();
            }
            return this.b;
        }
        int i = this.a - 1;
        Object obj = this.c;
        if (i != 0) {
            long jLongValue = ((Long) this.b).longValue();
            try {
                return Long.valueOf(jniVar.a.getLong((String) obj, jLongValue));
            } catch (ClassCastException unused) {
                return Long.valueOf(jniVar.a.getInt((String) obj, (int) jLongValue));
            }
        }
        boolean zBooleanValue = ((Boolean) this.b).booleanValue();
        try {
            return Boolean.valueOf(jniVar.a.getBoolean((String) obj, zBooleanValue));
        } catch (ClassCastException unused2) {
            return Boolean.valueOf(jniVar.a.getString((String) obj, String.valueOf(zBooleanValue)));
        }
    }

    public final Object e(long j) {
        int iJ = j(j);
        if (iJ >= 0) {
            return ((Object[]) this.c)[iJ];
        }
        return null;
    }

    public final boolean f(long j, Object obj) {
        int iJ = j(j);
        if (iJ < 0) {
            return false;
        }
        ((Object[]) this.c)[iJ] = obj;
        return true;
    }

    public final xgl i(long j, Object obj) {
        Object[] objArr;
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = (Object[]) this.c;
            if (i3 >= objArr.length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                i = this.a;
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = ((long[]) this.b)[i6];
                Object obj2 = objArr[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                jArr[i4] = j;
                objArr2[i4] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = ((long[]) this.b)[i6];
                    Object obj3 = objArr[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new xgl(i5, jArr, objArr2);
    }

    protected xgl(String str, Object obj, int i) {
        this.c = str;
        this.b = obj;
        this.a = i;
    }

    public xgl(knt kntVar, int i, kmz kmzVar) {
        this.b = kntVar;
        this.a = i;
        this.c = kmzVar;
    }

    public xgl(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public xgl(vxz vxzVar) {
        this.b = new LinkedHashMap();
        this.c = vxzVar;
        this.a = (int) vxzVar.c(22, 45737749L, 10L);
    }
}
