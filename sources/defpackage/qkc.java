package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkc {
    private static volatile agev a;

    private qkc() {
    }

    public static agev a(Context context) {
        agev agfaVar;
        agev agfaVar2;
        agev agevVar = a;
        if (agevVar == null) {
            synchronized (qkc.class) {
                agevVar = a;
                if (agevVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i = qke.a;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        int i2 = mef.a;
                        if (!context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                agfaVar = file.exists() ? new agfa(file) : agdf.a;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                agfaVar = agdf.a;
                            }
                            if (agfaVar.g()) {
                                Object objC = agfaVar.c();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objC)));
                                    try {
                                        aha ahaVar = new aha(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", a.ce(line, "Invalid: "));
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                aha ahaVar2 = (aha) ahaVar.get(str3);
                                                if (ahaVar2 == null) {
                                                    ahaVar2 = new aha(0);
                                                    ahaVar.put(str3, ahaVar2);
                                                }
                                                ahaVar2.put(strDecode, strDecode2);
                                            }
                                        }
                                        Log.w("HermeticFileOverrides", "Parsed " + objC.toString() + " for Android package " + context.getPackageName());
                                        ijt ijtVar = new ijt(ahaVar);
                                        bufferedReader.close();
                                        agfaVar2 = new agfa(ijtVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                agfaVar2 = agdf.a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        agfaVar2 = agdf.a;
                    }
                    a = agfaVar2;
                    agevVar = agfaVar2;
                }
            }
        }
        return agevVar;
    }
}
