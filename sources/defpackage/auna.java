package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import internal.org.jni_zero.CommonApis;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class auna {
    public static WeakReference b;
    public static final aumz c = new aumz();
    private final Context a;
    public String d;
    public Messenger e;
    public Messenger f;
    public boolean g;
    public boolean h;
    public final aunb i;
    public final axoz j;
    private boolean k;
    private final ServiceConnection l;

    public auna(Context context, axoz axozVar, aunb aunbVar) {
        aumu aumuVar = new aumu(this, 0);
        this.l = aumuVar;
        b = new WeakReference(this);
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = axozVar;
        this.i = aunbVar;
        if (this.g || this.h) {
            return;
        }
        this.h = true;
        this.d = CommonApis.l();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.waze", "com.waze.sdk.SdkService"));
        applicationContext.bindService(intent, aumuVar, 1);
        this.k = true;
    }

    public final void a() {
        Messenger messenger = this.e;
        if (messenger != null) {
            try {
                String str = this.d;
                boolean zB = b();
                Message messageObtain = Message.obtain((Handler) null, 102);
                Bundle bundle = new Bundle();
                bundle.putString("token", str);
                bundle.putBoolean("request", zB);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    final boolean b() {
        return new aumy(c).hasNext();
    }

    public final void c() {
        if (this.k) {
            Messenger messenger = this.e;
            if (messenger != null) {
                try {
                    String str = this.d;
                    Message messageObtain = Message.obtain((Handler) null, 103);
                    Bundle bundle = new Bundle();
                    bundle.putString("token", str);
                    messageObtain.setData(bundle);
                    messenger.send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            this.a.unbindService(this.l);
            this.k = false;
        }
        if (this.g) {
            this.g = false;
            this.h = false;
            this.e = null;
            this.d = null;
            aumy aumyVar = new aumy(c);
            while (aumyVar.hasNext()) {
                aumyVar.next().b();
            }
            aunb aunbVar = this.i;
            if (aunbVar != null) {
                aunbVar.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, java.lang.Object] */
    public final void d(axoz axozVar) {
        Messenger messenger = this.e;
        if (messenger != null) {
            try {
                String str = this.d;
                Object obj = axozVar.b;
                ?? r6 = axozVar.a;
                Message messageObtain = Message.obtain((Handler) null, 106);
                Bundle bundle = new Bundle();
                bundle.putString("token", str);
                bundle.putString("statsEvent", (String) obj);
                bundle.putSerializable("statsParams", r6);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }
}
