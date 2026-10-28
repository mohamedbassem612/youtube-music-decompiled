package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class khn {
    public final Object a;
    public final Object b;

    public khn(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.a = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.a = new kku(iBinder);
            this.b = null;
        }
    }

    public static final void e() {
        Build.TYPE.equals("user");
    }

    private final void n(ajwo ajwoVar) {
        Optional optionalB = ((heg) this.a).b();
        jfn jfnVar = new jfn(ajwoVar, 2);
        if (true == optionalB.isPresent()) {
            ((vxe) optionalB.get()).a((ajwo) jfnVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String a(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        ?? r1 = this.b;
        String str2 = TextUtils.isEmpty(r1) ? "" : String.format("[%s] ", r1);
        return !TextUtils.isEmpty(str2) ? String.valueOf(str2).concat(String.valueOf(str)) : str;
    }

    public final void b(String str, Object... objArr) {
        Log.e((String) this.a, a(str, objArr));
    }

    public final void c(Throwable th, String str, Object... objArr) {
        Log.e((String) this.a, a(str, objArr), th);
    }

    public final void d(String str, Object... objArr) {
        Log.w((String) this.a, a(str, objArr));
    }

    public final void f(Throwable th, Object... objArr) {
        Log.w((String) this.a, a("receiverSessionId %s is not valid for hash", objArr), th);
    }

    public final void g(int i) {
        n(fhz.P(((Context) this.b).getString(i)));
    }

    public final void h(String str) {
        n(fhz.P(str));
    }

    protected final String i(String str) {
        return ((String) this.b).concat(str);
    }

    public final void j(String str, Throwable th) {
        Log.e((String) this.a, i(str), th);
    }

    public final void k(String str) {
        Log.e((String) this.a, i(str));
    }

    public final void l(String str) {
        Log.w((String) this.a, i(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void m(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.b;
        synchronized (r0) {
            map = new HashMap((Map) r0);
        }
        ?? r3 = this.a;
        synchronized (r3) {
            map2 = new HashMap((Map) r3);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).j(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((kjc) entry2.getKey()).w(new kmu(status));
            }
        }
    }

    public khn(String str) {
        this.b = str;
        this.a = "Auth";
        for (int i = 2; i <= 7 && !Log.isLoggable((String) this.a, i); i++) {
        }
    }

    public khn(kqx kqxVar, kra kraVar) {
        this.b = kqxVar;
        this.a = kraVar;
    }

    public khn() {
        Boolean bool = Boolean.FALSE;
        this.a = new awku(bool);
        this.b = new awku(bool);
    }

    public khn(String str, String str2) {
        kro.j(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str2;
    }

    public khn(Context context, heg hegVar) {
        this.b = context;
        this.a = hegVar;
    }

    public khn(String str, kro kroVar, kro kroVar2) {
        if (kroVar == null) {
            throw new NullPointerException("Cannot construct an Api with a null ClientBuilder");
        }
        if (kroVar2 != null) {
            this.a = str;
            this.b = kroVar;
            return;
        }
        throw new NullPointerException("Cannot construct an Api with a null ClientKey");
    }

    public khn(byte[] bArr) {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
