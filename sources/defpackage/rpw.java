package defpackage;

import android.content.SharedPreferences;
import j$.lang.Iterable$EL;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rpw implements zwi {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/account/signin/flow/DefaultIncognitoController");
    public final mbc a;
    public final awmd b;
    private final Executor d;
    private final aunn e;
    private final tbt f;
    private final Set g = new CopyOnWriteArraySet();
    private final SharedPreferences h;
    private final awmd i;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
    }

    public rpw(Executor executor, aunn aunnVar, tbt tbtVar, SharedPreferences sharedPreferences, awmd awmdVar, mbc mbcVar, awmd awmdVar2) {
        this.d = executor;
        this.e = aunnVar;
        this.f = tbtVar;
        this.h = sharedPreferences;
        this.i = awmdVar;
        this.a = mbcVar;
        this.b = awmdVar2;
    }

    private final synchronized void h(zvv zvvVar, ajwo ajwoVar) throws Throwable {
        try {
            try {
                aihf aihfVarCreateBuilder = aiqw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aiqw aiqwVar = (aiqw) aihfVarCreateBuilder.instance;
                aiqwVar.c = 7;
                aiqwVar.b |= 1;
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aiqw aiqwVar2 = (aiqw) aihfVarCreateBuilder.build();
                aiqwVar2.getClass();
                alouVar.d = aiqwVar2;
                alouVar.c = 24;
                ((dov) this.b.io()).R((alou) alosVar.build());
                this.f.c(new rqg(rqf.a, false));
                taf.i(((rmu) this.e.io()).g(), this.d, new iul(9), new rjy((Object) this, (Object) zvvVar, (Object) ajwoVar, 8, (byte[]) null), null);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.zwi
    public final void a() {
        this.f.c(new rqg(rqf.c, false, null));
    }

    @Override // defpackage.zwi
    public final synchronized void b(zvv zvvVar, ajwo ajwoVar) {
        h(zvvVar, ajwoVar);
    }

    @Override // defpackage.zwi
    public final void e(zwj zwjVar) {
        this.g.add(zwjVar);
    }

    @Override // defpackage.zwi
    public final void f(zwj zwjVar) {
        this.g.remove(zwjVar);
    }

    public final synchronized void g(zvv zvvVar, ajwo ajwoVar) {
        this.h.edit().putLong("incognito_LACT", 0L).apply();
        rqg rqgVar = new rqg(rqf.b, true, ajwoVar);
        tbt tbtVar = this.f;
        tbtVar.c(rqgVar);
        tbtVar.e(new zwt(((rmu) this.e.io()).e(), ajwoVar));
        if (zvvVar != null) {
            zvvVar.a();
        }
        int i = 15;
        Iterable$EL.forEach(this.g, new hgi(i));
        aihf aihfVarCreateBuilder = aiqv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiqv aiqvVar = (aiqv) aihfVarCreateBuilder.instance;
        aiqvVar.c = 7;
        aiqvVar.b |= 1;
        wvl wvlVarB = ((hed) this.i.io()).B();
        wvlVarB.b = new kjh(this, aihfVarCreateBuilder, i, null);
        taf.j(wvlVarB.a(), new iul(10));
    }
}
