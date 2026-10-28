package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aux implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public aux(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(auw auwVar) {
        if (auwVar.b) {
            this.b.unbindService(this);
            auwVar.b = false;
        }
        auwVar.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[LOOP:0: B:14:0x0046->B:19:0x0077, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:19:0x0077 A[Catch: RemoteException -> 0x008b, DeadObjectException -> 0x009e, LOOP:0: B:14:0x0046->B:19:0x0077, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #3 {DeadObjectException -> 0x009e, RemoteException -> 0x008b, blocks: (B:16:0x004e, B:19:0x0077, B:24:0x0087, B:25:0x008a), top: B:36:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[EDGE_INSN: B:39:0x009e->B:28:0x009e BREAK  A[LOOP:0: B:14:0x0046->B:19:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    private final void b(auw auwVar) {
        auv auvVar;
        ath athVar;
        Parcel parcelObtain;
        ArrayDeque arrayDeque = auwVar.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (!auwVar.b) {
            Intent intent = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
            ComponentName componentName = auwVar.a;
            Intent component = intent.setComponent(componentName);
            Context context = this.b;
            boolean zBindService = context.bindService(component, this, 33);
            auwVar.b = zBindService;
            if (zBindService) {
                auwVar.d = 0;
            } else {
                Objects.toString(componentName);
                Log.w("NotifManCompat", "Unable to bind to listener ".concat(String.valueOf(componentName)));
                context.unbindService(this);
            }
            if (auwVar.b) {
                if (auwVar.e != null) {
                    while (true) {
                        auvVar = (auv) arrayDeque.peek();
                        if (auvVar != null) {
                            break;
                        }
                        try {
                            athVar = auwVar.e;
                            Notification notification = auvVar.d;
                            String str = auvVar.c;
                            int i = auvVar.b;
                            String str2 = auvVar.a;
                            parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                                parcelObtain.writeString(str2);
                                parcelObtain.writeInt(i);
                                parcelObtain.writeString(str);
                                parcelObtain.writeTypedObject(notification, 0);
                                if (athVar.a.transact(1, parcelObtain, null, 1)) {
                                    throw new RemoteException("Method notify is unimplemented.");
                                }
                                parcelObtain.recycle();
                                arrayDeque.remove();
                            } catch (Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (DeadObjectException unused) {
                        } catch (RemoteException e) {
                            ComponentName componentName2 = auwVar.a;
                            Objects.toString(componentName2);
                            Log.w("NotifManCompat", "RemoteException communicating with ".concat(String.valueOf(componentName2)), e);
                        }
                    }
                    if (auwVar.c.isEmpty()) {
                        return;
                    }
                    c(auwVar);
                    return;
                }
            }
        } else if (auwVar.e != null) {
            while (true) {
                auvVar = (auv) arrayDeque.peek();
                if (auvVar != null) {
                    break;
                    break;
                }
                athVar = auwVar.e;
                Notification notification2 = auvVar.d;
                String str3 = auvVar.c;
                int i2 = auvVar.b;
                String str4 = auvVar.a;
                parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                parcelObtain.writeString(str4);
                parcelObtain.writeInt(i2);
                parcelObtain.writeString(str3);
                parcelObtain.writeTypedObject(notification2, 0);
                if (athVar.a.transact(1, parcelObtain, null, 1)) {
                    throw new RemoteException("Method notify is unimplemented.");
                }
                parcelObtain.recycle();
                arrayDeque.remove();
            }
            if (auwVar.c.isEmpty()) {
                c(auwVar);
                return;
            }
            return;
        }
        c(auwVar);
    }

    private final void c(auw auwVar) {
        ComponentName componentName = auwVar.a;
        Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = auwVar.d;
        int i2 = i + 1;
        auwVar.d = i2;
        if (i2 <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = auwVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(auwVar.d);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        ath athVar;
        int i = message.what;
        if (i == 0) {
            auv auvVar = (auv) message.obj;
            Context context = this.b;
            Object obj = auy.a;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (auy.a) {
                if (string != null) {
                    if (!string.equals(auy.b)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        auy.c = hashSet;
                        auy.b = string;
                    }
                }
                set = auy.c;
            }
            if (!set.equals(this.e)) {
                this.e = set;
                List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet2 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (set.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", a.bV(componentName, "Permission present on component ", ", not adding listener record."));
                        } else {
                            hashSet2.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet2) {
                    Map map = this.d;
                    if (!map.containsKey(componentName2)) {
                        map.put(componentName2, new auw(componentName2));
                    }
                }
                Iterator it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet2.contains(entry.getKey())) {
                        a((auw) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (auw auwVar : this.d.values()) {
                auwVar.c.add(auvVar);
                b(auwVar);
            }
        } else if (i == 1) {
            eol eolVar = (eol) message.obj;
            Object obj2 = eolVar.a;
            ?? r10 = eolVar.b;
            auw auwVar2 = (auw) this.d.get(obj2);
            if (auwVar2 != null) {
                if (r10 == 0) {
                    athVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = r10.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    athVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ath)) ? new ath(r10) : (ath) iInterfaceQueryLocalInterface;
                }
                auwVar2.e = athVar;
                auwVar2.d = 0;
                b(auwVar2);
            }
        } else if (i == 2) {
            auw auwVar3 = (auw) this.d.get((ComponentName) message.obj);
            if (auwVar3 != null) {
                a(auwVar3);
            }
        } else {
            if (i != 3) {
                return false;
            }
            auw auwVar4 = (auw) this.d.get((ComponentName) message.obj);
            if (auwVar4 != null) {
                b(auwVar4);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new eol(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
