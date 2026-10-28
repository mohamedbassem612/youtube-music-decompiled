package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import internal.org.jni_zero.CommonApis;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aujj implements aujl {
    private final Context a;

    public aujj(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.aujl
    public final agzk a(aukb aukbVar) {
        return null;
    }

    @Override // defpackage.aujl
    public final aujy b() {
        String str = auiy.a;
        return (aujy) auiy.a(aujy.a.createBuilder(), "current_device_params", 894990891, true, this.a);
    }

    @Override // defpackage.aujl
    public final aujz c() {
        ArrayList arrayList;
        avcl avclVar;
        String str;
        String str2;
        String str3;
        String str4 = auiy.a;
        aujz aujzVar = aujz.a;
        aihf aihfVarCreateBuilder = aujzVar.createBuilder();
        Context context = this.a;
        aujz aujzVar2 = (aujz) auiy.a(aihfVarCreateBuilder, "phone_params", 779508118, false, context);
        if (aujzVar2 != null) {
            return aujzVar2;
        }
        ArrayList arrayList2 = aujk.a;
        aihf aihfVarCreateBuilder2 = aujzVar.createBuilder();
        List list = aujk.b;
        String str5 = Build.DEVICE;
        String strA = aujk.a(str5);
        Iterator it = list.iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                return null;
            }
            avclVar = (avcl) it.next();
            str = Build.MODEL;
            str2 = Build.MANUFACTURER;
            str3 = Build.HARDWARE;
            if (avclVar.g(str2, str5, str, str3)) {
                break;
            }
        } while (!avclVar.g(str2, strA, str, str3));
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", avclVar.g, avclVar.c, avclVar.f, avclVar.a, avclVar.e, avclVar.d, avclVar.b);
        Object obj = avclVar.e;
        if (obj != null) {
            float fFloatValue = ((Float) obj).floatValue();
            aihfVarCreateBuilder2.copyOnWrite();
            aujz aujzVar3 = (aujz) aihfVarCreateBuilder2.instance;
            aujzVar3.b |= 1;
            aujzVar3.c = fFloatValue;
        }
        Object obj2 = avclVar.d;
        if (obj2 != null) {
            float fFloatValue2 = ((Float) obj2).floatValue();
            aihfVarCreateBuilder2.copyOnWrite();
            aujz aujzVar4 = (aujz) aihfVarCreateBuilder2.instance;
            aujzVar4.b |= 2;
            aujzVar4.d = fFloatValue2;
        }
        Object obj3 = avclVar.b;
        if (obj3 != null) {
            float fFloatValue3 = ((Float) obj3).floatValue();
            aihfVarCreateBuilder2.copyOnWrite();
            aujz aujzVar5 = (aujz) aihfVarCreateBuilder2.instance;
            aujzVar5.b |= 4;
            aujzVar5.e = fFloatValue3;
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            Display displayY = CommonApis.y(context);
            DisplayMetrics displayMetricsX = CommonApis.x(displayY);
            int iMax = displayMetricsX.widthPixels;
            if (displayY != null && (arrayList = aujk.a) == null) {
                aujk.a = new ArrayList();
                Display.Mode[] supportedModes = displayY.getSupportedModes();
                if (supportedModes != null) {
                    for (Display.Mode mode : supportedModes) {
                        aujk.a.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                    }
                }
                arrayList = aujk.a;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Size size2 = (Size) arrayList.get(i);
                    iMax = Math.max(iMax, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (displayMetricsX.widthPixels != iMax) {
                    float f = displayMetricsX.widthPixels / iMax;
                    float f2 = ((aujz) aihfVarCreateBuilder2.instance).c * f;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aujz aujzVar6 = (aujz) aihfVarCreateBuilder2.instance;
                    aujzVar6.b |= 1;
                    aujzVar6.c = f2;
                    float f3 = aujzVar6.d * f;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aujz aujzVar7 = (aujz) aihfVarCreateBuilder2.instance;
                    aujzVar7.b |= 2;
                    aujzVar7.d = f3;
                }
            }
        }
        return (aujz) aihfVarCreateBuilder2.build();
    }

    @Override // defpackage.aujl
    public final auka d() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    @Override // defpackage.aujl
    public final boolean f(aujy aujyVar) throws Throwable {
        Context context = this.a;
        boolean zDelete = true;
        boolean z = false;
        if (aujyVar == null) {
            String str = auiy.a;
            try {
                File fileB = auiy.b("current_device_params", context);
                if (fileB.exists()) {
                    zDelete = fileB.delete();
                }
            } catch (IllegalStateException e) {
                Log.w(auiy.a, "Error clearing device parameters: ".concat(e.toString()));
                zDelete = false;
            }
            if (zDelete) {
                return zDelete;
            }
            Log.e(auiy.a, "Could not clear Cardboard parameters from storage.");
            return zDelete;
        }
        String str2 = auiy.a;
        byte[] byteArray = aujyVar.toByteArray();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(auiy.b("current_device_params", context)));
                try {
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        byteBufferAllocate.putInt(894990891);
                        byteBufferAllocate.putInt(byteArray.length);
                        bufferedOutputStream2.write(byteBufferAllocate.array());
                        bufferedOutputStream2.write(byteArray);
                    } catch (IOException e2) {
                        try {
                            Log.w(auiy.a, "Error writing parameters: ".concat(String.valueOf(e2.toString())));
                            zDelete = false;
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            bufferedOutputStream = bufferedOutputStream2;
                            Log.e(auiy.a, "Parameters file not found for writing: " + e.toString());
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                        }
                    }
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                    z = zDelete;
                } catch (IllegalStateException e4) {
                    e = e4;
                    bufferedOutputStream = bufferedOutputStream2;
                    Log.w(auiy.a, "Error writing parameters: " + e.toString());
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (!z) {
                        Log.e(auiy.a, "Could not write Cardboard parameters to storage.");
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        } catch (IllegalStateException e6) {
            e = e6;
        }
        if (!z) {
            Log.e(auiy.a, "Could not write Cardboard parameters to storage.");
        }
        return z;
    }

    @Override // defpackage.aujl
    public final void e() {
    }
}
