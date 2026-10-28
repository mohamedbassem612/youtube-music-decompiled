package org.chromium.base;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import defpackage.a;
import defpackage.axjh;
import defpackage.axjl;
import defpackage.axqi;
import defpackage.axqm;
import defpackage.axqs;
import defpackage.axrp;
import defpackage.axrq;
import defpackage.axrr;
import defpackage.axrs;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class JniAndroid {
    public static Context a;

    private JniAndroid() {
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Process.isSdkSandbox();
        }
        return false;
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (JSONException e) {
                throw new IllegalArgumentException(a.bU((byte) 93, str, "Failed adding a default object for key ["), e);
            }
        }
        return jSONObjectOptJSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[PHI: r4
      0x0097: PHI (r4v7 byte) = (r4v6 byte), (r4v12 byte) binds: [B:40:0x0092, B:42:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:82:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00af A[SYNTHETIC] */
    public static String c(byte[] bArr, int i, int i2) throws axqm {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (a.W(b2)) {
                    if (i6 >= i4) {
                        throw new axqm("Protocol message had invalid UTF-8.");
                    }
                    i3 = i5 + 1;
                    i += 2;
                    byte b4 = bArr[i6];
                    if (b2 < -62 || a.U(b4)) {
                        throw new axqm("Protocol message had invalid UTF-8.");
                    }
                    cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                } else {
                    if (a.V(b2)) {
                        if (i6 >= i4 - 1) {
                            throw new axqm("Protocol message had invalid UTF-8.");
                        }
                        i3 = i5 + 1;
                        int i7 = i + 2;
                        byte b5 = bArr[i6];
                        i += 3;
                        byte b6 = bArr[i7];
                        if (!a.U(b5)) {
                            if (b2 != -32) {
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            } else if (b5 >= -96) {
                                b2 = -32;
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            }
                        }
                        throw new axqm("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 2) {
                        throw new axqm("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i6];
                    int i8 = i + 3;
                    byte b8 = bArr[i + 2];
                    i += 4;
                    byte b9 = bArr[i8];
                    if (a.U(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || a.U(b8) || a.U(b9)) {
                        throw new axqm("Protocol message had invalid UTF-8.");
                    }
                    int i9 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                    cArr[i5] = (char) ((i9 >>> 10) + 55232);
                    cArr[i5 + 1] = (char) ((i9 & 1023) + 56320);
                    i5 += 2;
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static final int d(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int i4 = axrs.a;
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new axrr(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (axrr unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static axqs e(Object obj, Object obj2) {
        axqs axqsVarA = (axqs) obj;
        axqs axqsVar = (axqs) obj2;
        if (!axqsVar.isEmpty()) {
            if (!axqsVarA.b) {
                axqsVarA = axqsVarA.a();
            }
            axqsVarA.b();
            if (!axqsVar.isEmpty()) {
                axqsVarA.putAll(axqsVar);
            }
        }
        return axqsVarA;
    }

    public static axqi f(Object obj, long j) {
        return (axqi) axrq.a.i(obj, j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final List g(Object obj, long j) {
        axrp axrpVar = axrq.a;
        axqi axqiVar = (axqi) axrpVar.i(obj, j);
        if (axqiVar.c()) {
            return axqiVar;
        }
        int size = axqiVar.size();
        axqi axqiVarD = axqiVar.d(size == 0 ? 10 : size << 1);
        axrpVar.l(obj, j, axqiVarD);
        return axqiVarD;
    }

    private static Throwable handleException(Throwable th, String str) {
        try {
            Log.e("cn_JniAndroid", "Handling uncaught Java exception", th);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new axjh(str, th));
            Log.e("cn_JniAndroid", "Global uncaught exception handler did not terminate the process.");
        } catch (OutOfMemoryError unused) {
        } catch (Throwable th2) {
            Log.e("cn_JniAndroid", "Exception in uncaught exception handler.", th2);
            return th2;
        }
        return null;
    }

    private static String sanitizedStacktraceForUnhandledException(Throwable th) {
        int iLastIndexOf;
        try {
            try {
                String stackTraceString = Log.getStackTraceString(th);
                Pattern pattern = axjl.a;
                if (TextUtils.isEmpty(stackTraceString)) {
                    return "";
                }
                String[] strArrSplit = stackTraceString.split("\\n");
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (!strArrSplit[i].startsWith("\tat ")) {
                        String string = strArrSplit[i];
                        if (!axjl.b.matcher(string).find()) {
                            StringBuilder sb = new StringBuilder(string);
                            Pattern pattern2 = axjl.a;
                            Matcher matcher = pattern2.matcher(sb);
                            int i2 = 0;
                            while (matcher.find(i2)) {
                                int iStart = matcher.start();
                                int iEnd = matcher.end();
                                String strSubstring = sb.substring(iStart, iEnd);
                                String[] strArr = axjl.c;
                                int length = strArr.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < 3) {
                                        if (!strSubstring.startsWith(strArr[i3])) {
                                            i3++;
                                        }
                                    } else if (!strSubstring.startsWith("chromium-") || (!strSubstring.endsWith(".apk") && !strSubstring.endsWith(".aab"))) {
                                        String[] strArr2 = axjl.d;
                                        int length2 = strArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= 14) {
                                                if (!axjl.a(strSubstring) && ((iLastIndexOf = strSubstring.lastIndexOf(".")) == -1 || !axjl.a(strSubstring.substring(0, iLastIndexOf)))) {
                                                    sb.replace(iStart, iEnd, "HTTP://WEBADDRESS.ELIDED");
                                                    i2 = iStart + 24;
                                                    matcher = pattern2.matcher(sb);
                                                    break;
                                                }
                                            } else if (!strSubstring.startsWith(strArr2[i4])) {
                                                i4++;
                                            }
                                        }
                                    }
                                    i2 = iEnd;
                                    break;
                                }
                            }
                            string = sb.toString();
                        }
                        strArrSplit[i] = string;
                    }
                }
                return TextUtils.join("\n", strArrSplit);
            } catch (Throwable th2) {
                return a.ce(Log.getStackTraceString(th2), "Error while getting stack trace: ");
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
        return null;
    }
}
