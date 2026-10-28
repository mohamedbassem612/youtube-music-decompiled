package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvs implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final hvq a = new hvq(2, 3);
    static final agkj b;
    public final SharedPreferences c;
    public final avlh d;
    public boolean e;
    public avmn f;
    public hvr g;
    public final jnm h;
    private final awmd i;
    private hvq j;
    private final tfq k;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e("Low", new hvq(2, 2));
        agkhVar.e("Normal", new hvq(2, 3));
        agkhVar.e("High", new hvq(2, 4));
        agkhVar.e("Always High", new hvq(4, 4));
        b = agkhVar.d(true);
    }

    public hvs(SharedPreferences sharedPreferences, tfq tfqVar, awmd awmdVar, avlh avlhVar, jnm jnmVar) {
        this.c = sharedPreferences;
        this.i = awmdVar;
        this.k = tfqVar;
        this.d = avlhVar;
        this.h = jnmVar;
    }

    public final void a() {
        avlj avljVar = new avlj() { // from class: hvp
            @Override // defpackage.avlj
            public final void a(avli avliVar) {
                hvs hvsVar = this.a;
                jnm jnmVar = hvsVar.h;
                avliVar.c(Boolean.valueOf(jnmVar.C()));
                hvsVar.g = new hvr(avliVar);
                jnmVar.y(hvsVar.g);
            }
        };
        avla avlaVar = avla.e;
        int i = avlh.a;
        avsl avslVar = new avsl(avljVar, avlaVar);
        avnn avnnVar = atqp.j;
        avslVar.p().al(new hjd(this, 18), new hpw(3));
    }

    public final void b() {
        c((hvq) b.get(this.c.getString(true != this.k.j(1) ? gzj.BITRATE_AUDIO_MOBILE : gzj.BITRATE_AUDIO_WIFI, "Normal")));
    }

    public final void c(hvq hvqVar) {
        if (hvqVar == null || hvqVar.equals(this.j)) {
            return;
        }
        this.j = hvqVar;
        abvk abvkVar = (abvk) this.i.io();
        int i = hvqVar.a;
        int i2 = hvqVar.b;
        yoq yoqVar = abvkVar.c.h;
        yoqVar.d = i;
        yoqVar.e = i2;
        zjr zjrVar = yoqVar.a;
        boolean z = true;
        if (zjrVar.aB() && i2 >= 4) {
            z = false;
        }
        zjrVar.C = z;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.equals(gzj.BITRATE_AUDIO_MOBILE, str) || TextUtils.equals(gzj.BITRATE_AUDIO_WIFI, str)) {
            b();
        }
    }
}
