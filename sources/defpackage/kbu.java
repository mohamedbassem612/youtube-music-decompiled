package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbu extends kcq {
    public static final /* synthetic */ int f = 0;
    public final Set a;
    public final kcb b;
    public jzz c;
    public kfm d;
    public qcb e;
    private final Context h;
    private final kbn i;
    private final kdx j;
    private final kfz k;
    private CastDevice l;

    static {
        new khn("CastSession", (String) null);
    }

    public kbu(Context context, String str, String str2, kbn kbnVar, kdx kdxVar, kfz kfzVar) {
        super(context, str, str2);
        this.a = new HashSet();
        this.h = context.getApplicationContext();
        this.i = kbnVar;
        this.j = kdxVar;
        this.k = kfzVar;
        kuo kuoVarO = o();
        kby kbyVar = new kby(this, 0);
        int i = kdm.a;
        kcb kcbVarH = null;
        if (kuoVarO != null) {
            try {
                kcbVarH = kdm.a(context).h(kbnVar, kuoVarO, kbyVar);
            } catch (RemoteException | kcl unused) {
                khn.e();
            }
        }
        this.b = kcbVarH;
    }

    private final void r(Bundle bundle) {
        CastDevice castDeviceC = CastDevice.c(bundle);
        this.l = castDeviceC;
        if (castDeviceC == null) {
            kro.f("Must be called from the main thread.");
            kch kchVar = this.g;
            if (kchVar != null) {
                try {
                    if (kchVar.j()) {
                        kch kchVar2 = this.g;
                        if (kchVar2 != null) {
                            try {
                                kchVar2.k();
                                return;
                            } catch (RemoteException unused) {
                                khn.e();
                                return;
                            }
                        }
                        return;
                    }
                } catch (RemoteException unused2) {
                    khn.e();
                }
            }
            kch kchVar3 = this.g;
            if (kchVar3 != null) {
                try {
                    kchVar3.l();
                    return;
                } catch (RemoteException unused3) {
                    khn.e();
                    return;
                }
            }
            return;
        }
        jzz jzzVar = this.c;
        if (jzzVar != null) {
            jzzVar.g();
            this.c = null;
        }
        khn.e();
        CastDevice castDevice = this.l;
        kro.l(castDevice);
        Bundle bundle2 = new Bundle();
        kbn kbnVar = this.i;
        keh kehVar = kbnVar == null ? null : kbnVar.h;
        keu keuVar = kehVar != null ? kehVar.c : null;
        boolean z = kehVar != null && kehVar.d;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", keuVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", k());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", this.j.i);
        jzv jzvVar = new jzv(castDevice, new kbs(this));
        jzvVar.b = bundle2;
        jzw jzwVar = new jzw(jzvVar);
        Context context = this.h;
        int i = jzy.b;
        kan kanVar = new kan(context, jzwVar);
        kanVar.l(new kbt(this));
        this.c = kanVar;
        kanVar.f();
    }

    private static final void s(Bundle bundle) {
        if (bundle != null) {
            bundle.getInt("com.google.android.gms.cast.EXTRA_WAKE_ON_LAN_STATE", 0);
        }
    }

    @Override // defpackage.kcq
    public final long a() {
        kro.f("Must be called from the main thread.");
        kfm kfmVar = this.d;
        if (kfmVar == null) {
            return 0L;
        }
        return kfmVar.e() - this.d.d();
    }

    public final CastDevice b() {
        kro.f("Must be called from the main thread.");
        return this.l;
    }

    public final kfm c() {
        kro.f("Must be called from the main thread.");
        return this.d;
    }

    public final void d(int i) {
        kfz kfzVar = this.k;
        if (kfzVar.n) {
            kfzVar.n = false;
            kfm kfmVar = kfzVar.j;
            if (kfmVar != null) {
                ket ketVar = kfzVar.o;
                kro.f("Must be called from the main thread.");
                if (ketVar != null) {
                    kfmVar.e.remove(ketVar);
                }
            }
            AudioManager audioManager = (AudioManager) kfzVar.b.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            kdx kdxVar = kfzVar.d;
            dij.l(null);
            kfo kfoVar = kfzVar.h;
            if (kfoVar != null) {
                kfoVar.a();
            }
            kfo kfoVar2 = kfzVar.i;
            if (kfoVar2 != null) {
                kfoVar2.a();
            }
            fg fgVar = kfzVar.l;
            if (fgVar != null) {
                fgVar.g(null, null);
                kfzVar.l.j(new ek().a());
                kfzVar.e(0, null);
            }
            fg fgVar2 = kfzVar.l;
            if (fgVar2 != null) {
                fgVar2.f(false);
                kfzVar.l.e();
                kfzVar.l = null;
            }
            kfzVar.j = null;
            kfzVar.k = null;
            kfzVar.m = null;
            kfzVar.c();
            if (i == 0) {
                kfzVar.d();
            }
        }
        kfm kfmVar2 = this.d;
        if (kfmVar2 != null) {
            kfmVar2.k(null);
            this.d = null;
        }
        jzz jzzVar = this.c;
        if (jzzVar != null) {
            jzzVar.g();
            this.c = null;
        }
        this.l = null;
    }

    @Override // defpackage.kcq
    protected final void e(boolean z) {
        kcb kcbVar = this.b;
        if (kcbVar != null) {
            try {
                kcbVar.j(z);
            } catch (RemoteException unused) {
                khn.e();
            }
            p(0);
        }
    }

    @Override // defpackage.kcq
    protected final void f(Bundle bundle) {
        this.l = CastDevice.c(bundle);
        s(bundle);
    }

    @Override // defpackage.kcq
    protected final void g(Bundle bundle) {
        this.l = CastDevice.c(bundle);
        s(bundle);
    }

    @Override // defpackage.kcq
    protected final void h(Bundle bundle) {
        r(bundle);
        s(bundle);
    }

    @Override // defpackage.kcq
    protected final void i(Bundle bundle) {
        r(bundle);
        s(bundle);
    }

    @Override // defpackage.kcq
    protected final void j(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice castDeviceC = CastDevice.c(bundle);
        s(bundle);
        if (castDeviceC == null || castDeviceC.equals(this.l)) {
            return;
        }
        String str = castDeviceC.d;
        boolean z = !TextUtils.isEmpty(str) && ((castDevice2 = this.l) == null || !TextUtils.equals(castDevice2.d, str));
        this.l = castDeviceC;
        khn.e();
        if (!z || (castDevice = this.l) == null) {
            return;
        }
        kfz kfzVar = this.k;
        if (kfzVar != null) {
            kfz.a.a("update Cast device to %s", castDevice);
            kfzVar.k = castDevice;
            kfzVar.f();
        }
        for (hna hnaVar : new HashSet(this.a)) {
        }
        qcb qcbVar = this.e;
        if (qcbVar != null) {
            ((aepb) qcbVar.a).a().w++;
        }
    }

    public final boolean k() {
        kbn kbnVar;
        kdx kdxVar = this.j;
        if (!kdxVar.g || (kbnVar = kdxVar.c) == null) {
            return false;
        }
        Boolean bool = kbnVar.t;
        return bool != null ? bool.booleanValue() : kdxVar.f;
    }

    public final void l(lpa lpaVar) {
        ComponentName componentName;
        kcb kcbVar = this.b;
        if (kcbVar != null) {
            try {
                if (!lpaVar.j()) {
                    Exception excE = lpaVar.e();
                    if (excE instanceof kmu) {
                        kcbVar.b(((kmu) excE).a());
                        return;
                    } else {
                        kcbVar.b(2476);
                        return;
                    }
                }
                kgz kgzVar = (kgz) lpaVar.f();
                Status status = kgzVar.a;
                if (!status.c()) {
                    khn.e();
                    kcbVar.b(status.f);
                    return;
                }
                khn.e();
                kfm kfmVar = new kfm(new khq());
                this.d = kfmVar;
                kfmVar.k(this.c);
                this.d.B(new kbq(this));
                this.d.j();
                kfz kfzVar = this.k;
                kfm kfmVar2 = this.d;
                CastDevice castDeviceB = b();
                kbn kbnVar = kfzVar.c;
                keh kehVar = kbnVar == null ? null : kbnVar.h;
                if (kfzVar.n || kbnVar == null || kehVar == null || kfzVar.f == null || kfmVar2 == null || castDeviceB == null || (componentName = kfzVar.g) == null) {
                    khn.e();
                } else {
                    kfzVar.j = kfmVar2;
                    kfzVar.j.B(kfzVar.o);
                    kfzVar.k = castDeviceB;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    Context context = kfzVar.b;
                    int i = kyg.a;
                    PendingIntent pendingIntentB = kyg.b(context, intent, 67108864);
                    if (kehVar.e) {
                        fg fgVar = new fg(context, "CastMediaSession", componentName, pendingIntentB);
                        kfzVar.l = fgVar;
                        kfzVar.e(0, null);
                        CastDevice castDevice = kfzVar.k;
                        if (castDevice != null && !TextUtils.isEmpty(castDevice.d)) {
                            ek ekVar = new ek();
                            ekVar.e("android.media.metadata.ALBUM_ARTIST", context.getResources().getString(R.string.cast_casting_to_device, kfzVar.k.d));
                            fgVar.j(ekVar.a());
                        }
                        kfzVar.m = new kfx(kfzVar);
                        fgVar.g(kfzVar.m, null);
                        fgVar.f(true);
                        kdx kdxVar = kfzVar.d;
                        dij.l(fgVar);
                    }
                    kfzVar.n = true;
                    kfzVar.f();
                }
                jzt jztVar = kgzVar.b;
                kro.l(jztVar);
                String str = kgzVar.c;
                String str2 = kgzVar.d;
                kro.l(str2);
                kcbVar.a(jztVar, str, str2, kgzVar.e);
            } catch (RemoteException unused) {
                khn.e();
            }
        }
    }

    public final void m(String str) {
        kro.f("Must be called from the main thread.");
        jzz jzzVar = this.c;
        if (jzzVar == null) {
            new kpg(Looper.getMainLooper()).l(new Status(17, null, null, null));
        } else {
            lpa lpaVarD = jzzVar.d("urn:x-cast:com.google.youtube.mdx", str);
            keb kebVar = new keb();
            lpaVarD.q(new kbf(kebVar, 2));
            lpaVarD.p(new kea(kebVar, 0));
        }
    }
}
