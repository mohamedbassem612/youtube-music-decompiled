package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lqd {
    private static kwq a;

    public lqd() {
    }

    public static void a(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    public static int b(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Set<String> setKeySet = bundle.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return Objects.hash(setKeySet, linkedHashSet);
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
        } else if (bundle2 != null && bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null) {
                    if (obj2 != null || !bundle2.containsKey(str)) {
                    }
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !c((Bundle) obj, (Bundle) obj2)) {
                    }
                } else if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (Objects.equals(Array.get(obj, i), Array.get(obj2, i))) {
                            }
                        }
                    }
                } else if (!obj.equals(obj2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static Object d(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static void e(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object f(Class cls, String str, kyr... kyrVarArr) {
        int length = kyrVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < kyrVarArr.length; i++) {
            kyr kyrVar = kyrVarArr[i];
            kyrVar.getClass();
            clsArr[i] = (Class) kyrVar.b;
            objArr[i] = kyrVarArr[i].a;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static kmu g(Exception exc, int i, String str) {
        kmu kmuVar = new kmu(new Status(i, str.concat(exc.getMessage() == null ? "" : ": ".concat(String.valueOf(exc.getMessage()))), null, null));
        kmuVar.initCause(exc);
        return kmuVar;
    }

    public static kmu h(RemoteException remoteException, String str) {
        return g(remoteException, true != (remoteException instanceof DeadObjectException) ? 19 : 20, str);
    }

    public static synchronized kwq i(Context context) {
        kwq kwqVar;
        kwqVar = a;
        if (kwqVar == null) {
            HandlerThread handlerThread = new HandlerThread("DG");
            handlerThread.start();
            afkg afkgVar = new afkg(handlerThread.getLooper(), (byte[]) null);
            Context applicationContext = context.getApplicationContext();
            kuc kucVar = new kuc();
            kwq kwqVar2 = new kwq(new ahgb(afkgVar, new ktz(applicationContext, afkgVar.getLooper(), kucVar, kucVar), kucVar), new cck(afkgVar, 10), new kue(context), yz.d());
            a = kwqVar2;
            kwqVar = kwqVar2;
        }
        return kwqVar;
    }

    public static agcz j(Context context, byte[] bArr, agcy agcyVar) {
        Optional optionalEmpty;
        aihf aihfVarCreateBuilder = agcz.a.createBuilder();
        aigj aigjVarV = aigj.v(bArr);
        aihfVarCreateBuilder.copyOnWrite();
        agcz agczVar = (agcz) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        agczVar.b |= 2;
        agczVar.d = aigjVarV;
        aihfVarCreateBuilder.copyOnWrite();
        agcz agczVar2 = (agcz) aihfVarCreateBuilder.instance;
        agcyVar.getClass();
        agczVar2.e = agcyVar;
        agczVar2.b |= 4;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
            String string = sharedPreferences.getString("client_uuid", "");
            if (string.isEmpty()) {
                UUID uuidRandomUUID = UUID.randomUUID();
                sharedPreferences.edit().putString("client_uuid", uuidRandomUUID.toString()).apply();
                optionalEmpty = Optional.of(uuidRandomUUID);
            } else {
                optionalEmpty = Optional.of(UUID.fromString(string));
            }
        } catch (IllegalStateException unused) {
            optionalEmpty = Optional.empty();
        }
        if (true == optionalEmpty.isPresent()) {
            UUID uuid = (UUID) optionalEmpty.get();
            optionalEmpty = Optional.ofNullable(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        }
        jfn jfnVar = new jfn(aihfVarCreateBuilder, 10);
        if (true == optionalEmpty.isPresent()) {
            Object obj = optionalEmpty.get();
            Object obj2 = jfnVar.a;
            aigj aigjVarV2 = aigj.v((byte[]) obj);
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            agcz agczVar3 = (agcz) aihfVar.instance;
            aigjVarV2.getClass();
            agczVar3.b |= 16;
            agczVar3.f = aigjVarV2;
        }
        return (agcz) aihfVarCreateBuilder.build();
    }

    public static byte[] k(agcz agczVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (bArr[2] ^ ((byte) i));
            byteArrayOutputStream.write(bArr);
            aihf builder = agczVar.toBuilder();
            builder.copyOnWrite();
            agcz agczVar2 = (agcz) builder.instance;
            agczVar2.b &= -2;
            agczVar2.c = agcz.a.c;
            ((agcz) builder.build()).writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean l(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) kte.b(context).a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void m(Context context) {
        try {
            kro.l(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static boolean n(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public lqd(byte[] bArr) {
    }

    public void onDone() {
    }

    public void onMissing(lqa lqaVar) {
    }

    public void onNewItem(int i, Object obj) {
    }

    public void onUpdate(lqa lqaVar, Object obj) {
    }
}
