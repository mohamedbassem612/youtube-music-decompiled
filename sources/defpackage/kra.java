package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kra implements ServiceConnection, krb {
    public boolean d;
    public IBinder e;
    public ComponentName f;
    public final /* synthetic */ kqy g;
    public khn h;
    private final kqx i;
    public int b = 0;
    public final Map a = new HashMap();
    public int c = 2;

    public kra(kqy kqyVar, kqx kqxVar) {
        this.g = kqyVar;
        this.i = kqxVar;
    }

    public final klo a(String str, Executor executor) {
        Intent component;
        Bundle bundleCall;
        klo kloVar;
        try {
            Context context = this.g.e;
            kqx kqxVar = this.i;
            Uri uri = kru.a;
            String str2 = kqxVar.a;
            if (str2 == null) {
                component = new Intent().setComponent(kqxVar.c);
            } else {
                Intent intent = null;
                if (kqxVar.e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("serviceActionBundleKey", str2);
                    try {
                        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(kru.a);
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new RemoteException("Failed to acquire ContentProviderClient");
                        }
                        try {
                            bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (bundleCall != null) {
                                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                                if (intent2 != null) {
                                    intent = intent2;
                                } else {
                                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                    if (pendingIntent != null) {
                                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                        throw new krp(new klo(1, 25, pendingIntent, null, null, null));
                                    }
                                }
                            }
                            if (intent == null) {
                                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                            }
                        } catch (Throwable th) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            throw th;
                        }
                    } catch (RemoteException | IllegalArgumentException e) {
                        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundleCall = null;
                    }
                }
                component = intent;
                if (component == null) {
                    component = new Intent(str2).setPackage(kqxVar.b);
                }
            }
            Intent intent3 = component;
            this.c = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (a.aO()) {
                StrictMode.setVmPolicy(ksy.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                kqy kqyVar = this.g;
                ksp kspVar = kqyVar.g;
                Context context2 = kqyVar.e;
                kqx kqxVar2 = this.i;
                boolean zD = kspVar.d(context2, str, intent3, this, 4225, executor);
                this.d = zD;
                if (zD) {
                    this.h = new khn(kqxVar2, this);
                    kqyVar.f.sendMessageDelayed(kqyVar.f.obtainMessage(1, this.h), kqyVar.h);
                    kloVar = klo.a;
                } else {
                    this.c = 2;
                    try {
                        kspVar.b(context2, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    kloVar = new klo(1, 16, null, null, null, null);
                }
                return kloVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (krp e2) {
            return e2.a;
        }
    }

    public final void b(List list, int i, ComponentName componentName) {
        Object obj;
        Object value;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            synchronized (this.g.d) {
                if (this.b != i) {
                    return;
                }
                obj = this.a.get(entry.getKey());
                value = entry.getValue();
            }
            if (obj == value) {
                ((ServiceConnection) entry.getValue()).onServiceDisconnected(componentName);
            }
        }
    }

    public final boolean c(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, new kqz(serviceConnection2));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        ArrayList arrayList;
        Object obj;
        Object value;
        kqy kqyVar = this.g;
        synchronized (kqyVar.d) {
            kqyVar.d(this);
            this.e = iBinder;
            this.f = componentName;
            this.c = 1;
            i = this.b + 1;
            this.b = i;
            Map map = this.a;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry((ServiceConnection) entry.getKey(), (ServiceConnection) entry.getValue()));
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entry2 = (Map.Entry) arrayList.get(i2);
            synchronized (this.g.d) {
                if (this.b != i) {
                    return;
                }
                obj = this.a.get(entry2.getKey());
                value = entry2.getValue();
            }
            if (obj == value) {
                ((ServiceConnection) entry2.getValue()).onServiceConnected(componentName, iBinder);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i;
        ArrayList arrayList;
        kqy kqyVar = this.g;
        synchronized (kqyVar.d) {
            kqyVar.d(this);
            this.e = null;
            this.f = componentName;
            this.c = 2;
            i = this.b + 1;
            this.b = i;
            Map map = this.a;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry((ServiceConnection) entry.getKey(), (ServiceConnection) entry.getValue()));
            }
        }
        b(arrayList, i, componentName);
    }
}
