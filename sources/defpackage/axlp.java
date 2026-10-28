package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axlp {
    private static String a;
    private static final Object b = new Object();
    private static axkl c;

    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f3 A[Catch: RuntimeException -> 0x0300, all -> 0x0354, TRY_LEAVE, TryCatch #16 {RuntimeException -> 0x0300, blocks: (B:127:0x01cd, B:128:0x01d9, B:130:0x01df, B:132:0x01e7, B:134:0x01eb, B:136:0x01f0, B:138:0x01f8, B:140:0x0200, B:142:0x0206, B:144:0x020b, B:145:0x0212, B:148:0x0220, B:151:0x0227, B:156:0x0233, B:158:0x023c, B:172:0x025c, B:180:0x026c, B:192:0x0289, B:193:0x0292, B:222:0x02f3, B:194:0x0293, B:196:0x0297, B:198:0x029e, B:197:0x029c, B:199:0x02a2, B:201:0x02a9, B:202:0x02ae, B:203:0x02b2, B:205:0x02b6, B:207:0x02c0, B:208:0x02c4, B:210:0x02c8, B:212:0x02d3, B:213:0x02d7, B:215:0x02db, B:217:0x02e6, B:218:0x02ea), top: B:261:0x01cd, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static axkl a(Context context, boolean z, boolean z2) {
        axlo axloVar;
        axqf axqfVarL;
        int i;
        Throwable th;
        Object axlqVar;
        int i2;
        String str;
        synchronized (b) {
            String str2 = a;
            if (str2 != null && !"156.0.8078.25".equals(str2)) {
                throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
            }
            axkl axklVar = c;
            if (axklVar != null) {
                return axklVar;
            }
            a = "156.0.8078.25";
            int i3 = 0;
            new axjt("HttpFlagsLoader#getHttpFlags loading flags", 0);
            if (axnm.a(context).getBoolean("android.net.http.ReadHttpFlags", true)) {
                try {
                    new axjt("HttpFlagsLoader#getProviderApplicationInfo", 0);
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                    ApplicationInfo applicationInfo = resolveInfoResolveService == null ? null : resolveInfoResolveService.serviceInfo.applicationInfo;
                    if (applicationInfo != null) {
                        String str3 = applicationInfo.packageName;
                        File file = new File(new File(new File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                        file.getAbsolutePath();
                        new axjt("HttpFlagsLoader#loadFlagsFile", 0);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                axlo axloVar2 = axlo.DEFAULT_INSTANCE;
                                axpy axpyVarA = axpy.a();
                                try {
                                    try {
                                        int i4 = fileInputStream.read();
                                        if (i4 == -1) {
                                            axqfVarL = null;
                                        } else {
                                            int i5 = axps.e;
                                            if ((i4 & SemanticState.Focused) != 0) {
                                                i4 &= 127;
                                                int i6 = 7;
                                                while (true) {
                                                    if (i6 < 32) {
                                                        int i7 = fileInputStream.read();
                                                        if (i7 == -1) {
                                                            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i4 |= (i7 & 127) << i6;
                                                        if ((i7 & SemanticState.Focused) == 0) {
                                                            break;
                                                        }
                                                        i6 += 7;
                                                    } else {
                                                        while (true) {
                                                            if (i6 >= 64) {
                                                                throw new axqm("CodedInputStream encountered a malformed varint.");
                                                            }
                                                            int i8 = fileInputStream.read();
                                                            if (i8 == -1) {
                                                                throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if ((i8 & SemanticState.Focused) == 0) {
                                                                break;
                                                            }
                                                            i6 += 7;
                                                        }
                                                    }
                                                }
                                            }
                                            axpr axprVar = new axpr(new axpe(fileInputStream, i4, 0));
                                            axqfVarL = axloVar2.l();
                                            try {
                                                try {
                                                    try {
                                                        axre axreVarB = axrb.a.b(axqfVarL);
                                                        Object axptVar = axprVar.d;
                                                        if (axptVar == null) {
                                                            axptVar = new axpt(axprVar);
                                                        }
                                                        axreVarB.f(axqfVarL, (axpt) axptVar, axpyVarA);
                                                        axreVarB.d(axqfVarL);
                                                        try {
                                                            axprVar.x(0);
                                                        } catch (axqm e) {
                                                            throw e;
                                                        }
                                                    } catch (axrk e2) {
                                                        throw e2.a();
                                                    }
                                                } catch (axqm e3) {
                                                    if (e3.a) {
                                                        throw new axqm(e3);
                                                    }
                                                    throw e3;
                                                } catch (IOException e4) {
                                                    if (e4.getCause() instanceof axqm) {
                                                        throw ((axqm) e4.getCause());
                                                    }
                                                    throw new axqm(e4);
                                                }
                                            } catch (RuntimeException e5) {
                                                if (e5.getCause() instanceof axqm) {
                                                    throw ((axqm) e5.getCause());
                                                }
                                                throw e5;
                                            }
                                        }
                                        if (axqfVarL != null && !axqf.t(axqfVarL)) {
                                            throw new axrk().a();
                                        }
                                        axloVar = (axlo) axqfVarL;
                                        fileInputStream.close();
                                        if (axloVar == null) {
                                            axloVar = null;
                                        }
                                    } catch (axqm e6) {
                                        if (e6.a) {
                                            throw new axqm(e6);
                                        }
                                        throw e6;
                                    }
                                } catch (IOException e7) {
                                    throw new axqm(e7);
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (FileNotFoundException unused) {
                            String.format("HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath());
                            axloVar = null;
                        } catch (IOException e8) {
                            throw new RuntimeException("Unable to read HTTP flags file", e8);
                        }
                    } else {
                        axloVar = null;
                    }
                } catch (RuntimeException unused2) {
                }
            } else {
                axloVar = null;
            }
            if (axloVar == null) {
                axloVar = (axlo) axlo.DEFAULT_INSTANCE.i().c();
            }
            String packageName = context.getPackageName();
            new axjt("Cronet ResolvedFlags#resolve", 0);
            int[] iArrE = axkl.e("156.0.8078.25");
            HashMap map = new HashMap();
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(axloVar.flags_).entrySet()) {
                try {
                    Iterator it = ((axlm) entry.getValue()).constrainedValues_.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            axll axllVar = (axll) it.next();
                            if (z2 || axllVar.applyEvenIfCronetTelemetryDisabled_) {
                                if ((axllVar.bitField0_ & 1) != 0) {
                                    String str4 = axllVar.appId_;
                                    if (str4.equals(packageName) || (str4.endsWith(".") && packageName.startsWith(str4))) {
                                    }
                                }
                                if ((axllVar.bitField0_ & 2) != 0) {
                                    int[] iArrE2 = axkl.e(axllVar.minVersion_);
                                    int i9 = i3;
                                    while (true) {
                                        int length = iArrE.length;
                                        i = i3;
                                        int length2 = iArrE2.length;
                                        th = null;
                                        if (i9 < Math.max(length, length2)) {
                                            int i10 = i9 < length ? iArrE[i9] : i;
                                            int i11 = i9 < length2 ? iArrE2[i9] : i;
                                            if (i10 <= i11) {
                                                if (i10 < i11) {
                                                    i3 = i;
                                                } else {
                                                    i9++;
                                                    i3 = i;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i = i3;
                                    th = null;
                                }
                                int i12 = axllVar.valueCase_;
                                if (i12 == 0) {
                                    i2 = 6;
                                } else if (i12 == 3) {
                                    i2 = 1;
                                } else if (i12 == 4) {
                                    i2 = 2;
                                } else if (i12 == 5) {
                                    i2 = 3;
                                } else if (i12 != 6) {
                                    i2 = i12 != 7 ? i : 5;
                                } else {
                                    i2 = 4;
                                }
                                int i13 = i2 - 1;
                                if (i2 == 0) {
                                    throw th;
                                }
                                if (i13 == 0) {
                                    axlqVar = new axlq(i12 == 3 ? ((Boolean) axllVar.value_).booleanValue() : i);
                                } else if (i13 == 1) {
                                    axlqVar = new axlq(i12 == 4 ? ((Long) axllVar.value_).longValue() : 0L);
                                } else if (i13 == 2) {
                                    axlqVar = new axlq(i12 == 5 ? ((Float) axllVar.value_).floatValue() : 0.0f);
                                } else if (i13 == 3) {
                                    axlqVar = new axlq(i12 == 6 ? (String) axllVar.value_ : "");
                                } else if (i13 == 4) {
                                    axlqVar = new axlq(i12 == 7 ? (axpo) axllVar.value_ : axpo.d);
                                } else if (i13 != 5) {
                                    if (i2 == 1) {
                                        str = "BOOL_VALUE";
                                    } else if (i2 == 2) {
                                        str = "INT_VALUE";
                                    } else if (i2 == 3) {
                                        str = "FLOAT_VALUE";
                                    } else if (i2 != 4) {
                                        str = i2 != 5 ? "VALUE_NOT_SET" : "BYTES_VALUE";
                                    } else {
                                        str = "STRING_VALUE";
                                    }
                                    throw new IllegalArgumentException("Flag value uses unknown value type ".concat(str));
                                }
                                if (axlqVar != null) {
                                    map.put((String) entry.getKey(), axlqVar);
                                }
                                i3 = i;
                            }
                        } else {
                            i = i3;
                            th = null;
                        }
                        axlqVar = th;
                        if (axlqVar != null) {
                            map.put((String) entry.getKey(), axlqVar);
                        }
                        i3 = i;
                    }
                } catch (RuntimeException e9) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + '`', e9);
                }
            }
            int i14 = i3;
            axkl axklVar2 = new axkl(map);
            c = axklVar2;
            axlq axlqVar2 = (axlq) axklVar2.d().get("Cronet_log_me");
            if (axlqVar2 != null) {
                String str5 = z ? "API" : "Impl";
                String strD = axlqVar2.d();
                Object[] objArr = new Object[2];
                objArr[i14] = str5;
                objArr[1] = strD;
                String.format("HTTP flags log line (%s): %s", objArr);
            }
            return c;
        }
    }
}
