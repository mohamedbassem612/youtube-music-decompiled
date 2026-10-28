package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwj {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile(".*\\.so$", 2);

    public static boolean a(gcw gcwVar) {
        int iOrdinal = gcwVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final gcw b(Context context, kwc kwcVar) {
        gcw gcwVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new agyp(b));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (kwcVar != null) {
                    kwcVar.b(5017, "No .so");
                } else {
                    kwcVar = null;
                }
                gcwVar = gcw.UNKNOWN;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                d(bArr, null, kwcVar);
                                gcwVar = gcw.UNSUPPORTED;
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    gcwVar = gcw.X86;
                                } else if (s == 40) {
                                    gcwVar = gcw.ARM7;
                                } else if (s == 62) {
                                    gcwVar = gcw.X86_64;
                                } else if (s == 183) {
                                    gcwVar = gcw.ARM64;
                                } else if (s != 243) {
                                    d(bArr, null, kwcVar);
                                    gcwVar = gcw.UNSUPPORTED;
                                } else {
                                    gcwVar = gcw.RISCV64;
                                }
                            }
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                            gcwVar = gcw.UNSUPPORTED;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    d(null, e.toString(), kwcVar);
                }
            }
        } else {
            if (kwcVar != null) {
                kwcVar.b(5017, "No lib/");
            } else {
                kwcVar = null;
            }
            gcwVar = gcw.UNKNOWN;
        }
        if (gcwVar == gcw.UNKNOWN) {
            String strC = c(kwcVar);
            if (TextUtils.isEmpty(strC)) {
                d(null, "Empty dev arch", kwcVar);
                gcwVar = gcw.UNSUPPORTED;
            } else if (strC.equalsIgnoreCase("i686") || strC.equalsIgnoreCase("x86")) {
                gcwVar = gcw.X86;
            } else if (strC.equalsIgnoreCase("x86_64")) {
                gcwVar = gcw.X86_64;
            } else if (strC.equalsIgnoreCase("arm64-v8a")) {
                gcwVar = gcw.ARM64;
            } else if (strC.equalsIgnoreCase("armeabi-v7a") || strC.equalsIgnoreCase("armv71")) {
                gcwVar = gcw.ARM7;
            } else if (strC.equalsIgnoreCase("riscv64")) {
                gcwVar = gcw.RISCV64;
            } else {
                d(null, strC, kwcVar);
                gcwVar = gcw.UNSUPPORTED;
            }
        }
        if (kwcVar != null) {
            kwcVar.b(5018, gcwVar.name());
        }
        return gcwVar;
    }

    private static final String c(kwc kwcVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strA = agfn.OS_ARCH.a();
        if (!TextUtils.isEmpty(strA) && hashSet.contains(strA)) {
            return strA;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            if (kwcVar != null) {
                kwcVar.c(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            if (kwcVar != null) {
                kwcVar.c(2024, 0L, e2);
            }
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }

    private static final void d(byte[] bArr, String str, kwc kwcVar) {
        if (kwcVar != null) {
            StringBuilder sb = new StringBuilder("os.arch:");
            sb.append(agfn.OS_ARCH.a());
            sb.append(';');
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(';');
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(';');
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(';');
            }
            if (str != null) {
                sb.append("dbg:");
                sb.append(str);
                sb.append(';');
            }
            kwcVar.b(4007, sb.toString());
        }
    }
}
