package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actj {
    public static final String a;
    public final Context b;
    public final abvk c;
    public final xgm d;
    public final wbz e;
    public final zwh f;
    public final avmb g;
    public final avmb h;
    public final acsj i;
    public final AudioManager j;
    public int k;
    public final avmm l;
    public wek m;
    public Window.Callback n;
    public final awlo o;
    public final hno p;
    private final awmi q;
    private final awmi r;

    static {
        String strG = wfs.g(307, "mute_toggle_button_state_entity");
        strG.getClass();
        a = strG;
    }

    public actj(Context context, abvk abvkVar, xgm xgmVar, wbz wbzVar, zwh zwhVar, avmb avmbVar, avmb avmbVar2, acsj acsjVar, hno hnoVar) {
        context.getClass();
        abvkVar.getClass();
        xgmVar.getClass();
        wbzVar.getClass();
        zwhVar.getClass();
        avmbVar.getClass();
        avmbVar2.getClass();
        hnoVar.getClass();
        this.b = context;
        this.c = abvkVar;
        this.d = xgmVar;
        this.e = wbzVar;
        this.f = zwhVar;
        this.g = avmbVar;
        this.h = avmbVar2;
        this.i = acsjVar;
        this.p = hnoVar;
        this.q = new awmp(new acoo(this, 3));
        this.j = (AudioManager) context.getSystemService(AudioManager.class);
        this.r = new awmp(new acoo(this, 4));
        this.l = new avmm();
        this.o = new awlo();
    }

    public final int a() {
        return ((Number) this.r.a()).intValue();
    }

    public final Activity b() {
        return (Activity) this.q.a();
    }

    public final boolean c() {
        return ((abnc) this.c.x.b).b == 0.0f;
    }
}
