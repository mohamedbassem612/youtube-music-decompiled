package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnt implements gzh {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController");
    public final Context b;
    public final hnq c;
    public final Executor d;
    public final tbt e;
    public final huf f;
    public final jnm h;
    private final zwa i;
    private final aaqn j;
    private final SharedPreferences k;
    private final aacm l;
    private final aany m;
    private final hnz o;
    private final vxz p;
    private final vxz q;
    private final syn r;
    public final avmm g = new avmm();
    private final AtomicBoolean n = new AtomicBoolean(false);

    public hnt(Context context, zwa zwaVar, aaqn aaqnVar, hnq hnqVar, jnm jnmVar, SharedPreferences sharedPreferences, Executor executor, hnz hnzVar, aacm aacmVar, tbt tbtVar, huf hufVar, aany aanyVar, syn synVar, vxz vxzVar, vxz vxzVar2) {
        this.b = context;
        this.i = zwaVar;
        this.j = aaqnVar;
        this.c = hnqVar;
        this.h = jnmVar;
        this.k = sharedPreferences;
        this.d = executor;
        this.o = hnzVar;
        this.l = aacmVar;
        this.e = tbtVar;
        this.f = hufVar;
        this.m = aanyVar;
        this.r = synVar;
        this.p = vxzVar;
        this.q = vxzVar2;
    }

    private final ListenableFuture d() {
        return afxd.f(this.r.n(this.i)).g(new hnd(this, 2), this.d);
    }

    public final void a() {
        this.n.set(false);
        this.k.edit().remove(hna.a(this.i)).apply();
        if (!this.p.l(39, 45376078L, false)) {
            this.l.a(this.j.s());
            return;
        }
        try {
            aany aanyVar = this.m;
            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
            aofhVar.c = 2;
            aofhVar.b |= 1;
            String strAG = kro.aG();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
            strAG.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strAG;
            aihh aihhVar = (aihh) aofg.b.createBuilder();
            aihhVar.copyOnWrite();
            aofg aofgVar = (aofg) aihhVar.instance;
            aofgVar.c |= 1;
            aofgVar.d = -6;
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
            aofg aofgVar2 = (aofg) aihhVar.build();
            aofgVar2.getClass();
            aofhVar3.e = aofgVar2;
            aofhVar3.b |= 4;
            aanyVar.a((aofh) aihfVarCreateBuilder.build());
        } catch (aaob e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "AutoOfflineToggleCtlr")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController", "cancelAutoOffline", (char) 304, "AutoOfflineToggleController.java")).t("Failure when cancelling smart downloads.");
        }
    }

    public final void b(boolean z) {
        int i = 4;
        if (z) {
            ahno.at(d(), new hfb(this, 4), this.d);
        }
        afxd afxdVarF = afxd.f(d());
        gpr gprVar = new gpr(i);
        Executor executor = this.d;
        ahno.at(afxdVarF.h(gprVar, executor), new hnr(this, z), executor);
    }

    public final void c() {
        if (!this.h.C()) {
            if (this.q.l(66, 45858271L, false)) {
                this.n.set(true);
                return;
            }
            return;
        }
        this.n.set(false);
        if (hna.b(this.k, this.i).isEmpty()) {
            if (!this.p.l(39, 45376078L, false)) {
                hnz hnzVar = this.o;
                aaqn aaqnVar = this.j;
                if (hnzVar.c(true, aaqnVar.s(), aaqnVar) != 0) {
                    this.l.c(aaqnVar.s());
                    return;
                }
                return;
            }
            try {
                aany aanyVar = this.m;
                aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                aofhVar.c = 1;
                aofhVar.b |= 1;
                String strAG = kro.aG();
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                strAG.getClass();
                aofhVar2.b |= 2;
                aofhVar2.d = strAG;
                aihh aihhVar = (aihh) aofg.b.createBuilder();
                aihhVar.copyOnWrite();
                aofg aofgVar = (aofg) aihhVar.instance;
                aofgVar.c |= 1;
                aofgVar.d = -6;
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                aofg aofgVar2 = (aofg) aihhVar.build();
                aofgVar2.getClass();
                aofhVar3.e = aofgVar2;
                aofhVar3.b |= 4;
                aanyVar.a((aofh) aihfVarCreateBuilder.build());
            } catch (aaob e) {
                ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "AutoOfflineToggleCtlr")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController", "maybeRunAutoOffline", (char) 270, "AutoOfflineToggleController.java")).t("Failure when running smart downloads.");
            }
        }
    }

    @tcc
    public void handleSdCardMountChangedEvent(tqb tqbVar) {
        b(this.c.g());
    }

    @Override // defpackage.gzh
    public final void v(zwa zwaVar) {
        if (this.i.equals(zwaVar)) {
            this.n.set(false);
            b(this.c.g());
        }
    }

    @Override // defpackage.gzh
    public final void w(zwa zwaVar, jnm jnmVar) {
        if (this.q.l(66, 45858271L, false) && this.i.equals(zwaVar) && jnmVar.C() && this.n.compareAndSet(true, false)) {
            b(this.c.g());
        }
    }
}
