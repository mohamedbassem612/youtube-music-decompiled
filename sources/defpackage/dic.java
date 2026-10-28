package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dic extends Service {
    final Messenger a;
    final dia b;
    dhp c;
    final dhz d;
    private final dib e;
    private final ast f;

    public dic() {
        dib dibVar = new dib(this);
        this.e = dibVar;
        this.a = new Messenger(dibVar);
        this.b = new dia(this);
        if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001) {
            this.d = new dhu(this);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.d = new dht(this);
        } else {
            this.d = new dhz(this);
        }
        this.f = new dhy(this.d);
    }

    static Bundle a(dhq dhqVar, int i) {
        if (dhqVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<dhg> list = dhqVar.b;
        arrayList.addAll(list);
        azs.D(null, arrayList);
        boolean z = i < 4 ? false : dhqVar.c;
        for (dhg dhgVar : list) {
            if (i >= dhgVar.d() && i <= dhgVar.c()) {
                azs.C(dhgVar, arrayList);
            }
        }
        dhq dhqVar2 = new dhq(arrayList, z);
        Bundle bundle = dhqVar2.a;
        if (bundle != null) {
            return bundle;
        }
        dhqVar2.a = new Bundle();
        List list2 = dhqVar2.b;
        if (!list2.isEmpty()) {
            int size = list2.size();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((dhg) list2.get(i2)).a);
            }
            dhqVar2.a.putParcelableArrayList("routes", arrayList2);
        }
        dhqVar2.a.putBoolean("supportsDynamicGroupRoute", dhqVar2.c);
        return dhqVar2.a;
    }

    static String c(Messenger messenger) {
        return "Client connection ".concat(String.valueOf(messenger.getBinder().toString()));
    }

    static void e(Messenger messenger, int i) {
        if (i != 0) {
            f(messenger, 1, i, 0, null, null);
        }
    }

    static void f(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MediaRouteProviderSrv", "Could not send message to ".concat(c(messenger)), e);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        context.getPackageManager();
        this.d.c(context);
    }

    public abstract dhp b();

    final void d() {
        dhp dhpVarB;
        if (this.c != null || (dhpVarB = b()) == null) {
            return;
        }
        String strA = dhpVarB.g.a();
        if (strA.equals(getPackageName())) {
            this.c = dhpVarB;
            dhpVarB.gC(this.f);
            return;
        }
        throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + strA + ".  Service package name: " + getPackageName() + '.');
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d.a(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        dhp dhpVar = this.c;
        if (dhpVar != null) {
            dhpVar.gC(null);
        }
        dhz dhzVar = this.d;
        synchronized (dhzVar.j) {
            dhzVar.i.clear();
        }
        super.onDestroy();
    }
}
